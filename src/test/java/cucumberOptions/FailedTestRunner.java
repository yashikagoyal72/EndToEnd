package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failedscenario.txt",
                 glue="stepDefinition",
                 monochrome = true,
                plugin = {"html:target/cucumber.html",
                		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		"rerun:target/failedscenario.txt"})
public class FailedTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
}
