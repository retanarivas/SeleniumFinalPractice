Feature: Create a new account

	Background:
		Given: User is on "http://automationpractice.com/" home page
    And: User clicks on Sing in button

  Scenario: Create a new acount
     When: User enters a valid email address "test546565545@gmail.com"
     And: User clicks on Create an account
     And: User fill required information
     And: User clicks on Register button
     Then: New account is created
     
	Scenario: Create a new acount with an existing email
     When: User enters a existing email address "test5454545@gmail.com"
     Then: The "An account using this email address has already been registered. Please enter a valid password or request a new one." is displayed
     
	Scenario: Create a new account without providing the personal information required
	     When: User enters a valid email address "test546565545@gmail.com"
	     And: User clicks on Create an account
	     And: User clicks on Register button
	     Then: A error message is displayed
	     
	     
	     