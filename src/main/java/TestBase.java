

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
public ChromeDriver driver;
	public ChromeDriver WebDriverManager() {
	
		if (driver == null) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Yashika goyal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(chromeOptions);
		}
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    return driver;
    
	}
}
