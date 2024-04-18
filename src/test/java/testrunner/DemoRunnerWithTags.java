package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\AppFeaturesWIthTags"},
		glue = {"stepdefenation"},
		//tags= "@SmokeTest or @regression"
		//ignore or skip
		tags= "@SmokeTest and not @regression"
		,plugin = {"json:target/cucumber.json"}
		)	
public class DemoRunnerWithTags {

}
