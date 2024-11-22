package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	public TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup) {
      
		this.testcontextsetup=testcontextsetup;
		
	}
	
	@After
	public void AfterScenario() throws IOException{
		
		//driver.quit();
		testcontextsetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testcontextsetup.testBase.WebDriverManager();
		
		
		if(scenario.isFailed()) {
		File Screenshot = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//this will take screenshot
		byte[] filecontent = FileUtils.readFileToByteArray(Screenshot);//this will convert the file into byte
		scenario.attach(filecontent, "image/png", "image");//this will attach the screenshot with scenario but with byte format
		//byte[] filecontent = FileUtils.readFileToByteArray(Screenshot);//this will convert the file into byte
		
		}
		
	}

}
