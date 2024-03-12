package com.truevalue.hyperlocal;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormValidation {

	@Test
	public void Class() throws InterruptedException
	{
	//public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "D:/Selenium/Chrome driver/chromedriver-win64/chromedriver.exe");
WebDriver driver = new ChromeDriver();


driver.get("http://www.truevalueofmathuraroad.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("scroll(0, 400)");
Thread.sleep(2000);	

driver.findElement(By.xpath("//div//input[@name=\"name\"]")).sendKeys("Heman Singhal");
driver.findElement(By.xpath("//div//input[@name=\"email\"]")).sendKeys("hemendra.singhal@adglobal360.com");
driver.findElement(By.xpath("//div//input[@name=\"MobileNumber\"]")).sendKeys("8130084842");
driver.findElement(By.xpath("//div//select [@class= 'form-control']/option[contains(text (), 'true value of 18/1 Mathura Road')]")).click();
driver.findElement(By.xpath("//div//select [@class= 'form-control form-control-looking']/option[contains(text (), 'Buy')]")).click();
driver.findElement(By.xpath("//div//button[@id=\"btnsubmit\"]")).click();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
Thread.sleep(10);
String thankYou = driver.findElement(By.xpath("//*[@id=\"booktestDriveThankYou\"]/div/div[1]")).getText();
if(thankYou.contains("Test Drive Booked Successfully")) {
	System.out.println(thankYou);
	System.out.println("Test success");
}
	}

}
