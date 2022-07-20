package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfirfile {
protected FileInputStream fis =null;
protected Properties prop =null;

public ReadConfirfile() {
 	try {
// 		ReadConfirfile.class.getClassLoader().getSystemResourceAsStream("src\\main\\java\\Properties\\config.properties");
 		prop=new Properties();
// 		prop.load(input);
 		fis=new FileInputStream("src\\main\\java\\Config\\Config.properties");
 		prop.load(fis);
 		
 	} catch(IOException e) {
 		e.printStackTrace();
 	}
}
public String getbrowser() {
	if(prop.getProperty("browser")==null)
	{
		return "";
		
	}
	return prop.getProperty("browser");
}

public String getURL() {
	if(prop.getProperty("URL")==null)
	{
		return "";
		
	}
	return prop.getProperty("URL");
}

}
