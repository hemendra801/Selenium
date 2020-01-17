package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrvBuyPageObject {
	
	public TrvBuyPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//div[@class='menubox left']//a[@href='/buy-car']")	
WebElement Buylink;
public void Buylink() {
Buylink.click();	
	
}


@FindBy(xpath="//label[@for='trueValue1']")	
WebElement Trvcheckbox;
public void Trvcheckbox() {
Trvcheckbox.click();	
	
}	

@FindBy(xpath="//div[@class='testDriveButton']/a[@data-target='.booktestdrive']")	
WebElement btnbook;
public void btnbook() {
btnbook.click();	
}	

	
@FindBy(xpath="//input[@id='namee']")	
WebElement setName;
public void setName() {
setName.sendKeys("Hemendra Singhal");
}	
@FindBy(xpath="//input[@id='mobile']")	
WebElement setMobile;
public void setMobile() {
setMobile.sendKeys("8130084842");
}	
@FindBy(xpath="//input[@id='email']")	
WebElement setEmail;
public void setEmail() {
setEmail.sendKeys("hemendra.singhal@adglobal360.com");	
}	
@FindBy(xpath="//input[@type='checkbox'and @class='testlogin']")	
WebElement privacycheckbox;
public void privacycheckbox() {
privacycheckbox.click();	
}	


@FindBy(xpath="//button[@class='blueButton']")	
WebElement btnbooktest;
public void btnbooktest() {
btnbooktest.click();	

}	

	
	
	
	
}
