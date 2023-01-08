package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumCommonutils.ElementDrivers;

public class facebooklogin extends ElementDrivers
{
	
	WebDriver driver;
	@FindBy(id="email")
	WebElement usrname;
	@FindBy(id="pass")
	WebElement pwd;
	@FindBy(name="login")
	WebElement login;
	
	public facebooklogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username ) 
	{
	//WebElement usrname=driver.findElement(By.id("email"));
	TextToEnter(usrname,username);
	}
	
	public void enterPassword(String password)
	{
	//WebElement pwd=driver.findElement(By.id("pass"));
	TextToEnter(pwd,password);
	}
	
	public void ClickLoginButton()
	{
		//WebElement login=driver.findElement(By.name("login"));
		ClickOnButton(login);
	}

}
