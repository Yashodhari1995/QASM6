package MethodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckForBackGroundColor {

	public static void main(String[] args) {
	     WebDriver driver=new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	     driver.get("https://www.facebook.com/");
	     WebElement loginButton=driver.findElement(By.name("login"));
	     String backgroundcolor= loginButton.getCssValue("background-color");
	     System.out.println("backgroundcolor="+backgroundcolor);
	     //Chrome-rgba(24,119,242,1)
	     String hexaValue=Color.fromString(backgroundcolor).asHex();
	     driver.manage().window().minimize();
	     driver.quit();
	    
	}

}
