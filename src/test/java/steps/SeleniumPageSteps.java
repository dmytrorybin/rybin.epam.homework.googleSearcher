package steps;

import org.openqa.selenium.WebDriver;

import pages.SeleniumPage;

public class SeleniumPageSteps {
	
	private SeleniumPage seleniumPage;
	
	public SeleniumPageSteps(WebDriver driver) {
		seleniumPage = new SeleniumPage(driver);
	}

    public  String getTitle()
    {
        return seleniumPage.getDriver().getTitle();
    }
}
