package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
public ChromeDriver driver;
String OfferPageProductname;
String LandingPageProductName;
TestContextSetup testcontextsetup;


public LandingPageStepDefinition (TestContextSetup testcontextsetup) {
	this.testcontextsetup = testcontextsetup;
}


     
	@Given("User is on Green Cart landing page")
	public void user_is_on_green_cart_landing_page() {
    
	}
	
	
	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		//LandingPage landingpage = new LandingPage(testcontextsetup.driver);
		LandingPage landingpage = testcontextsetup.pageObjectManager.getLandingpage();
		landingpage.searchItem(shortname);
		
		//testcontextsetup.driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(shortname);
		Thread.sleep(2000);
		testcontextsetup.LandingPageProductName = landingpage.getProductName();
		testcontextsetup.LandingPageProductName1=landingpage.getProductName().split("-")[0].trim();
	   System.out.println(testcontextsetup.LandingPageProductName +" is extracted from Home Page");
	   
	   
	}
	
	
	
	
	

}
