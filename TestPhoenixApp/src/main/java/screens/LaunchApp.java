package screens;


import org.openqa.selenium.support.PageFactory;

import basetest.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import waitutility.WaitUtility;


public class LaunchApp extends BasePage
{
	public LaunchApp(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
	}
	
	
	@AndroidFindBy(id ="com.unifynd.lite.frt.pro:id/btnPickMall")
	private MobileElement pickLocation;
	

	@AndroidFindBy(className  ="android.widget.Button")
	private MobileElement LocateLocation;
	
	@AndroidFindBy(id="com.unifynd.lite.frt.pro:id/clCity")
	private MobileElement clickcitychennai;
	
	@AndroidFindBy(id="com.unifynd.lite.frt.pro:id/mall_2")
	private MobileElement selectmall;
	
	
    	
	public void clickonLocation()
	{try {
		
		Thread.sleep(4000);
		pickLocation.click();		
	} 
	catch (Exception e) {
		System.out.println("Exception in Picklocation" +e);
	}
		
      }
	public void LocateLocation()
	{
		LocateLocation.click();		
      }	
	public void clickcitychennai()
	{
		try {
			Thread.sleep(2000);
			clickcitychennai.click();	
		} catch (Exception e) {
			System.out.println("Exception in clickoncitylocation" +e);
		}
		
      }
	
	public void selectmall()
	{
		selectmall.click();	
	} 
	
}