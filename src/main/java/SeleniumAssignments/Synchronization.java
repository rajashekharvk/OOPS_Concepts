package SeleniumAssignments;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
TimeoutException
	This exception occurs when an operation takes longer than the specified wait time. It can happen when Selenium is waiting for a page load, element interaction, or other action. 
NoSuchWindowException
	This exception occurs when Selenium can't find the desired browser window or tab using the specified window handle or name. 
NoSuchAttributeException
	This exception occurs when Selenium tries to retrieve the value of a non-existent attribute for an element. 
StaleElementReferenceException
	This exception occurs when Selenium tries to reference an element that is no longer associated with an HTML element in the DOM.
NullpointerException

 * Implicit Wait in Selenium	
Applies to all elements in a test script. 	. 
No need to specify “ExpectedConditions” on the element to be located	
Most effective when used in a test case in which the elements are located with the time frame specified in implicit wait

Explicit Wait in Selenium
Applies only to specific elements as intended by the user
Must always specify “ExpectedConditions” on the element to be located
Most effective when used when the elements are taking a long time to load. Also useful for verifying property of the element, such as visibilityOfElementLocated, elementToBeClickable, elementToBeSelected

 */

public class Synchronization {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // .implicitlyWait(20,TimeUnit.SECONDS);

//		Explicit Wait
		WebDriverWait Ewait = new WebDriverWait(driver, Duration.ofSeconds(30)); // WebDriverWait(driver,30);
		Ewait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(null)));

//		Fluentwait
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofMillis(600))
				.ignoring(NoSuchElementException.class);

//				WebElement foo=wait.until(new Function(driver));

		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
											.withTimeout(Duration.ofSeconds(0))
											.pollingEvery(Duration.ofSeconds(0))
											.ignoring(NoSuchElementException.class, TimeoutException.class);

		for (int i = 0; i < 2; i++) {
			WebElement element = driver.findElement(By.xpath(""));
			try {

				fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
						"//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We are processing through trillions of data events, this insight may take more than 15 minutes to complete.']")));
				fWait.until(ExpectedConditions.visibilityOf(element));
				fWait.until(ExpectedConditions.elementToBeClickable(element));
			} catch (Exception e) {

				System.out.println("Element Not found trying again - " + element.toString().substring(70));
				e.printStackTrace();
			}
		}

	}

	public WebElement aply(WebDriver driver) {

		return driver.findElement(By.id("foo"));

	}

}
