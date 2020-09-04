package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Loginpage extends Pageutility{
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//h1[text()='Login']")
	WebElement login;
	@FindBy(xpath="//input[@type='text']")
	WebElement userName;
	@FindBy(xpath="//input[@type='password']")
	WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public void login(String username,String password) {
	
		userName.sendKeys(username);
		passWord.sendKeys(password);
		Pageutility.isElementLoaded(driver, submit, 5);
		submit.click();
		Pageutility.waitforElementTobeClickable(driver, submit, 3);
		//Pageutility.handlesleep(2000);
		
	}
	public boolean isLoginPageIsDisplayed() {
		
		return login.isDisplayed();
	
	}



}




