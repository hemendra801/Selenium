package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TrvEditProfilePageObject {
	
public TrvEditProfilePageObject(WebDriver driver){
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@type='text' and @id='prDisplayName']")
WebElement displayName;
public void setDisplayName() throws InterruptedException {
displayName.clear();
Thread.sleep(2000);
displayName.sendKeys("Heman");	
}
	
@FindBy(xpath="//input[@type='text' and @id='prName']")
WebElement Name;
public void setName() throws InterruptedException{
Name.clear();
Thread.sleep(2000);
Name.sendKeys("hemendra");
}

@FindBy(xpath="//input[@type='text' and @id='prEmail']")
WebElement email;
public void setEmail() throws InterruptedException{
email.clear();
Thread.sleep(2000);
email.sendKeys("hemendra.singhal@adglobal360.com");
}
	
@FindBy(xpath="//input[@type='tel' and @id='prMobile']")
WebElement mobileNumber;
public void setNumber() throws InterruptedException{
mobileNumber.clear();
Thread.sleep(2000);
mobileNumber.sendKeys("8130084842");	
}

@FindBy(xpath="//input[@type='tel' and @id='editProfilePin']")
WebElement pin;
public void setPin() throws InterruptedException{
pin.clear();
Thread.sleep(2000);
pin.sendKeys("202138");
}

@FindBy(xpath="//input[@type='text' and @id='prAddress']")
WebElement address;
public void setAddress() throws InterruptedException{
address.clear();
Thread.sleep(2000);
address.sendKeys("Block Colony");
}

@FindBy(xpath="//input[@type='button' and @id='prUpdateProfile']")
WebElement updatebtn;
public void updatebtn() throws InterruptedException{
Thread.sleep(2000);
updatebtn.click();
}	
{	
}	
}