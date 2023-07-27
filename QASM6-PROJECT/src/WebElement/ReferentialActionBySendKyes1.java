package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReferentialActionBySendKyes1 {

	public static void main(String[] args) throws Throwable 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm");
	WebElement usernameTextField=driver.switchTo().activeElement();
    usernameTextField.sendKeys(Keys.CONTROL +"a");
    Thread.sleep(5000);
    usernameTextField.sendKeys(Keys.BACK_SPACE);
    Thread.sleep(5000);
    usernameTextField.sendKeys("admin");
    Thread.sleep(5000);
    usernameTextField.sendKeys(Keys.TAB);
    Thread.sleep(5000);
    driver.switchTo().activeElement().sendKeys("Test@123");
    Thread.sleep(5000);
    driver.switchTo().activeElement().sendKeys(Keys.TAB);
    Thread.sleep(5000);
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    WebElement adminLogoOption = driver.findElement(By.xpath("//div[@id='navbar']//a[@role='button']"));
    adminLogoOption.click();
    Thread.sleep(2000);
    WebElement signOutOption = driver.findElement(By.cssSelector("a[id='menubar_item_right_LBL_SIGN_OUT']"));
    signOutOption.click();
	}
	}
	
	

    
    
    
    
    
  
    
   /* WebElement adminLogoOption = driver.findElement(By.xpath("//div[@id='navbar']//a[@role='button']"));
    adminLogoOption.click();
    WebElement signOutOption = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
    signOutOption.click();
	}
	}*/

//a[class='userName dropdown-toggle pull-right