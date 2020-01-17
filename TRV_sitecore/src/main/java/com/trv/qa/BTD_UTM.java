package com.trv.qa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BTD_UTM {
	
WebDriver driver;
@Test (priority=1)
	public void Book_Test_Drive_UTM() throws InterruptedException 
	{	
          System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com/"); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  Thread.sleep(4000); 
		  WebElement element = driver.findElement(By.name("q"));
		  element.sendKeys("Maruti suzuki true value"); 
		  element.submit();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//h3[contains(text(),'Maruti Suzuki True Value | Certified Used Cars In')]")).click();
		  Thread.sleep(2000);

		
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  //jse.executeScript("scroll(0, 200)"); 

		  driver.findElement(By.xpath("//div[@class='menubox left']//a[contains(text(),'Buy')]")).click();
		  Thread.sleep(2000);
		  List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='testDriveButton']/a[@data-target='.booktestdrive']"));
			buttons.get(1).click();
			driver.findElement(By.xpath("//input[@id='namee']")).sendKeys("Heman");
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8130084842");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemendra.singhal@adglobal360.com");
			Thread.sleep(4000);
			WebElement element1=driver.findElement(By.xpath("//div[@class='custumCheckbox']/input[@id='testlogin']"));
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		    jse1.executeScript("arguments[0].click();", element1);
			Thread.sleep(4000);
		    driver.findElement(By.xpath("//button[@class='blueButton']")).click();
		    
		    Thread.sleep(8000);
		    
			 driver.close();
			 
			    driver = new ChromeDriver();
			    
			    driver.get("https://trvportal.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("agladmin");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xP)9(4@Zv+8C*b%X");
				driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class='sidebarToggle sidebarToggleBtn sidebarCross']")).click();
				driver.findElement(By.xpath("//a[@class='sidebar-anchor lead-management'][contains(text(),'Lead Management')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(text(),'Enquiry List')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class='sidebarToggle sidebarToggleBtn sidebarCross open']")).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath("//input[@name='customer_name']")).sendKeys("Heman");
				Thread.sleep(8000);
				driver.findElement(By.xpath("//tr[1]//td[7]//a[1]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//b[contains(text(),'Click here to view more details')]")).click();  
				jse.executeScript("scroll(0, 400)"); 
	}
}
