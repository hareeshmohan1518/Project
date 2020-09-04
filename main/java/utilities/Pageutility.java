package utilities;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageutility {

	
	public static String GetTitle(WebDriver driver) {

		String title = driver.getTitle();

		return title;

		}

		public static final  String getExcelPath() {

		final String excelpath=System.getProperty("C:\\Users\\Hareesh\\Documents\\selenium project database.xlsx");

		return  excelpath;

		}

		public static final  String getExcelSheetName() {

		final String  Sheetname = "selenium project database";

		return Sheetname;
		}

	
	
	
	
	
	
	
	public static void handlesleep(int time){
		try
		{
			Thread.sleep(time);
			
		}
		catch(InterruptedException e)
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static WebElement isElementLoaded(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element;
	}
	
	public static WebElement waitforElementTobeClickable(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		return element;
	}
	
	public static Boolean elementToBeSelected(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		Boolean element=wait.until(ExpectedConditions.elementToBeSelected(elementToBeLoaded));
		return element;
	}
	public static WebElement presenceOfAllElementsLocatedBy(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=(WebElement) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) elementToBeLoaded));
		return element;
		
	}
	public static Boolean textToBePresentInElement(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		String text = null;
		Boolean element=wait.until(ExpectedConditions.textToBePresentInElementLocated((By) elementToBeLoaded, text));
		return element;
	}
	
	
	
	
	
	/*public static WebElement datetime()
	{
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date(0);
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 System.out.println("Current date and time is " +date1);
		return null;
	
		 
		 // Print the Date
		
	}*/
	
	/*public static WebElement currentDate(WebDriver driver,WebElement currentDate,int Date) {
		WebDriverDate date=new WebDriverDate(driver,Date);
		WebElement element=date.until(ExpectedConditions.)
	}*/
	
	
	


}