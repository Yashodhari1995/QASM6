//Write a script to print all the links present in amazon and also take the input from the user

package WebElement;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllTheLinksPresentInAmezon {

		static {
				System.setProperty("webdriver.Chrome.driver","./driver/Chromedriver.exe");
		}

				public static void main(String[] args) {
					System.out.println("enter the url");
					Scanner sc=new Scanner(System.in);
					String url = sc.nextLine();
					WebDriver driver=new EdgeDriver();
					driver.get(url);
					/*driver.get("https://www.amazon.in//");*/
					
				    List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
				    int count=alllinks.size();
				    System.out.println(count);
				    for(int i=0;i<count;i++)
				    {
				    	String text=alllinks.get(i).getText();
				    	System.out.println(text);
				    }
				    driver.close();
	}

}
