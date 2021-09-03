Feature: Login with an existing account

	Background:
		Given: User is on "http://automationpractice.com/" home page
    And: User clicks on Sing in button

  Scenario: The Password field is empty
     When: User enters a valid email "test5454545@gmail.com"
     And: User clicks Sing in button
     Then: Error message "Password is required." is displayed
     
	Scenario: The Email address field is empty
     When: User enters a password "A123456"
     And: User clicks Sing in button
     Then: Error message "An email address required." is displayed
     
	Scenario: The Email address is invalid
	 	 When: User enters a invalid email "test5454545@gml.com"
     And: User enters a password "A123456"
     And: User clicks Sing in button
     Then: Error message "Invalid email address." is displayed
    
  Scenario: The password is invalid
	 	 When: User enters a valid email "test5454545@gmail.com"
     And: User enters a invalid password "A3456"
     And: User clicks Sing in button
     Then: Error message "Authentication failed." is displayed
     
   Scenario: Email and password are valid
	 	 When: User enters a valid email "test5454545@gmail.com"
     And: User enters a valid password "A123456"
     And: User clicks Sing in button
     Then: My account page is displayed 
     