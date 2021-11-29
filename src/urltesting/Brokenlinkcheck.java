package urltesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkcheck {
	public static void main(String[] args) {
		
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.faircent.com");
      List<WebElement> links =  d.findElements(By.tagName("a"));
		System.out.println("No of link are "+links.size());
		System.out.println("name of link"+links);
		
		
		List<String> urlList = new ArrayList<String>();
		
		for (WebElement e : links)
		{
		
			String url = e.getAttribute("href");
			urlList.add(url);
			//checkBrokenLink(url); line by  check link with 
		}   
		// parrelmode
		Long stTime = System.currentTimeMillis();
	//	urlList.parallelStream().forEach(e -> checkBrokenLink(e)); // parllel stream check with link  connection 
		urlList.stream().forEach(e -> checkBrokenLink(e));  // sequnce link with check
		Long endtime = System.currentTimeMillis();
		System.out.println("Total time taken :"+(endtime-stTime));
		
		
		
		d.quit();
		
	}

	public static void checkBrokenLink(String linkurl)
	{
		try {
			
			URL url = new URL(linkurl);  // this package come with java.node package
              HttpURLConnection  httpUrlConnection =  (HttpURLConnection)  url.openConnection();			
              httpUrlConnection.connect();
              httpUrlConnection.setConnectTimeout(5000);
              if(httpUrlConnection.getResponseCode()>=400)
              {
            	  System.out.println(linkurl+"---->>"+httpUrlConnection.getResponseMessage()+"is borken link");
              }
              else
              {
            	  System.err.println(linkurl + "------>>"+httpUrlConnection.getResponseMessage());
              }
              
              
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
