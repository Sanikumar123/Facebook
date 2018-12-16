package fb.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fb.base.FBBaseClass;
import fb.pages.HomepageClassFile;
import fb.pages.LoginPageClassFile;

public class LoginPageTestPage extends FBBaseClass {
	
     HomepageClassFile homepage;
     LoginPageClassFile login;

	public LoginPageTestPage() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setUP() throws Exception
	{
		initialization();
		login = new LoginPageClassFile();
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		homepage = login.loginToFB(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
