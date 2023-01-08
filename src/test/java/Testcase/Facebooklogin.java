package Testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.Browser;
import SeleniumCommonutils.ElementDrivers;
import Utils.ExcelRead;
import Utils.propertyclass;
import pages.facebooklogin;
import pages.facebooklogout;

public class Facebooklogin extends Browser
{
	propertyclass p = new propertyclass();
	
	@BeforeSuite
	public void browserlaunch()
	{
		launch();
		report= new ExtentReports(reportpath,false);
		test=report.startTest("Automation started");
	}
	
	@BeforeTest
	public void maximize()
	{
		driver.manage().window().maximize();
		String url=propertyclass.propreaddata().getProperty("URL");
		driver.get(url);
	}
	
	@Test(priority=0,dataProvider="loginsheet",dataProviderClass=dataproviderinfo.class,enabled=true)
	public void LoginandLogout(String username,String password)
	{
		facebooklogin fb= new facebooklogin(driver);
		fb.enterUsername(username);
		test.log(LogStatus.INFO, "Entered the user name is : "+username);
		fb.enterPassword(password);
		test.log(LogStatus.INFO, "Entered the password is : "+password);
		fb.ClickLoginButton();
		test.log(LogStatus.INFO, "Login button is clicked");
		
		facebooklogout fo= new facebooklogout(driver);
		//Assert.assertEquals("Facebook",fo.ValidateLogin());
		fo.ClickOnProfile();
		fo.ClickOnLogout();
		String scrnshot=Takescreenshot();
		test.log(LogStatus.PASS, "Login and Lgout sucessfully",test.addScreenCapture(scrnshot));
	}
	
	
	@Test(priority=1)
	public void Invalidlogin()
	{
		try
		{
		WebElement usrname=driver.findElement(By.id("email"));
		usrname.sendKeys("2384tsadh");
		/*WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("Adminn2323");*/
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='_9ay7']"))));
		String expectederror=driver.findElement(By.xpath("//*[@class='_9ay7']")).getText();
		System.out.println(expectederror);
		Assert.assertEquals(expectederror, "The email address or mobile number you entered isn't connected to an account. Create a new Facebook account.");
		test.log(LogStatus.PASS, "invalid username validated sucessfully");
		String scrnshot=Takescreenshot();
		test.log(LogStatus.PASS, "Login and Lgout sucessfully",test.addScreenCapture(scrnshot));
		}
		catch(Exception e)
		{
			String scrnshot=Takescreenshot();
			test.log(LogStatus.FAIL,test.addScreenCapture(scrnshot));
			test.log(LogStatus.FAIL, e);
			
		}
	}
	
	
	@AfterMethod
	public String Takescreenshot()
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File Destinationfile= new File(System.getProperty("user.dir")+
				"//Screenshot//"+currentdate()+".png");
		try {
			FileUtils.copyFile(sourcefile, Destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return Destinationfile.toString();
	}
	
	public String currentdate()
	{
		Date date = new Date();
	    //This method returns the time in millis
		long timeMilli = date.getTime();
		String date_v= String.valueOf(timeMilli);
		return date_v;
	}
	
	@AfterSuite
	public void teardown()
	{
		report.flush();
		driver.close();
		driver.quit();
	}
	
	

}
