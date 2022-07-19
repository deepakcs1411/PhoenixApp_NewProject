package utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import propertyutility.PropertyUtility;

public class CommonUtlis extends PropertyUtility
{

	private static AppiumDriver<MobileElement> driver;
	private static URL serverurl;
	private static DesiredCapabilities caps=new DesiredCapabilities();

	public static void setAndroidCapabilities()
	{
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, props.getProperty("platform.Name"));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, props.getProperty("device.Name"));
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, props.getProperty("App.Package"));
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, props.getProperty("App.Activity"));
		caps.setCapability("avd", "Pixel_2");
	    caps.setCapability("avdLaunchTimeout", "180000");
	    
//	    File path = new File("src/test/resources");
//	    File applocation= new File(path,"app-stagingPro-debug-20220628.apk");
//	    caps.setCapability(MobileCapabilityType.APP, applocation.getAbsolutePath());
//		
	}
   public static void loadIosconfiqprop(String loadpropFile) 
   {
		// write Capabilites for IOS
		
	}

   public static AppiumDriver<MobileElement> getAndroidDriver()
   {
	try {
		serverurl= new URL("http://localhost:"+ props.getProperty("appiumserverport")+ "/wd/hub");
	
	} catch (MalformedURLException e) 
	{

		e.printStackTrace();
	}   
	
	driver=new AndroidDriver<MobileElement>(serverurl, caps);  
	return driver;
   
   }
}
