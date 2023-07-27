package WebElement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class PrintAllLinksWiproJobs {
	
	public class PrintAutoSuggession {
		static {
			System.setProperty("WebDriver.Chrome.driver","./driver/Chromedriver.exe");
		}	
		public static void main(String[] args) throws InterruptedException {
	    WebDriver driver =new EdgeDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("wiprojobs");
	    List<WebElement>allLinks=driver.findElements(By.xpath("//div[@class='hdtb-mitem hdtb-msel']"));
	    int count=allLinks.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++)
	    	
	    {
	    	String text=allLinks.get(i).getText();
	    	System.out.println(text);
	    }
           driver.close();
          }

	}
}