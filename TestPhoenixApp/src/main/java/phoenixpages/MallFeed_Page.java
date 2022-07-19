package phoenixpages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import propertyutility.PropertyUtility;
import screenshotutility.ScreenShotUtility;
import waitutility.WaitUtility;

public class MallFeed_Page extends BasePage 
{
public MallFeed_Page()
{
PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(xpath = "//*[@text='Mall feed']")
private MobileElement mallfeedBtn;

@AndroidFindBy(xpath = "//*[@text='Which store are you looking for?']")
private MobileElement clicksearchBtn;

@AndroidFindBy(xpath = "//*[@text='Search for a Store']")
private MobileElement EntermallName;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvStoreName")
private MobileElement selectmall;

@AndroidFindBy(xpath = "//*[@text='Add to Visit']")
private MobileElement visitDate;

@AndroidFindBy(xpath = "//*[@text='Create a new visit']")
private MobileElement createNewVisit;

@AndroidFindBy(xpath = "//*[@text='Pick a Date']")
private MobileElement clickonPickDateBtn;

@AndroidFindBy(xpath = "//*[@text='Today']")
private MobileElement clickonTodayBtn;

@AndroidFindBy(xpath = "//*[@text='Tomorrow']")
private MobileElement clickonTommorBtn;

@AndroidFindBy(xpath = "//*[@text='Add More Stores']")
private MobileElement AddMoreStoreBtn;

@AndroidFindBy(xpath  = "(//*[@class='android.widget.ImageView'])[6]")
private MobileElement selcetStoreBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/btnAddStores")
private MobileElement AddStoreBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/etNotes")
private MobileElement Notebtn;

@AndroidFindBy(xpath = "//*[@text='Save the visit']")
private MobileElement Savethevisit;

@AndroidFindBy(xpath = "//*[@text='Your Visit is Saved!']")
private MobileElement actualdata;

@AndroidFindBy(xpath = "//*[@text='View your planned visits']")
private MobileElement clickplannedvisit;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivRightArrow")
private MobileElement clickonArrow;

@AndroidFindBy(xpath = "//*[@text='Delete Visit']")
private MobileElement deletevisit;

@AndroidFindBy(xpath  = "(//*[@text='Delete Visit'])[2]")
private MobileElement confirmdelete;

@AndroidFindBy(xpath  = "(//*[@class='android.widget.ImageView'])[1]")
private MobileElement plannedvisitBack;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/cvNavigate")
private MobileElement navigateBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivLift")
private MobileElement ClickonLiftBtn;
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivATM")
private MobileElement ClickonAtmBtn;
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivEscalator")
private MobileElement ClickonEscalatorBtn;
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivRestaurant")
private MobileElement ClickonFoodCourtBtn;
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivRestroom")
private MobileElement ClickonClubrestBtn;
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/cvBackButton")
private MobileElement navigateBackBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivSIBack")
private MobileElement mallfeedBackBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/txtCancel")
private MobileElement mallfeedCancilBtn;

@AndroidFindBy(xpath = "//*[@text='Home']")
private MobileElement clickHomeBtn;


public void clickOnMallFeed()
{
	click(mallfeedBtn);
	ExtentListeners.test.log(Status.INFO, "Click on MallFeed Button Page" );
	click(clicksearchBtn);
	ExtentListeners.test.log(Status.INFO, "Click on search are you looking for" );
	sendkeys(EntermallName, PropertyUtility.getreaddata("Select_Store"));
	ExtentListeners.test.log(Status.INFO, "send any store name which want to search" );
	WaitUtility.implicitwait(10);
	click(selectmall);
	ExtentListeners.test.log(Status.INFO, "Click on select mall Button" );
	click(visitDate);
	ExtentListeners.test.log(Status.INFO, "Click on visit Date" );	
}
public void createNewVisit()
{
	try {
	//	click(createNewVisit);
		click(clickonTodayBtn);
		ExtentListeners.test.log(Status.INFO, "Click on today date Button" );
		click(AddMoreStoreBtn);
		ExtentListeners.test.log(Status.INFO, "Click on add more store button" );
		click(selcetStoreBtn);
		ExtentListeners.test.log(Status.INFO, "Click on select store button" );
		click(AddStoreBtn);
		ExtentListeners.test.log(Status.INFO, "Click on add more store Button" );
		sendkeys(Notebtn, PropertyUtility.getreaddata("Type_DemoMsg1"));
		ExtentListeners.test.log(Status.INFO, "Type any message " );
		click(Savethevisit);
		ExtentListeners.test.log(Status.INFO, "Click on save the visit Button" );
		ExtentListeners.captureScreenShot();
		
	} catch (Exception e) {
		System.out.println("Exception in New Visit" +e);
	}	
}
public void viewSavedVisit()
{
	WaitUtility.implicitwait(20);
	System.out.println("Text = "+actualdata.getText());
	ExtentListeners.test.log(Status.INFO, "Taking text from UI section" );
	assertEquals(actualdata.getText(), PropertyUtility.getreaddata("SavedVisit"));
	ExtentListeners.test.log(Status.INFO, "Actual and Expected data verify successfully");
	ExtentListeners.captureScreenShot();
	click(clickplannedvisit);
	ExtentListeners.test.log(Status.INFO, "Click on View Planned mall Visit" );
	click(clickonArrow);
	ExtentListeners.test.log(Status.INFO, "Enter in view planned mall Visit" );
	click(deletevisit);
	ExtentListeners.test.log(Status.INFO, "Click on delete planned mall visit" );
	click(confirmdelete);	
	ExtentListeners.test.log(Status.INFO, "Successfully delete planned mall visit" );
	click(plannedvisitBack);
	ExtentListeners.test.log(Status.INFO, "Exit from planned mall visit" );
}	
public void clickOnNavigateBtn()
{
	try {
		click(navigateBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Navigate Button Page" );
		WaitUtility.implicitwait(40);
		click(ClickonLiftBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Lift Button " );
		click(ClickonAtmBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Atm Button " );
		click(ClickonEscalatorBtn);	
		ExtentListeners.test.log(Status.INFO, "Click on Escalator Button " );
		click(ClickonFoodCourtBtn);
		ExtentListeners.test.log(Status.INFO, "Click on FoodCourt Button " );
		click(ClickonClubrestBtn);
		ExtentListeners.test.log(Status.INFO, "Click on clubcrest Button " );
		click(navigateBackBtn);
		ExtentListeners.test.log(Status.INFO, "Exit from Navigate Button Page" );
	} catch (Exception e) {
		System.out.println("Exception in way2Finder" +e);
	}	
}
public void exitMallFeed()
{
	click(mallfeedBackBtn);
	ExtentListeners.test.log(Status.INFO, "Exit from Mall feed page" );
	click(mallfeedCancilBtn);
	ExtentListeners.test.log(Status.INFO, "Successfully exit from Mallfeed Page" );
	click(clickHomeBtn);
	ExtentListeners.test.log(Status.INFO, "Back on Home Page successfully" );
}
}
