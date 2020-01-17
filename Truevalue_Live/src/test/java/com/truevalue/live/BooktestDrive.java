package com.truevalue.live;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BooktestDrive {
private static JavascriptExecutor jse;

public WebDriver driver;
@BeforeTest
public void TRV_Booking()
{
//public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.marutisuzukitruevalue.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='dropdown-toggle userBehaviour buy-car']")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 200)");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='carListBook']/span[starts-with(@id,'bookButton')]"));
	buttons.get(1).click();
}
	
	@Test (priority=1)
	public void Booktestdrive () {
	driver.findElement(By.xpath("//input[@id='nameBookModal']")).sendKeys("Heman Singhal");
	//driver.findElement(By.xpath("//input[@id='phoneBookModal']")).sendKeys("8130084842");
	//driver.findElement(By.xpath("//input[@id='emailBookModal']")).sendKeys("hemendra.singhal@adglobal360.com");
	driver.findElement(By.xpath("//div[@class= 'col-sm-12 book-test-check form-group']/div/label")).click();
	//jse.executeScript("arguments[0].click();", element3);
	driver.findElement(By.xpath("//button[@id='bookButtonListing']")).click();
//	driver.findElement(By.xpath("//*[@id=\"closeTestDriveModal\"]/span")).click();
//	List <WebElement> buttons = driver.findElements(By.xpath("//div[@class='carListBook']/span[starts-with(@id,'bookButton')]"));
//	buttons.get(1).click();
	}

	@Test (priority=2)
	public void Booktestdrive1 () {
	//driver.findElement(By.xpath("//input[@id='nameBookModal']")).sendKeys("Heman Singhal");
	driver.findElement(By.xpath("//input[@id='phoneBookModal']")).sendKeys("8130084842");
	//driver.findElement(By.xpath("//input[@id='emailBookModal']")).sendKeys("hemendra.singhal@adglobal360.com");
//	WebElement element3=driver.findElement(By.xpath("//div [@class= 'col-sm-12 book-test-check form-group']/div/input[@type= 'checkbox']"));
//	jse.executeScript("arguments[0].click();", element3);
	driver.findElement(By.xpath("//button[@id='bookButtonListing']")).click();
	}
//
//	@Test (priority=3)
//	public void Booktestdrive2()
//	{
//	driver.findElement(By.xpath("//input[@id='nameBookModal']")).sendKeys("Heman Singhal");
//	driver.findElement(By.xpath("//input[@id='phoneBookModal']")).sendKeys("8130084842");
//	driver.findElement(By.xpath("//input[@id='emailBookModal']")).sendKeys("hemendra.singhal@adglobal360.com");
//	WebElement element1=driver.findElement(By.xpath("//div [@class= 'col-sm-12 book-test-check form-group']/div/input[@type= 'checkbox']"));
//	jse.executeScript("arguments[0].click();", element1);
//	driver.findElement(By.xpath("//button[@id='bookButtonListing']")).click();
//
//
//}
}