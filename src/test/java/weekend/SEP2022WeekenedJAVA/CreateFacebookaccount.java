package weekend.SEP2022WeekenedJAVA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateFacebookaccount {
	
	WebDriver driver;
	public void createaccount() throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		//driver.quit();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("sathish");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@data-name='gender_wrapper']//span[3]//input"))));
		driver.findElement(By.xpath("//*[@data-name='gender_wrapper']//span[3]//input")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@name='preferred_pronoun']")));
		Select daydropdown = new Select(driver.findElement(By.id("day")));
		daydropdown.selectByIndex(10);
		Select monthdropdown = new Select(driver.findElement(By.id("month")));
		monthdropdown.selectByValue("9");
		Select yeardropdown = new Select(driver.findElement(By.id("year")));
		yeardropdown.selectByVisibleText("2010");
		
		
	}
	public void multiselect() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Select muliselect= new Select(driver.findElement(By.xpath("//select[@id='second']")));
		if (muliselect.isMultiple())
		{
			muliselect.selectByIndex(2);
			Thread.sleep(1000);
			muliselect.selectByValue("pizza");
			Thread.sleep(1000);
			muliselect.selectByVisibleText("Bonda");
			Thread.sleep(1000);
			muliselect.deselectByValue("pizza");
			Thread.sleep(1000);
			muliselect.deselectAll();
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateFacebookaccount c = new CreateFacebookaccount();
		c.multiselect();
	}

}
