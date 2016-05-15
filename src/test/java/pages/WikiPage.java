package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiPage extends AbstractPage {

	private static final By pageTitle = By.xpath("//title");

	
	public WikiPage(WebDriver driver) {
		super(driver);
	}


	public static By getPagetitle() {
		return pageTitle;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
} 
