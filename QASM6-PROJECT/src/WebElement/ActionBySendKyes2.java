package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionBySendKyes2 {

	public static void main(String[] args) throws Throwable 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm");
	WebElement usernameTextField=driver.switchTo().activeElement();
    usernameTextField.sendKeys(Keys.CONTROL +"a");
    Thread.sleep(2000);
    usernameTextField.sendKeys(Keys.BACK_SPACE);
    Thread.sleep(2000);
    usernameTextField.sendKeys("admin");
    Thread.sleep(2000);
    usernameTextField.sendKeys(Keys.TAB);
    Thread.sleep(2000);
    driver.switchTo().activeElement().sendKeys("Test@123");
    Thread.sleep(2000);
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    Thread.sleep(2000);
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    WebElement adminLogoOption = driver.findElement(By.cssSelector("fa fa-user"));
    adminLogoOption.click();
    Thread.sleep(2000);
    WebElement signOutOption = driver.findElement(By.cssSelector("a[id='menubar_item_right_LBL_SIGN_OUT']"));
    signOutOption.click();
	}
	}