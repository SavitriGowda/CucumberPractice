package stepdefenation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step: Browser is open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/savit/eclipse-workspace/CucumberPractice1/src/test/resources/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step: User on google search page");
		driver.navigate().to("https:google.com/");
	}
	
	
	@When("user enter text in search box")
	public void user_enter_text_in_search_box() {
		System.out.println("Inside Step: user enter text in search bar");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("AutomationTesting");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step: user hits enter key");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("user navigated to the serach results page")
	public void user_navigated_to_the_serach_results_page() {
		System.out.println("Inside Step: user navigated to serch results page");
		driver.getPageSource().contains("Automation Testing");
		driver.close();
	}
}
