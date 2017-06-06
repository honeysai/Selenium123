package oops;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb {
public static void main(String[] args) {
	String URL ="https://www.facebook.com";
	 String expTitle ="Facebook";
	 WebDriver driver =new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(URL);
	String  ActualTitle =driver.getTitle();
	System.out.println(driver.getTitle());
if (expTitle.equals(ActualTitle)){
	System.out.println("Tital pass");
}
else { System.out.println("Tital fail");
	
}
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("vdivya1255@gmail.com");
System.out.println("enter uname");
driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys();
System.out.println("enter password");
driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
System.out.println("login");
driver.findElement(By.xpath(".//*[@id='u_0_4']/div[1]/div[1]/div/a")).click();
driver.navigate().back();
System.out.println("back");
driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
System.out.println("logout");
	}
}

