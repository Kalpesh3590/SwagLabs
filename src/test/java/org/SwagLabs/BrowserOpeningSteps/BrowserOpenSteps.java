package org.SwagLabs.BrowserOpeningSteps;

import java.io.IOException;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.SwagLabs.ScreenShots.ScreenShots;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class BrowserOpenSteps 
{
	@Given("Open the Browser.")
	public void open_the_browser() throws IOException 
	{
		try 
		{
			BrowserURLOpening.Browser_Driver();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@When("Enter the WebURL. {string}")
	public void enter_the_web_url(String string) throws Exception 
	{
		try {
			BrowserURLOpening.getUrl(string);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

	@Then("Homepage Page is displayed.")
	public void homepage_page_is_displayed() throws Exception 
	{
		try 
		{
			String title = BrowserURLOpening.getTitle();
			Assert.assertEquals("Swag Labs", title);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		ScreenShots.screenShot("Homepage");
		Thread.sleep(1000);
		BrowserURLOpening.WebBrowserClose();
	}
}
