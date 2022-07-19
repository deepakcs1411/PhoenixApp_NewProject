package testcases;

import org.testng.annotations.Test;

import basetest.BasePage;
import screens.LaunchApp;
import screens.LoginScreen;

public class LaunchAppTest extends BasePage
{
// Creating Object
	
    LaunchApp launch; 
	
	
	
 @Test(priority = 1)
 public void setupApp()
 {
 setup();	
 }
 
 @Test(priority = 2)
 public void GetAppLaunch()
 
 {   launch=new LaunchApp(driver);
	 launch.clickonLocation();
	 launch.LocateLocation();
	 launch.clickcitychennai();
	 launch.selectmall();
 }
}
 
// @AfterTest
// public void quitDriver()
// {
//	 quit();
// }
// 
//}
