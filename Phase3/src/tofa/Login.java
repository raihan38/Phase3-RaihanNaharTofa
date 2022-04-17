package tofa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
		Login login=new Login();
		login.userLogin1();
		login.userLogin2();
		
		
	}
	public void userLogin1() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		By findClass= By.className("login");
		WebElement webElement=driver.findElement(findClass);
		webElement.click();
		
		
		driver.findElement(By.id("email")).sendKeys("local1234@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("account01");
		driver.findElement(By.id("SubmitLogin")).click();
	}
	public void userLogin2() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		By findClass= By.className("login");
		WebElement webElement=driver.findElement(findClass);
		webElement.click();
		
		
		driver.findElement(By.id("email")).sendKeys("tofacse26@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("account02");
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
