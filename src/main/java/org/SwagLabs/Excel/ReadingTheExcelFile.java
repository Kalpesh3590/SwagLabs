package org.SwagLabs.Excel;

import java.io.FileInputStream;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ReadingTheExcelFile extends BrowserURLOpening
{
	public static String readExcel(int row, int column)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ReadingTheExcelFile");
		logger.log(Status.INFO, "Reading the Excel file");
		String testData=null;
		try 
		{
			String filePath;
			
			filePath = System.getProperty("user.dir")+"//src/main/resources//Excel//loginData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			testData = String.valueOf(ws.getRow(row).getCell(column));
			logger.log(Status.PASS, "Excel file readed successfully");
			wb.close();
		}
		catch(Exception e)
		{
			System.out.println("Excel Read"+e);
			logger.log(Status.FAIL, "Failed to read excel file");
		}
		extents.flush();
		return testData;
	}
}
