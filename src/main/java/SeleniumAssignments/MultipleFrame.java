package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
        driver.manage().window().maximize();

        WebElement frameOne = driver.findElement(By.xpath("//frame[@src='htmlf.htm']"));

        driver.switchTo().frame(frameOne);
        driver.findElement(By.xpath("//a[normalize-space()='Javascript Scientific Calculator']")).click();

        driver.switchTo().defaultContent();

        WebElement frameTwo = driver.findElement(By.xpath("//frame[@src='message.htm']"));

        driver.switchTo().frame(frameTwo);

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Naruto");

        driver.switchTo().defaultContent();

        WebElement frameThree = driver.findElement(By.xpath("//frame[@src='tags.htm']"));

        driver.switchTo().frame(frameThree);

        String text = driver.findElement(By.xpath("//font[contains(text(),'Brief')]")).getText();
        System.out.println(text);
        // driver.quit();
	}

}
