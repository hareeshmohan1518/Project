package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtility {
	
	
	public  Object[][] readExcelData() throws IOException {  

		 String path=System.getProperty("user.dir")+"\\src\\test\\resources\\selenium project database.xlsx";
	     FileInputStream file= new FileInputStream(path); 
	     XSSFWorkbook wb = new XSSFWorkbook(file);
	     XSSFSheet sheet = wb.getSheet("Details of registered users");
	     int rowCount = sheet.getLastRowNum();
	     int column = sheet.getRow(0).getLastCellNum();
	     Object[][] data = new Object[rowCount][column];
	     for (int i = 1; i <= rowCount; i++) {
	         XSSFRow row = sheet.getRow(i);
	         for (int j = 0; j < column; j++) {
	             XSSFCell cell = row.getCell(j);
	             DataFormatter formatter = new DataFormatter();
	             String val = formatter.formatCellValue(cell);
	             data[i - 1][j] = val;
	         }
	     }
	return data;
	}
	
	public Object[][] getData(String filePath,String sheetName) throws IOException {
		
		 FileInputStream file= new FileInputStream(filePath); 
	     XSSFWorkbook wb = new XSSFWorkbook(file);
	     XSSFSheet sheet = wb.getSheet(sheetName);
	     int rowCount = sheet.getLastRowNum();
	     int column = sheet.getRow(0).getLastCellNum();
	     Object[][] data = new Object[rowCount][column];
	     for (int i = 1; i <= rowCount; i++) {
	         XSSFRow row = sheet.getRow(i);
	         for (int j = 0; j < column; j++) {
	             XSSFCell cell = row.getCell(j);
	             DataFormatter formatter = new DataFormatter();
	             String val = formatter.formatCellValue(cell);
	             data[i - 1][j] = val;
	         }
	     }
	return data;
	}
	
	public Object[][] getUserNameAndPassword(String filePath,String sheetName) throws IOException {
	
	return getData(filePath,sheetName);
	
	}
}
	
	/*public static String getCellValue(String xl, String Sheet, int r, int c)

	{

	try

	{

	FileInputStream fis = new FileInputStream(xl);

	Workbook wb = WorkbookFactory.create(fis);

	Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);

	return cell.getStringCellValue();

	}

	catch (Exception e)
	 
	{

	return "Error in loading data!!";

	}

	}

	public static int getRowCount(String xl, String Sheet)

	{

		try

		{

			FileInputStream fis = new FileInputStream(xl);

			Workbook wb = WorkbookFactory.create(fis);
	 
			return wb.getSheet(Sheet).getLastRowNum();

		}	

		catch (Exception e)

		{

			return 0;

		}

	}



	public static int getColumnCount(String xl, String Sheet)

	{

		try

		{

			FileInputStream fis = new FileInputStream(xl);

			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet(Sheet).getRow(0).getLastCellNum();
			return wb.getSheet(Sheet).getRow(0).getLastCellNum();

		}

		catch (Exception e)

		{

			return 0;

		}

	}











	public static void ExcelWrite(String xl, String Sheet, int r, int c, String test)
	throws EncryptedDocumentException, IOException, InvalidFormatException {

	// FileInputStream fsIP= new FileInputStream(new File(
	// "D:\\Testingg\\EclipseWorkSpace\\qabible-erptest\\src\\test\\resources\\test1.xlsx"));
	// //Read the spreadsheet that needs to be updated
	FileInputStream fis = new FileInputStream(new File(xl));

	Workbook wb = WorkbookFactory.create(fis);
	Cell cell = null;
	cell = wb.getSheet(Sheet).getRow(r).getCell(c);
	cell.setCellValue(test);
	fis.close(); // Close the InputStream

	FileOutputStream output_file = new FileOutputStream(new File(xl)); // Open FileOutputStream to write updates

	wb.write(output_file); // write changes

	output_file.close(); // close the stream

//	                  XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook
//	                    
//	                  XSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.

	// declare a Cell object
//	                  System.out.println("val of r is "+ r);
//	                  System.out.println("val of c is "+ c);
//	                  System.out.println("val of test is "+ test);
	// cell = worksheet.getRow(r).getCell(c); // Access the second cell in second
	// row to update the value
	// System.out.println("val of cell is"+ cell.getStringCellValue());

	// setCellValue("hello");
	// Get current cell value value and overwrite the value



	/// Sheet sheet;
	// Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);

//	                  // return cell.getStringCellValue();
//	              Row rw = wb.getSheet(Sheet).getRow(r); // 10-1
//	              if (rw == null) {
//	                 // First cell in the row, create
//	                 rw = wb.getSheet(Sheet).createRow(r);
//	              }
	//
//	              Cell col = rw.getCell(c); // 4-1
//	              if (col == null) {
//	                  // New cell
//	                  col = rw.createCell(c);
//	              }
//	              col.setCellValue(val);
	}*/

	


