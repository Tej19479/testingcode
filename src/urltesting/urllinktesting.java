package urltesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urllinktesting {
public static void main(String[] args) {

	WebDriver d =new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.faircent.com/");
  List<WebElement> links =  d.findElements(By.tagName("a"));
	System.out.println("No of link are "+links.size());
	/*for (int i = 0; i < links.size(); i++) {
	   System.out.println(links.get(i).getAttribute("href"));
	}*/
	
	for (WebElement e : links) {
		
		String r  = e.getAttribute("href");
		System.out.println("Number of link is use to our company is used =="+r);
	}
	
	d.quit();
}
}
