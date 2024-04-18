package stepdefenation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step: user on login page");
	}

	@When("user enetrs username and password")
	public void user_enetrs_username_and_password() {
		System.out.println("Inside Step: Enter username and password");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside Step: User click on login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("Inside Step: User navigated to HomePage");
	}
}
