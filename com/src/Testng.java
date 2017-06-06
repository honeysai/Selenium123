

import java.net.StandardSocketOptions;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Testng {
	
	@Test(priority=0,description="test cass will be log in")
	public void login(){

System.out.println("hi this is my first class for testng");

		
	}
	@Test(priority=1,description="test cass will be click")
	public void click(){

System.out.println("log in to the page");
Assert.assertEquals(12, 13);

	}
	@Test(priority=-1,description="test cass will be logout")
	public void logout(){

System.out.println("the mail will be sing out");
}
	}
