package basepage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import propertyutility.PropertyUtility;
import utilities.AppiumServer;
import utilities.CommonUtlis;
import waitutility.WaitUtility;

public class BasePage 
{
 public static AppiumDriver<MobileElement> driver;
 public static String key ="confiq.properties";
  
 public void setup()
 { 
			// AppiumServer.start();
	         PropertyUtility.getreaddata(key);
			 CommonUtlis.setAndroidCapabilities();
			 driver=CommonUtlis.getAndroidDriver(); 			
		  }

 
 public static void waitForVisibility(MobileElement el)
 {
    WebDriverWait wait=new WebDriverWait(driver, WaitUtility.WAIT);
    wait.until(ExpectedConditions.visibilityOf(el));
 }

 public static void click(MobileElement el)
 {
 	waitForVisibility(el);
 	el.click();
 }
 public static void sendkeys(MobileElement el, String text)
 {
 	waitForVisibility(el);
 	el.sendKeys(text); 	
 }
 public static void clear(MobileElement el)
 {
 	waitForVisibility(el);
 	el.clear();
 }
public String getAttribute(MobileElement el, String attribute)
{

 	waitForVisibility(el);
 	return el.getAttribute(attribute);	
}
public String getText(MobileElement el)
{
	return getAttribute(el,"text") ;	
}

 public void quit() 
 {

		try {
			WaitUtility.implicitwait(20);
			 driver.quit();
			 AppiumServer.stop();
		 
			
		} catch (Exception e) {
			System.out.println("Quit the driver" +e);
		}		
 }

}
