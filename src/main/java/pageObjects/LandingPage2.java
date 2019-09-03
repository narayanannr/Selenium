package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage2 {

	WebDriver driver;
	By loginElelement=By.cssSelector("a[href*='sign_in']");

	public LandingPage2(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	public WebElement clickLogin()
	{
		return driver.findElement(loginElelement);
	}
	
	
	}
