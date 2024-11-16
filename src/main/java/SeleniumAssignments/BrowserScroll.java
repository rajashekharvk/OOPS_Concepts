package SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BrowserScroll {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");

		WebElement element1 = driver
				.findElement(By.xpath("//div[@class='iconsection']/ul/li/a[@href='https://www.air.irctc.co.in/']"));
		WebElement element2 = driver
				.findElement(By.xpath("//div[@class='iconsection']/ul/li/a/span[@class='allcircle circlesix']"));

//		4 ways to do it
//		==========================================================
//		 Method_1
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);

		if (element2.isDisplayed()) {
			System.out.println("Object exists");

		} else {
			System.out.println("Object NOT exists");
		}

//==========================================================		
//		Method_2

		try {
			Actions action = new Actions(driver);
			action.moveToElement(element2).perform();
			if (element2.isDisplayed()) {
				System.out.println("Object exists");

			} else {
				System.out.println("Object NOT exists");
			}
		} catch (Exception e) { // NoSuchElementException
			System.out.println("Object NOT exists");
			e.getStackTrace();
		}

//==========================================================

//		Method_3
		element2.sendKeys(Keys.DOWN);

//		==========================================================	
//		 Method_4
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	}

}
