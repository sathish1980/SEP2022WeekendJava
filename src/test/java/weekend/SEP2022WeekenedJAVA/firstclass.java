package weekend.SEP2022WeekenedJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstclass {
	
	WebDriver driver;
	public void firsttestcase(String Browser)
	{
		if (Browser.equalsIgnoreCase("chrome"))
		{
		 driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();	
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		//driver.quit();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.gmail.com/");
		/*driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//WebElement username=driver.findElement(By.id("emails"));
		/*WebElement username=driver.findElement(By.cssSelector("input#email"));
		WebElement username=driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"));
		WebElement username=driver.findElement(By.cssSelector("input[data-testid=royal_email]"));
		WebElement username=driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[data-testid=royal_email]"));*/
		
		WebElement username=driver.findElement(By.name("email"));
		//WebElement username=driver.findElement(By.className("inputtext_55r1_6luy"));
		username.sendKeys("sathish kumar R");
		username.clear();
		username.sendKeys("sathish");
		username.sendKeys("Besant");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("gotten")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstclass f = new firstclass();
		f.firsttestcase("Edge");
	}

}
