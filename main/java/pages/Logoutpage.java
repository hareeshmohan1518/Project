package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Logoutpage extends Pageutility {
	WebDriver driver;
	public Logoutpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@class='logout-btn']")
	WebElement logoutButton;
	
	public void logout() {
		
		Pageutility.isElementLoaded(driver, logoutButton, 5);
		logoutButton.click();
		//Pageutility.waitforElementTobeClickable(driver, logoutButton, 5);
	
	}

}
