package org.SwagLabs.BrowserOpening;

import java.io.IOException;

import org.SwagLabs.PageObjects.LoginPageWElements;
import org.SwagLabs.Properties.ReadingThePropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserURLOpening 
{
	public static WebDriver driver;
	public static ExtentReports extents = new ExtentReports();
	public static ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\WorkSpaces\\org.SwagLabs.com\\target\\ExtentReports//extentreports.html");

	public static WebDriver Browser_Driver() throws IOException 
	{
		String B_Name = ReadingThePropertiesFile.ReadProp("Browser_Name");
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ReadingThePropertiesFileTest");
		logger.log(Status.INFO, "ReadingBrowserData");
		try 
		{
			switch (B_Name) 
			{
			case "Google_Chrome_103":
				driver = Google_ChromeDriver();
				break;

			case "Microsoft_Edge_103":
				driver = Microsoft_EdgeDriver();
				break;

			default:
				System.out.println("Browser Name is Invalid/ Input Data is Wrong");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "failed to Reading the Properties files");
		}
		extents.flush();
		return driver;
	}
	

	public static WebDriver Google_ChromeDriver() 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenBrowserTest");
		logger.log(Status.INFO, "Opening The Browser");
		try 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.log(Status.PASS, "Browser is opened successfully");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Browser is failed to open");
		}
		extents.flush();
		return driver;
	}

	public static WebDriver Microsoft_EdgeDriver() 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenBrowserTest");
		logger.log(Status.INFO, "Opening The Browser");
		try 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.log(Status.PASS, "Browser is opened successfully");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Browser is failed to open");
		}
		extents.flush();
		return driver;
	}
	
	public static void getUrl(String url) throws Exception 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenURLTest");
		logger.log(Status.INFO, "Opening The URL");
		try 
		{
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().deleteAllCookies();
			logger.log(Status.PASS, "URL is opened successfully");
		}
		catch(Exception e)
		{
			System.out.println("Error in URL fetching"+e);
			logger.log(Status.FAIL, "URL is failed to open");
		}
		extents.flush();
	}
	
	public static String getTitle() throws Exception 
	{
		String actualTitle = driver.getTitle();
		return actualTitle;			
	}
	
	public static void WebBrowserClose() 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("CloseBrowserTest");
		logger.log(Status.INFO, "Closing The Browser");
		try 
		{
			logger.log(Status.PASS, "Browser is closed successfully");
			driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("closing"+e);
			logger.log(Status.FAIL, "Browser is failed to Close");
		}
		extents.flush();
	}
}
