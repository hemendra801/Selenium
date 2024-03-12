package com.truevalue.hyperlocal;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DetailPageBookDrive {

	@Test
	public void Class() throws InterruptedException
	{
//public static void main(String[] args) throws InterruptedException {	
System.setProperty("webdriver.chrome.driver", "D:/Selenium/Chrome driver/chromedriver-win64/chromedriver.exe");
WebDriver driver = new ChromeDriver();
JavascriptExecutor jse = (JavascriptExecutor)driver;
driver.get("http://www.truevalueofmathuraroad.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.xpath("//body/div[4]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(4000);
		List <WebElement> images = driver.findElements(By.xpath("//div[@class='carsecImage']"));
		images.get(1).click();
		Thread.sleep(4000);
		
driver.findElement(By.xpath("//div//input[@id=\"Name\"]")).sendKeys("Heman Singhal");
driver.findElement(By.xpath("//div//input[@id=\"MobileNumber\"]")).sendKeys("8130084842");
driver.findElement(By.xpath("//div//input[@name=\"email\"]")).sendKeys("hemendra.singhal@adglobal360.com");
WebElement element2=driver.findElement(By.xpath("//div//input[@id=\"conditionId\"]"));
jse.executeScript("arguments[0].click();", element2);		
WebElement	element3=driver.findElement(By.xpath("//div//button[@id=\"btnsubmit\"]"));
jse.executeScript("arguments[0].click();", element3);
driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
Thread.sleep(1000);
{
	System.out.println("Test success");
}

}
	}