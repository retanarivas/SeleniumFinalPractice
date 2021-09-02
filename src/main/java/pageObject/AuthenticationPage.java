package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AuthenticationPage {
	WebDriver driver;
	
	@FindBy(id="id_gender1")
	WebElement mrRadioButton;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameInput;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameInput;
	
	@FindBy(id="passwd")
	WebElement passwordInput;
	
	@FindBy(id="days")
	WebElement selectBirthDay;
	Select selectDay;
	
	@FindBy(id="months")
	WebElement selectBirthMonth;
	Select selectMonth;
	
	@FindBy(id="years")
	WebElement selectBirthYear;
	Select selectYear;

	@FindBy(id="company")
	WebElement companyInput;
	
	@FindBy(id="address1")
	WebElement address1Input;
	
	@FindBy(id="city")
	WebElement cityInput;
	
	@FindBy(id="id_state")
	WebElement stateDropDown;
	Select selectState;
	
	@FindBy(id="postcode")
	WebElement postCodeInput;
	
	@FindBy(id="id_state")
	WebElement countryDropDown;
	Select selectCountry;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneInput;
	
	@FindBy(id="submitAccount")
	WebElement registerButton;
	
	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		selectDay = new Select(selectBirthDay);
		selectMonth = new Select(selectBirthMonth);
		selectYear = new Select(selectBirthYear);
		selectState = new Select(stateDropDown);
		selectCountry = new Select(countryDropDown);
	}
	
	public AuthenticationPage selectMrTitle() {
		mrRadioButton.click();
		return this;
	}
	
	public AuthenticationPage typeFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
		return this;
	}
	
	public AuthenticationPage typeLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
		return this;
	}
	
	public AuthenticationPage typePassword(String password) {
		passwordInput.sendKeys(password);
		return this;
	}
	
	public AuthenticationPage selectBirthDate(String day, String month, String year) {
		this.selectDay.selectByValue(day);
		this.selectMonth.selectByValue(month);
		this.selectYear.selectByValue(year);
		return this;
	}
	
	public AuthenticationPage typeCompany(String company) {
		companyInput.sendKeys(company);
		return this;
	}
	
	public AuthenticationPage typeAddress(String address1) {
		address1Input.sendKeys(address1);
		return this;
	}
	
	public AuthenticationPage typeCity(String city) {
		cityInput.sendKeys(city);
		return this;
	}
	
	public AuthenticationPage selectState(String state) {
		selectState.selectByVisibleText(state);
		return this;
	}
	
	public AuthenticationPage typePostalCode(String postalCode) {
		postCodeInput.sendKeys(postalCode);
		return this;
	}
	
	public AuthenticationPage typeMobilePhone(String mobilePhone) {
		mobilePhoneInput.sendKeys(mobilePhone);
		return this;
	}
	
	public HomePage clickRegisterButton() {
		registerButton.click();
		return new HomePage(driver);
	}
}
