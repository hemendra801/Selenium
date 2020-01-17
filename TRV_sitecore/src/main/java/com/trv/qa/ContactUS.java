package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactUS {

WebDriver driver;
@Test (priority=1)
public void ContactUS() throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://marutisuzukitruevalue.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	Thread.sleep(4000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 4000)");
	
	driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
	jse.executeScript("scroll(0, 200)");
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hemendra Singhal");
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8130084842");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemendra.singhal@adglobal360.com");
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hello Heman");

	Thread.sleep(2000);

	WebElement element1 = driver.findElement(By.xpath("//input[@type='checkbox' and @class= 'policy']"));
    jse.executeScript("arguments[0].click();", element1);
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@type='button']")).click();


}
	

}
