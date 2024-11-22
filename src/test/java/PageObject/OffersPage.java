package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OffersPage {

	public WebDriver driver;
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private By search = By.xpath("//input[@id='search-field']");
	private By productname= By.cssSelector("tbody tr td:nth-child(1)");
	
	//If I keep this as private that means we are not able to use these in other class,
	//We can can only use in same class in methods like we did below.
	//and we will use these methods in other class- this method is called as encapsulation
	
	public void searchItem(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);

	}
	
	public String getProductName() {
		
		 String name = driver.findElement(productname).getText();
		 return name;
	}
}


