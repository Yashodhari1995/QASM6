package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetTitle {

	public static void main(String[] args) {
		// Instantiate the browser specific class
		//Step 01-Launch the browser 
		WebDriver driver=new ChromeDriver();
		//pass the main url of the app
		//step 02:enter the main url of the app
		driver.get("https://demo.actitime.com/login.do");
		String ExceptedLoginPage="";
		String ActualLoginPageTitle=driver.getTitle();
		String ExceptedLoginPageURL="https://demo.actitime.com/login.do";
		String ActualLoginPageURL=driver.getCurrentUrl();
		if(ActualLoginPageTitle.equals(ExceptedLoginPage))
		{
			System.out.println("Loginpage Title is currect");
			if(ActualLoginPageURL.equals(ExceptedLoginPageURL)) {
				System.out.println("Login page URl is correct");
				System.out.println("pass:the loginpage is displayed upon the verification of url & title");
			}
			else
			{
				System.out.println("Login URL is incorrected");
				System.out.println("Fail:the login page is not displayed since URL is in correct");
			}
		}
			else
			{
				System.out.println("Login page title is in correct");
				System.out.println("Fail:the login page is not displayed sience");
			}
			//driver.quit();
			}
		}



