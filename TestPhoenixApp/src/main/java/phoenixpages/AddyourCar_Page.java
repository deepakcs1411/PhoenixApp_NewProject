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

public class AddyourCar_Page extends BasePage
{
 public AddyourCar_Page()
 {
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this );
 }
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/cvParking")
 private MobileElement MemberParkingBtn; 
 
 @AndroidFindBy(xpath =  "//*[@text='Add New Car']")
 private MobileElement AddCarBtn;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/etCarNumber")
 private MobileElement AddCarNumber;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/etCarModel")
 private MobileElement AddCarModel;
 
 @AndroidFindBy(xpath =  "//*[@text='Add Car']")
 private MobileElement ConfrimAddCarBtn;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/ivProfileBack")
 private MobileElement ViewparkingBackBtn;
 
 public void addYourCar()	 
 { 
	 try {
		 click(MemberParkingBtn);	
		 ExtentListeners.test.log(Status.INFO, "click on Member Parking Button " );
		 Thread.sleep(2000);
		 ApplicationUtility.Scroll(512, 1517, 533, 669);
		 ExtentListeners.test.log(Status.INFO, "Scroll to view Add your car Page " );
	 	 click(AddCarBtn);
	 	 ExtentListeners.test.log(Status.INFO, "Click on add your car Button " );
	 	 sendkeys(AddCarNumber,PropertyUtility.getreaddata("AddYourCar"));
	 	 ExtentListeners.test.log(Status.INFO, "Enter your Car Number" );
	 	 sendkeys(AddCarModel, PropertyUtility.getreaddata("AddYourModel"));
	 	 ExtentListeners.test.log(Status.INFO, "Enter your Car Model " );
	 	 click(ConfrimAddCarBtn);
	 	 ExtentListeners.test.log(Status.INFO, "click on confirm car add Button " );
	 	 click(ViewparkingBackBtn);
	 	 ExtentListeners.test.log(Status.INFO, "Exit from Member Parking Button " );
		
	} catch (Exception e) {
		System.out.println("Exception in Add Yor Car " +e);
	}
	 
 	
 }
 
}
