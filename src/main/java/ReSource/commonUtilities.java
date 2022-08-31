package ReSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonUtilities 
   {
      public static void dropdownHandle(WebElement dropdownXpath)
      {
	  Select s=new Select(dropdownXpath);
	  s.selectByIndex(0);
	  
	  
	  
      }
   }
