package urltesting;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hashmap {
public static void main(String[] args) {
	//Role based -- permsion based use case
	// custmer user -->>> go to the app >> buy th e a product -->>
	//admin user -->> go to app -->> csn  sell all the order 
	// seller user -->> o to app>> see only the those order which are relavlante
	
	// distrubutor user >> go to user can see respective order user 
	// delivery buy user -->> can use the order and deliver product
	//category manager uer -->>> go to app>> add all the product
	
	// custome care user
	
	 WebDriver d = new ChromeDriver();
	d.get("https://crmpro.com/index.html");
	// d.findElement(By.name("username")).sendKeys("nameusername");
	 // d.findElement(By.name("password")).sendKeys("Test123");	
	
	System.out.println(getCreadetialsMap());
	System.out.println(getCreadetialsMap().get("Customer")); //TejAutomatiom:Tej@123
	// String credentaila_customer =getCreadetialsMap().get("Customer");
	//d.findElement(By.name("username")).sendKeys(credentaila_customer.split(":")[0]);
//	d.findElement(By.name("password")).sendKeys(credentaila_customer.split(":")[1]);	
	
    d.findElement(By.name("username")).sendKeys(getUserName("distrbutor"));
	d.findElement(By.name("password")).sendKeys(getPassowrd("distrbutor"));	
	
	
}

public static HashMap<String, String> getCreadetialsMap()
{
HashMap<String , String> userMap = new  HashMap<String , String>();
userMap.put("Customer", "Tejautomation:Tej@123");
userMap.put("admin", "Teja:Tej@123");
userMap.put("distrbutor", "Boy:Tej@123");
userMap.put("seller", "Golu:Tej@123");
userMap.put("deliverygirl", "girl:Tej@123");

return userMap;

}
public static String getUserName(String role)
{
	 String credentaila_customer =getCreadetialsMap().get(role);
	 return credentaila_customer.split(":")[0];
}

public static String getPassowrd(String pass )
{
	 String credentaila_customer =getCreadetialsMap().get(pass);
	 return credentaila_customer.split(":")[1];
}





}
