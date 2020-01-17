package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrvMyaccountPageObject {
public TrvMyaccountPageObject(WebDriver driver) {	
PageFactory.initElements(driver, this);	
	


}
		@FindBy(xpath="//div[@class='text-right']//a[contains(text(),'My Account')]")
		WebElement editProfile;
		
		public void clickOnMyaccountButton() {
		editProfile.click();
			
			
		}
		
		@FindBy(xpath="//li[@class='nav-item']/a[@data-value='wishlist']")
		WebElement wishlist;
		
		public void clickOnWishlistButton() {
			wishlist.click();
			
			
		}
		
		@FindBy(xpath="//li[@class='nav-item']/a[@data-value='recentlyViewed']")
		WebElement recentlyViewed;
		@FindBy(xpath="//li[@class='nav-item']/a[@data-value='bookingHistory']")
		WebElement bookingHistory;
		
		
		
		
		
		
		
		
	}
