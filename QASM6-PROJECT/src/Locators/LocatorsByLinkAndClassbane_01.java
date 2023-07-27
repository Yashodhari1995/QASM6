package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByLinkAndClassbane_01 {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//find click on forgotten password
	WebElement Forgottenpassword=driver.findElement(By.linkText("Forgottenpassword")
}
}
