package testCases;

import org.openqa.selenium.WebDriver;

import pageObject.HomePage;
import resources.Constants;
import resources.base;

public class Common extends base {
	
	public HomePage logIn(WebDriver driver) throws Exception {
		driver.get(Constants.url);
		HomePage homePage = new HomePage(driver);
		homePage.clickSinginButton()
		.typeEmailAddress(Constants.mail)
		.typePassword(Constants.password)
		.clickSubmitButton();
		return homePage;
	}
}
