package com.cse.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Healthcare_Medical {
	WebDriver driver;
	@Test (priority=1)

	public void Nonprofit_Educations() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.computersolutionseast.com");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	Thread.sleep(4000);
	Actions actions = new Actions(driver);
	WebElement Healthcare_Medical = driver.findElement(By.xpath("//li[@id='menu-item-6366']//span[@class='menu-text'][contains(text(),'Industry')]"));
	actions.moveToElement(Healthcare_Medical).perform();
	System.out.println("Done Mouse hover on 'Healthcare_Medical' from Menu");
	WebElement Healthcare_Medicals= driver.findElement(By.xpath("//li[@id='menu-item-1287']//a[@class='fusion-background-highlight']")); 
	Healthcare_Medicals.click();	
	Thread.sleep(4000);
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