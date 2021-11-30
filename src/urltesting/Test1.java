package Scripts;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLabraries.BaseClass;
import pom.Login;

public class Test1 extends BaseClass {
	@Test
	public void homepage() throws InterruptedException, FileNotFoundException, IOException
	{
		Login l = new Login(driver);
		l.logButton();
		Thread.sleep(1000);
		l.Email(p.getdata("mail"));
		l.password(p.getdata("Password"));
		Thread.sleep(5000);
		
		l.Singin();
	}

}
