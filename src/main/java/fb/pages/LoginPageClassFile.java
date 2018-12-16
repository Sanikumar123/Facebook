package fb.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.base.FBBaseClass;

public class LoginPageClassFile extends FBBaseClass {

	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement Loginbtn;
	
	
	public LoginPageClassFile() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomepageClassFile loginToFB(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		Loginbtn.click();
		return new HomepageClassFile();
	}
	
	
	
	

}
