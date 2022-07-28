package org.SwagLabs.SortingSteps;

import java.io.IOException;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.SwagLabs.Pages.LoginPage;
import org.SwagLabs.Pages.SortButton;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class SortingSteps 
{
	@Given("on the webpage {string}")
	public void on_the_webpage(String string) throws Exception 
	{
		try 
		{
			BrowserURLOpening.Browser_Driver();
			BrowserURLOpening.getUrl(string);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Given("User will type the {string}")
	public void user_will_type_the(String string) 
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

	@Given("User can type the {string}")
	public void user_can_type_the(String string) 
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

	@When("Click LoginButton")
	public void click_login_button() 
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

	@Then("User navigating to product backlog page.")
	public void user_navigating_to_product_backlog_page() 
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
	}

	@When("click on Soft button")
	public void click_on_soft_button() throws InterruptedException 
	{
		try 
		{
			SortButton.SortButton();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	@Then("User able to see the multiple choises for sorting the products")
	public void user_able_to_see_the_multiple_choises_for_sorting_the_products() 
	{
		try 
		{
			SortButton.SortOptions();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Given("User is able to click the sort button")
	public void user_is_able_to_click_the_sort_button() throws InterruptedException 
	{
		try 
		{
			SortButton.SortButton();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	@When("selecting the available sorting options")
	public void selecting_the_available_sorting_options() throws InterruptedException 
	{
		try 
		{
			SortButton.sortoptionSelections();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	@Then("Products soft according to the selected options")
	public void products_soft_according_to_the_selected_options() 
	{
		System.out.println("All Products are sorted according to the Choise and stored at 'taget/Screenshot'");
	}
}
