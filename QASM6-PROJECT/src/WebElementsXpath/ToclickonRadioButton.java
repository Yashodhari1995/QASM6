package WebElementsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToclickonRadioButton {

	public static void main(String[] args) 
	{
	WebDriver diver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/")
	Thread.sleep(2000);
	WebElement maleradioButton=driver.findElement(By.xpath("//lable[text()='Male'"))
		

	}

	
}
