package petshop.stepdefinitions;

import Utils.ReadConfirfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class Homepagestep {
	Homepage home = new Homepage();
	ReadConfirfile conf = new ReadConfirfile();

	@Given("User landed on Jpetstore")
	public void user_landed_on_jpetstore() {
		home.enterJpetshoptURL();
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		home.isDisplayeJPetStoreTitile();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		home.clickEntertTheStore();
	}
}
