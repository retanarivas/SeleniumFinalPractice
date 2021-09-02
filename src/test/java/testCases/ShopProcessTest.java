package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.ShopingCartPage;
import resources.base;

public class ShopProcessTest extends base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void shopProcess() throws Exception {
		Common common = new  Common();
		ShopingCartPage shopingCart = common.logIn(driver)
		.clickTshirtButton()
		.clickaddToCartButton()
		.clickProceedToCheckoutButton()
		.clickProceedCheckoutSumaryButton()
		.clickProceedCheckoutAddressButton()
		.clickTermsOfServiceCheckbox()
		.clickProceedCheckoutShipingButton()
		.clickPayBankWireOption()
		.clickConfirmOrderButton();
		
		String actualConfirmMessage = shopingCart.getConfirmMessage();
		Assert.assertEquals(actualConfirmMessage, "Your order on My Store is complete.");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
