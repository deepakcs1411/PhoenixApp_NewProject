package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import basepage.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;

public class Scanbills_Page extends BasePage
{
public Scanbills_Page()
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this );
}

@AndroidFindBy(xpath = "//*[@text='Bill Scan']")
private MobileElement clickScanBillBtn;

@AndroidFindBy(xpath = "//*[@text='Continue']")
private MobileElement clickContinueBtn;

@AndroidFindBy(xpath = "//*[@text='Ask me later']")
private MobileElement clickAskmeLaterBtn;

@AndroidFindBy(xpath = "//*[@text='While using the app']")
private MobileElement clickWhileUsingBtn;

@AndroidFindBy(xpath = "//*[@text='Only this time']")
private MobileElement clickOnlythisBtn;

@AndroidFindBy(xpath = "//*[@text='Don’t allow']")
private MobileElement clickDontAllowBtn;

@AndroidFindBy(xpath = "//*[@text='Allow']")
private MobileElement clickAllowBtn;

@AndroidFindBy(xpath = "//*[@text='Don’t allow']")
private MobileElement clickDontAllowBtn1;

@AndroidFindBy(xpath = "//*[@text=\"Let's Go\"]")
private MobileElement clickLetsGoBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/tvLongBillScan")
private MobileElement longBillScanBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileClose")
private MobileElement ScanBillBackBtn;

public void clickonScanBill()
{
	try {
		WaitUtility.implicitwait(20);
		click(clickScanBillBtn);
		click(clickContinueBtn);
		click(clickWhileUsingBtn);
		click(clickAllowBtn);
		click(clickLetsGoBtn);
		click(longBillScanBtn);
		click(ScanBillBackBtn);
	} catch (Exception e) {
		System.out.println("Exception in scanBill" +e);
	}
	
}
}
