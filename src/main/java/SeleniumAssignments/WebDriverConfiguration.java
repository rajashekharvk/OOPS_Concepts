package SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConfiguration {
	private WebDriver driver;
	private String browser = "chrome"; // set the browser type
	
//@Parametorization("browser")
//	@Before
	public void setUp() {

		if (browser.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-- start-maximized");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("fireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--width=1920");
			options.addArguments("--height = 1080");
			driver = new FirefoxDriver(options);
		}

		// Configure the timeout setting
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

//	@Test
	public void testExample() {
		// Example to navigatge to webpage
		driver.get("https://example.com");
		System.out.println("Title:" + driver.getTitle());
	}

//	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();// close the browser after each test
		}
	}

}
