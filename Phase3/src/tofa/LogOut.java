package tofa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut {
	public static void main(String[] args) {

		LogOut logOut = new LogOut();
		logOut.UserLogout1();
		logOut.UserLogout2();

	}

	public void UserLogout1() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		// login
		By findClass = By.className("login");
		WebElement webElement = driver.findElement(findClass);
		webElement.click();

		driver.findElement(By.id("email")).sendKeys("local1234@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("account01");
		driver.findElement(By.id("SubmitLogin")).click();

		// logout
		WebElement logoutElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		logoutElement.click();
	}

	public void UserLogout2() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		// login
		By findClass = By.className("login");
		WebElement webElement = driver.findElement(findClass);
		webElement.click();

		driver.findElement(By.id("email")).sendKeys("tofacse26@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("account02");
		driver.findElement(By.id("SubmitLogin")).click();

		// logout
		WebElement logoutElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		logoutElement.click();
	}

}
