package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestHelper {
  public  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hareesh\\Desktop\\New ChromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  		
  }
  @AfterMethod
 public void afterMethod(ITestResult r) throws IOException {
	  
	  if(ITestResult.FAILURE==r.getStatus())
	  {
		  File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  FileUtils.copyFile(f,new File("C:\\Users\\Hareesh\\Desktop\\OutputScreenshot\\"+r.getName()+".JPG"));
	  }
  }

}
