package petshop.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {

	@Given("user is on petstore")
	public void user_is_on_petstore() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("pass");
	}

	@When("user gets the titile page")
	public void user_gets_the_titile_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("pass");
	}

	@Then("user land on Petstore")
	public void user_land_on_petstore() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("pass");
	}
}
