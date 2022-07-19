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
import waitutility.WaitUtility;

public class PlanVisit_Page extends BasePage
{
	
	public PlanVisit_Page() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
	}
	
	@AndroidFindBy(xpath = "//*[@text='Plan Visit']")
	private MobileElement clickonPlanVisitBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Pick a Date']")
	private MobileElement clickonPickDateBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Today']")
	private MobileElement clickonTodayBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Tomorrow']")
	private MobileElement clickonTommorBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Add Stores']")
	private MobileElement clickonAddStoreBtn;
	
	@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/cvAdd")
	private MobileElement selcetAddStoreBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Add 1 Stores']")
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
	
	
	
	public  void ClickonPlanVisit()
	{
		WaitUtility.implicitwait(30);
		click(clickonPlanVisitBtn);
		ExtentListeners.test.log(Status.INFO, "Click on plan visit Button" );
		click(clickonTodayBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Today Button" );
		click(clickonAddStoreBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Add Store Button" );
		click(selcetAddStoreBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Select your store Button" );
		click(AddStoreBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Add more store Button" );
		sendkeys(Notebtn, PropertyUtility.getreaddata("Type_DemoMsg1"));
		ExtentListeners.test.log(Status.INFO, "Please Type Any message" );
		click(Savethevisit);
		ExtentListeners.test.log(Status.INFO, "Click on save the visit Button" );
		ExtentListeners.captureScreenShot();
		ExtentListeners.test.log(Status.INFO, "Successfully your visit is saved " );
		
	}
public void ViewSavedVisit()
{
	WaitUtility.implicitwait(20);
	System.out.println("Text = "+actualdata.getText());
	ExtentListeners.captureScreenShot();
	assertEquals(actualdata.getText(), PropertyUtility.getreaddata("SavedVisit"));
	ExtentListeners.test.log(Status.INFO, "Successfully verify your visit is saved " );
	click(clickplannedvisit);
	ExtentListeners.test.log(Status.INFO, "Click on planned mall visit " );
	click(clickonArrow);
	ExtentListeners.test.log(Status.INFO, "View all planned mall visit " );
	click(deletevisit);
	ExtentListeners.test.log(Status.INFO, "Delete your planned mall visit " );
	click(confirmdelete);
	ExtentListeners.test.log(Status.INFO, "Successfully Delete your planned mall visit " );
	click(plannedvisitBack);
	ExtentListeners.test.log(Status.INFO, " Exit from planned visit mall" );
	
}
}
