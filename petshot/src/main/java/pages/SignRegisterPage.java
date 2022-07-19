package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.browserfactory;

public class SignRegisterPage extends browserfactory {
	String Signinbtn ="//a[text()='Sign In']";  
	String username="//input[@name='username']";
	String password="//input[@name='password']";
	String LoginBtn="//input[@type='submit' and  @value='Login']";
	String Registerlink="//a[text()='Register Now!']";
//	----category
	String Fishlink="//img[@src='../images/sm_fish.gif']";
	String dogLink="//img[@src='../images/sm_dogs.gif']";
	String reptilesLink="//img[@src='../images/sm_dogs.gif']";
	String catsLink="//img[@src='../images/sm_dogs.gif']";
	String birdsLink="//img[@src='../images/sm_dogs.gif']";
//	Headers 
	String sighInHdr="//p[text()='Please enter your username and password.']";
	String SighHdrLogo="//img[@src='../images/logo-topbar.gif']";
	String SighInSearch="//input[@name='keyword']";
	String SearchBtn="//input[@name='searchProducts']";
	
	public WebElement Signbtn= driver.findElement(By.xpath(Signinbtn)) ;
	public WebElement uName= driver.findElement(By.xpath(username)) ;
	public WebElement pword= driver.findElement(By.xpath(password)) ;
	public WebElement lgbtn= driver.findElement(By.xpath(LoginBtn)) ;
	public WebElement regLink= driver.findElement(By.xpath(Registerlink)) ;
//	----category
	public WebElement Fish= driver.findElement(By.xpath(Fishlink)) ;
	public WebElement dog= driver.findElement(By.xpath(dogLink)) ;
	public WebElement reptiles= driver.findElement(By.xpath(reptilesLink)) ;
	public WebElement cats= driver.findElement(By.xpath(catsLink)) ;
	public WebElement birds= driver.findElement(By.xpath(birdsLink)) ;
//	Headers 
	public WebElement HdrSignIN= driver.findElement(By.xpath(sighInHdr)) ;
	public WebElement HDRSignINLogo= driver.findElement(By.xpath(SighHdrLogo)) ;
	public WebElement HdrSighInSearch= driver.findElement(By.xpath(SighInSearch)) ;
	public WebElement HdrSearchBtn= driver.findElement(By.xpath(SearchBtn)) ;
	
}
