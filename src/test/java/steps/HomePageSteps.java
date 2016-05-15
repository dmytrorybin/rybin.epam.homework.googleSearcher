package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.HomePage;

public class HomePageSteps{
	
	private HomePage homePage;

	public HomePageSteps(WebDriver driver) {
		homePage = new HomePage(driver);
	}

	public void open () {

		homePage.getDriver().get(homePage.getUrl());
	}
	
	public void type (String searchName) {
		homePage.getDriver().findElement(HomePage.getSearchfield()).sendKeys(searchName);
//		googlePage.getSearchFieldId().sendKeys(searchName);
	}
	
	public void clickSearchButton () {
		homePage.getDriver().findElement(HomePage.getSearchbutton()).click();
	}
	
	public void clickSearchResult (String searchResult) {
		homePage.getDriver().findElement(By.linkText(searchResult)).click();
	}
	
}
