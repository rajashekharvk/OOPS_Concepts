package WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etmoney.com/stocks/list-of-stocks");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement table = driver.findElement(By.xpath("//table[@id=’myTable’]"));
		//table[@class="table-striped"]//a[text()="20 Microns Ltd. "]
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath(".//td"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}
		}
	}

}
