package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Homepage extends Pageutility{
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	//@FindBy(xpath="//a[@href='/payrollapp/site/index']")
	//WebElement home;
	@FindBy(xpath="//h1[text()='Payroll Application']")
	WebElement text;
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientButton;
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement user;
	@FindBy(xpath="//a[@href='/payrollapp/user']")
	WebElement settings;
	
	public String getTextOfWelcomeText() {
		
		Pageutility.isElementLoaded(driver, text, 5);
		String s=text.getText();
		//System.out.println(s);
	    /*	String a="PAYROLL APPLICATION";
		System.out.println(a);*/
		//Pageutility.waitforElementTobeClickable(driver, text, 3000);
		return s;
		
	}
	public void clickonClientsTab() {
		
		Pageutility.waitforElementTobeClickable(driver, clientButton, 5);
		clientButton.click();
		
	}
	public void clickonUsername() {
		
		Pageutility.isElementLoaded(driver, user, 5);
		user.click();
		Pageutility.waitforElementTobeClickable(driver, user, 3);                //not need
	
	}
	public boolean isSettingsLinkDisplayed() {
		
		Pageutility.isElementLoaded(driver,settings, 5);
		return settings.isDisplayed();
	
	}
	public void clickonSettings() {
		
		Pageutility.isElementLoaded(driver, settings, 5);
		settings.click();
		Pageutility.waitforElementTobeClickable(driver, settings, 5);                 //not need
	
	}
	
}
