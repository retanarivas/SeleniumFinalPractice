Feature: Validate Sign off from an existing session

	Background:
		Given: User is on "http://automationpractice.com/" home page
    And: User clicks on Sing in button

  Scenario: The Password field is empty
     When: User enters a valid email "test5454545@gmail.com"
     And: User enters a valid password "A123456"
     And: User clicks Sing in button
     And: User clicks on Sign out button
     Then: The user is signed out of the account
     And: The user is redirected to Sign in page
     
	