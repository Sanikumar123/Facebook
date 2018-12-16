package fb.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBBaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public FBBaseClass() throws Exception 
	{
		prop = new Properties();
		FileInputStream fin = new FileInputStream("F:\\com.facebook\\src\\main\\java\\fb\\config\\config.properties");
		prop.load(fin);
	}
	
	public static void initialization()
	{
		if(prop.getProperty("browser_name").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		}
	}

}
