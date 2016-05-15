package tests;
//package googleSearcher;
//
//import org.junit.Test;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import steps.HomePageSteps;
//import tests.AbstractTest;
//
//import org.junit.Assert;
//
//public class GoogleTest extends AbstractTest{
//
////	@Test
//	public void googleTest()
//	{
//		HomePageSteps googleSteps = new HomePageSteps(driver);
//		googleSteps.open();
//		(new WebDriverWait(driver, 5))
//				  .until(ExpectedConditions.titleContains("Google"));
////		Assert.assertEquals("google", googleSteps.getTitle().toLowerCase());
//	}
//	
////	@Test
//	public void searchWikiTest()
//	{
//		HomePageSteps googleSteps = new HomePageSteps(driver);
//		googleSteps.open();
//		googleSteps.type("wikipedia");
//		googleSteps.clickSearchButton();
//		googleSteps.clickSearchResult("Wikipedia");
//
//		(new WebDriverWait(driver, 5))
//				  .until(ExpectedConditions.titleContains("Wikipedia"));
////		Assert.assertEquals("wikipedia", googleSteps.getTitle().toLowerCase());
//	}
//	
////	@Test
//	public void searchSelenuimTest()
//	{
//		HomePageSteps googleSteps = new HomePageSteps(driver);
//		googleSteps.open();
//		googleSteps.type("selenium");
//		googleSteps.clickSearchButton();
//		googleSteps.clickSearchResult("Selenium - Web Browser Automation");
//
//		(new WebDriverWait(driver, 5))
//				  .until(ExpectedConditions.titleContains("Selenium - Web Browser Automation"));
////		Assert.assertEquals("selenium - web browser automation", googleSteps.getTitle().toLowerCase());
//	}
//}
