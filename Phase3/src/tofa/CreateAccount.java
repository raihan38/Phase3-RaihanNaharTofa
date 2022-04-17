package tofa;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	
	public static void main(String[] args) {
		
	
		//String webUrl = "http://automationpractice.com/index.php";
		CreateAccount createAccount = new CreateAccount();
		createAccount.signUp1();
		createAccount.signup2();
		
	}
	
	
	public void signUp1() {
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		By findClass= By.className("login");
		WebElement webElement=driver.findElement(findClass);
		webElement.click();
		
		driver.findElement(By.id("email_create")).sendKeys("local1234@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		//Gender selection
		WebElement genderElement= driver.findElement(By.xpath("//input[@name=\"id_gender\" and @value=\"1\"]"));
		genderElement.click();
		System.out.println(genderElement.isSelected());
		
		//First Name lastname & password
		driver.findElement(By.name("customer_firstname")).sendKeys("Raihan");
		driver.findElement(By.name("customer_lastname")).sendKeys("Nahar");
		driver.findElement(By.name("passwd")).sendKeys("account01");
		
		//DOB
		WebElement dayElement= driver.findElement(By.id("days"));	
		WebElement monthElement= driver.findElement(By.id("months"));
		WebElement yearElement= driver.findElement(By.id("years"));
		
		Select daySelect= new Select(dayElement);
		Select monthSelect= new Select(monthElement);
		Select yearSelect= new Select(yearElement);
		
		daySelect.selectByValue("10");
		monthSelect.selectByValue("4");
		yearSelect.selectByValue("2000");
		
		
		//Address
		driver.findElement(By.id("company")).sendKeys("abc corporation");
		driver.findElement(By.id("address1")).sendKeys("road 1234");
		driver.findElement(By.id("address2")).sendKeys("house 56, xyz area");
		driver.findElement(By.id("city")).sendKeys("Texas");
		WebElement stateElement= driver.findElement(By.id("id_state"));	
		Select stateSelect= new Select(stateElement);
		stateSelect.selectByValue("43");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone")).sendKeys("+14844578854");
		driver.findElement(By.id("phone_mobile")).sendKeys("+15852826418");
		
		
		//Register
		driver.findElement(By.id("submitAccount")).click();
		
	}
	public void signup2() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		By findClass2= By.className("login");
		WebElement webElement2=driver.findElement(findClass2);
		webElement2.click();
		
		driver.findElement(By.id("email_create")).sendKeys("tofacse26@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		// 
		}
		//Gender selection
		WebElement genderElement2= driver.findElement(By.xpath("//input[@name=\"id_gender\" and @value=\"1\"]"));
		genderElement2.click();
		System.out.println(genderElement2.isSelected());
		
		//First Name lastname & password
		driver.findElement(By.name("customer_firstname")).sendKeys("Raihan");
		driver.findElement(By.name("customer_lastname")).sendKeys("Nahar");
		driver.findElement(By.name("passwd")).sendKeys("account02");
		
		//DOB
		WebElement dayElement2= driver.findElement(By.id("days"));	
		WebElement monthElement2= driver.findElement(By.id("months"));
		WebElement yearElement2= driver.findElement(By.id("years"));
		
		Select daySelect2= new Select(dayElement2);
		Select monthSelect2= new Select(monthElement2);
		Select yearSelect2= new Select(yearElement2);
		
		daySelect2.selectByValue("10");
		monthSelect2.selectByValue("4");
		yearSelect2.selectByValue("2000");
		
		
		//Address
		driver.findElement(By.id("company")).sendKeys("abc corporation");
		driver.findElement(By.id("address1")).sendKeys("road 1234");
		driver.findElement(By.id("address2")).sendKeys("house 56, xyz area");
		driver.findElement(By.id("city")).sendKeys("Texas");
		WebElement stateElement2= driver.findElement(By.id("id_state"));	
		Select stateSelect2= new Select(stateElement2);
		stateSelect2.selectByValue("43");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone")).sendKeys("+14844578854");
		driver.findElement(By.id("phone_mobile")).sendKeys("+15852826418");
		
		
		//Register
		driver.findElement(By.id("submitAccount")).click();
	}

}
