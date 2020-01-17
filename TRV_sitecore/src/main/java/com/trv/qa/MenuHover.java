package com.trv.qa;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

public class MenuHover {

WebDriver driver;
@Test (priority=1)
	public void CarDetailPage() throws InterruptedException
	{		
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://marutisuzukitruevalue.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	Thread.sleep(4000);
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
				
	//Instantiate Action Class        
	Actions actions = new Actions(driver);
		        
	//Retrieve WebElement 'By Model' to perform mouse hover 
		        
	WebElement Bymodel = driver.findElement(By.xpath("//li[@class='has-submenu']//a[contains(text(),'By Model')]"));
		       
	//Mouse hover menuOption 'By Model'
		        
	actions.moveToElement(Bymodel).perform();
	System.out.println("Done Mouse hover on 'By Model' from Menu");
		
	//Now Select 'Alto' from sub menu which has got displayed on mouse hover of 'By Model'
	WebElement selectAlto = driver.findElement(By.xpath("//a[contains(text(),'Alto 800')]")); 
	selectAlto.click();		
	Thread.sleep(4000);

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 500)");
	
	Thread.sleep(4000);

	List <WebElement> buttons = driver.findElements(By.xpath("//input[@type='checkbox' and @class='compareCheckBox_listing']"));
	buttons.get(1).click();
	Thread.sleep(2000);

	List <WebElement> buttons1 = driver.findElements(By.xpath("//input[@type='checkbox' and @class='compareCheckBox_listing']"));
	buttons1.get(2).click();
	Thread.sleep(2000);

	List <WebElement> buttons2 = driver.findElements(By.xpath("//input[@type='checkbox' and @class='compareCheckBox_listing']"));
	buttons2.get(3).click();
	Thread.sleep(2000);

	List <WebElement> buttons3 = driver.findElements(By.xpath("//input[@type='checkbox' and @class='compareCheckBox_listing']"));
	buttons3.get(4).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//a[@class='tab_carcompare carcompare active']")).click();
	
	
	WebElement Compare = driver.findElement(By.xpath("//a[@class='tab_carcompare carcompare']"));
		        
	actions.moveToElement(Compare).perform();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//a[@class='comparebtn']")).click();
	
	jse.executeScript("scroll(0, 1200)");
	
	Thread.sleep(2000);

	List <WebElement> buttons4 = driver.findElements(By.xpath("//td/a[@class='testDrvLinkBtn']"));
	buttons4.get(1).click();
	
	driver.findElement(By.xpath("//input[@id='namee']")).sendKeys("Hemendra Singhal");
	driver.findElement(By.xpath("//form[@id='form-book-test-drive']//input[@id='mobile']")).sendKeys("8130084842");
	driver.findElement(By.xpath("//form[@id='form-book-test-drive']//input[@id='email']")).sendKeys("hemendra.singhal@adglobal360.com");
	
	WebElement element1 = driver.findElement(By.xpath("//input[@type='checkbox' and @class='testlogin']"));
    jse.executeScript("arguments[0].click();", element1);
	
driver.findElement(By.xpath("//button[@class='blueButton']")).click();
	
	
}
}

