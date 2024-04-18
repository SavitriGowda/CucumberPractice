package HooksStepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageHooksSteps {

	WebDriver driver = null;

	@Before(order = 1)
	public void browserSetup() {
		System.out.println("I am inside browser setup");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savit\\eclipse-workspace\\"
				+ "CucumberPractice1\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Before(order = 0)
	public void setup2() {
		System.out.println("I am inside browser setup2 \n");
	}

	@After
	public void tearDown() {
		System.out.println("I am inside teardown");
		driver.close();
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println("  I am inside before steps----------");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("  I am inside After Steps-------------");
		System.out.println();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	}

	@When("click on login button")
	public void click_on_login_button() {
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	}

}
