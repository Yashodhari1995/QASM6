package WebElementsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipaleElements 
{
public static void main(String[]args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/gainers");
	Thread.sleep(2000);
	List<RemoteWebElement> allLinksOfTable =driver.findElements(By.xpath("//table[starts-with(")
			
     System.out.println(allLinksOfTable.size());
	for (WebElement Links : 
	{
		String anchorTagText=Link.getText();
		System.out.println(achorTagText);
	}
	driver.quit();
}

	}
