package SeleniumAssignments;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
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
		WebDriver driver=new ChromeDriver();
		
		
//		Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //.implicitlyWait(20,TimeUnit.SECONDS);
		
		
//		Explicit Wait
		WebDriverWait Ewait=new WebDriverWait(driver, Duration.ofSeconds(30)) ;    //WebDriverWait(driver,30);
		Ewait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(null)));
		
//		Fluentwait
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(600))
				.ignoring(NoSuchElementException.class);
		
//				WebElement foo=wait.until(new Function(driver));
					
	}
	
	public WebElement aply(WebDriver driver){
		
		return driver.findElement(By.id("foo"));
		
		}

}
