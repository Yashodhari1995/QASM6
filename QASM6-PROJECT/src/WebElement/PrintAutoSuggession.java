package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintAutoSuggession {
	static {
		System.setProperty("WebDriver.Chrome.driver","./driver/Chromedriver.exe");
	}
		
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new EdgeDriver();
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("java");
    Thread.sleep(2000);
    List<WebElement>allsugg=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
    int count=allsugg.size();
    System.out.println(count);
    for(int i=0;i<count;i++)
    {
    	String text=allsugg.get(i).getText();
    	System.out.println(text);
    }
    
    allsugg.get(0).click();
    driver.quit();
    
			}
}

