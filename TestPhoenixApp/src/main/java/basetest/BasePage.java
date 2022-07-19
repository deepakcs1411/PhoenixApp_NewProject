package basetest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilities.AppiumServer;
import utilities.CommonUtlis;

public class BasePage 
{
 public static AppiumDriver<MobileElement> driver;
 public static String loadpropFile ="confiq.properties";
 
 public void setup()
 { 
			// AppiumServer.start();
			 CommonUtlis.loadAndroidconfiqprop(loadpropFile);
			 CommonUtlis.setAndroidCapabilities();
			 driver=CommonUtlis.getAndroidDriver(); 
			
		  }
		 
 public void quit() 
 {
	 try {
		Thread.sleep(3000);
		 driver.quit();
		 AppiumServer.stop();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	 
 }

}
