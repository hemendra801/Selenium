package com.truevalue.hyperlocal;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Truevalueofmathuraroad {
	@Test
	
	public void Class()
	
	{
		
//public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.truevalueofmathuraroad.com/");
	driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Sell')]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='col-sm-4 form-group']/input[@placeholder='Name*']")).sendKeys("Heman");
		driver.findElement(By.xpath("//input[@placeholder='Phone*']")).sendKeys("8130084842");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hemendra.singhal@adglobal360.com");
		driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option[contains(text (), 'ALTO K10')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Registration Number*']")).sendKeys("HR26CAS4422");
		WebElement element2=driver.findElement(By.xpath("//div [@class= 'book-test-check top-priv']/div/input[@type='checkbox']"));
		jse.executeScript("arguments[0].click();", element2);
		driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']/button[@type='button'][contains(text(),'Submit')]")).click();
		//driver.findElement(By.xpath("//div[@class='col-sm-12']//button[@type='button'][contains(text(),'Submit')]")).click();

		//driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option[contains(text (), 'ALTO K10 VXI AMT')]")).click();
		//driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option[contains(text (), 'SUPERIOR WHITE')]")).click();
		//driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option[contains(text (), '20,000 - 40,000 Km')]")).click();
		//driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option[contains(text (), '2017')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option [contains(text(),'FARIDABAD')]")).click();
		//driver.findElement(By.xpath("//div [@class= 'col-sm-4 form-group']/select/option [contains(text(),'TCS & ASSOCIATES PVT LTD')]")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Full Name*']")).sendKeys("Heman");
		//driver.findElement(By.xpath("//input[@placeholder='Mobile No.*']")).sendKeys("8130084842");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hemendra.singhal@adglobal360.com");
		
	
	

	}

}
