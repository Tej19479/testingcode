package codechallege;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cuurentpupaltoin {
	/* keep getting the count of{
	 * current world population
	 * today,birthdeath ,death and population groeyh yoday
	 * This year birh,death and poplulation
	 * while(true)
	 * keep getting the element text ussing selenium
	 * print consle 
	 * break the loop afte feww second
	 * main
	 */
public static void main(String[] args) {
	ChromeDriver d = new ChromeDriver();
			d.get("https://www.worldometers.info/world-population/");
			
			
			while(true)
			{
				List<WebElement> popList = d.findElements(By.xpath(" //div[@class='maincounter-number']/span/span"));

			for (WebElement e : popList) {
				System.out.println(e.getText());
				
			}
			List<WebElement> popList = d.findElements(By.xpath(" //div[@class='maincounter-number']/span/span"));

			}
}

}
