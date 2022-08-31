package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;

public class SignupPageObjects {

	public WebDriver driver;

	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By LastName = By.xpath("//input[@name='UserLastName']");
	private By Workmail = By.xpath("//input[@name='UserEmail']");
	private By Company =By.xpath("//input[@name='CompanyName']");
	private By Phone =By.xpath("//input[@name='UserPhone']");
	private By JobTitle =By.xpath("//select[@name='UserTitle']");
	private By Employees =By.xpath("//select[@name='CompanyEmployees']");
	private By Country =By.xpath("//select[@name='CompanyCountry']");
	 public SignupPageObjects(WebDriver driver2) 
	{this.driver=driver2;
	}
	public WebElement selectfirstname() {
		return driver.findElement(firstName);
	}

	public WebElement selectlastname() {
		return driver.findElement(LastName);
	}
	public WebElement selectworkmail() {
		 return driver.findElement( Workmail);
    }
	public WebElement selectCompany() {
		return driver.findElement(Company);
	}
	public WebElement selectPhone() {
		return driver.findElement(Phone);
	}	
	public WebElement selectJobTitle() {
		return driver.findElement(JobTitle);
	}
	public WebElement selectEmployees() {
		return driver.findElement(Employees);
	}
	public WebElement selectcountry() {
		return driver.findElement(Country);
	}	
		


	
	
	
	


}
