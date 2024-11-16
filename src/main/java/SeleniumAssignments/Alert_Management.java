package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * What are Alerts in Selenium?
Alert in Selenium is a message/notification box that notifies the user about some information or asks for permission to perform a certain kind of operation. It may be used for warning purposes as well.

Types of Alerts in Selenium
There are three types of Alert in Selenium, described as follows:

Simple Alert
Prompt Alert
Confirmation Alert
1. Simple Alert
This alert is used to notify a simple warning message with an ‘OK’ button, as shown in the below snapshot.

2. Prompt Alert
This alert will ask the user to input the required information to complete the task. In the below snapshot, you can see that without entering the destination for Hotel, you are not allowed to hit the search button.

3. Confirmation Alert
This alert is basically used for the confirmation of some tasks. For Example: Do you wish to continue a particular task? Yes or No? The snapshot below depicts the same.
How to Handle Alerts in Selenium?
Handling alerts manually is a tedious task. To reduce human intervention and ease this task, Selenium provides a wide range of functionalities and methods to handle alerts.

The following methods are useful to handle alerts in Selenium:

1. Void dismiss(): This method is used when the ‘Cancel’ button is clicked in the alert box.
	driver.switchTo().alert().dismiss();
	
2. Void accept(): This method is used to click on the ‘OK’ button of the alert.
	driver.switchTo().alert().accept();
	
3. String getText(): This method is used to capture the alert message.
	driver.switchTo().alert().getText();
	
4. Void sendKeys(String stringToSend): This method is used to send data to the alert box.

driver.switchTo().alert().sendKeys("Text");
 */

public class Alert_Management {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 
		System.setProperty("webdriver.chrome.driver","Path_of_Chrome_Driver"); //mention dummy path or variable that stores chrome driver path 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.browserstack.com/users/sign_up");

		driver.findElement(By.id("user_full_name")).sendKeys("username"); 
		driver.findElement(By.id("input-lg text user_email_ajax")).sendKeys("username.xyz.net");
		driver.findElement(By.id("user_password")).sendKeys("Your_Password");
		driver.findElement(By.id("user_submit")).click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
		alert.accept();
		alert.dismiss();

		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept(); 
		}

	}

