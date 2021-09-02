package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.Constants;
import resources.base;

public class CreateAccountTest extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = initializeDriver();
		driver.get(Constants.url);
		
	}
	
	@Test
	public void createNewAccount() throws Exception {
		HomePage homePage = new HomePage(driver);
		HomePage logedHomePage = homePage.clickSinginButton()
			.typeCreateEmailAddress(Constants.mail)
			.clickCreateAccountButton()
			.selectMrTitle()
			.typeFirstName(Constants.firstName)
			.typeLastName(Constants.lastName)
			.typePassword(Constants.password)			
			.selectBirthDate(Constants.birthDateDay, Constants.birthDateMonth, Constants.birthDateYear)
			.typeCompany(Constants.companyName)
			.typeAddress(Constants.addres1)
			.typeCity(Constants.city)
			.selectState(Constants.state)
			.typePostalCode(Constants.postalCode)
			.typeMobilePhone(Constants.phoneNumber)
			.clickRegisterButton();
		
		String actualTitle = logedHomePage.getAccountTitle();
		Assert.assertEquals(actualTitle, "Angel Retana");
		
		logedHomePage.clickSingoutButton();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}
