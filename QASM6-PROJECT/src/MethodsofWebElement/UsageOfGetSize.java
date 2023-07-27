package MethodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		//username
		WebElement username = driver.findElement(By.id("email"));
		Dimension usernameDimension=username.getSize();
		int usernameWidth = usernameDimension.getWidth();
		System.out.println("usernameWidth="+ usernameWidth);
		int usernameHeight= usernameDimension.getHeight();
		System.out.println("usernameHeight="+usernameHeight);
		WebElement password=driver.findElement(By.id("passContainer"));
		Dimension passwordDimension=password.getSize();
		int passwordWidth = passwordDimension.getWidth();
		System.out.println("passwordWidth="+ usernameWidth);
		int passwordHeight= passwordDimension.getHeight();
		System.out.println("passwordHeight="+passwordHeight);
	}

}

/*OUT PUT
passwordWidth=364
passwordHeight=52*/

