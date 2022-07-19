package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;

public class Offers_Page extends BasePage
{
public Offers_Page()
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(xpath = "//*[@text='Offers']")
private MobileElement clickoffersBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/llRewards")
private MobileElement rewardsBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvYourCouponReward")
private MobileElement coupenrewardsBtn;

@AndroidFindBy(xpath =  "//*[@text='Used']")
private MobileElement rewardsusedBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvCoupons")
private MobileElement tvcoupenBtn;

@AndroidFindBy(xpath =  "//*[@text='Used']")
private MobileElement coupenusedBtn;

@AndroidFindBy(xpath =  "//*[@text='Gifted']")
private MobileElement coupenGiftedBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivBack")
private MobileElement offersBackBtn;

@AndroidFindBy(xpath = "//*[@text='Home']")
private MobileElement homebtn;

public void clickonOffers() 
{
	try {
		click(clickoffersBtn);
		WaitUtility.implicitwait(10);
		ApplicationUtility.Scroll(446, 1500, 468, 389);
		
	} catch (Exception e) {
		System.out.println("Exception in clickon offers" +e);
	}
}
public void clickonRewards()
{
	try {
		click(rewardsBtn);
		WaitUtility.implicitwait(10);
		ApplicationUtility.Scroll(529, 319, 529, 1063);
	} catch (Exception e) {
		System.out.println("Exception in Rewards offers" +e);
	}

}
public void viewyourRewards()
{
	WaitUtility.implicitwait(10);
	click(coupenrewardsBtn);
	click(rewardsusedBtn);
}
public void viewyourcoupens()
{
	WaitUtility.implicitwait(10);
	click(tvcoupenBtn);
	click(coupenusedBtn);
	click(coupenGiftedBtn);
}
public void exitoffers()
{
	WaitUtility.implicitwait(10);
	click(offersBackBtn);
	click(homebtn);
}
}
