package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;

public class PayNow_Page extends BasePage
{
	public PayNow_Page() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
	}
	
	@AndroidFindBy(xpath = "//*[@text='Pay Now']")
	private MobileElement clickonPayNowBtn;
	
	@AndroidFindBy(xpath = "//*[@text='While using the app']")
	private MobileElement accescCameraBtn;
	
	@AndroidFindBy(id  = "com.unifynd.lite.frt.pro:id/ivClosePayNow")
	private MobileElement ClosePayBtn;
	
	public void ClickOnPayNow()
	{try {
		WaitUtility.implicitwait(30);
		click(clickonPayNowBtn);
		ExtentListeners.test.log(Status.INFO, "Click on Pay Now Button" );
		click(accescCameraBtn);
		ExtentListeners.test.log(Status.INFO, "Access mobile camera" );
		click(ClosePayBtn);
		ExtentListeners.test.log(Status.INFO, "Exit from Pay Now Button" );
	} catch (Exception e) {
		System.out.println("Exception in PayNow section" +e);
	}
		
	}
	
	
}



