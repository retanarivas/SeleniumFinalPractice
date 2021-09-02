package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	WebDriver driver;
	
	//Create an account
	@FindBy(id="email_create")
	WebElement emailCreateInput;

	@FindBy(id="SubmitCreate")
	WebElement createAccountButton;
	
	@FindBy(xpath="//*[@id=\"create_account_error\"]/ol/li")
	WebElement existingEmailError;
	
	// ALREADY REGISTERED?
	@FindBy(id="email")
	WebElement emailInput;
	
	@FindBy(id="passwd")
	WebElement passwordInput;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SigninPage typeCreateEmailAddress(String email) {
		emailCreateInput.sendKeys(email);
		return this;
	}
	
	public AuthenticationPage clickCreateAccountButton() {
		createAccountButton.click();
		return new AuthenticationPage(driver);
	}
	
	public String getExistingEmailError() {
		return existingEmailError.getText();
	}
	
	public SigninPage typeEmailAddress(String email) {
		emailInput.sendKeys(email);
		return this;
	}
	
	public SigninPage typePassword(String password) {
		passwordInput.sendKeys(password);
		return this;
	}
	
	public HomePage clickSubmitButton() {
		submitButton.click();
		return new HomePage(driver);
	}
	
}
