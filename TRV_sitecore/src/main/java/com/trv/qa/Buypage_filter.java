package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Buypage_filter {
WebDriver driver;
	
@Test (priority=1)
public void Buypage_filter() throws InterruptedException 
{	
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://marutisuzukitruevalue.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='dSearch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dSearch']")).sendKeys("Alto");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[contains(text(),'ALTO')]")).click();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 700)");
		driver.findElement(By.xpath("//label[@for='brand1']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='inraccordCheckBox alto']//div[1]//label[1]")).click();
		//Thread.sleep(4000);
      
        //jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		//Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='testDriveButton']")).click();
        driver.findElement(By.xpath("//input[@id='namee']")).sendKeys("Hemendra Singhal");
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8130084842");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemendra.singhal@adglobal360.com");
        WebElement element=driver.findElement(By.xpath("//input[@type='checkbox'and @class='testlogin']"));
        jse.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//button[@class='blueButton']")).click();
		
	}


}
