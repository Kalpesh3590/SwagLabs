package org.SwagLabs.Pages;

import java.io.IOException;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.SwagLabs.PageObjects.LoginPageWElements;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPage extends BrowserURLOpening
{
	public static String title;
	
	public static void OpenTheURL(String url) throws Exception 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenURLTest");
		logger.log(Status.INFO, "Opening The URL");
		try 
		{
			BrowserURLOpening.Browser_Driver();
			logger.log(Status.PASS, "Browser is opened successfully");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Browser is failed to open");
		}
		
		try 
		{
			BrowserURLOpening.getUrl(url);
			logger.log(Status.PASS, "URL is opened successfully");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "URL is failed to open");
		}
		extents.flush();
	}
	
	public static void EnterTheUserName(String userID)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterTheUserName");
		logger.log(Status.INFO, "Entering the Username");
		try
		{
			LoginPageWElements welp = new LoginPageWElements();
			welp.UsernameText().sendKeys(userID);
			logger.log(Status.PASS, "Username Entered successfully");
			Thread.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Entering the Username");
		}
		extents.flush();
	}
	
	public static void EnterThePassword(String passID)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterThePassword");
		logger.log(Status.INFO, "Entering the Password");
			try 
			{
				LoginPageWElements welp = new LoginPageWElements();
				welp.PasswordText().sendKeys(passID);
				logger.log(Status.PASS, "Password Entered successfully");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				logger.log(Status.FAIL, "Failed to Entering the Password");
			}
			extents.flush();
	}
	
	public static void ClickTheLoginButton()
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ClickLoginButton");
		logger.log(Status.INFO, "Clicking the LoginButton");
		try
		{
			LoginPageWElements welp = new LoginPageWElements();
			welp.LoginButton().click();
			logger.log(Status.PASS, "Successfully clicked LoginButton");
			Thread.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Clicking the LoginButton");
		}
		extents.flush();
	}
	
	public static String NavigateToNextPage() 
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("NextPage");
		logger.log(Status.INFO, "Next Page Opening");
		try
		{
			title = driver.getTitle();
			logger.log(Status.PASS, "Next Page is Opened Successfully");
			Thread.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Open NextPage");
		}
		extents.flush();
		return title;
	}
	
	public static void ErrorMessage() throws InterruptedException
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ErrorMsg");
		logger.log(Status.INFO, "Capturing the Error massage");
		try
		{
			LoginPageWElements welp = new LoginPageWElements();
			String errormsg =welp.WrongPassError().getText();
			System.out.println("==============================================");
			System.out.println(errormsg);
			logger.log(Status.PASS, "Error message captured Successfully");
			Thread.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Capture the Error message");
		}
		extents.flush();
	}
	
	public static void EmptyCredErrorMessage() throws InterruptedException
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ErrorMsg");
		logger.log(Status.INFO, "Capturing the Error massage");
		try
		{
			LoginPageWElements welp = new LoginPageWElements();
			String errormsg =welp.EmptycredError().getText();
			System.out.println("==============================================");
			System.out.println(errormsg);
			logger.log(Status.PASS, "Error message captured Successfully");
			Thread.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Capture the Error message");
		}
		extents.flush();
	}
}
	