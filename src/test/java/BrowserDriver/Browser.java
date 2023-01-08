package BrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utils.propertyclass;

public class Browser {
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static String reportpath=System.getProperty("user.dir")+"//Reports//selenium.html";
	
	
	public void launch()
	{
		String browser=propertyclass.propreaddata().getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("start-maximized");
			options.addArguments("--disable-Notifications");
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	}

}
