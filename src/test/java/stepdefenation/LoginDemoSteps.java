package stepdefenation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	WebDriver driver=null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step: Browser is open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/savit/eclipse-workspace/CucumberPractice1/src/test/resources/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	

	@Given("User on login page")
	public void user_on_login_page() {
		System.out.println("Inside Step: User on Login Page");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String password) {
		System.out.println("Inside Step: User Eneter username and password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ' and @type='submit']")).click();
		
		
		
	}

	@Then("navigate to the homepage")
	public void navigate_to_the_homepage() {
		
		driver.quit();
	}

}
