package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.OffersPage;
import PageObject.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffersPageStepDefinition {
public String OfferPageProductname;
TestContextSetup testcontextsetup;
public ChromeDriver driver;	
PageObjectManager pageObjectManager;

public OffersPageStepDefinition (TestContextSetup testcontextsetup) {
	this.testcontextsetup = testcontextsetup;
}


	@Then("^User searched for (.+) shortname in Offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
		
		SwitchToOfferPage();
		
		//OffersPage offerspage = new OffersPage(testcontextsetup.driver);
		OffersPage offerspage = testcontextsetup.pageObjectManager.getOffersPage();
		offerspage.searchItem(shortname);
		//testcontextsetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortname);
		Thread.sleep(2000);
		OfferPageProductname = offerspage.getProductName();
		//System.out.println(OfferPageProductname);
	  
	}
	
	public void SwitchToOfferPage() {
		//if already switched to offers page -> Skip below Part
		//if(testcontextsetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		//pageObjectManager= new PageObjectManager(testcontextsetup.driver);
		//LandingPage landingpage = pageObjectManager.getLandingpage();
		LandingPage landingpage = testcontextsetup.pageObjectManager.getLandingpage();
		//Here We are using Page Object Creation
		//LandingPage landingpage = new LandingPage(testcontextsetup.driver);
		landingpage.TopDealLink();
//		Set<String> windows = testcontextsetup.driver.getWindowHandles();
//		Iterator<String> It  = windows.iterator();
//		String parent = It.next();
//		String child = It.next();
//		testcontextsetup.driver.switchTo().window(child);
	//	
		testcontextsetup.genericUtils.SwitchWindowToChild();
		
		
	}
	
	@And("validate product name in Offers Page matches with landing page")
	public void validate_product_name_in_Offers_Page_matches_with_landing_page() {
	Assert.assertEquals(testcontextsetup.LandingPageProductName1, OfferPageProductname);
	}

}
