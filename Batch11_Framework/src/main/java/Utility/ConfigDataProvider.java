package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public  ConfigDataProvider() throws Exception {
		
		String pathconfig="C:\\Users\\ADMIN\\eclipse-workspace\\Batch11_Framework\\Config\\Config.Properties";
		FileInputStream File=new FileInputStream(pathconfig);
		pro=new Properties();
		pro.load(File);
		
		}
	
	public String getBaseUrl_QA1 () {
		return pro.getProperty(getBaseUrl_QA1());
		
	}

	public String getBaseUrl_Qa2 () {
		
		return pro.getProperty(getBaseUrl_Qa2());
	}
}
