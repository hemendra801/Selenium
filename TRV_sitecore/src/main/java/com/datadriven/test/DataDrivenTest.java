package com.datadriven.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.XlsReader;

public class DataDrivenTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://truevalue.azurewebsites.net");	
		driver.manage().window().maximize();
				
		
		Xls_Reader reader = new Xls_Reader("C:/Users/AGL/eclipse-workspace/TRV_sitecore/src/main/java/com/testdata/booktestdata.xlsx");
		
		
		
		
	}

}
