package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.base;

public class LoginTest extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = initializeDriver();
		driver.get("http://automationpractice.com/");
	}
	
	@Test
	public void createNewAccount() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickSinginButton()
		.typeEmailAddress(prop.getProperty("email"))
		.typePassword(prop.getProperty("password"))
		.clickSubmitButton();
		
		String actualTitle = homePage.getAccountTitle();
		Assert.assertEquals(actualTitle, "Angel Retana");
		
		homePage.clickSingoutButton();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
