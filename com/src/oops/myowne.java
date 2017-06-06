package oops;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myowne {
public static void main(String[] args) {
	String URL="https://www.facebook.com";
	String ActualTitle="facebook";
	
	WebDriver Driver=new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Driver.get(URL);
	System.out.println(URL);
	
	String ExpTitel=Driver.getTitle();

	 
}
}
