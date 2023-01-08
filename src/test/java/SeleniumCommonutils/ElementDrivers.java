package SeleniumCommonutils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDrivers 
{

	public void TextToEnter(WebElement textWebelement,String texttoenter)
	{
		textWebelement.clear();
		textWebelement.sendKeys(texttoenter);
	}
	
	public String ReturnText(WebElement textWebelement)
	{
		return textWebelement.getText();
	}
	
	public void ClickOnButton(WebElement buttonWebelement)
	{
		if(buttonWebelement.isDisplayed())
		buttonWebelement.click();
		
	}
	
	public void WaitforClickable(WebDriver driver,WebElement clickableWebelement)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(clickableWebelement));
		
	}
	
	public void Waitforvisible(WebDriver driver,By visibleWebelement)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(visibleWebelement));
		
	}
}
