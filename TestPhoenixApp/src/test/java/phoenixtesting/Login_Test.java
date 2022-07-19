package phoenixtesting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import phoenixpages.Login_Page1;

public class Login_Test extends BasePage
{
// Creating Object
	
    Login_Page1 login; 
 		
 @Test(priority = 1)
 public void setupApp()
 {
 setup();	
 ExtentListeners.testReport.get().log(Status.INFO, "Application Setup, Launch SuccessFully" );
 login=new Login_Page1();
 }
 
 @Test(priority = 2)
 public void GetAppLaunch()
 
 {   
	 login.clickonLocation();
	 login.LocateLocation();
	 login.clickcitychennai();
	 login.clickOnMobno();
	 login.loginviaMobno();
 }
 @Test(priority = 3)
 public void verifyOtp()
 {
	 login.verifyOtp();
 }
}
 
// @AfterTest
// public void quitDriver()
// {
//	 quit();
//  ExtentListeners.testReport.get().log(Status.INFO, "Driver Quit Successfully" );
// }
// 
//}
