package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{
	
	private static final String WIKI_HOST = "https://www.google.com";
//	@FindBy(id = "lst-ib")
//	protected WebElement searchFieldId;
	
	private static final By searchField = By.id("lst-ib");
	private static final By searchButton = By.id("sblsbb");
	
	public HomePage(WebDriver driver)
    {
        super(driver);
    }

	public String getUrl() {
		return WIKI_HOST;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public static By getSearchfield() {
		return searchField;
	}

	public static By getSearchbutton() {
		return searchButton;
	}

//	public WebElement getSearchFieldId() {
//		return searchFieldId;
//	}
}
