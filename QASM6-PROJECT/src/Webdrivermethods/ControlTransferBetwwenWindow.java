package Webdrivermethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ControlTransferBetwwenWindow {

		public static void main(String[] args) throws InterruptedException {
			// Instantiate the browser specific class
			WebDriver driver = new ChromeDriver();
			//pre-condition-maximize the window
			driver.manage().window().maximize();
			//pass the main url of the app
			driver.get("https://demoqa.com/browser-windows");
			Thread.sleep(2000);
			//find the new window button click
			driver.findElement(By.id("windowButton")).click();
			//capture the current window id
			Thread.sleep(2000);
			//there are two windows here
			//getwindowHanle()
			//it will capture the window ID where the driver is present.
			Set<String>allWindowsid=driver.getWindowHandles();
			for(String wid:allWindowsid)
			{
				String windowUrl=driver.switchTo().window(wid).getCurrentUrl();
				System.out.println(windowUrl);
			}
			driver.quit();
			
			}
	}
				
