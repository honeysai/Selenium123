package oops;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gemail {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com");
	driver.findElement(By.id("link-signup")).click();
	driver.findElement(By.id("FirstName")).sendKeys("sree");
	driver.findElement(By.id("LastName")).sendKeys("Divya");
	
	driver.findElement(By.id("GmailAddress")).sendKeys("sreedv1255@gmail.com");
	driver.findElement(By.id("password-label")).sendKeys("ilovedad123");
	driver.findElement(By.id("PasswdAgain")).sendKeys("ilovedad123");

	Select sel =new Select(driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")));
	sel.selectByVisibleText("January");
	driver.findElement(By.id("'BirthDay")).sendKeys("6");
	driver.findElement(By.id("BirthYear")).sendKeys("1992");
	Select sel1 =new Select(driver.findElement(By.xpath(".//*[@id='Gender']/div[1]")));
	sel.selectByVisibleText("Female");
	driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9394793974");
	driver.findElement(By.id(":i"));
	Thread.sleep(300);
	
	driver.findElement(By.id("submitbutton")).click();

}
}