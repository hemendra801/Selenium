package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class buypage {
WebDriver driver;

@Test (priority=1)
public void Buypage() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
	//System.setProperty("webdriver.firefox.marionette","E:\\Hemendra Data\\Selenium Data\\geckodriver.exe");	
	//WebDriver driver = new FirefoxDriver();
	driver = new ChromeDriver();
	driver.get("https://marutisuzukitruevalue.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='menubox left']//a[contains(text(),'Buy')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//label[@for='trueValue1']")).click();
	Thread.sleep(4000);
	List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='testDriveButton']/a[@data-target='.booktestdrive']"));
	buttons.get(1).click();
	driver.findElement(By.xpath("//input[@id='namee']")).sendKeys("Heman Singhal");
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8130084842");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemendra.singhal@adglobal360.com");
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//div[@class='loginCheckBox']/div/input[@type='checkbox'][@id='testlogin']")).click();
	WebElement element=driver.findElement(By.xpath("//div[@class='custumCheckbox']/input[@id='testlogin']"));
	JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].click();", element);
	Thread.sleep(4000);
    driver.findElement(By.xpath("//button[@class='blueButton']")).click();
	
	
	
		
		
	}
}
