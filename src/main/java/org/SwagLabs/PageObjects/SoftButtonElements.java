package org.SwagLabs.PageObjects;

import org.SwagLabs.BrowserOpening.BrowserURLOpening;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftButtonElements extends BrowserURLOpening
{
	public SoftButtonElements() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "product_sort_container")
	WebElement SortButton;
	public WebElement SortButton() 
	{
		return SortButton;
	}
	
}
