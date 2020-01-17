package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Sellpage {
WebDriver driver;
@Test (priority=1)
public void Sellpage() throws InterruptedException 
{	
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://marutisuzukitruevalue.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(4000);
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
		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox'and @class='checkbox1']"));
	    jse.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//input[@id='formstepone']")).click();
		Thread.sleep(2000);
		jse.executeScript("scroll(0, 100)");

		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Preferred Date*']")).sendKeys("31-Oct-2019");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//input[@type='checkbox'and @class='checkbox2']"));
	    jse.executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='formsteptwo']")).click();
		
}

}
