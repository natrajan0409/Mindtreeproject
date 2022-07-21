import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utils.browserfactory;

public class testrun extends browserfactory {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		browserfactory obj = new browserfactory();
obj.getdriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	
	}
}
