package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class ClientsPageSearchFieldsVerification {

WebDriver driver;
	
	public ClientsPageSearchFieldsVerification(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientName;
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientId;
	
	
	public boolean isCheckClientNameSearchFieldisEnabled()
	{
	return clientName.isDisplayed();
	
	}
	public boolean isCheckClientIdSearchFieldisEnabled()
	{
		return clientId.isDisplayed();
	}
	
}
