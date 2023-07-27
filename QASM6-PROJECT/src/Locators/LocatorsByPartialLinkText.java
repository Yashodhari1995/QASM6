package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByPartialLinkText {

	public static void main(String[] args) throws Throwable {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.sit.ac.in/html/home.html");
	  	 //naac identification  
	  driver.findElement(By.partialLinkText("Accredited by NAAC with A Grade"));
	  Thread.sleep(2000);
	  driver.findElement(By.partialLinkText("NAAC")).click();
	  Set<String> allWindowsId=driver.getWindowHandles();
	  for(String wid:allWindowsId)
	  {
		  String WindowUrl=driver.switchTo().window(wid).getCurrentUrl();
		  if(WindowUrl.contains("nacecertificatecycle"))
			  Thread.sleep(2000);
		  {
			  driver.close();
		  }
			  
	  }
	  

	}

}
