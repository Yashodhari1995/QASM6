package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsageofSubmit {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/getting_started/");
		driver.switchTo().activeElement().sendKeys("7892746347");
		WebElement passwordTextField=driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("gold@123");
		driver.findElement(By.name("login")).click();
		//WebElement ProfileIcon = driver.findElement(By.xpath())
		
		
		
	}

}
