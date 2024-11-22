package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutPage {
	
	public ChromeDriver driver;
	public CheckoutPage(ChromeDriver driver) {
		
		this.driver = driver;
	}

	
	By AddtoCartButton = By.xpath("//button[text()='ADD TO CART']");
	By CartIcon = By.xpath("//img[@alt='Cart']");
	By ProceedToCheckoutButton = By.cssSelector("div[class='cart-preview active'] button[type='button']");
	By Productname = By.cssSelector(".product-name");
	By Increment = By.xpath("//a[@class='increment']");
	
	public void AddproductToCart() {
		driver.findElement(AddtoCartButton).click();
	}
	
	public void ProceedtoCheckout() {
		driver.findElement(CartIcon).click();

		driver.findElement(ProceedToCheckoutButton).click();
		
	}
	
	public String getProductname() {
		
		String productname =  driver.findElement(Productname).getText();
		return productname;
		
	}
	
	public void Adding() {
		int i=1;
		while(i<3) {
		driver.findElement(By.xpath("//a[@class='increment']")).click();	
		i++;
		}
	
}
	
}
