package petshop.stepdefinitions;

import org.openqa.selenium.WebDriver;

import Utils.ReadConfirfile;
import Utils.browserfactory;
import Utils.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class Homepagestep {
	Homepage home = new Homepage();
	ReadConfirfile conf = new ReadConfirfile();
	browserfactory obj =new browserfactory();
	public static WebDriver driver;
	
	@Given("User landed on Jpetstore")
	public void user_landed_on_jpetstore() {
		obj.getdriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
//		home.enterJpetshoptURL();
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
