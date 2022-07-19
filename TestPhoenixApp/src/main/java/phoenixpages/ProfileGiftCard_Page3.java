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

public class ProfileGiftCard_Page3 extends BasePage
{
public ProfileGiftCard_Page3()
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgUser")
private MobileElement  clickonProfile;

@AndroidFindBy(xpath = "//*[@text='Phoenix Gift Card']")
private MobileElement PhoenixGiftBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement BackGiftCard;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/clScratchCardHistory")
private MobileElement scratchcard;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivScratchHistoryBack")
private MobileElement scratchcardBack;

@AndroidFindBy(xpath = "//*[@text='Wheel of Fortune']")
private MobileElement wheelBtn;

@AndroidFindBy(className = "android.widget.RelativeLayout")
private MobileElement clickoncoupons;

@AndroidFindBy(xpath = "//*[@text='View this Coupon']")
private MobileElement viewcoupons;

@AndroidFindBy(xpath = "//*[@text='Used']")
private MobileElement usedcoupons;

@AndroidFindBy(xpath = "//*[@text='Gifted']")
private MobileElement Giftedcoupons;

@AndroidFindBy(xpath = "//*[@text='Rewards']")
private MobileElement Rewardcoupons;

@AndroidFindBy(xpath = "//*[@text='Used']")
private MobileElement usedRewcoupons;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivBack")
private MobileElement exitRewards;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivScratchHistoryBack")
private MobileElement exitcoupensection;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivScratchHistoryBack")
private MobileElement wheelBackBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/txtCouponsTitle")
private MobileElement youroffersBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivBack")
private MobileElement youroffersBackBtn;

@AndroidFindBy(xpath = "//*[@text='Planned Mall Visits']")
private MobileElement clickvisitmallBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement clickvisitmallBackBtn;

@AndroidFindBy(xpath = "//*[@text='Parking Booking']")
private MobileElement parkingbookbtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement parkingbookbackBtn;

@AndroidFindBy(xpath = "//*[@text='Payment History']")
private MobileElement paymentHistoryBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement paymentHistoryBackBtn;

@AndroidFindBy(xpath  = "//*[@text='Scan History']")
private MobileElement ScanHistoryBtn;

@AndroidFindBy(xpath  = "//*[@text='Under Review']")
private MobileElement ReviewHistoryBtn;

@AndroidFindBy(xpath  = "//*[@text='Rejected']")
private MobileElement RejectedBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivScanHistoryBack")
private MobileElement ScanHistoryBackBtn;

@AndroidFindBy(xpath  = "//*[@text='Your Favourite Stores']")
private MobileElement FavStoresBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement FavStoresBackBtn;


@AndroidFindBy(xpath  = "//*[@text='Your Activities']")
private MobileElement ActivitiesBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement ActivitiesBackBtn;

@AndroidFindBy(xpath  = "//*[@text='Help']")
private MobileElement HelpBtn;

@AndroidFindBy(xpath  = "//*[@text='FAQs']")
private MobileElement FaQBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement FaQBackBtn;

@AndroidFindBy(xpath  = "//*[@text='View Tutorials']")
private MobileElement ViewTutorialsBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement TutorialsBackBtn;


@AndroidFindBy(xpath  = "//*[@text='Support']")
private MobileElement SupportBtn;

@AndroidFindBy(xpath  = "//*[@text='Query Type']")
private MobileElement YourQueryBtn;

@AndroidFindBy(xpath  = "//*[@text='Rewards']")
private MobileElement SelectRewardBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/etMessage")
private MobileElement TypeMessegeBtn;

@AndroidFindBy(xpath  = "//*[@text='Submit']")
private MobileElement SubmitBtn1;

@AndroidFindBy(id  = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement SubmitBackBtn1;

@AndroidFindBy(xpath  = "//*[@text='Privacy Policy']")
private MobileElement PolicyBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement PolicyBackBtn;

@AndroidFindBy(xpath  = "//*[@text='Loyalty Terms & Conditions']")
private MobileElement LoyaltyTnCBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement LoyaltyTncBackBtn;

@AndroidFindBy(xpath  = "//*[@text='About']")
private MobileElement AboutBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivBack")
private MobileElement AboutBackBtn;

@AndroidFindBy(id = "//*[@text='Delete Account']")
private MobileElement deleteaccount;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement helpBackBtn;

@AndroidFindBy(xpath  = "//*[@text='Logout']")
private MobileElement Logout;

@AndroidFindBy(xpath  = "//*[@text='Logout']")
private MobileElement ConfirmLogout;



public void PhoenixGiftCard()
{
	try {
		WaitUtility.implicitwait(20);
		click(clickonProfile);
		ExtentListeners.test.log(Status.INFO, "Enter in profile Section" );
		click(PhoenixGiftBtn);
		ExtentListeners.test.log(Status.INFO, "click on Phoenix Gift Crad Section" );
} catch (Exception e) {
	System.out.println("Exception in Click on Phoenix Gift Card");
}
	
}
public void EXitPhoenixGiftCard()
{ try {
	Thread.sleep(3000);
	click(BackGiftCard);
	ExtentListeners.test.log(Status.INFO, "Exit from Phoenix Gift Crad Section" );
} catch (Exception e) {
	System.out.println("Exception in Exit from Phoenix Gift Card");
}
	
}
public void ClickonScratchCard()
{ try 
{
	WaitUtility.implicitwait(20);
	click(scratchcard);
	ExtentListeners.test.log(Status.INFO, "click on scratch Gift Crad Section" );
	click(scratchcardBack);
	ExtentListeners.test.log(Status.INFO, "Exit on scratch Gift Crad Section" );
} catch (Exception e) {
	System.out.println("Exception in Click in Scrathch Cards " +e);
}
	
}
public void ClickonWheelofFortune()
{
	WaitUtility.implicitwait(20);
	click(wheelBtn);
	ExtentListeners.test.log(Status.INFO, "click on wheel of Fortune Section" );
	click(clickoncoupons);
	ExtentListeners.test.log(Status.INFO, "click on coupons and rewards" );
	click(viewcoupons);
	ExtentListeners.test.log(Status.INFO, "click on view this coupons" );
	click(usedcoupons);
	ExtentListeners.test.log(Status.INFO, "click on used coupons" );
	click(Giftedcoupons);
	ExtentListeners.test.log(Status.INFO, "click on Gifted coupons" );
	click(Rewardcoupons);
	ExtentListeners.test.log(Status.INFO, "click on Rewards Button" );
	click(usedRewcoupons);
	ExtentListeners.test.log(Status.INFO, "click on used Rewards Button" );
	click(exitRewards);
	ExtentListeners.test.log(Status.INFO, "Exit in Rewards Button" );
	click(exitcoupensection);
	ExtentListeners.test.log(Status.INFO, "Exit in coupons and rewards" );
	click(wheelBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit in wheel of Fortune Section" );
}

public void ClickonYourOffers()
{
	WaitUtility.implicitwait(20);
	click(youroffersBtn);
	ExtentListeners.test.log(Status.INFO, "click on Your offers Button" );
	click(usedcoupons);
	ExtentListeners.test.log(Status.INFO, "click on used coupons" );
	click(Giftedcoupons);
	ExtentListeners.test.log(Status.INFO, "click on Gifted coupons" );
	click(Rewardcoupons);
	ExtentListeners.test.log(Status.INFO, "click on used Rewards Button" );
	click(usedRewcoupons);
	ExtentListeners.test.log(Status.INFO, "click on used Rewards Button" );
	click(youroffersBackBtn);	
	ExtentListeners.test.log(Status.INFO, "Exit in Your offers Button" );
}
public void ClickonPlannedVisitMall()
{
	click(clickvisitmallBtn);
	ExtentListeners.test.log(Status.INFO, "click on planned mall Visit" );
	click(clickvisitmallBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from planned mall Visit" );
}

public void ClickonParkingBooking()
{
	WaitUtility.implicitwait(20);
	click(parkingbookbtn);
	ExtentListeners.test.log(Status.INFO, "click on parking booking Btn" );
	click(parkingbookbackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from parking booking Btn" );
}

public void scrolldown()
{
	try {
		WaitUtility.implicitwait(20);
		ApplicationUtility.Scroll(450, 1640, 459, 468);
		ExtentListeners.test.log(Status.INFO, "scroll your profile page" );
	} catch (Exception e) {
		System.out.println("Exception in ScrollDown " +e);
	}
	
}
public void ClickonPaymentHistory()
{
	WaitUtility.implicitwait(20);
	click(paymentHistoryBtn);
	ExtentListeners.test.log(Status.INFO, "click on payment history Button" );
	click(paymentHistoryBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from payment history Button" );
}
public void ClickonScanHistory()
{
	WaitUtility.implicitwait(20);
	click(ScanHistoryBtn);
	ExtentListeners.test.log(Status.INFO, "click on Scan history Button" );
	click(ReviewHistoryBtn);
	ExtentListeners.test.log(Status.INFO, "click on under review Button" );
	click(RejectedBtn);
	ExtentListeners.test.log(Status.INFO, "click on rejected Button" );
	click(ScanHistoryBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from  history Button" );
}

public void ClickonFavStores()
{
	WaitUtility.implicitwait(20);
	click(FavStoresBtn);
	ExtentListeners.test.log(Status.INFO, "click on your Fav stores Button" );
	click(FavStoresBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from Fav stores Button" );
}
public void ClickonYourActivities()
{
	WaitUtility.implicitwait(20);
	click(ActivitiesBtn);
	ExtentListeners.test.log(Status.INFO, "click on your activities Button" );
	click(ActivitiesBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from activities Button" );
}
public void ClickonHelp()
{  try {
	WaitUtility.implicitwait(20);
	click(HelpBtn);
	ExtentListeners.test.log(Status.INFO, "click on Help Button" );
	click(FaQBtn);
	ExtentListeners.test.log(Status.INFO, "click on FaQ Button" );
	click(FaQBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from FaQ Button" );
	click(ViewTutorialsBtn);
	ExtentListeners.test.log(Status.INFO, "click on View Tutorial Button" );
	click(TutorialsBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit From Tutorial Button" );
	click(SupportBtn);
	ExtentListeners.test.log(Status.INFO, "click on Support Button" );
	click(YourQueryBtn);
	ExtentListeners.test.log(Status.INFO, "click on Query Type Button" );
	click(SelectRewardBtn);
	sendkeys(TypeMessegeBtn, PropertyUtility.getreaddata("Type_DemoMsg"));
	ExtentListeners.test.log(Status.INFO, "Please Type your  message" );
	ApplicationUtility.hidekeyboard();
	click(SubmitBtn1);
	ExtentListeners.test.log(Status.INFO, "click on submit Button" );
	click(SubmitBackBtn1);
	ExtentListeners.test.log(Status.INFO, "Exit from Support Button" );
	click(PolicyBtn);
	ExtentListeners.test.log(Status.INFO, "click on Privacy Policy Button" );
	click(PolicyBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from Privacy Policy Button" );
	click(LoyaltyTnCBtn);
	ExtentListeners.test.log(Status.INFO, "click on Loyalty TnC Button" );
	click(LoyaltyTncBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from Loyalty TnC Button" );
	click(AboutBtn);
	ExtentListeners.test.log(Status.INFO, "click on About Button" );
	click(AboutBackBtn);	
	ExtentListeners.test.log(Status.INFO, "Exit from About Button" );
	click(helpBackBtn);
} catch (Exception e) {
	// TODO: handle exception
}	
}
public void ClickonLogout()
{
	WaitUtility.implicitwait(10);
	
	click(Logout);
	ExtentListeners.test.log(Status.INFO, "Click on Logout Button" );
	click(ConfirmLogout);
	ExtentListeners.test.log(Status.INFO, "Application Successfully Logout" );
}

}




