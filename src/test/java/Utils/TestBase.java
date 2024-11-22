package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public ChromeDriver driver;
	public ChromeDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("QAurl");
		
		if (driver == null) {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) { //Here we are checking that the if the browser is chromebrowser then execute below:
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yashika goyal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--remote-allow-origins=*");
	   driver = new ChromeDriver(chromeOptions);
			}
			
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				//firefox code
			}
	   
	    driver.get(URL);
		}
	    return driver;
		
	}
}
