package ExecuteTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.TrvEditProfilePageObject;
import Pageobjects.TrvLoginPageObject;
import Pageobjects.TrvMyaccountPageObject;

public class TestTrvSite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Hemendra Data\\Selenium Data\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://truevalue.azurewebsites.net");	
		
		//Login page Automation
		TrvLoginPageObject loginpage= new TrvLoginPageObject(driver);
		loginpage.clickOnLogin();
		Thread.sleep(2000);
		loginpage.enterNumber("xpath");
		loginpage.clickOnSubmit();
		
		Thread.sleep(2000);
		//My Account Automation
		TrvMyaccountPageObject Myaccount= new TrvMyaccountPageObject(driver);
		Myaccount.clickOnMyaccountButton();
		
		//Edit Profile Automation
		TrvEditProfilePageObject Editprofile= new TrvEditProfilePageObject(driver);
		
		Editprofile.setDisplayName();
		Editprofile.setName();
		Editprofile.setEmail();
		Editprofile.setNumber();
		Editprofile.setPin();
		Editprofile.setAddress();
		Editprofile.updatebtn();
		
		
		

	}

}
