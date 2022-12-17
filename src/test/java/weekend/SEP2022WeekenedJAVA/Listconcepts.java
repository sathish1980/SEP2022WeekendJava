package weekend.SEP2022WeekenedJAVA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listconcepts {
	
	WebDriver driver;
	public void listimplementation(String expetedvalue) throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.findElement(By.id("j_idt87:country")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//*[@id='j_idt87:country_items']//li"))));
		List<WebElement> alllistvalue=driver.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
		System.out.println(alllistvalue.size());
		for (WebElement eachvalue : alllistvalue)
		{
			String actaulvalue=eachvalue.getText();
			if (actaulvalue.equalsIgnoreCase(expetedvalue))
			{
				eachvalue.click();
				break;
			}
		}
	}
	
	public void city(String expectedcity)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:city")));
		
		driver.findElement(By.id("j_idt87:city")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//*[@id='j_idt87:city_items']//li"))));
		List<WebElement> alllistvalue=driver.findElements(By.xpath("//*[@id='j_idt87:city_items']//li"));
		System.out.println(alllistvalue.size());
		for (WebElement eachvalue : alllistvalue)
		{
			String actaulvalue=eachvalue.getText();
			if (actaulvalue.equalsIgnoreCase(expectedcity))
			{
				eachvalue.click();
				break;
			}
		}
	}

	public void fromhome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menuform:j_idt40")));
		
		driver.findElement(By.id("menuform:j_idt40")).click();
		driver.findElement(By.xpath("//*[text()='Dropdown']//parent::a")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Listconcepts L = new Listconcepts();
		//L.listimplementation("India");
		//L.city("Chennai");
		L.fromhome();
	}

}
