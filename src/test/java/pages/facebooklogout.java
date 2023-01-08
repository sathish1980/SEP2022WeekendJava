package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import SeleniumCommonutils.ElementDrivers;

public class facebooklogout extends ElementDrivers
{
	WebDriver driver;
	@FindBy(xpath="//*[local-name()='svg' and @aria-label='Your profile']")
	WebElement pofileWeblement;
	@FindBy(xpath="(//span[text()='Log Out']//parent::div//parent::div)[1]")
	WebElement logoutbutton;
	String lgoutbutton="(//span[text()='Log Out']//parent::div//parent::div)[1]";
	public facebooklogout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public String ValidateLogin()
	{
		//WebElement pofileWeblement=driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']"));
		WaitforClickable(driver,pofileWeblement);
		String Title=driver.getTitle();
		return Title;
		
	}
	public void ClickOnProfile()
	{
	
	//WebElement pofileWeblement=;
	WaitforClickable(driver,pofileWeblement);
	//Assert.assertEquals(driver.getTitle(), "Facebook");
	ClickOnButton(pofileWeblement);
	}
	
	public void ClickOnLogout()
	{
		//WebElement logoutWeblement=driver.findElement(By.xpath("(//span[text()='Log Out']//parent::div//parent::div)[1]"));
		Waitforvisible(driver,By.xpath(lgoutbutton));
		//Assert.assertEquals(driver.getTitle(), "Facebook");
		ClickOnButton(logoutbutton);
		
	}
	
}
