package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ReadConfirfile;
import Utils.driverfactory;

public class Homepage extends driverfactory {
	private WebDriver driver;
	ReadConfirfile conf= new ReadConfirfile();
	
	String  jstoreHomeTitle ="//div[@id='Content']//h2";
	String  enterStore = "Enter the Store";
	
	public WebElement jstoreTitle= driver.findElement(By.xpath(jstoreHomeTitle)) ;
	public WebElement Store= driver.findElement(By.linkText(enterStore)) ;
	
	
	public void  isDisplayeJPetStoreTitile() {
		String  titile =jstoreTitle.getText();
		assertTrue(titile.equals("Welcome to JPetStore 6"));
		
	}

	public void clickEntertTheStore() {
		Store.click();
	}
	
	public void enterJpetshoptURL() {
	String URL =	conf.getURL();
	if(URL!=null) {
		driver.get(URL);
	}else {
		System.out.println("URL not avaliable");
	}
		
	}
}
