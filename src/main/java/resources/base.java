package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public String getProperty(String propertyName) throws IOException {
		String propertiesFileLocation = "C:\\Users\\000914781\\eclipse-workspace\\SeleniumFinalPractice\\src\\main\\java\\resources\\data.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(propertiesFileLocation);
		
		prop.load(fis);
		String property = prop.getProperty(propertyName);
		return property;
	}
	
	public WebDriver initializeDriver() throws IOException {
		String propertiesFileLocation = "C:\\Users\\000914781\\eclipse-workspace\\SeleniumFinalPractice\\src\\main\\java\\resources\\data.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(propertiesFileLocation);
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\000914781\\Documents\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
}
