package WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://google.com");
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
		driver.findElement(By.name("q")).sendKeys("asfa");
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("sbct PZPZlf sbre")));
		Thread.sleep(1000);
		
		/*WebElement list=driver.findElement(By.className("sbtc"));
		List rows=list.findElements(By.tagName("li"));

		for(WebElement elem:rows) {
		System.out.println(elem.getText());
		}*/

		
		WebElement lst =driver.findElement(By.className("sbct PZPZlf sbre"));
		List<WebElement> rows=lst.findElements(By.tagName("li"));
		for(WebElement elem:rows) {
			System.out.println(elem.getText());
			
			
		}
	}

}
