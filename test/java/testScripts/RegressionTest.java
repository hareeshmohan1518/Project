package testScripts;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pages.ClientsPageSearchFieldsVerification;

import pages.Clientspage;
import pages.CreateClientPage;
import pages.Homepage;
import pages.Loginpage;
import pages.Logoutpage;
import pages.Settingspage;
import pages.UpdateClientDetailsPage;
import pages.ViewClientsDetailspage;
import utilities.ExcelUtility;
import utilities.GenericUtility;
import utilities.Pageutility;

public class RegressionTest extends TestHelper{
 //@Test
  public void verifyValidLogin() {
	  
	  Loginpage login=new Loginpage(driver);
	 // Assert.assertTrue(login.isCheckLoginPageIsDisplayed());
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);  
	  Assert.assertEquals(home.getTextOfWelcomeText(),"PAYROLL APPLICATION");
                                                                 //Assertion
  }
 //@Test
  public void verifyHomepageLoaded() {
	  
	  Loginpage login=new Loginpage(driver);                    
	  login.login("carol","1q2w3e4r");     
	  Homepage home=new Homepage(driver);              
	 // dashboard.getTextOfWelcomeText();
	  Assert.assertEquals(home.getTextOfWelcomeText(),"PAYROLL APPLICATION");
	 // System.out.println("HomePage verified succesfully");
	  
  }
//@Test
  public void verifyValidLogoutFromHomePage() {
	
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");   
	  Homepage home=new Homepage(driver); 
	  home.clickonUsername();
	  Logoutpage logout=new  Logoutpage(driver);     
	  logout.logout();
	  Assert.assertTrue(login.isLoginPageIsDisplayed());
	  
  }
//@Test
 public void verifySettingsLinkIsDisplayedInLoginpage() {
	 
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");   
	  Homepage home=new Homepage(driver); 

	  Assert.assertTrue( home.isSettingsLinkDisplayed()); 
	  
                                                                                //assertion for settingspage
 }
 //@Test
 public void verifySettingsPageIsLoaded() {
	 
	 Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");   
	  Homepage home=new Homepage(driver); 
	  home.clickonSettings();
	  Settingspage settings=new Settingspage(driver);
	  Assert.assertEquals(settings.getTextFromSettingspage(), "USERS");
	  
	
	 
 }
//@Test
  public void verifyClientsTabIsDisplayed() {
	  
	  Loginpage login=new Loginpage(driver);                    
	  login.login("carol","1q2w3e4r");     
	//  Homepage home=new Homepage(driver);    
	 // home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  Assert.assertTrue(clients.isCheckClientsTabDisplayed());

  }
//@Test
  public void verifyClientsPageDisplayed() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  Assert.assertTrue(clients.isTableHeadingsInTheClientpageAreDisplayed());
	
	// Assert.assertEquals(clients.getTextFromTheClientsPage(), "Showing 1-20 of 105 items.");   //table heading assertion
  
  }
 // @Test
  public void verifyHomeLinkIsDisplayedInClientsPage() {
	
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  Assert.assertTrue(clients.isHomeLinkIsDisplayedOnClientsPage());
  }
//@Test
public void verifyHomepageIsLoadedWhenClickedHomeLinkFromClientspage() {
	
	 Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnHomeLink();
	  Assert.assertEquals(home.getTextOfWelcomeText(),"PAYROLL APPLICATION");
}
//@Test
public void verifyHomeLinkIsDisplayedInCreateClientpage() {
	
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  Assert.assertTrue(clients.isHomeLinkIsDisplayedOnCreateClientsPage());
}
//@Test
public void verifyHomepageIsLoadedWhenClickedHomeLinkFromCreateClientPage() {
	
	Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  clients.clickOnHomeLink();
	  Assert.assertEquals(home.getTextOfWelcomeText(),"PAYROLL APPLICATION");
	
}

  //@Test
  public void verifyButtonsInClientsPageIsDisplayed() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
      Assert.assertTrue(clients.isCheckSearchButtonisDisplayed());
      Assert.assertTrue(clients.isCheckResetButtonisDisplayed());
 
  }
 //@Test
  public void verifySearchForClientFromClientsDetils() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.searchClient("Middleton Grove", "3");
	  Assert.assertEquals(clients.getTextAfterSearchingClient(),"1-1" ); 
	 
  }
 //@Test
  public void verifyResetClientSearch() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.searchClient("Middleton Grove", "3");
	  clients.resetClientSearch();
	  Assert.assertTrue(clients.isTableHeadingsInTheClientpageAreDisplayed());
	 // Assert.assertEquals(clients.getTextFromTheClientsPage(), "Showing 1-20 of 105 items.");
  
  }
 //@Test
 public void verifyViewIconIsDisplayed() {
	 
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  Assert.assertTrue(clients.isViewIconIsDisplayed());
	  
	
  }
// @Test
 public void verifyClientDetailsLoaded() {
	 
	 Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.viewClientDetails();
	  ViewClientsDetailspage view=new ViewClientsDetailspage(driver);
	  Assert.assertEquals(view.getTextFromViewClientDetails(), "WESTERLEIGH NURSING HOME REGENCY MEDICINE LTD");
	  Assert.assertEquals(view.getTextOfClientName(), "Westerleigh Nursing Home Regency Medicine Ltd");
	  Assert.assertEquals(view.getTextOfPostCode(), "BN25 1BD");
 }
 //@Test
 public void verifyValidLogoutFromClientspage() {
	 
	 Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  home.clickonUsername();
	  Logoutpage logout=new  Logoutpage(driver);     
	  logout.logout();
	  Assert.assertTrue(login.isLoginPageIsDisplayed());
 }
 //@Test
