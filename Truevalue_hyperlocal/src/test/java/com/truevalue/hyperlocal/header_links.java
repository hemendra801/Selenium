package com.truevalue.hyperlocal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class header_links {

	@Test
	
	public void Class() throws InterruptedException
	{
	
	//public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:/Selenium/Chrome driver/chromedriver-win64/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.truevalueofmathuraroad.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[contains(@href,'about-us')]")).click();

System.out.println("About Page sucessfully open");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[contains(@href,'finance')]")).click();
System.out.println("Finnace Page Sucessfully open");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[contains(@href,'insurance')]")).click();
System.out.println("Insurance Page Sucessfully open");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[contains(@href,'outlet-car')]")).click();
System.out.println("Outlet Page Sucessfully open");

Thread.sleep(2000);

driver.findElement(By.xpath("//li//a[contains(@href,'privacy-policy')]")).click();
System.out.println("Privacy Policy Page Sucessfully open");
	System.out.println("Test success");
	
	
}
	}

