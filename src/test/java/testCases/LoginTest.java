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
	}
	
	@Test
	public void login() throws Exception {
		Common common = new  Common();
		HomePage homePage = common.logIn(driver);
		
		String actualTitle = homePage.getAccountTitle();
		Assert.assertEquals(actualTitle, "Angel Retana");
		
		homePage.clickSingoutButton();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
