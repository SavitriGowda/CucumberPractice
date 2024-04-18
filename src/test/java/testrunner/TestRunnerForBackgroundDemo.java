package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\AppFeature\\BackgroundDemo"},
		glue = {"StepsforBackgroundDemo"},
		monochrome = true,
//		plugin = {"pretty","html:target/HtmplReports/index.html",
//				  "pretty","json:target/JsonReports/report.json",
//				  "pretty","junit:target/JUnitReports/report.xml"}
				plugin = {"json:target/cucumber.json"}
		)
public class TestRunnerForBackgroundDemo {

}
