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
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SigninPage clickSinginButton() throws Exception {
		singinButton.click();
		return new SigninPage(driver);
	}
	
	public SigninPage clickSingoutButton() throws Exception {
		singoutButton.click();
		return new SigninPage(driver);
	}
	
	public String getAccountTitle() throws Exception {
		return customerAccountTitle.getText();
	}
}
