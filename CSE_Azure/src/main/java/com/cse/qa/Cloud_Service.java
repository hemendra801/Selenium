package com.cse.qa;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Cloud_Service {
	
	WebDriver driver;
	@Test (priority=1)

	public void ITService_innerpage() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.computersolutionseast.com");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	Thread.sleep(4000);
	
//Instantiate Action Class        
Actions actions = new Actions(driver);
			        
//Retrieve WebElement 'IT Services' to perform mouse hover 
WebElement IT_Services = driver.findElement(By.xpath("//li[@id='menu-item-6364']//span[@class='menu-text'][contains(text(),'IT Services')]"));
			       
//Mouse hover menuOption 'By Model'
actions.moveToElement(IT_Services).perform();
System.out.println("Done Mouse hover on 'IT_Services' from Menu");
			
//Now Select 'Alto' from sub menu which has got displayed on mouse hover of 'IT Service'
WebElement Cloud_Services = driver.findElement(By.xpath("//li[@id='menu-item-1277']//span[contains(text(),'Cloud Services')]")); 
Cloud_Services.click();	
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("scroll(0, 350)");
driver.findElement(By.xpath("//button[@id='catapultCookie']")).click();
driver.findElement(By.xpath("//input[@id='contactformfname']")).sendKeys("Heman");
driver.findElement(By.xpath("//input[@id='contactformlname']")).sendKeys("Singhal");
driver.findElement(By.xpath("//input[@id='contactformcname']")).sendKeys("Test");
driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("hsinghal801@gmail.com");
driver.findElement(By.xpath("//input[@id='contactformtel']")).sendKeys("8130084842");
driver.findElement(By.xpath("//div[@class='wpcf7-select-parent']/select/option[@value='1-10']")).click();
driver.findElement(By.xpath("//div[@class='wpcf7-select-parent']/select/option[@value='It Services']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='cntSubmit']")).click();

}
}
