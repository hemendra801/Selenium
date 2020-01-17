package com.truevalue.live;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	@Test
	
	public void TRV_Brokenlink()
	{

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marutisuzukitruevalue.com/sitemap");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links are " +links.size());
		for( int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			UrlBroken1(url);
		}
		driver.close();
		}
		public static void UrlBroken1(String urlLink) {
			try {
				URL link = new URL(urlLink);
				HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
				httpconn.setConnectTimeout(10000);
				httpconn.connect();
				if(httpconn.getResponseCode() == 302) {
					//System.out.println("These Links are working fine");
				System.out.println(urlLink + " - " +httpconn.getResponseMessage() +" - " +httpconn.getResponseCode());
				}
				if(httpconn.getResponseCode() >= 400) {
					System.out.println(urlLink + " - " +httpconn.getResponseMessage() +" - " +httpconn.getResponseCode());
				}
			}
			
				catch(Exception  e) {}
			}
		
}