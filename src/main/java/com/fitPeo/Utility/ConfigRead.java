package com.fitPeo.Utility;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

public static Properties prop;
	
	public static Properties getProValue(String fileName) {
		String filePath=System.getProperty("user.dir")+"/src/main/resources/"+fileName+".properties";
		try {
		FileInputStream fis=new FileInputStream(filePath);
		prop=new Properties();
		prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
