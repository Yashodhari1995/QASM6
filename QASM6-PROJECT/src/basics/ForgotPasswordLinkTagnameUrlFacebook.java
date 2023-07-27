package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ForgotPasswordLinkTagnameUrlFacebook {

	public static void main(String[] args) {
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  WebElement link =driver.findElement(By.linkText("Forgotten password?"));
	  String tagname=link.getTagName();
	  System.out.println("tagname:"+tagname);
	  String url=link.getAttribute("href");
	  System.out.println("url:"+url);
	  driver.close();
	  

	}

}
