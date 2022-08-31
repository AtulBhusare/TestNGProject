package testNGFramework.ProjectTrial1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import ReSource.ChromeLaunch;

public class VerifyLoginTestCase extends ChromeLaunch {
    @Test
	public void login() throws IOException 
    {
    browserLaunch();	
    
    driver.get("https://login.salesforce.com/?locale=in");
    	
    	LoginPageObjects lpo=new LoginPageObjects(driver);
    	lpo.EnterUsername().sendKeys("Rahul");
    	lpo.EnterPassword().sendKeys("Nikhil");
    	lpo.ClickLogin().click() ;	
    	
    	String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator";
    	String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
    	
    	SoftAssert assertion =new SoftAssert();
    	assertion.assertEquals(actual,expected);
    }
	
	
}
