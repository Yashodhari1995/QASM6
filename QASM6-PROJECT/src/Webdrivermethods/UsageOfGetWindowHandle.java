package Webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsageOfGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pre-condition-maximize the window
		driver.manage().window().maximize();
		//pass the main url of the app
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		//find the new window button click
	  //driver.findElement(By.id("windowid="+windowid)).click();
		//Thread.sleep(5000);
		//capture the current window id
		//there are two windows here
		getwindowHanle();
		//it will capture the window ID where the driver is present.
		String windowid=driver.getWindowHandle();
		System.out.println("windowid="+windowid);
		Set<String>allWindowsid=driver.getWindowHandles();
		for(String wid:allWindowsid)
		{
			System.out.println(wid);
		}
		driver.quit();
		
		}

	private static void getwindowHanle() {
		// TODO Auto-generated method stub
		
	}
}
			
