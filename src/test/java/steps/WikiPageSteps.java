package steps;

import org.openqa.selenium.WebDriver;

import pages.WikiPage;

public class WikiPageSteps {
	
	private WikiPage wikiPage;
	
	public WikiPageSteps(WebDriver driver) {
		wikiPage = new WikiPage(driver);
	}

    public  String getTitle()
    {
        return wikiPage.getDriver().getTitle();
    }
}
 