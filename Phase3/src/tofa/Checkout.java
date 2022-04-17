package tofa;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkout {

	public static void main(String[] args) {

		Checkout checkout = new Checkout();
		checkout.checkoutProcess1();
		checkout.checkoutProcess2();

	}

	public void checkoutProcess1() {

		Checkout checkout = new Checkout();
		// login
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		By findClass = By.className("login");
		WebElement webElement = driver.findElement(findClass);
		webElement.click();

		driver.findElement(By.id("email")).sendKeys("local1234@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("account01");
		driver.findElement(By.id("SubmitLogin")).click();

		// go to dress
		WebElement findDressElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));

		Actions actions = new Actions(driver);
		actions.moveToElement(findDressElement).perform();

		// go to Casual dress

		WebElement findCasualDressElement = driver
				.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a"));
		findCasualDressElement.click();

		// add product to cart

		WebElement addToCartElement = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addToCartElement.click();

		// wait for 3 seconds for the pop up to show

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// continue shopping
		WebElement continuElement = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
		continuElement.click();

		// find tshirt
		WebElement findTshirtElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		findTshirtElement.click();

		// filter Tshirt
		WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"color_2\"]"));
		filterElement.click();

		// add blue tshirt to cart
		WebElement addTshirtElement = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		addTshirtElement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		// Checkout page
		WebElement checkoutElement = driver
				.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkoutElement.click();

		// scroll down to product info page
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// Proceed Payment
		WebElement paymentElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		paymentElement.click();

		// Scroll down to address page

		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// Proceed Payment confirming address
		WebElement paymentElement2 = driver.findElement(By.name("processAddress"));
		paymentElement2.click();

		// Agree terms
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		WebElement termsElement = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		termsElement.click();

		// Proceed payment after shipping
		WebElement paymentElement3 = driver.findElement(By.name("processCarrier"));
		paymentElement3.click();

		// payment method
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		WebElement payByElement = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		payByElement.click();

		// Order confirmation
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		WebElement confirmElement = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		confirmElement.click();

	}

	public void checkoutProcess2() {

		Checkout checkout = new Checkout();
		// login
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		By findClass = By.className("login");
		WebElement webElement = driver.findElement(findClass);
		webElement.click();

		driver.findElement(By.id("email")).sendKeys("tofacse26@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("account02");
		driver.findElement(By.id("SubmitLogin")).click();

		// go to dress
		WebElement findDressElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));

		Actions actions = new Actions(driver);
		actions.moveToElement(findDressElement).perform();

		// go to Casual dress

		WebElement findCasualDressElement = driver
				.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a"));
		findCasualDressElement.click();

		// add product to cart

		WebElement addToCartElement = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addToCartElement.click();

		// wait for 3 seconds for the pop up to show

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// continue shopping
		WebElement continuElement = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
		continuElement.click();

		// find tshirt
		WebElement findTshirtElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		findTshirtElement.click();

		// filter Tshirt
		WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"color_2\"]"));
		filterElement.click();

		// add blue tshirt to cart
		WebElement addTshirtElement = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		addTshirtElement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		// Checkout page
		WebElement checkoutElement = driver
				.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkoutElement.click();

		// scroll down to product info page
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// Proceed Payment
		WebElement paymentElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		paymentElement.click();

		// Scroll down to address page

		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		// Proceed Payment confirming address
		WebElement paymentElement2 = driver.findElement(By.name("processAddress"));
		paymentElement2.click();

		// Agree terms
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		WebElement termsElement = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		termsElement.click();

		// Proceed payment after shipping
		WebElement paymentElement3 = driver.findElement(By.name("processCarrier"));
		paymentElement3.click();

		// payment method
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		WebElement payByElement = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		payByElement.click();

		// Order confirmation
		javascriptExecutor.executeScript("window.scrollBy(0,2000);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		WebElement confirmElement = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		confirmElement.click();

	}

}
