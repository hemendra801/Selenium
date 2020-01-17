package com.truevalue.live;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrueValueLive {
	


public WebDriver driver;
public WebElement element1;
public WebElement checkbox;
public List <WebElement> buttons;
public static JavascriptExecutor jse;

@BeforeTest
public void Detail_Page() throws InterruptedException 

{

		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.marutisuzukitruevalue.com/");
		driver.manage().window().maximize();			
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"cars-result\"]/div[1]/div[1]/a[3]/img")).click();
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 400)");
		Thread.sleep(2000);				
	}
	

@Test (priority=1)
public void TrueValueLive1()

{
		driver.findElement(By.xpath("//div[@class ='col-md-4 hidden-sm hidden-xs']/div/div[3]/div/ div[1][@class='form-group pos-rel']/input[1][starts-with(@id,'name') and @placeholder='Name']")).sendKeys("Heman");
		driver.findElement(By.xpath("//div[@class ='col-md-4 hidden-sm hidden-xs']/div/div[3]/div/ div[2][@class='form-group pos-rel']/input[1][starts-with(@id,'mobile') and @placeholder='Enter Mobile No.']")).sendKeys("8130084842");
		driver.findElement(By.xpath("//div[@class ='col-md-4 hidden-sm hidden-xs']/div/div[3]/div/ div[3][@class='form-group pos-rel']/input[1][starts-with(@id,'email') and @placeholder='Enter your email.']")).sendKeys("hemendra.singhal@adglobal360.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		checkbox=driver.findElement(By.xpath("//div[@class ='col-md-4 hidden-sm hidden-xs']/div/div[3]/div/div[4]/div/div/input"));
		jse.executeScript("arguments[0].click();", checkbox);
		element1=driver.findElement(By.xpath("//div[starts-with(@id,'bookButton')]//a[@class='book-test-drive-btn ga-book-test-drive'][contains(text(),'Book Test Drive')]"));
		jse.executeScript("arguments[0].click();", element1);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

}
	
@AfterTest
public void afterTest(){

	driver.close();
}

}


