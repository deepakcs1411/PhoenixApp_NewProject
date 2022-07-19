package phoenixpages;


import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import propertyutility.PropertyUtility;
import waitutility.WaitUtility;

public class Login_Page1 extends BasePage
{
	public Login_Page1() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
	}
	
	@AndroidFindBy(xpath = "//*[@text='Pick Your Location']")
	private MobileElement clickLoacationBtn;

	@AndroidFindBy(xpath = "//*[@text='While using the app']")
	private MobileElement clickLocateLocation;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvBtnText")
	private MobileElement Locationaccess;
	
	@AndroidFindBy(xpath = "//*[@text='Allow all the time']")
	private MobileElement AllowAccess;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
	private MobileElement BackLocationAcces;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvAskLater")
	private MobileElement AskLater;
	
	@AndroidFindBy(xpath = "//*[@text='Chennai']")
	private MobileElement clickcitychennai;
	

	@AndroidFindBy(xpath = "//*[@text='Via Mobile Number']")
	private MobileElement clickviaMobno;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/etMobileNumber")
	private MobileElement loginbyMob;
	
	@AndroidFindBy(xpath = "//*[@text='Verify Mobile Number']")
	private MobileElement verifyviaMobno;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/et_otp_1")
	private MobileElement verifyotp1;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/et_otp_2")
	private MobileElement verifyotp2;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/et_otp_3")
	private MobileElement verifyotp3;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/et_otp_4")
	private MobileElement verifyotp4;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/et_otp_5")
	private MobileElement verifyotp5;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/et_otp_6")
	private MobileElement verifyotp6;
	
	@AndroidFindBy(xpath = "//*[@text='Verify OTP']")
	private MobileElement verifyviaOtp;
	
		
	public void clickonLocation()
	{try {
		
		WaitUtility.implicitwait(20);
		click(clickLoacationBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Pick Your Location Button" );
	} 
	catch (Exception e) {
		System.out.println("Exception in Picklocation" +e);
	}
		
      }
	public void LocateLocation()
	{
         click(clickLocateLocation);
         ExtentListeners.test.log(Status.INFO, "Locate your Location" );
         click(Locationaccess);
         ExtentListeners.test.log(Status.INFO, "Get Access your Location" );
         click(AllowAccess);
         ExtentListeners.test.log(Status.INFO, "Allow your Location to access" );
         click(BackLocationAcces);
      }	
	public void clickcitychennai()
	{
		try {
			WaitUtility.implicitwait(20);
			click(clickcitychennai);
			ExtentListeners.test.log(Status.INFO, "Select city and click on Chennai city" );
		} catch (Exception e) {
			System.out.println("Exception in clickoncitylocation" +e);
		}
	}
	public void clickOnMobno()
	{
		try {
			WaitUtility.implicitwait(20);
			click(clickviaMobno);
			 ExtentListeners.test.log(Status.INFO, "Login via Mobile Number" );
		} catch (Exception e) {
			System.out.println("Exception in clickonmobile No" +e);
		}
}
	public void loginviaMobno()
	{
		try {
			WaitUtility.implicitwait(20);
			click(loginbyMob);
			sendkeys(loginbyMob, PropertyUtility.getreaddata("MobileNo"));
			ExtentListeners.test.log(Status.INFO, "Enter Your Mobile Number" );
			ApplicationUtility.hidekeyboard();
			click(verifyviaMobno);
			ExtentListeners.test.log(Status.INFO, "Successfully verified your phone Number" );
		} catch (Exception e) {
			System.out.println("Exception in LoginViaMobile No" +e);
		}
	}
	public void verifyOtp()
	{
		try {
			WaitUtility.implicitwait(20);
			sendkeys(verifyotp1, PropertyUtility.getreaddata("verifyotp1"));
			sendkeys(verifyotp2, PropertyUtility.getreaddata("verifyotp2"));
			sendkeys(verifyotp3, PropertyUtility.getreaddata("verifyotp3"));
			sendkeys(verifyotp4, PropertyUtility.getreaddata("verifyotp4"));
			sendkeys(verifyotp5, PropertyUtility.getreaddata("verifyotp5"));
			sendkeys(verifyotp6, PropertyUtility.getreaddata("verifyotp6"));
			click(verifyviaOtp);
			ExtentListeners.test.log(Status.INFO, "Successfully verified Otp" );
			ExtentListeners.test.log(Status.INFO, "Application login Successfully" );
			
			WaitUtility.implicitwait(20);
		} catch (Exception e) {
			System.out.println("Exception in LoginViaMobile No" +e);
		}
	}
}