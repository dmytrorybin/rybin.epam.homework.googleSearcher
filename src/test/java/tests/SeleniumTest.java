package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.HomePageSteps;
import steps.SeleniumPageSteps;

public class SeleniumTest extends AbstractTest {
	
	@Test
	public void seleniumTest()
	{
		HomePageSteps homePageSteps = new HomePageSteps(driver);
		SeleniumPageSteps seleniumPageSteps = new SeleniumPageSteps(driver);
		
		String searchWord = "selenium";
		String expectedTitle = "Selenium - Web Browser Automation";
		
		homePageSteps.open();
		homePageSteps.type(searchWord);
		homePageSteps.clickSearchButton();
		homePageSteps.clickSearchResult(expectedTitle);

		(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.titleContains(expectedTitle));

		Assert.assertEquals(expectedTitle, seleniumPageSteps.getTitle());
	}

} 
