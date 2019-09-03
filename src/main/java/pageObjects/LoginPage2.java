package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage2 {

	WebDriver driver;
	
	By userIdTxtBox = By.xpath("//input[@id='user_email']");
	
	By pwdTxtBox=By.cssSelector("input[id='user_password']");
	By loginBtn=By.name("commit");
	
	
	
	public LoginPage2(WebDriver driver) {
this.driver=driver;

	}

	public WebElement getUserIDTxtbox()
	{
		return driver.findElement(userIdTxtBox);
	}
	
	public WebElement getPwdTxtbox()
	{
		return driver.findElement(pwdTxtBox);
	}
	
	public WebElement getLoginBtn()
	{
		
		return driver.findElement(loginBtn);
	}

}
