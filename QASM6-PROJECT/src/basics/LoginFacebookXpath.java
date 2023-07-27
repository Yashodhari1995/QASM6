package basics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LoginFacebookXpath 
{

	public static void main(String[] arg) throws Throwable
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/login.php");
        driver.manage().window().maximize(); // MAXIMIZE WEB PAGE
        
        // xpath      
       //Enter email id or phone number
        driver.switchTo().activeElement().sendKeys("Email");// email or phone no
        
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Email");
        //Thread.sleep(1000);
        
        //Enter password
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("password"); // password
        
        //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("email"); //enter email
        //Click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        
        driver.findElement(By.xpath("(//*[local-name()='svg' and @class='x1lliihq x1k90msu x2h7rmj x1qfuztq x198g3q0'])[2]")).click();
        
        driver.findElement(By.xpath("(//span[text()='Goutam Kumar Goutam Kumar'])[1]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[76]")).click();	
        //driver.findElement(By.xpath("//div[text()='Aa']")).sendKeys("kya kr rha h goutam");
        Thread.sleep(5000);
        
        //driver.findElement(By.xpath("//*[local-name()='svg' and @class='xsrhx6k']")).click();
       
        
        
        /*//click on profile icon 
        driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']")).click();
        //Thread.sleep(3000);
        
        //Click on Logout button
        driver.findElement(By.xpath("//span[contains(.,'Log Out')]")).click();
        
        //Thread.sleep(5000);*/
        
        
        //driver.findElement(null)
        driver.manage().window().minimize();
        driver.quit();
	}
}

