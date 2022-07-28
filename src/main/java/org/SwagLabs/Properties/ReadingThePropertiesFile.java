package org.SwagLabs.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ReadingThePropertiesFile extends BrowserURLOpening 
{
	public static String ReadProp(String ReqData) throws IOException 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ReadingThePropertieFile");
		logger.log(Status.INFO, "Reading the Properties file");
		
		String out_Data = null;
		String find_Data = ReqData;

		try 
		{
			String file_location = System.getProperty("user.dir")+ "\\src/main/resources//Application_Properties//BrowserData.properties";
			File file = new File(file_location);
			FileInputStream file_input = new FileInputStream(file);
			Properties prop_file = new Properties();
			prop_file.load(file_input);
			out_Data = prop_file.getProperty(find_Data);
			logger.log(Status.PASS, "Properties file readed successfully");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to read Properties file");
		}
		extents.flush();
		return out_Data;
	}
}
