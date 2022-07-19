package phoenixpages;



import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;

public class Notification_Page extends BasePage
{
	public  Notification_Page()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
 
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgNotifications")
private MobileElement notificationbtn;
	
@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement notificationBackbtn;
		
public void clickonnotofication()
{try {
	
	WaitUtility.implicitwait(20);
	click(notificationbtn);
	ExtentListeners.test.log(Status.INFO, "Click on Notification Button" );	
} catch (Exception e) {
	System.out.println("Exception in Notification Btn" +e);
}	
}

public void homepageScroll()
{
	try {
		ApplicationUtility.Scroll(459, 1517, 442, 437);
		ExtentListeners.test.log(Status.INFO, "checking Notifications" );	
		ApplicationUtility.Scroll(442, 1430, 450, 433);
		ExtentListeners.test.log(Status.INFO, "scrolling in Notifications" );
		click(notificationBackbtn);
		ExtentListeners.test.log(Status.INFO, "Exit from Notification " );
		
	} catch (Exception e) {
		System.out.println("Exception in HomePage scrolling" +e);
	}
}

}
