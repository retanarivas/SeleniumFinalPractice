package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement singinButton;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement customerAccountTitle;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement singoutButton;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement tShirtsButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
	WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement proceedToCheckoutButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SigninPage clickSinginButton() throws Exception {
		singinButton.click();
		return new SigninPage(driver);
	}
	
	public HomePage clickSingoutButton() throws Exception {
		singoutButton.click();
		return new HomePage(driver);
	}
	
	public String getAccountTitle() throws Exception {
		return customerAccountTitle.getText();
	}
	
	public HomePage clickTshirtButton() throws Exception {
		tShirtsButton.click();
		return this;
	}
	
	public HomePage clickaddToCartButton() throws Exception {
		addToCartButton.click();
		return this;
	}
	
	public ShopingCartPage clickProceedToCheckoutButton() throws Exception {
		proceedToCheckoutButton.click();
		return new ShopingCartPage(driver);
	}
	
	public String getSiginTitle() throws Exception {
		return singinButton.getText();
	}
	
	public String getSigoutTitle() throws Exception {
		return singoutButton.getText();
	}
}
