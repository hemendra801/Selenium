package com.truevalue.hyperlocal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class insurance {
@Test
	public void TRV_booklisting() {
	System.setProperty("webdriver.chrome.driver", "D:/Selenium/Chrome driver/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.truevalueofmathuraroad.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(@href,'insurance')]")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 450)");	
	driver.findElement(By.xpath("//div//input [@id=\"inpname\"]")).sendKeys("Heman Singhal");
	driver.findElement(By.xpath("//div//input [@id=\"MobileNumber\"]")).sendKeys("8130084842");
	driver.findElement(By.xpath("//div//input [@id=\"inpemail\"]")).sendKeys("hemendra.singhal@adglobal360.com");
	driver.findElement(By.xpath("//div//select [@class= 'form-control rounded-0']/option[contains(text (), 'true value of 18/1 Mathura Road')]")).click();
	WebElement element1=driver.findElement(By.xpath("//input[@id= 'conditionId']"));
	jse.executeScript("arguments[0].click();", element1);
	driver.findElement(By.xpath("//button[@id= 'btninsurance']")).click();
System.out.println("Sucess");
	driver.close();	
}
}
