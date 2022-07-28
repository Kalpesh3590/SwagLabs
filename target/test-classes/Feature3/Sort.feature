Feature: To verifying the fuctionlity of an soft option

				Scenario: To validate that user is able navigate Product catlog page.
				Given on the webpage "https://www.saucedemo.com/"
				And User will type the '<username>'
				And User can type the '<password>'
				When Click LoginButton
				Then User navigating to product backlog page.
Examples:
|username|password|
|standard_user|secret_sauce|


				Scenario: To validate that user is able to click the softButton
				Given: User is on the Product Backlog Page
				When click on Soft button
				Then User able to see the multiple choises for sorting the products
				
				
				Scenario: To checking the functionality of an sorting options.
				Given User is able to click the sort button
				When selecting the available sorting options
				Then Products soft according to the selected options