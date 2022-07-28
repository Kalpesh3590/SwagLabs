package org.SwagLabs.LoginPageSteps;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.SwagLabs.Excel.ReadingTheExcelFile;
import org.SwagLabs.Pages.LoginPage;
import org.SwagLabs.ScreenShots.ScreenShots;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginPageSteps 
{
	@Given("User on the webpage {string}")
	public void user_on_the_webpage(String string) throws Exception 
	{
		try 
		{
			LoginPage.OpenTheURL(string);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@And("User enters the {string}")
	public void user_enters_the(String string) 
	{
		try 
		{
			LoginPage.EnterTheUserName(string);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@And("User passes the {string}")
	public void user_passes_the(String string) 
	{
		try 
		{
			LoginPage.EnterThePassword(string);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@When("Click on the LoginButton")
	public void click_on_the_login_button() 
	{
		try 
		{
			LoginPage.ClickTheLoginButton();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Then("User is navigate to Next page.")
	public void user_is_navigate_to_next_page() 
	{
		try
		{
			String actualTitle = LoginPage.NavigateToNextPage();
			Assert.assertEquals("Swag Labs", actualTitle);
		}
		catch (AssertionError e)
		{
			e.printStackTrace();
		}
		BrowserURLOpening.WebBrowserClose();
	}

	@And("User entered the Invalid username")
	public void user_entered_the_invalid_username() 
	{
		try 
		{
			LoginPage.EnterTheUserName(ReadingTheExcelFile.readExcel(1, 0));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@And("User passed the Invalid password")
	public void user_passed_the_invalid_password() 
	{
		try 
		{
			LoginPage.EnterThePassword(ReadingTheExcelFile.readExcel(1, 1));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@When("Tap on the LoginButton")
	public void tap_on_the_login_button() 
	{
		try 
		{
			LoginPage.ClickTheLoginButton();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	@Then("User is occured error massage.")
	public void user_is_occured_error_massage() throws InterruptedException 
	{
		try 
		{
			LoginPage.ErrorMessage();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ScreenShots.screenShot("Invalid_Credentials");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		Thread.sleep(500);
		BrowserURLOpening.WebBrowserClose();
	}

	@When("Tap the LoginButton")
	public void tap_the_login_button() 
	{
		try 
		{
			LoginPage.ClickTheLoginButton();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Then("Error massage displayed")
	public void error_massage_displayed() throws InterruptedException 
	{
		try 
		{
			LoginPage.EmptyCredErrorMessage();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ScreenShots.screenShot("Without_Credentials");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		Thread.sleep(500);
		BrowserURLOpening.WebBrowserClose();
	}

	@And("Username entered")
	public void username_entered() 
	{
		try 
		{
			LoginPage.EnterTheUserName(ReadingTheExcelFile.readExcel(6, 0));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@When("Tap on LoginButton")
	public void tap_on_login_button() 
	{
		try 
		{
			LoginPage.ClickTheLoginButton();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Then("User Should occured error massage.")
	public void user_should_occured_error_massage() throws InterruptedException 
	{
		try 
		{
			LoginPage.EmptyCredErrorMessage();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ScreenShots.screenShot("Without_Password");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		Thread.sleep(500);
		BrowserURLOpening.WebBrowserClose();
	}

	@And("password entered")
	public void password_entered() 
	{
		try 
		{
			LoginPage.EnterThePassword(ReadingTheExcelFile.readExcel(6, 1));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@When("Tap LoginButton")
	public void tap_login_button() 
	{
		try 
		{
			LoginPage.ClickTheLoginButton();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Then("Error massage should displayed")
	public void error_massage_should_displayed() throws InterruptedException 
	{
		try 
		{
			LoginPage.EmptyCredErrorMessage();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ScreenShots.screenShot("Without_Username");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		Thread.sleep(500);
		BrowserURLOpening.WebBrowserClose();
	}
}
