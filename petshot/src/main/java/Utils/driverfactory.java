package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverfactory<Readconfigfile> {
public static WebDriver driver;
public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
public WebDriver getdriver(String browser) {
	
	try {
		ReadConfirfile file = new ReadConfirfile();
		String browserName= file.getbrowser();
		
		if (browserName.equals("chrome")||browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Firefox")||browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if (browserName.equals("ID")||browser.equals("ID")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		else if (browserName.equals("Edge")||browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		else if (browserName.equals("operamin")||browser.equals("operamin")) {
			WebDriverManager.operadriver().setup();
			driver= new OperaDriver();
		}
	} catch (Exception e) {
		System.out.println("Unble to load browser"+e.getMessage());
		e.printStackTrace();
	}finally {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	return driver;
}
public static synchronized WebDriver getDriver() {
	return tlDriver.get();
}
}
