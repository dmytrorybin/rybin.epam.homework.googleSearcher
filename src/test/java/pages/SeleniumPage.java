package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumPage extends AbstractPage{
	
	private static final By pageTitle = By.xpath("//title");
	
	public SeleniumPage(WebDriver driver) {
		super(driver);
	}
	
	public static By getPagetitle() {
		return pageTitle;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

} 
