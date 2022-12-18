package weekend.SEP2022WeekenedJAVA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehandlings {
	WebDriver driver;
	
	public void mousehandlingsimplementations()
	{
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//*[text()='Electronics'])[2]")));
			WebElement ele=driver.findElement(By.xpath("(//*[text()='Electronics'])[2]"));
			Actions ac= new Actions(driver);
			ac.moveToElement(ele).perform();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Computers and tablets']")));
			ac.moveToElement(driver.findElement(By.xpath("//*[text()='Computers and tablets']"))).click().perform();
			
	}
	
	public void facebookmouse() throws AWTException
	{	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement username=driver.findElement(By.id("email"));
	Actions ac= new Actions(driver);
	ac.moveToElement(username).sendKeys("sathish").doubleClick().contextClick().perform();
	Robot rb= new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	}
	
	public void dragamddrop()
	{	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/drag.xhtml");
	WebElement drag=driver.findElement(By.id("form:drag_content"));
	WebElement drop=driver.findElement(By.id("form:drop_content"));
	Actions ac= new Actions(driver);
	ac.moveToElement(drag).dragAndDrop(drag, drop).perform();
	}

	
	public void facebookkeyboard()
	{	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement username=driver.findElement(By.id("email"));
	Actions ac= new Actions(driver);
	ac.moveToElement(username).sendKeys("sathish").keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	}
	
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Mousehandlings M = new Mousehandlings();
		M.facebookmouse();
	}

}
