package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MyAccount {

WebDriver driver;
@Test (priority=1)
public void MyAccount() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://marutisuzukitruevalue.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='text-right']//a[contains(text(),'login')]")).click();
	driver.findElement(By.xpath("//input[@id='loginMobileFirst']")).sendKeys("8130084842");
	driver.findElement(By.xpath("//button[@class='sendotpbtn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='text-right']//a[contains(text(),'My Account')]")).click();
	Thread.sleep(4000);

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 300)");
	Thread.sleep(4000);
		
	 //WebElement uploadElement = driver.findElement(By.xpath("//label[@for='file-input']"));
     //uploadElement.sendKeys("E:\\Photos\\Clicks");

    // WebElement UploadImg = driver.findElement(By.xpath("//label[@for='file-input']"));
     //UploadImg.click();
     //WebElement frame =driver.switchTo().activeElement();
     //frame.sendKeys("E:\\Photos\\Clicks\\IMG_0079.jpg");
     
	WebElement displayName = driver.findElement(By.xpath("//input[@type='text' and @id='prDisplayName']"));
	displayName.clear();
	Thread.sleep(2000);
	displayName.clear();
	displayName.sendKeys("Heman Singhal");
	
	Thread.sleep(4000);

	WebElement Name = driver.findElement(By.xpath("//input[@type='text' and @id='prName']"));
	Name.clear();
	Thread.sleep(2000);
	Name.sendKeys("Hemendra Singhal");
	
	Thread.sleep(4000);

	WebElement Email = driver.findElement(By.xpath("//input[@type='text' and @id='prEmail']"));
	Email.clear();
	Thread.sleep(2000);
	Email.sendKeys("hemendra.singhal@adglobal360.com");
     
	Thread.sleep(4000);
	
	WebElement Mobile = driver.findElement(By.xpath("//input[@type='tel' and @id='prMobile']"));
	Mobile.clear();
	Thread.sleep(2000);
	Mobile.sendKeys("8130084842");
     
	Thread.sleep(4000);
	
	WebElement Pincode = driver.findElement(By.xpath("//input[@type='tel' and @id='editProfilePin']"));
	Pincode.clear();
	Thread.sleep(2000);
	Pincode.sendKeys("202138");
	
	Thread.sleep(4000);

	WebElement Address = driver.findElement(By.xpath("//input[@type='text' and @id='prAddress']"));
	Address.clear();
	Thread.sleep(2000);
	Address.sendKeys("Block Colony Khair Aligarh");
	
	Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@type='button' and @id='prUpdateProfile']")).click();
	
	Thread.sleep(2000);

	WebElement element=driver.findElement(By.xpath("//div[@class='modal fade errorModal show']//div[@class='closemodal']//img"));
    jse.executeScript("arguments[0].click();", element);
	
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("//li[@class='nav-item']/a[@data-value='wishlist']")).click();
	

    //driver.findElement(By.xpath("//input[@type='button' and @class='signoutbtn']")).click();
    
	
		}
}
