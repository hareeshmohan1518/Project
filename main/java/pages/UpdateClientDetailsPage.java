package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Pageutility;

public class UpdateClientDetailsPage {
	WebDriver driver;
	public UpdateClientDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
    @FindBy(xpath="//select[@name='Client[invoice_delivery_method]']")
	WebElement invoiceDeliveryMethod ;
    @FindBy(xpath="//select[@id='client-branch_id']")
    WebElement branch_Name;
    @FindBy(xpath="//input[@id='client-fax']")
    WebElement faxNumber;
    @FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;
	@FindBy(xpath="//h1")
	WebElement afterUpdate;
	@FindBy(xpath="//td[text()='Eastbourne   City']")
	WebElement branch_Name_Verification;
	@FindBy(xpath="//td[text()='Electronic']")
	WebElement invoice_Delivery_Method_Verification;
	@FindBy(xpath="//th[text()='Fax']")
	WebElement fax_Number_Verification;
	
/*	@FindBy(xpath="//th[text()='Updated At']")
	WebElement updated_Details;*/
	@FindBy(xpath="//table[@class='table table-striped table-bordered detail-view']/tbody/tr[24]/td[1]")
	WebElement date_Time;
	
	
	public void selectInvoiceDeliveryMethodClientDetails(String invoice) {
	
		Pageutility.isElementLoaded(driver,invoiceDeliveryMethod, 5);
		
		Select branch1=new Select(invoiceDeliveryMethod);
		
		branch1.selectByVisibleText(invoice);
		
		//Pageutility.waitforElementTobeClickable(driver, invoiceDeliveryMethod, 2000);
	//	Pageutility.isElementLoaded(driver, save, 5);
		
	
	}
	public void selectBranchNameInClientDetails(String branchName) {
		
		Select branch=new Select(branch_Name);
		branch.selectByVisibleText(branchName);
		
	}
	public void updateFaxNumber(String keysToSend) {
		faxNumber.clear();
		faxNumber.sendKeys(keysToSend);
		
	}
	public void clickOnSaveButton() {
		saveButton.submit();
		Pageutility.waitforElementTobeClickable(driver, saveButton, 5);
	}
	public String getTextOfBranchName() {
		
		Pageutility.isElementLoaded(driver, branch_Name_Verification, 5);
		return branch_Name_Verification.getText();
	}
	public String getTextOfInvoiceDeliveryMethod() {
		
		Pageutility.isElementLoaded(driver, invoice_Delivery_Method_Verification, 4);
		return invoice_Delivery_Method_Verification.getText();
	
	}
	public String getTextOfFaxNumber() {
		
		Pageutility.isElementLoaded(driver,fax_Number_Verification, 3);
		return fax_Number_Verification.getText();
	}
	
	public String getTextFromUpdatedClientPage() {
		
		return afterUpdate.getText();
		
	}
	public void UpdatedTimeAndDate(){
		
		Pageutility.isElementLoaded(driver, date_Time, 5);
		String s=date_Time.getText();
	System.out.println(s);
		
	}
}
