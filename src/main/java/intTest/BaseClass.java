package intTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fitPeo.Utility.ConfigRead;

public class BaseClass {

	public static WebDriver driver = null;
	public static Properties fitPeoSelectorsProperties = ConfigRead.getProValue("fitPeo_selectors");
	protected Properties fitPeoProperties = ConfigRead.getProValue("staticData");

	public void browserSetup(String broName) {
		switch (broName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().window().maximize();
	}

}
