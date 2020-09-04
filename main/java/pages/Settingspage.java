package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settingspage {
	
	WebDriver driver;
	public Settingspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//h1[text()='Users']")
	WebElement textOnSettingsPage;

	public String getTextFromSettingspage()
	{
		return textOnSettingsPage.getText();
	}
}
