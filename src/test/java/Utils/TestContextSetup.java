package Utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.PageObjectManager;


public class TestContextSetup {
	public ChromeDriver driver;	
	public String LandingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public String LandingPageProductName1;
	
	
	
	public TestContextSetup() throws IOException 
	{
		testBase = new TestBase();
		 pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
	
	
}
