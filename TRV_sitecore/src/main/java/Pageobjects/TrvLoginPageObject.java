package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrvLoginPageObject {
	
	// make Constructor
	public TrvLoginPageObject(WebDriver driver) {
	
	//Notation for this page
	PageFactory.initElements(driver, this);
	}
	
	// Create Objects
	@FindBy(xpath="//div[@class='text-right']//a[contains(text(),'login')]")
	public WebElement loginbtn;
	
	@FindBy(xpath="//input[@name='loginMobileFirst']")
	public WebElement mobilenumber;
	
	@FindBy(xpath="//button[@class='sendotpbtn']")
	public WebElement submitbtn;
	
	public void clickOnLogin() {
		loginbtn.click();
	}
	
	public void enterNumber(String xpath) {
		mobilenumber.sendKeys("8130084842");
	}
	public void clickOnSubmit() {
		submitbtn.click();
		
	}
	}

	
