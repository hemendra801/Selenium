package com.truevalue.hyperlocal;
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
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("http://www.truevalueofmathuraroad.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navigation1\"]/nav/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"inventoryBlock\"]/li[1]/div/div/div[1]/a/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nameDetail\"]")).sendKeys("Heman Singhal");
		driver.findElement(By.xpath("//*[@id=\"mobileDetail\"]")).sendKeys("8130084842");
		driver.findElement(By.xpath("//*[@id=\"emailDetail\"]")).sendKeys("hemendra.singhal@adglobal360.com");
		//driver.findElement(By.xpath("//*[@id=\"car-details-page\"]/div[2]/div/div[5]/div[4]/div/div/label")).click();
		WebElement element2=driver.findElement(By.xpath("//div[@class ='form-group col-sm-12']/div/div/input[@type='checkbox']"));
		jse.executeScript("arguments[0].click();", element2);
		//driver.findElement(By.xpath("//*[@id=\"car-details-page\"]/div[2]/div/div[5]/div[6]/a")).click();
	WebElement	element3=driver.findElement(By.xpath("//div[@class='col-sm-12 col-xs-12 book-drive-detail-AWolpHQWxuAvBRd4p0CF']//a[@class='book-test-drive-btn book-detail'][contains(text(),'Book Test Drive')]"));
		jse.executeScript("arguments[0].click();", element3);
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(1000);
		String thankYou = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div")).getText();
		if(thankYou.contains("THANK YOU FOR SHOWING INTEREST")) {
			System.out.println(thankYou);
			System.out.println("Test success");
		}
			}

	}