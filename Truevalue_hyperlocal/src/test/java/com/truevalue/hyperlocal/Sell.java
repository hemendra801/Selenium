package com.truevalue.hyperlocal;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sell {
	@Test
	
	public void Class()
	
	{
		
//public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:/Selenium/Chrome driver/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.truevalueofmathuraroad.com/");
	driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"nav-link\" and contains(@href,'sell-car')]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"Name\"]")).sendKeys("Heman");
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("8130084842");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("hemendra.singhal@adglobal360.com");
		driver.findElement(By.xpath("//div [@class= 'col-md-4 mb-2 mb-md-0']/select/option[contains(text (), 'INVICTO')]")).click();
		driver.findElement(By.xpath("//input[@id=\"RegistrationNumber\"]")).sendKeys("HR26CAS4422");
		driver.findElement(By.xpath("//div [@class= 'col-md-4']/select/option[contains(text (), 'true value of 18/1 Mathura Road')]")).click();
		WebElement element2=driver.findElement(By.xpath("//input[@id=\"conditionId\"]"));
		jse.executeScript("arguments[0].click();", element2);
		driver.findElement(By.xpath("//button[@id=\"btnsubmit\"]")).click();
	
	}

}
