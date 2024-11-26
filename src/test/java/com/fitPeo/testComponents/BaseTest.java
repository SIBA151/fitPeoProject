package com.fitPeo.testComponents;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.apache.commons.io.FileUtils;
import com.fitPeo.Utility.ConfigRead;

import intTest.BaseClass;

public class BaseTest extends BaseClass	{
	public static ConfigRead prop = new ConfigRead();
	
	protected Properties fitPeoProperties = ConfigRead.getProValue("staticData");
		
	String browserName = fitPeoProperties.getProperty("browser");
	String url = fitPeoProperties.getProperty("baseUrl");

	@BeforeSuite(alwaysRun = true)
	public void initialization() {
		browserSetup(browserName);
		driver.get(url);
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
