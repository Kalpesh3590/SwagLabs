Feature: To verifying the functionality of an Login.

Background: 
Given User on the webpage "https://www.saucedemo.com/"

			Scenario: Checking the fuctionality of a login module with Valid credentials.
					
					And User enters the '<username>'
					And User passes the '<password>'
					When Click on the LoginButton
					Then User is navigate to Next page.
		
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
|locked_out_user|secret_sauce|



			Scenario: Checking the fuctionality of a login module with InValid credentials.
				
				And User entered the Invalid username
				And User passed the Invalid password
				When Tap on the LoginButton
				Then User is occured error massage.
				
				
			Scenario: Checking the fuctionality of a login module without credentials.
				
				When Tap the LoginButton
				Then Error massage displayed	

		
		
			Scenario: Checking the fuctionality of a login module with Username only.
				
				And Username entered
				When Tap on LoginButton
				Then User Should occured error massage.
		
		
		
			Scenario: Checking the fuctionality of a login module with Password only.
				
				And password entered
				When Tap LoginButton
				Then Error massage should displayed
		
		
		
		
		
		
		
		