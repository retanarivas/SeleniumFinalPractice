package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import resources.base;

public class SignoffTest extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void singOff() throws Exception {
		Common common = new  Common();
		HomePage homePage = common.logIn(driver);
		
		String actualSignoutTitle = homePage.getSigoutTitle();
		Assert.assertEquals(actualSignoutTitle, "Sign out");
		
		String actualSignOutTitle = homePage.clickSingoutButton()
			.getSiginTitle();
		Assert.assertEquals(actualSignOutTitle, "Sign in");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
