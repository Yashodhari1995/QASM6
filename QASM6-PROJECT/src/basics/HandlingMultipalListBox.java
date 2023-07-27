package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipalListBox {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/yashodhari/OneDrive/Desktop/HandlingListBox.html");
	WebElement colorListBox=driver.findElement(By.id("color"));
	Select s=new Select(colorListBox);
	Thread.sleep(1000);
	s.selectByIndex(0);
	s.selectByValue("G");
	s.selectByVisibleText("White");
	s.deselectByIndex(2);
	s.deselectByValue("O");
	s.deselectByVisibleText("Pink");
	boolean status=s.isMultiple();
	System.out.println(status);	
}
}
