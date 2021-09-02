package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement proceedToCheckoutButtonSumary;
	
	@FindBy(name="processAddress")
	WebElement proceedToCheckoutButtonAddress;
	
	@FindBy(id="cgv")
	WebElement termsOfServiceCheckBox;
	
	@FindBy(name="processCarrier")
	WebElement proceedToCheckoutButtonShipping;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement payByBankWireOption;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	WebElement confirmOrderButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/p")
	WebElement confirmMessage;
	
	public ShopingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ShopingCartPage clickProceedCheckoutSumaryButton() throws Exception {
		proceedToCheckoutButtonSumary.click();
		return this;
	}
	
	public ShopingCartPage clickProceedCheckoutAddressButton() throws Exception {
		proceedToCheckoutButtonAddress.click();
		return this;
	}
	
	public ShopingCartPage clickTermsOfServiceCheckbox() throws Exception {
		termsOfServiceCheckBox.click();
		return this;
	}
	
	public ShopingCartPage clickProceedCheckoutShipingButton() throws Exception {
		proceedToCheckoutButtonShipping.click();
		return this;
	}
	
	public ShopingCartPage clickPayBankWireOption() throws Exception {
		payByBankWireOption.click();
		return this;
	}
	
	public ShopingCartPage clickConfirmOrderButton() throws Exception {
		confirmOrderButton.click();
		return this;
	}
	
	public String getConfirmMessage() throws Exception {
		return confirmMessage.getText();
	}
}
