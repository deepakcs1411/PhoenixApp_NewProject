package phoenixtesting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import phoenixpages.FirstLogin_Page;

public class Firstlogin_Test extends BasePage
{
	FirstLogin_Page ob;

@Test(priority = 1)
public void setupApp()
	{
	 setup();	
	 ExtentListeners.testReport.get().log(Status.INFO, "Application Setup Launch SuccessFully" );
	 ob=new FirstLogin_Page();
	 }
@Test(priority = 2)
	 public void GetAppLaunch()
	 
	 {   
	ob.clickonLocation();
	ob.LocateLocation();
	ob.clickcitychennai();
	ob.clickOnMobno();
	ob.loginviaMobno();
	 }
@Test(priority = 3)
public void verifyOtp()
	 {
		 ob.verifyOtp();
	 }
@Test(priority = 4)
public void getUserdetails()
{
	ob.enterdetails();
	
}

	}
	 
	// @AfterTest
	// public void quitDriver()
	// {
//		 quit();
	//  ExtentListeners.testReport.get().log(Status.INFO, "Driver Quit Successfully" );
	// }
	// 
	//}
	
