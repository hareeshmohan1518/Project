package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewClientsDetailspage {
	
	WebDriver driver;
	public ViewClientsDetailspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//h1[text()='Westerleigh Nursing Home Regency Medicine Ltd']")
	WebElement textOnViewClientsdetails;
	@FindBy(xpath="//td[text()='Westerleigh Nursing Home Regency Medicine Ltd']")
	WebElement client_Name;
	@FindBy(xpath="//td[text()='BN25 1BD']")
	WebElement post_Code;
	
	public String getTextFromViewClientDetails()
	{
		return textOnViewClientsdetails.getText();
	}
	public String getTextOfClientName() {
		return client_Name.getText();
	}
	public String getTextOfPostCode() {
		return post_Code.getText();
	}

}
