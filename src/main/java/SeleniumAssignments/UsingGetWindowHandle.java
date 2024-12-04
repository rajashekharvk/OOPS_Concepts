
package SeleniumAssignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingGetWindowHandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		String MainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		System.out.println(set.size());

		for (String windowTab : set) {
			System.out.println(MainWindow);
			if (!windowTab.equalsIgnoreCase(MainWindow)) {
				driver.switchTo().window(it.next());
				String Wdinw2 = driver.getWindowHandle();
//	            Thread.sleep(10000);
				System.out.println(driver.getTitle());
				if (driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).isDisplayed()) {
					System.out.println("DISPLAYED");
					driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("asfa");
				} else {
					System.out.println("NOT DISPLAYED");
				}
				break;
			}
		}
	}
}
