package weekend.SEP2022WeekenedJAVA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Progressbarandslider {
	
WebDriver driver;
	
	public void progressbar()
	{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leafground.com/drag.xhtml");
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			driver.findElement(By.id("form:j_idt119")).click();
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@class='ui-progressbar-label']")),"100%"));
			System.out.println(driver.findElement(By.className("ui-growl-title")).getText());		
	}
	
	public void slider()
	{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leafground.com/drag.xhtml");
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Actions ac= new Actions(driver);
			WebElement from=driver.findElement(By.xpath("//*[contains(@id,'form:j_idt125')]//span[1]"));
			ac.moveToElement(from).dragAndDropBy(from, -50, 0).perform();
			WebElement To=driver.findElement(By.xpath("//*[contains(@id,'form:j_idt125')]//span[2]"));
			ac.moveToElement(To).dragAndDropBy(To, 50, 0).perform();
			
			System.out.println(driver.findElement(By.id("form:displayRange")).getText());		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Progressbarandslider p = new Progressbarandslider();
		p.slider();
	}

}
