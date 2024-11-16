package SeleniumAssignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkintoNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.get("https://mail.google.com/");
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("www.facebook.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
		
		Thread.sleep(1000);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//		driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();
		driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).sendKeys(selectLinkOpeninNewTab);
		
		
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//		driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
		
		
		
	}

}
