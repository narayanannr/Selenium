package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LandingPage2;
import pageObjects.LoginPage2;
import resources.base;

class HomePageTest2{
	WebDriver driver;
	@BeforeTest
	public void initialiseDriver() throws IOException
	{
		driver=base.initializeDriver();
	}
	
	@Test
	public void navigateToLoginPage()
	
	{
base.getUrl();
LandingPage2 l=new LandingPage2(driver);
l.clickLogin().click();
LoginPage2 lp=new LoginPage2(driver);
lp.getUserIDTxtbox().sendKeys("user@hgj.com");
lp.getPwdTxtbox().sendKeys("dfsdf");
lp.getLoginBtn().click();
	}
	
@AfterTest
public void tearDown()
{
	driver.quit();
	driver=null;
}
	
}