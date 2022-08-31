package testNGFramework.ProjectTrial1;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import ReSource.ChromeLaunch;
import ReSource.commonUtilities;

public class SignUpTestcase extends ChromeLaunch{
	
	@Test
     public void SigUp() throws IOException, InterruptedException {
		 browserLaunch();
		
	 driver.get("https://login.salesforce.com/?locale=in");
	 
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.clickontry().click();
		
		Thread.sleep(5000);
		SignupPageObjects spo=new SignupPageObjects(driver);
		spo.selectfirstname().sendKeys("Atul");
		spo.selectlastname().sendKeys("Bhusare");
		spo.selectworkmail().sendKeys("atul.r.bhusare1998@gmail.com");
		spo.selectCompany().sendKeys("Alpha Pvt Ltd");
		spo.selectPhone().sendKeys("8554028371");
		
		commonUtilities.dropdownHandle(spo.selectJobTitle());
		commonUtilities.dropdownHandle(spo.selectcountry());
		commonUtilities.dropdownHandle(spo.selectEmployees());
		
		Select s=new Select (spo.selectJobTitle());
		s.selectByIndex(5);
		
		Select S1=new Select(spo.selectEmployees());
		S1.selectByIndex(2);
		
		Select s2=new Select(spo.selectcountry()); 
		s2.selectByIndex(1);
		
		
 }
}
