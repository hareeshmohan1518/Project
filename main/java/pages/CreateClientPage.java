package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateClientPage {
	WebDriver driver;
	public CreateClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//label[text()='Branch']")
	WebElement branch;
	@FindBy(xpath="//select[@id='client-branch_id']")
	WebElement branch_Name;
	@FindBy(xpath="//label[text()='Invoice Order']")
	WebElement invoice_Order;
	@FindBy(xpath="//select[@id=\"client-invoice_order\"]")
	WebElement invoiceOrder;
	
	@FindBy(xpath="//label[text()='Division']")
	WebElement division;
	@FindBy(xpath="//select[@id=\"client-division_id\"]")
	WebElement divison_Name;
	
	
	
	@FindBy(xpath="//select[@id='client-invoice_delivery_method']")
	WebElement invoice_Delivery_Method;
	@FindBy(xpath="//input[@id='client-client_name']")
	WebElement client_Name;
	@FindBy(xpath="//input[@id='client-phone']")
	WebElement phone_Number;
	@FindBy(xpath="//select[@id='client-master_document']")
	WebElement master_Doc;
	@FindBy(xpath="//textarea[@id='client-client_address']")
	WebElement client_Address;
	@FindBy(xpath="//input[@id='client-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='client-settilement_days']")
	WebElement settilement_Days;
	@FindBy(xpath="//input[@id='client-postcode']")
	WebElement post_Code;
	@FindBy(xpath="//input[@id='client-company_reg']")
	WebElement company_Reg;
	@FindBy(xpath="//select[@id='client-vat_rate']")
	WebElement vat_Rate;
	@FindBy(xpath="//label[text()='Country']")
	WebElement country;
	@FindBy(xpath="//input[@id='client-country']")
	WebElement country_Name;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save_Button;
	
	public boolean isCreateClientPageIsDisplayed() {
		return branch.isDisplayed()&&invoice_Order.isDisplayed()&&division.isDisplayed();
		
	}
	public boolean isFieldForCreateClientIsDisplayed() {
		return branch.isDisplayed()&&invoice_Order.isDisplayed()&&division.isDisplayed()&&invoice_Delivery_Method.isDisplayed()&&client_Name.isDisplayed()&&phone_Number.isDisplayed()&&master_Doc.isDisplayed()&&client_Address.isDisplayed()&&email.isDisplayed()&&settilement_Days.isDisplayed()&&post_Code.isDisplayed()&&company_Reg.isDisplayed()&&vat_Rate.isDisplayed()&&country.isDisplayed();
		
	}
	public boolean isSaveButtonDisplayedInCreateClientPage() {
		return save_Button.isDisplayed();
	}
	
	public void addBranchNameForNewClient(String branchName) {
		
		Select branch1=new Select(branch_Name);
		branch1.selectByVisibleText(branchName);
	}
	public void addInvoiceOrderForNewClient(String invoiceorder) {
		
		Select invoice=new Select(invoiceOrder);
		invoice.selectByVisibleText(invoiceorder);
	}
	public void addDivisionForNewClient(String division_name) {
		Select divisionBranch=new Select(divison_Name);
		divisionBranch.selectByVisibleText(division_name);
	}
	public void addInvoiceDeliveryMethodForNewClient(String invoiceDeliveryMethod) {
		
		Select invoice=new Select(invoice_Delivery_Method);
		invoice.selectByVisibleText(invoiceDeliveryMethod);
	}
	public void addMasterDocumentForNewClient(String masterDocumentType) {
		
		Select doc=new Select(master_Doc);
		doc.selectByVisibleText(masterDocumentType);
	}
	public void addClientNameForNewClient(String clientName) {
		
		client_Name.sendKeys(clientName);
	}
	public void addPhoneNumberForNewClient(String phonenum) {
		
		phone_Number.sendKeys(phonenum);
	}
	public void addClientAddressForNewClient(String clientAddress) {
	
		client_Address.sendKeys(clientAddress);
	}
	public void addEmailIdForNewClient(String emailId) {
		
		email.sendKeys(emailId);
	}
	public void addSettilementDaysForNewClient(String settilementDays) {
		
		settilement_Days.sendKeys(settilementDays);
	}
	public void addPostCodeForNewClient(String postCode) {
		
		post_Code.sendKeys(postCode);
	}
	public void addCompanyRegForNewClient(String companyReg) {
		
		company_Reg.sendKeys(companyReg);
	}
	public void addVatRateForNewClient(String vatRate) {
		
		Select vat=new Select(vat_Rate);
		vat.selectByVisibleText(vatRate);
	}
	public void addCountryDetailForNewClient(String country_name) {
		
		country_Name.clear();
		country_Name.sendKeys(country_name);
	}
	public void clickOnSaveButton() {
		
		save_Button.click();
	}
}
