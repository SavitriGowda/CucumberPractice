package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/HooksDemo"},
		glue = {"HooksStepDefination"},
		monochrome = true,
//		plugin = {"pretty","html:target/HtmplReports/index.html",
//				  "pretty","json:target/JsonReports/report.json",
//				  "pretty","junit:target/JUnitReports/report.xml"}/
		plugin = {"json:target/cucumber.json"}
		
		)
public class TestRunnerForHooks {

}
