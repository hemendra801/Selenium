package com.truevalue.hyperlocal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class insurance {
@Test
	public void TRV_booklisting() {
	System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.truevalueofmathuraroad.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='userBehaviour'][contains(text(),'Insurance')]")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 450)");
	driver.findElement(By.xpath("//div[@class= 'col-sm-6 col-md-3 form-group']/select/option[@value= 'A STAR']")).click();
	driver.findElement(By.xpath("//div[@class= 'col-sm-6 col-md-3 form-group']/input[@placeholder= 'Registration Number*']")).sendKeys("HR26CAS4422");
	driver.findElement(By.xpath("//div[@class= 'col-sm-6 col-md-3 form-group']/select/option[@value= 'January']")).click();
	driver.findElement(By.xpath("//div[@class= 'col-sm-6 col-md-3 form-group']/select/option[@value= '2017']")).click();
	driver.findElement(By.xpath("//input[@id='insurance-policyNo']")).sendKeys("123");
	driver.findElement(By.xpath("//input[@id='insurance-Cmp']")).sendKeys("test");
	driver.findElement(By.xpath("//input[@id='insurance-date']")).sendKeys("11/08/2018");
	driver.findElement(By.xpath("//input[@id='insurance-name']")).sendKeys("Heman Singhal");
	driver.findElement(By.xpath("//input[@id='insurance-email']")).sendKeys("hemendra.singhal@adglobal360.com");
	driver.findElement(By.xpath("//input[@id='insurance-mobNo']")).sendKeys("8130084842");
	WebElement element1=driver.findElement(By.xpath("//div[@class= 'col-sm-12 form-group']/div/div/input[@type= 'checkbox']"));
	jse.executeScript("arguments[0].click();", element1);
	driver.findElement(By.xpath("//div[@class='col-sm-12 form-group']//button[@type='button'][contains(text(),'Submit')]")).click();
System.out.println("Wow It's Done");
	
	driver.close();	
}


}
