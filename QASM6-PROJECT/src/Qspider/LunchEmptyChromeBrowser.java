package Qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchEmptyChromeBrowser {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.com");
	}
}
