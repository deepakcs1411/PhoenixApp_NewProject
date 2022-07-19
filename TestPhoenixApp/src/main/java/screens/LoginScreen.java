package screens;

import org.openqa.selenium.support.PageFactory;

import basetest.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends BasePage
{
	public LoginScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id ="com.unifynd.lite.frt.pro:id/btnContinue")
	public MobileElement signupbymobno;

	public void clickonsignMobileno()
	{
		signupbymobno.click();	
      }
}
