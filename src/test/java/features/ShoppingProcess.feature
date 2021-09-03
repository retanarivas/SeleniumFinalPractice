Feature: Validate the shopping process till the end

	Background:
		Given: User is on "http://automationpractice.com/" home page
    And: User clicks on Sing in button

  Scenario: The Password field is empty
     When: User enters a valid email "test5454545@gmail.com"
     And: User enters a valid password "A123456"
     And: User clicks Sing in button
     And: User go to T-SHIRTS section
     And: User select a t-shirt and click Add to cart button
     And: User clicks Proceed to checkout button
     And: User clicks Proceed to checkout button in the Summary section
     And: User clicks Proceed to checkout button in the Address section
     And: User clicks checkbox to acept Terms of Service
     And: User clicks Proceed to checkout button in the Shipping section
     And: User select a method of payment
     And: User cliks I confirm my order button
     Then: The confirm message is display "Your order on My Store is complete."
     
	