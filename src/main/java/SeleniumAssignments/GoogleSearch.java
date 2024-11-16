package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("xpath");
		
		String c= driver.findElement(By.xpath("//ul[@role='listbox']/li/div/div[2]/div[1]/div[1]/span")).getText();
		
		System.out.println(c);
		
		System.out.println("----------------------");
		
		List<WebElement> elmnt=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]"));
		
		System.out.println(elmnt.size());
		for(int i=0;i<elmnt.size();i++) {
			
			System.out.println(elmnt.get(i).getText());	
			Select sc=new Select(elmnt.get(i));
			sc.selectByValue(c);
		}

	}

}


