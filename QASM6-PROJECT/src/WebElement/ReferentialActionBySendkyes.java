package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReferentialActionBySendkyes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//identify the UN textfield
		WebElement usernameTestField=driver.findElement(By.id("username"));
		usernameTestField.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(5000);
		usernameTestField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(5000);
		usernameTestField.sendKeys("admin");
		Thread.sleep(5000);
		usernameTestField.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Test@123");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);	
		Thread.sleep(5000);
		
	}

}
