package com.trv.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sell_UTM {
	WebDriver driver;
	
	@Test (priority=1)
	public void Buypage_filter() throws InterruptedException 
	{	
          System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com/"); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  Thread.sleep(4000); 
		  WebElement element = driver.findElement(By.name("q"));
		  element.sendKeys("Maruti Suzuki true value"); 
		  element.submit();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//h3[@class='sA5rQ']")).click();
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("scroll(0, 100)"); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='nav-link custumButton']")).click();
		  driver.findElement(By.xpath("//input[@id='vregistration']")).sendKeys("DL5CN1553");
		  driver.findElement(By.xpath("//input[@id='vmobile']")).sendKeys("8130084842"); 
		  driver.findElement(By.xpath("//div[@class='customselect']/div/select/option[@value='N' and contains(text (), 'Agra')]")).click();
		  driver.findElement(By.xpath("//input[@id='sellsearchButton']")).click();
		  Thread.sleep(2000); 
		  jse.executeScript("scroll(0, 200)");
		  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hemendra Singhal"); 
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//div[@class='form-group col-lg-4 col-md-12']/div/select/option[contains (text(), 'Madhusudan Motors')]")).click();
		  WebElement element1 =driver.findElement(By.xpath("//input[@type='checkbox'and @class='checkbox1']")); 
		  jse.executeScript("arguments[0].click();", element1);
		  driver.findElement(By.xpath("//input[@id='formstepone']")).click();
		  Thread.sleep(2000); 
		  jse.executeScript("scroll(0, 100)"); Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Preferred Date*']")).sendKeys("20-Nov-2019"); 
		  Thread.sleep(2000); 
		  WebElement element2 =driver.findElement(By.xpath("//input[@type='checkbox'and @class='checkbox2']")); 
		  jse.executeScript("arguments[0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ].click();", element2); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='formsteptwo']")).click();
		  
		 
		  Thread.sleep(4000);
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
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='customer_name']")).sendKeys("Hemendra");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//tr[1]//td[7]//a[1]")).click();
			jse.executeScript("scroll(0, 600)");
		 	
}}