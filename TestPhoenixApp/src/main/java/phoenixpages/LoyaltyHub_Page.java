package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoyaltyHub_Page extends BasePage
{
	public LoyaltyHub_Page()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

@AndroidFindBy(xpath = "//*[@text='Loyalty Hub']")
private MobileElement LoyaltyhubBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivTerms")
private MobileElement tncBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement tncBackBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivHelp")
private MobileElement HelpBTn;

@AndroidFindBy(xpath  = "(//*[android.widget.ImageView])[2]")
private MobileElement pointsBTn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvGetMoreRewards")
private MobileElement getRewardsBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement pointsBackBTn;

@AndroidFindBy(xpath = "(//*[android.widget.ImageView])[3]")
private MobileElement GemsBTn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement GemsBackBTn;

@AndroidFindBy(xpath = "(//*[android.widget.ImageView])[4]")
private MobileElement BlueBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivClose")
private MobileElement BlueBackBtn;

@AndroidFindBy(xpath = "//*[@text='Home']")
private MobileElement homebtn;


public void clickonLoyaltyHub()
{
	click(LoyaltyhubBtn);
	ExtentListeners.test.log(Status.INFO, "Click on LoyaltyHub Button " );
}
public void clickOnTnC()
{
	try {
		click(tncBtn);
		ExtentListeners.test.log(Status.INFO, "Click on T&C Button Page" );
		ApplicationUtility.Scroll(442, 1627, 450, 376);
		ApplicationUtility.Scroll(416, 1666, 468, 267);
		ExtentListeners.test.log(Status.INFO, "Successfully scroll on T&C  Page" );
		click(tncBackBtn);
		ExtentListeners.test.log(Status.INFO, "Exit from  T&C Button Page" );
	} catch (Exception e) {
		System.out.println("Exception in TnC  Button" +e);
	}
}
public void clickonHelp()
{
	try {
		click(HelpBTn);
		ExtentListeners.test.log(Status.INFO, "Click on Help Button" );
		ApplicationUtility.tap(254, 1080);
		ApplicationUtility.tap(682, 1176);
		ApplicationUtility.tap(503, 953);
		ExtentListeners.test.log(Status.INFO, "successfully tap 3 times on page" );
	} catch (Exception e) {
		System.out.println("Exception in help Button" +e);
	}
	
}
public void clickonPoints()
{
	click(pointsBTn);
	ExtentListeners.test.log(Status.INFO, "Click on point Button Page" );
	//click(getRewardsBtn);
	click(pointsBackBTn);
	ExtentListeners.test.log(Status.INFO, "Click on point Back Button Page" );
	
}
public void clickonGems()
{
	click(GemsBTn);
	ExtentListeners.test.log(Status.INFO, "Click on Gems Button Page" );
	click(GemsBackBTn);
	ExtentListeners.test.log(Status.INFO, "Exit from Gems Button Page" );
}
public void clickonBlue()
{
	click(BlueBtn);
	ExtentListeners.test.log(Status.INFO, "Click on Blue Button Page" );
	click(BlueBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from Blue Button Page" );
	click(homebtn);
	ExtentListeners.test.log(Status.INFO, "Exit from Loyaltyhub Button Page" );
	
}
}
