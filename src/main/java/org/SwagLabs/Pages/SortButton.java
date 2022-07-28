package org.SwagLabs.Pages;

import java.util.List;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.SwagLabs.PageObjects.SoftButtonElements;
import org.SwagLabs.ScreenShots.ScreenShots;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class SortButton extends BrowserURLOpening
{
	public static void SortButton() throws InterruptedException
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("SortButton");
		logger.log(Status.INFO, "Clicking the SortButton");
		try 
		{
			SoftButtonElements sbe = new SoftButtonElements();
			sbe.SortButton().click();
			Thread.sleep(2000);
			sbe.SortButton().click();
			Thread.sleep(2000);
			logger.log(Status.PASS, "SortButton Clicked successfully");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to click SortButton");
		}
		extents.flush();
	}
	
	public static void SortOptions()
	{
		SoftButtonElements sbe = new SoftButtonElements();
		
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("SortButtonOptions");
		logger.log(Status.INFO, "Printing Options under the sortButton");
		try 
		{
			Select s = new Select(sbe.SortButton());
			List<WebElement> op = s.getOptions();
			int size = op.size();
			for (int i = 0; i < size; i++) 
			{
				String options = op.get(i).getText();
				System.out.println("==================================================================");
				System.out.println(options);
			}
			logger.log(Status.PASS, "Fetched all options successfully");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Kuchh to error hai..!");
			logger.log(Status.FAIL, "Failed to fetch the Options");
		}
		extents.flush();
	}
	
	public static void sortoptionSelections() throws InterruptedException 
	{
		SoftButtonElements sbe = new SoftButtonElements();
		
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("SortOptionSelection");
		logger.log(Status.INFO, "Selecting the options");
		try 
		{
			for (int i = 0; i <= 3; i++) 
			{
				Select se = new Select(sbe.SortButton());
				Thread.sleep(500);
				se.selectByIndex(i);
				Thread.sleep(500);
				WebElement a = sbe.SortButton();
				String name = String.valueOf(i);
				ScreenShots.screenShot(name);
				a.click();
				Thread.sleep(500);
				a.click();
			}
			logger.log(Status.PASS, "Successfully selected the options");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Kuchh to error hai..!");
			logger.log(Status.FAIL, "Failed to select the option");
		}
		extents.flush();
		Thread.sleep(500);
		BrowserURLOpening.WebBrowserClose();
	}
}
