package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	/*
	 * Actions class is an ability provided by Selenium for handling keyboard and mouse events.
	 * In Selenium WebDriver, handling these events includes operations such as drag and drop in Selenium, 
	 * clicking on multiple elements with the control key, among others.
	 * Mouse Actions in Selenium:
		doubleClick(): Performs double click on the element
		clickAndHold(): Performs long click on the mouse without releasing it
		dragAndDrop(): Drags the element from one point and drops to another
		moveToElement(): Shifts the mouse pointer to the center of the element
		contextClick(): Performs right-click on the mouse
	Keyboard Actions in Selenium:
		sendKeys(): Sends a series of keys to the element
		keyUp(): Performs key release
		keyDown(): Performs keypress without release
	 */

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Actions action = new Actions(driver);

		//action.moveToElement((WebElement) By.xpath("")).click().perform();
		
		WebElement element = driver.findElement(By.linkText("Get started free"));
		//Perform Click Action on the Web Element
		action.moveToElement(element).click();
		
		//Perform Mouse Hover Action on the Web Element
		WebElement live= driver.findElement(By. cssSelector("div.product-cards-wrapper--click a[title='Live']")); 
		action.moveToElement(live).build().perform();
		
		//Perform Double Click Action on the Web Element
		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		action.doubleClick(trialaction).perform();
		
	}

}
