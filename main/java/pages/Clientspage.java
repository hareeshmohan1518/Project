package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Clientspage extends Pageutility {
	WebDriver driver;
	public Clientspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[text()='Client ID']")
	WebElement clientID;
	@FindBy(xpath="//a[text()='Client Name']")
	WebElement client_Name;
	@FindBy(xpath="Postcode")
	WebElement postCode;
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientButton;
	/*@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	WebElement clientsTab;*/
    @FindBy(xpath="//div[@class='summary']")
	WebElement textOnClientPage;
    @FindBy(xpath="//a[@href='/payrollapp/client/create']")
    WebElement createClientTab;

	@FindBy(xpath="//b[text()='1-1']")
	WebElement textAfterSearch;
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientName;
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientId;
/*	@FindBy(xpath="//button[@type='submit']")
	WebElement searchClient;
	@FindBy(xpath="//button[@type='reset']")
	WebElement resetClientSearch;*/
	@FindBy(xpath="//a[@href='/payrollapp/client/view?id=2']")
	WebElement view;
	@FindBy(xpath="//a[@href='/payrollapp/client/update?id=2']")
	WebElement update;
	@FindBy(xpath="//*[@id=\"w1\"]/table/thead/tr/th")
	List<WebElement>c;
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr")
	List<WebElement>r;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement home_Link;
	
	@FindBy(xpath="//ul[@class='pagination']")
	WebElement pages;
	
	public String getTextFromTheClientsPage() {
		
		return textOnClientPage.getText();
		
	}
	public boolean isTableHeadingsInTheClientpageAreDisplayed()
	{
		Pageutility.isElementLoaded(driver, clientID, 5);
		Pageutility.isElementLoaded(driver, client_Name, 3);
		
		return clientID.isDisplayed()&&client_Name.isDisplayed();
		
	}

	
	public String getTextAfterSearchingClient() {
	/*	String s=textAfterSearch.getText();
		System.out.println(s);*/
		Pageutility.isElementLoaded(driver, textAfterSearch, 5);
		return textAfterSearch.getText();
		
	}
	public boolean isCheckClientsTabDisplayed() {
		
		Pageutility.isElementLoaded(driver, clientButton, 5);
		return clientButton.isDisplayed();
		
	}
	public boolean isCheckSearchButtonisDisplayed() {
		
		return search.isDisplayed();
		
	}
	public boolean isCheckResetButtonisDisplayed() {
		
		return reset.isDisplayed();
	
	}
	public void searchClient(String clientname,String clientid) {
		
		clientName.sendKeys(clientname);
		clientId.sendKeys(clientid);
		search.click();
		Pageutility.waitforElementTobeClickable(driver, search, 5);
		
	}
	public void resetClientSearch() {
		
		Pageutility.isElementLoaded(driver, reset, 3);
		//Pageutility.handlesleep(3000);
		reset.click();
	
	}
	public void viewClientDetails() {
		
		Pageutility.isElementLoaded(driver, view, 5);
		view.click();
	//	Pageutility.waitforElementTobeClickable(driver, view, 5);
		
	}
	public boolean isViewIconIsDisplayed() {
		
		Pageutility.isElementLoaded(driver, view, 5);
		return view.isDisplayed();
	
	}
	public void clickOnUpdateIcon() {
		
	update.click();
	
	}
	public void showingListOfClientDetails() {
		
		int column=c.size();
		System.out.println(column);      
		Pageutility.handlesleep(3000);
		int row=r.size();
		System.out.println(row);
		
		for(int i=0;i<row;i++)
		{
			List<WebElement>currentrow=r.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<column;j++)
			{
				String text=currentrow.get(j).getText();
				System.out.println(text);
			}
			System.out.println();
			System.out.println("------------------------------------");
		}
	}
/*	public boolean isClientDetailsDisplayedInTabularFormat()
	{
		return c.is
	}*/
	
	
	public boolean isCreateClientTabDisplayed() {
		
		return createClientTab.isDisplayed();
		
		
		
	}
	public void clickOnCreateClientTab() {
		
		createClientTab.click();
		
	}
	
	public boolean isPageNumInBottomOfClientsPageIsDisplayed() {
		
		return pages.isDisplayed();
		
	}
	public boolean isHomeLinkIsDisplayedOnClientsPage() {
		
		return home_Link.isDisplayed();
	}
	public void clickOnHomeLink() {
	
		home_Link.click();
	}
public boolean isHomeLinkIsDisplayedOnCreateClientsPage() {
		
		return home_Link.isDisplayed();
	}
}
