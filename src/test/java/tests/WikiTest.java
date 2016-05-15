package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.HomePageSteps;
import steps.WikiPageSteps;

public class WikiTest extends AbstractTest {
	
	@Test
	public void wikiTest()
	{
		String searchWord = "wikipedia";
		String expectedTitle = "Wikipedia";
		
		HomePageSteps homePageSteps = new HomePageSteps(driver);
		WikiPageSteps wikiPageSteps = new WikiPageSteps(driver);
		
		homePageSteps.open();
		homePageSteps.type(searchWord);
		homePageSteps.clickSearchButton();
		homePageSteps.clickSearchResult(expectedTitle);

		(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.titleContains(expectedTitle));

		Assert.assertEquals(expectedTitle, wikiPageSteps.getTitle());
	}
}
 