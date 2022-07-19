package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;

public class Way2Finder_Page extends BasePage
{
	public Way2Finder_Page() 
	 {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/cvWayfinder")
private MobileElement ClickwayFinderBtn;

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
private MobileElement ClickwayFinderBackBtn;


public void ClickonWay2Finder()
{
	try {
		WaitUtility.implicitwait(40);
		click(ClickwayFinderBtn);
		 ExtentListeners.test.log(Status.INFO, "Click on WaytoFinder Button " );
		Thread.sleep(2000);
		click(ClickonLiftBtn);
		 ExtentListeners.test.log(Status.INFO, "Click on Lift Button " );
		Thread.sleep(4000);
		click(ClickonAtmBtn);
		 ExtentListeners.test.log(Status.INFO, "Click on Atm Button " );
		click(ClickonEscalatorBtn);	
		ExtentListeners.test.log(Status.INFO, "Click on Escalator Button " );
		click(ClickonFoodCourtBtn);
		ExtentListeners.test.log(Status.INFO, "Click on FoodCourt Button " );
		click(ClickonClubrestBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Restroom Button " );
		click(ClickwayFinderBackBtn);
		ExtentListeners.test.log(Status.INFO, "Click on clubcrest Button " );
	} catch (Exception e) {
		System.out.println("Exception in way2Finder" +e);
	}
	
	
}



}
