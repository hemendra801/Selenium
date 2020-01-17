package com.truevalue.hyperlocal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Website2 {

	@Test
	
	public void Class() throws InterruptedException
	{
	
	//public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.truevalueofmathuraroad.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[contains(text(),'Buy')]")).click();
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("scroll(0, 500)");
List<WebElement> list=driver.findElements(By.xpath("//button[@type='button'][contains (text(), 'Book Test Drive')]"));
jse.executeScript("arguments[0].click();", list.get(1));
driver.findElement(By.xpath("//*[@id=\"nameBookModal\"]")).sendKeys("Heman Singhal");
driver.findElement(By.xpath("//*[@id=\"phoneBookModal\"]")).sendKeys("8130084842");
driver.findElement(By.xpath("//*[@id=\"emailBookModal\"]")).sendKeys("hemendra.singhal@adglobal360.com");
driver.findElement(By.xpath("//*[@id=\"booktestDriveFormBody\"]/div/form/div[1]/div[1]/div[4]/div/label")).click();
driver.findElement(By.xpath("//*[@id=\"bookButton\"]")).click();
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
Thread.sleep(10);
String thankYou = driver.findElement(By.xpath("//*[@id=\"booktestDriveThankYou\"]/div/div[1]")).getText();
if(thankYou.contains("Test Drive Booked Successfully")) {
	System.out.println(thankYou);
	System.out.println("Test success");
}
	}

}
