package phoenixpages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeleteCar_Page extends BasePage
{
public DeleteCar_Page()
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this );
}

@AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/cvParking")
private MobileElement MemberParkingBtn;

@AndroidFindBy(xpath  =  "//*[@text='View previous bookings']")
private MobileElement ViewPreBookingBtn;

@AndroidFindBy(id  = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement ViewPreBookingBackBtn;

@AndroidFindBy(xpath  =  "//*[@text='View all your cars']")
private MobileElement ViewCarBtn;

@AndroidFindBy(id  =  "com.unifynd.lite.frt.pro:id/ivCheckFilled")
private MobileElement editcarButton;

@AndroidFindBy( xpath  =  "//*[@text='Delete Car']")
private MobileElement deletecar;

@AndroidFindBy(id  =  "com.unifynd.lite.frt.pro:id/btnDeleteCar")
private MobileElement confirmdeletecar;

@AndroidFindBy(id  = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement ViewCarBackBtn;

@AndroidFindBy(id =  "com.unifynd.lite.frt.pro: id/ivProfileBack")
private MobileElement ViewparkingBackBtn;

public void viewpreviousBooking()
{
	click(MemberParkingBtn);
	ExtentListeners.test.log(Status.INFO, "click on Member Parking Button " );
	 click(ViewPreBookingBtn);	 
	 ExtentListeners.test.log(Status.INFO, "click on previuos Booking Button " );
	 click(ViewPreBookingBackBtn);	 
  ExtentListeners.test.log(Status.INFO, " Exit from previuos Booking Button " ); 
}
public void deleteyourCar()
{
	 click(ViewCarBtn);
	 ExtentListeners.test.log(Status.INFO, "click on view car Button " );
	 click(editcarButton);
	 ExtentListeners.test.log(Status.INFO, "Edit in view car Button " );
	 click(deletecar);
	 ExtentListeners.test.log(Status.INFO, "Delete in view car Button " );
	 click(confirmdeletecar);
	 ExtentListeners.test.log(Status.INFO, "SuccessFully Delete your Car" );
	 click(ViewCarBackBtn);	
	 ExtentListeners.test.log(Status.INFO, "Exit from view car Button" );
	 click(ViewparkingBackBtn);
	 ExtentListeners.test.log(Status.INFO, "Exit from Member Parking Button " );
 }

}
