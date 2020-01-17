package com.cse.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home_Page {

WebDriver driver;

@Test (priority=1)

public void homepage() {
	
System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.computersolutionseast.com");	
driver.manage().window().maximize();	
System.out.print("Page successfully load");
		
	}

}
