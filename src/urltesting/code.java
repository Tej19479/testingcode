package codechallege;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class code {
	public static void main(String[] args) throws InterruptedException {
	 String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']" ;
		String xpath_today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";  
		String xpath_thisyear_pop = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		WebDriver driver = new ChromeDriver();
		int count = 1;
		while(count<=20) {
			if(count==21)break;
		driver.get("https://www.worldometers.info/world-population/");
		System.out.println("--------current poplation---------------");
		printPopulationData(xpath_current_pop);
		System.out.println("Today and This | population-------------");
	
		printPopulationData(xpath_today_pop);
		Thread.sleep(1000);
		count++;
	}
		
	}	
		
		
		public static  void printPopulationData(String locator)
		{
			
				List<WebElement> popList = driver.findElements(By.xpath(locator));

				
				for (WebElement e : popList) 
				{
					System.out.println(e.getText());
					
			}
		}
}


