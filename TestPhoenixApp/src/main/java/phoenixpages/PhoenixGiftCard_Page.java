package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import propertyutility.PropertyUtility;
import waitutility.WaitUtility;

public class PhoenixGiftCard_Page extends BasePage
{
public PhoenixGiftCard_Page()
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

    @AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/cvGiftCard")
    private MobileElement phoenixBtn;
    
    @AndroidFindBy(xpath = "//*[@text='Accept Cookies']")
	private MobileElement acceptBtn; 

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText'][1]")
	private MobileElement NameBtn;

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText'][2]")
	private MobileElement MobNoBtn;

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText'][3]")
	private MobileElement emailCompanyBtn;

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText'][4]")
	private MobileElement NameCompanyBtn;

	@AndroidFindBy(xpath = "//*[@text='Submit']")
	private MobileElement SubmitBtn;

	
	
	public void clickonPhoenixGiftCard()
	{
		click(phoenixBtn);
		ExtentListeners.test.log(Status.INFO, "Click on phoenix Gift card Button " );
		click(acceptBtn);
		ExtentListeners.test.log(Status.INFO, "Click on accept Button " );
	}
	public void scollPage()
	{
		try {
			
			WaitUtility.implicitwait(20);
			ApplicationUtility.Scroll(538, 1670, 529, 359);
			ApplicationUtility.Scroll(472, 1666, 498, 538);
			ExtentListeners.test.log(Status.INFO, "scroll on phoenix Gift card Button " );
			
		} catch (Exception e) {
			System.out.println("Exception in scrolling the page" +e);
		}
	}
	
public void enquirycorporate()
{
	sendkeys(NameBtn, PropertyUtility.getreaddata("Full_Name"));
	ExtentListeners.test.log(Status.INFO, "Enter your full Name " );
	sendkeys(MobNoBtn, PropertyUtility.getreaddata("MobileNo"));
	ExtentListeners.test.log(Status.INFO, "Enter your mobile Number" );
	sendkeys(emailCompanyBtn, PropertyUtility.getreaddata("Company_mail"));
	ExtentListeners.test.log(Status.INFO, "Enter your company mail" );
	sendkeys(NameCompanyBtn, PropertyUtility.getreaddata("Company_Name"));
	ExtentListeners.test.log(Status.INFO, "Enter your company Name" );
	click(SubmitBtn);
	ExtentListeners.test.log(Status.INFO, "Click on submit Details Button" );
	
}
	
}






