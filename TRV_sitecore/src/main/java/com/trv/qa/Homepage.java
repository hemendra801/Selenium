package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage 
{
public static JavascriptExecutor jse;	
public WebDriver driver;
public WebElement element1;
public WebElement checkbox;


@Test (priority=1)
public void Homepage() throws InterruptedException
{	
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		driver.get("https://marutisuzukitruevalue.com/");			
		//jse = (JavascriptExecutor)driver; 
		//jse.executeScript("scroll(0, 700)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='menubox left']//a[contains(text(),'Buy')]")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(500);	
		List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='testDriveButton']/a[contains (text(), 'Book a Test Drive')]"));
		buttons.get(1).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='namee']")).sendKeys("Hemendra Singhal");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8130084842");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemendra.singhal@adglobal360.com");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(6000);	
	       //	WebElement element1= driver.findElement(By.xpath("//span[contains(text(),'I authorize Maruti Suzuki India Ltd. or its partne')]"));
	      //  jse.executeScript("arguments[0].s;", element1);
 	     // driver.findElement(By.xpath("//*[@id=\"testlogin\"]")).click(); 
	    //WebElement element = driver.findElement(By.xpath("//input[@data-empty='Please authorize Maruti Suzuki India Ltd. or its partners to call me']"));
	   //Actions actions = new Actions(driver);
	  //actions.moveToElement(element).click().build().perform();
	 //driver.findElement(By.xpath("//input[@data-empty='Please authorize Maruti Suzuki India Ltd. or its partners to call me']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='testlogin']")));
		driver.findElement(By.xpath("//input[@id='testlogin']")).click();
		
	//	driver.findElement(By.xpath("//span[contains(text(),'I authorize Maruti Suzuki India Ltd. or its partne')]")).click();

		
	
	}


}
