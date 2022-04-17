package tofa;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class AddtoCart {

	String baseUrlString = "http://automationpractice.com/index.php";

	public static void main(String[] args) {

		AddtoCart addtoCart = new AddtoCart();
		addtoCart.AddProducts1();
		addtoCart.AddProducts2();

	}

	public void AddProducts1() {

		// login
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

		// Proceed to checkout

		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"))).click();

	}

	public void AddProducts2() {

		// login
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

		// Proceed to checkout

		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"))).click();

	}

}
