package MethodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm");
		WebElement tgTag=driver.findElement(By.id("adminCredentialsHeader"));
		String tdTagText=tgTag.getText();
		System.out.println(tdTagText);
		driver.manage().window().minimize();
		driver.quit();
	}
}
