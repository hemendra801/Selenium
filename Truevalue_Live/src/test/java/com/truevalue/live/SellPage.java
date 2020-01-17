package com.truevalue.live;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SellPage {

@Test

public void TRV_SellPage () throws InterruptedException

{
	//public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.marutisuzukitruevalue.com/");
	driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/ul/li[3]/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 400)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div [@class= 'col-sm-6']/div/select/option [contains(text(),'AGRA')]")).click();
		driver.findElement(By.xpath("//div [@class= 'col-sm-6']/div/select/option [contains(text(),'MADHUSUDAN MOTORS PVT. LTD, AGRA')]")).click();
		driver.findElement(By.xpath("//div[@class='col-md-10 col-md-offset-1']//input[@placeholder='Name*']")).sendKeys("Heman");
		driver.findElement(By.xpath("//input[@placeholder='Phone*']")).sendKeys("8130084842");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hemendra.singhal@adglobal360.com");
		WebElement element2=driver.findElement(By.xpath("//div[@class ='col-sm-12']/div/div/input[@type= 'checkbox']"));
		jse.executeScript("arguments[0].click();", element2);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();		
		driver.findElement(By.xpath("//div [@class= 'col-sm-4']/div/input [@id= 'registrationNumber']")).sendKeys("HR26CAS4422");
		driver.findElement(By.xpath("//div [@class= 'col-sm-4']/div/select/option[contains(text (), 'New Alto K10')]")).click();
		driver.findElement(By.xpath("//div [@class= 'col-sm-4']/div/select/option[contains(text (), 'ALTO K10 LX')]")).click();
		driver.findElement(By.xpath("//div [@class= 'col-sm-4']/div/select/option[contains(text (), 'SUPERIOR WHITE')]")).click();
		driver.findElement(By.xpath("//div [@class= 'col-sm-4']/div/select/option[contains(text (), '2017')]")).click();
		driver.findElement(By.xpath("//div [@class= 'col-sm-4']/div/select/option[contains(text (), 'Upto 20,000 km')]")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']//button[@type='button'][contains(text(),'Submit')]")).click();
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Sell Second Hand Cars Online in India - Maruti Suzuki True Value");

	}

}
