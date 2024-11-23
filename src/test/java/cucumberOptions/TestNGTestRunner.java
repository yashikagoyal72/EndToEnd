package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
                 glue="stepDefinition",
                 monochrome = true,
                 tags = "PlaceOrder or @SearchProduct",
                plugin = {"html:target/cucumber.html",
                		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//"rerun:target/failedscenario.txt"
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
}
