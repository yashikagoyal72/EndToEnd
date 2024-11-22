package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.CheckoutPage;
import PageObject.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefinition {
	TestContextSetup testcontextsetup;
	public CheckoutPage checkoutpage;
	public CheckoutPageStepDefinition (TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	
	@And("user add three products into the Cart")
	public void user_add_three_products_into_the_cart() {
	    
		//LandingPage landingpage = new LandingPage(textcontextsetup.driver);
		//PageObjectManager pageobjectmanager = new PageObjectManager(textcontextsetup.driver);
		testcontextsetup.pageObjectManager.getCheckoutPage().Adding();
		}

	@Then("^User User proceed with the checkout page and searched for (.+) shortname in Offers page$")
	public void user_proceed_with_the_checkout_page_and_searched_for_shortname_in_checkout_page(String name) {
		
		
		checkoutpage = testcontextsetup.pageObjectManager.getCheckoutPage();
		
		checkoutpage.AddproductToCart();
		
	}
	@Then("validate product name in Checkout Page matches with landing page")
	public void validate_product_name_in_checkout_page_matches_with_landing_page() throws InterruptedException {
		
		
		testcontextsetup.pageObjectManager.getCheckoutPage().ProceedtoCheckout();
	Thread.sleep(3000);
	String Checkpageproductname = testcontextsetup.pageObjectManager.getCheckoutPage().getProductname();
	
	  System.out.println(Checkpageproductname);
	  Assert.assertEquals(testcontextsetup.LandingPageProductName, Checkpageproductname);
	  System.out.println(testcontextsetup.LandingPageProductName);
	}
	
	  
	}

