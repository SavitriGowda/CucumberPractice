package stepdefenation;

import amazonapplication.Productpage;
import amazonapplication.Searchpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchModule {
	Productpage product;
	Searchpage search;
	@Given("I have search field on amazon application")
	public void i_have_search_field_on_amazon_application() {
	  System.out.println("Step 1: search bar on amazon app");  
	}

	@When("I search product with name {string} with price {int}")
	public void i_search_product_with_name_with_price(String productName, Integer price) {
	   System.out.println("Search with product name: "+productName+ " price : "+price);
	   product=new Productpage(productName,price);
	   search=new Searchpage();
	 
	   
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		  String name=search.displayProductName(product);
		   System.out.println("Product Name : "+name +" Should be Displayed");
	}
}
