package Utils;

import java.io.File;

public class Driverclass {
	
	private static String driverpath  = setwebdriverfolder();
	private static String ieDriverServerDownloadURL="https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.3.0/IEDriverServer_Win32_4.3.0.zip";
private static String chromeServerDownload="https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.134/chromedrive_win32.zip";
private static String gechkodriverDownload="https://github.com/mozilla/geckodriver/releases/download/v0.31.0/geckodriver-v0.31.0-win32.zip";
private static String browserDownloadfile="chromedriver.zip";
private static String Downloadfolder=new File("target").getAbsolutePath();
private static String os= System.getProperty("os.name").toLowerCase();

	private static String setwebdriverfolder() {
	File driverFolder = new File("/petshot/Drivers");
	driverFolder.mkdir();
		return driverFolder.getAbsolutePath();
	}
	
	private static String DownloadDriver(String browser) {
		setDownloadWebdriversource(browser);
		String fullpath= driverpath+"\\"+browserDownloadfile;
		
		
		return browser;
	}
	
	private static void setDownloadWebdriversource(String browser) {
		// 
		boolean windows=false;
		if(os.contains("windows"))
			windows=true;
	if(windows && browser.toLowerCase().contains("firefox")) {
		browserDownloadfile="geckoDriver.zip";
	}else if(windows && browser.toLowerCase().contains("chrome")) {
		browserDownloadfile="chromedriver.zip";
	}
	else if(windows && browser.toLowerCase().contains("ie")) {
		browserDownloadfile="ieDriver.zip";
	}
	}
}
