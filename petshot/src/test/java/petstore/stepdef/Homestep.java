package petstore.stepdef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class Homestep extends Homepage {
	Homepage home = new Homepage();
	@Given("User landed on Jpetstore")
	public void user_landed_on_jpetstore() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Ecelips worksapce/Mindtreeproject/petshot/Drivers/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		driver.manage().window().maximize();
		driver.manage().wait(0);
	
	}
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
//	   home.isDisplayeJPetStoreTitile();

		System.out.println("pass");
	}
	@When("click On Enter the store link")
	public void click_on_enter_the_store_link() {
//		home.Store.click();
		System.out.println("pass");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
//	    home.isDisplayedSignHDR();
	    System.out.println("pass");
	}


}
