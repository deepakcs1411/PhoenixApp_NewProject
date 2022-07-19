package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;

public class ShopNDrop_Page extends BasePage
{
	public ShopNDrop_Page(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );	
	}
	

	
public void scrollRight()
{ try {
	
	WaitUtility.implicitwait(20);
	ApplicationUtility.Scroll(1001, 538, 144, 542);
} catch (Exception e) {
	System.out.println("exception in Right Swipe" +e);
	
}	
}
}