package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Actime_Checkbox_01 {
	public static void main(String[] args) throws Throwable {
		//Instantiate the browser specific class
		WebDriver Driver=new ChromeDriver();
		//pre condition-Maxmize
		Driver.manage().window().maximize();
		//pass the main URL of the application
		Driver.get("https://demo.actitime.com/login.do");
		//fine the username text fiels and enter the data
		WebElement usernameTextfield=Driver.findElement(By.name("username"));
		usernameTextfield.sendKeys("admin");
		Thread.sleep(5000);
		WebElement passwordTestfield=Driver.findElement(By.name("pwd"));
		passwordTestfield.sendKeys("manager");
		Thread.sleep(5000);
		WebElement Loginbutton=Driver.findElement(By.id("loginButton"));
		Loginbutton.click();
		Thread.sleep(7000);
		Driver.manage().window().minimize();
		//terminate the session
		Driver.quit();
	}
}



