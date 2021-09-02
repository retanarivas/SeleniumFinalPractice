package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.base;

public class CreateAccountTest extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = initializeDriver();
		driver.get("http://automationpractice.com/");
		
	}
	
	@Test
	public void createNewAccount() throws Exception {
		HomePage homePage = new HomePage(driver);
		HomePage logedHomePage = homePage.clickSinginButton()
			.typeCreateEmailAddress(prop.getProperty("email"))
			.clickCreateAccountButton()
			.selectMrTitle()
			.typeFirstName("Angel")
			.typeLastName("Retana")
			.typePassword(prop.getProperty("password"))			
			.selectBirthDate("10", "6", "2007")
			.typeCompany("Test")
			.typeAddress("Siempre viva 123")
			.typeCity("Springfield")
			.selectState("Utah")
			.typePostalCode("14589")
			.typeMobilePhone("8775924252")
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
