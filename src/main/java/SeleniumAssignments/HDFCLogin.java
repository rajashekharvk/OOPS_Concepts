
package SeleniumAssignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFCLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		List<WebElement> ls = driver.findElements(By.xpath("//frame"));
		for (int i = 0; i < ls.size(); i++) {
			try {
				driver.switchTo().frame(i);
				if (driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).isDisplayed()) {
					System.out.println("User Name");
					driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("asfa");
					driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
//					Thread.sleep(4);
					driver.switchTo().defaultContent();
//					Thread.sleep(4);
					System.out.println("Password");
					driver.findElement(By.xpath("//*[@type='password']")).sendKeys("asfa");
//					Thread.sleep(5);
					driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
					System.out.println("Login Button");
				}
				break;
			} catch (Exception e) {
				System.out.println("Object not found");
				driver.quit();
			}
		}

//		Set<String> ls1 = driver.getWindowHandles();
//		Iterator<String> it = ls1.iterator();
//		while (it.hasNext()) {
//			driver.switchTo().window(it.next());
//
//			try {
//
//				if (driver.findElement(By.xpath("//*[@type='password']")).isDisplayed()) {
//					System.out.println("Password");
//					Thread.sleep(4);
//					driver.findElement(By.xpath("//*[@type='password']")).sendKeys("asfa");
//					Thread.sleep(5);
//					driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
//					System.out.println("Login Button");
//					break;
//				} else {
//					System.out.println("NOT DISPLAYED");
//				}
//
//			} catch (Exception e) {
//				System.out.println("Object not found");
//				// driver.quit();
//			}
//		}

}}
