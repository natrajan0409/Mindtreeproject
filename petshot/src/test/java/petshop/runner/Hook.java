package petshop.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.driverfactory;
import io.cucumber.java.Scenario;

public class Hook  extends driverfactory{
	private  static String  ScreenshotName;
	@Before
	public void setup() {
		driver=getdriver("chrome");
	}
	
	@After
	public void teardownScreenshot(Scenario scenario) {
		try {
//			if (driver!=null&&scenario.isFailed() ) {
//				scenario.attach(ScreenshotName, ScreenshotName, ScreenshotName);
//				scenario.e
//				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),ScreenshotName);
//			driver.manage().deleteAllCookies();
//				driver.quit();
//				driver=null;
//			}
			if(driver!=null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver=null;
			}
		} catch (Exception e) {
			System.out.println("method failed :teardownScreenshot ,Exception:"+ e.getMessage());
		}
	}
	
	public static String retrunDateStamp(String fileextension) {
		Date d= new Date();
		String date =d.toString().replace(":", "_").replace("", "_")+fileextension;
		return date;
	}
	public static void capturescreenshot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		ScreenshotName=retrunDateStamp(".jpg");
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\output\\image"+ScreenshotName));
//		Reporter.addSteplog("Taking a screenshot!");
//		Reporter.addSteplog("<br>");
		
		
	}
	
	private  static void copyfileusingStream(File source,File dest) throws IOException {
		InputStream Is= null;
		OutputStream Os=null;
		try {
			Is=new FileInputStream(source);
			Os=new FileOutputStream(dest);
			byte[]buffer=new byte[1024];
			int length;
			
			while((length=Is.read(buffer))>0){
				Os.write(buffer,0,length);
			}
		}
		finally {
			Is.close();
			Os.close();
		}
		
	}
	
	public static void copylatestExtendsReposts () throws IOException {
		Date d= new Date();
		String date =d.toString().replace(":", "_").replace("", "_");
		File source= new File(System.getProperty("user.dir")+"\\output\\report.html");
		File dest= new File(System.getProperty("user.dir")+"\\output\\"+date.toString()+".html");
		copyfileusingStream(source,dest);
	}
}
