package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CarDetailPage {
	
	
WebDriver driver;
@Test (priority=1)
	public void CarDetail() throws InterruptedException
	{		
			System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://marutisuzukitruevalue.com/");	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript("scroll(0, 700)");
			
			//List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='menubox left']//a[contains(text(),'Buy')]"));
			//buttons.get(1).click();
		    driver.findElement(By.xpath("//div[@class='menubox left']//a[contains(text(),'Buy')]")).click();
			Thread.sleep(4000);
			List <WebElement> image = driver.findElements(By.xpath("//div[@class='carsecImage']"));
				image.get(1).click();
				
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Heman Singhal");
			driver.findElement(By.xpath("//input[@id='mobile_carDetails']")).sendKeys("8130084842");
			driver.findElement(By.xpath("//input[@id='email_carDetails']")).sendKeys("hemendra.singhal@adglobal360.com");
			WebElement element = driver.findElement(By.xpath("//input[@type='checkbox' and @class='policyy']"));
			jse.executeScript("arguments[0].click();", element);
		
			driver.findElement(By.xpath("//input[@class='redButton']")).click();
			
			
	}
}
