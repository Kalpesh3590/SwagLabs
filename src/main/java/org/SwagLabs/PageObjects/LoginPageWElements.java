package org.SwagLabs.PageObjects;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWElements extends BrowserURLOpening 
{
	public LoginPageWElements() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement UsernameText;
	public WebElement UsernameText() 
	{
		return UsernameText;
	}
	
	
	@FindBy(id = "password")
	WebElement PasswordText;
	public WebElement PasswordText() 
	{
		return PasswordText;
	}
	
	
	@FindBy(id = "login-button")
	WebElement LoginButton;
	public WebElement LoginButton() 
	{
		return LoginButton;
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")
	WebElement WrongPassError;
	public WebElement WrongPassError() 
	{
		return WrongPassError;
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")
	WebElement EmptycredError;
	public WebElement EmptycredError() 
	{
		return EmptycredError;
	}
}
