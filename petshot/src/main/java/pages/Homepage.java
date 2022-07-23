package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ReadConfirfile;
import Utils.browserfactory;
import Utils.driverfactory;

public class Homepage  {
	private WebDriver driver;
	ReadConfirfile conf= new ReadConfirfile();
	browserfactory obj =new browserfactory();
	
	String  jstoreHomeTitle ="//div[@id='Content']//h2";
	String  enterStore = "Enter the Store";
	String  signin="Sign In";
	
	public WebElement jstoreTitle= driver.findElement(By.xpath(jstoreHomeTitle)) ;
	public WebElement Store= driver.findElement(By.linkText(enterStore)) ;
	public WebElement signinhdr= driver.findElement(By.linkText(signin)) ;
	
	
	public void  isDisplayeJPetStoreTitile() {
		String  titile =jstoreTitle.getText();
		assertTrue(titile.equals("Welcome to JPetStore 6"));
		
	}
	
	public void isDisplayedSignHDR() {
		assertTrue(signinhdr.isDisplayed());
	}

	public void clickEntertTheStore() {
		Store.click();
	}
	
	public void enterJpetshoptURL() {
	String URL =	conf.getURL();
	String browser = conf.getbrowser();
	if(URL!=null) {
		obj.getdriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}else {
		System.out.println("URL not avaliable");
	}
		
	}
}
