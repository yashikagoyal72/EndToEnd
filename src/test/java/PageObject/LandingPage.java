package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.TestContextSetup;

public class LandingPage {
	public ChromeDriver driver;
	
	By search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productname= By.cssSelector("h4[class='product-name']");
	By Topdeals = By.cssSelector(".cart-header-navlink[href='#/offers']");
	By AddingProduct = By.xpath("//a[@class='increment']");
	By AddtoCartButton = By.cssSelector("div[class='product-action'] button[type='button']");
	
	
	
	public LandingPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void searchItem(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);

	}
	
	public String getProductName() {
		
		 String name = driver.findElement(productname).getText();
		 return name;
	}
	
	public void TopDealLink() {
		
		driver.findElement(Topdeals).click();
		
	}
	
	
	}
	
	
	
	
	