public void verifyNextPageNumberIsDisplayedInTheeBottomOfClientsPage() {
	 
	 Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.isPageNumInBottomOfClientsPageIsDisplayed();
	  Assert.assertTrue(clients.isPageNumInBottomOfClientsPageIsDisplayed());
	  
	  
}

 //@Test
  public void verifyUpdateDetailsInClientDetails() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnUpdateIcon();
	  UpdateClientDetailsPage update=new UpdateClientDetailsPage(driver);
	  update.selectInvoiceDeliveryMethodClientDetails("Electronic");
	  update.selectBranchNameInClientDetails("Eastbourne City");
	  update.updateFaxNumber("1234567");
	  update.clickOnSaveButton();
	  update.UpdatedTimeAndDate();
	  Assert.assertEquals(update.getTextOfBranchName(), "Eastbourne City");
	  Assert.assertEquals(update.getTextOfInvoiceDeliveryMethod(), "Electronic");
	 // Assert.assertEquals(update.getTextOfFaxNumber(), "1234567");
	  
	  GenericUtility.currenttime();
	  
	  Assert.assertEquals(update.getTextFromUpdatedClientPage(), "WESTERLEIGH NURSING HOME REGENCY MEDICINE LTD");  
  
  }
  //@Test
  public void verifyCreateClientTabIsDisplayed() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);                                     
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	 // clients.isCreateClientTabDisplayed();
	
	 
	  Assert.assertTrue(clients.isCreateClientTabDisplayed());
	 
	  
  }
 // @Test
  public void verifyCreateClientPageIsLoaded() {
	
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  CreateClientPage create=new CreateClientPage(driver);
	  Assert.assertTrue(create.isCreateClientPageIsDisplayed());          
  }
  //@Test
  public void verifyValidLogoutFromCreateClientPage() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  home.clickonUsername();
	  Logoutpage logout=new  Logoutpage(driver);     
	  logout.logout();
	  Assert.assertTrue(login.isLoginPageIsDisplayed());
  }
  //@Test
  public void verifyFieldsForCreateClientIsDisplayed() {
	
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  CreateClientPage create=new CreateClientPage(driver);
	  Assert.assertTrue(create.isFieldForCreateClientIsDisplayed());
	  
  }
  //@Test
  public void verifySaveButtonInTheCreateClientPageIsDisplayed() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  CreateClientPage create=new CreateClientPage(driver);
	  Assert.assertTrue(create.isSaveButtonDisplayedInCreateClientPage());
  }
 //@Test
  public void verifyValidCreationOfClient() {
	  
	  Loginpage login=new Loginpage(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.clickOnCreateClientTab();
	  CreateClientPage create=new CreateClientPage(driver);
	  create.addBranchNameForNewClient("Eastbourne City");
	  create.addInvoiceOrderForNewClient("One per client sorted by PO");
	  create.addDivisionForNewClient("weq");
	  create.addInvoiceDeliveryMethodForNewClient("Paper");
	  create.addClientNameForNewClient("Hareesh");
	  create.addPhoneNumberForNewClient("9400687416");
	  create.addMasterDocumentForNewClient("PDF");
	  create.addClientAddressForNewClient("pakideeriyil");
	  create.addEmailIdForNewClient("hareesh.mohan@gmail.com");
	  create.addSettilementDaysForNewClient("20");
	  create.addPostCodeForNewClient("679516");
	  create.addCompanyRegForNewClient("123456");
	  create.addVatRateForNewClient("VAT 5.00%");
	  create.addCountryDetailForNewClient("India");
	  create.clickOnSaveButton();
  }
 
 
  
@Test(dataProvider="verifyLoginData")
  public void verifyLogin(String sUserName, String sPassword) {              
 
	  Loginpage login=new Loginpage(driver);
	  login.login(sUserName, sPassword);
	  Homepage home=new Homepage(driver); 
	  Assert.assertEquals(home.getTextOfWelcomeText(),"PAYROLL APPLICATION");
  
}
@DataProvider
public Object[][] verifyLoginData() throws IOException {

	ExcelUtility excelUtility=new ExcelUtility();
	return excelUtility.readExcelData();

}
}
  
 

















/* //@Test
  public void verifySearchFieldsOfClientspage()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
      clients.clickonClientsTab();
      
      ClientsPageSearchFieldsVerification verify=new  ClientsPageSearchFieldsVerification(driver);
      
      Assert.assertTrue( verify.isCheckClientIdSearchFieldisEnabled());
      System.out.println("ClientName field is in the clientspage");
      Assert.assertTrue(verify.isCheckClientNameSearchFieldisEnabled());
      System.out.println("ClientId field is in the clientspage");
      
      
   }*/
  
/*//@Test
  public void verifyListOfClientsDetailsDisplayed() {
	  
	  Loginpage login=new Loginpage(driver);                            
	  login.login("carol","1q2w3e4r");
	  Homepage home=new Homepage(driver);    
	  home.clickonClientsTab();
	  Clientspage clients=new Clientspage(driver);
	  clients.showingListOfClientDetails();
	  Assert.assertEquals(clients.getTextFromTheClientsPage(), "Showing 1-20 of 105 items.");    //
	
      
  }*/
  
  
  
  
  
  
  

