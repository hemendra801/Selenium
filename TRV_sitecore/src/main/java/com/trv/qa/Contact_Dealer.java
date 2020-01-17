                                                                         package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact_Dealer {
	
	WebDriver driver;
	//JavascriptExecutor jse = (JavascriptExecutor) driver;

	@Test (priority=1)
	public void Buypage_Contact() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://marutisuzukitruevalue.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='menubox left']//a[contains(text(),'Buy')]")).click();
		Thread.sleep(4000);
		//jse.executeScript("scroll(0, 100)");
		List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='conDealButton']"));
		buttons.get(1).click();
		driver.findElement(By.xpath("//input[@id='cdname']")).sendKeys("Heman Contact Dealer");
		driver.findElement(By.xpath("//input[@id='cdmobile']")).sendKeys("8130084842");
		driver.findElement(By.xpath("//input[@id='cdemail']")).sendKeys("hemendra.singhal@adglobal360.com");
		WebElement element=driver.findElement(By.xpath("//div[@class='custumCheckbox']/input[@id='cdtestlogin']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].click();", element);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[contains(text(),'Contact Dealer')]")).click();
		
		
		
		}
	
}
