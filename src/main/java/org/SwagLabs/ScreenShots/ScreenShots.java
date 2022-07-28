package org.SwagLabs.ScreenShots;

import java.io.File;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ScreenShots extends BrowserURLOpening
{
		public static void screenShot(String filename) throws Exception 
		{
			extents.attachReporter(reporter);
			ExtentTest logger = extents.createTest("TakingTheScrenShot");
			logger.log(Status.INFO, "Capturing The Screen");
			try 
			{
				TakesScreenshot scrShot =((TakesScreenshot)driver); 
				File Src=scrShot.getScreenshotAs(OutputType.FILE);	
				String filePath = System.getProperty("user.dir")+"//target//ScreenShots//Screenshot"+"_"+filename+".png";
				File Dest=new File(filePath);	 
				FileUtils.copyFile(Src, Dest);
				logger.log(Status.PASS, "Screen Capturing successfully");
			}
			catch(Exception e)
			{
				System.out.println("Screen Capture"+e);
				logger.log(Status.FAIL, "Failed to Capture the Screen");
			}
		}
}
