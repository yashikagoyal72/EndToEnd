package Utils;

import java.io.FileInputStream;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public WebDriver driver;
	public  WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("QAurl");
		
		if (driver == null) {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) { //Here we are checking that the if the browser is chromebrowser then execute below:
		WebDriverManager.chromedriver().setup();
		
	    
	   driver = new ChromeDriver();
			}
			
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				//firefox code
			}
	   
	    driver.get(URL);
		}
	    return driver;
		
	}
}
