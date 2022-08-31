package ReSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch 
{
	 public WebDriver driver;
	 public WebDriver browserLaunch() throws IOException 
	 {
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ReSource\\Data.properties");
		 Properties prop=new Properties();
		 prop.load(fis);
		 String browserName=prop.getProperty("browser");
		 
		 if (browserName.equalsIgnoreCase("chrome")) 
		 {
			 WebDriverManager.chromedriver().setup();
			 //System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
    	 }
		 else if(browserName.equalsIgnoreCase("firefox")) 
		 {
    	 
		 }
		 else if(browserName.equalsIgnoreCase("Edge"))
		 {
			 //System.setProperty("webdriver.Edge.driver")
		 }
   
		 else 
		 {
			 System.out.println("Please select any browser ");
		 }
   
	
		 return driver; 
	 }
		// @AfterMethod
		// public void method12() 
		 {
		//	 driver.quit();
		 }
	 
}




