package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class PageObjectManager {

	public LandingPage landingpage;
	public WebDriver driver;
	public OffersPage offerspage;
	public CheckoutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public LandingPage getLandingpage() {
		
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage getOffersPage() {
		
		offerspage = new OffersPage(driver);
		return offerspage;
	}
	

	public CheckoutPage getCheckoutPage() {
		 checkoutpage = new CheckoutPage(driver);	
		
		return checkoutpage;
	}
	
	
	
	
}
