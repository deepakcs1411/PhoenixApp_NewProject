package phoenixpages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import propertyutility.PropertyUtility;
import waitutility.WaitUtility;

public class BookingParking_Page extends BasePage
{
 public BookingParking_Page() 
 {
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
 }
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/cvParking")
 private MobileElement MemberParkingBtn;
 
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
 
 @AndroidFindBy(xpath  =  "//*[@text='View previous bookings']")
 private MobileElement ViewPreBookingBtn;
 
 @AndroidFindBy(id  = "com.unifynd.lite.frt.pro:id/ivProfileBack")
 private MobileElement ViewPreBookingBackBtn;
 
 @AndroidFindBy(xpath  =  "//*[@text=\"Book Member's Parking\"]")
 private MobileElement BookParkingBtn;
 
 @AndroidFindBy(id  =  "com.unifynd.lite.frt.pro:id/tvTimeslotInActive")
 private MobileElement BookSlot;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/tvCarName")
 private MobileElement selectCar;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/btnContinue")
 private MobileElement confirmBooking;
 
 @AndroidFindBy(id  =  "com.unifynd.lite.frt.pro:id/tvConfirm")
 private MobileElement confirmParking;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/tvFailureMessage")
 private MobileElement displaymsgBtn;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/ivCloseIcon")
 private MobileElement BackBookingBtn;
 
 @AndroidFindBy(xpath =  "//*[@text='Your booking Details are as Follows:']")
 private MobileElement actualData;
 
 @AndroidFindBy(xpath =  "//*[@text='Booking Successful!']")
 private MobileElement actualData1;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/ivProfileBack")
 private MobileElement ReturnHomePage;
 
 @AndroidFindBy(xpath =  "//*[@text='Add New Car']")
 private MobileElement AddCarBtn;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/etCarNumber")
 private MobileElement AddCarNumber;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro:id/etCarModel")
 private MobileElement AddCarModel;
 
 @AndroidFindBy(xpath =  "//*[@text='Add Car']")
 private MobileElement ConfrimAddCarBtn;
 
 @AndroidFindBy(xpath =  "//*[@text='Let’s start the journey']")
 private MobileElement actualData2;
 
 @AndroidFindBy(xpath =  "//*[@text='You have a Parking booked at']")
 private MobileElement actualData3;
 
 @AndroidFindBy(xpath =  "//*[@text='05:12 PM - 06:12 PM']")
 private MobileElement actualData4;
 
 @AndroidFindBy(xpath =  "//*[@text='24 June 2022']")
 private MobileElement actualData5;
 
 @AndroidFindBy(xpath =  "//*[@text='View your Parking Booking']")
 private MobileElement ViewparkingBtn;
 
 @AndroidFindBy(id =  "com.unifynd.lite.frt.pro: id/ivProfileBack")
 private MobileElement ViewparkingBackBtn;
 
 @AndroidFindBy(xpath = "(//*[@class='android.widget.LinearLayout'])[9]")
 private MobileElement newpath;
 
 
 public void bookMemberparking()
 {
	 WaitUtility.implicitwait(30);
	 click(MemberParkingBtn);
	 ExtentListeners.test.log(Status.INFO, "click on Member Parking Button " );
	 click(BookParkingBtn);
	 ExtentListeners.test.log(Status.INFO, "click on Book Parking Button " );
	 click(BookSlot); 
	 ExtentListeners.test.log(Status.INFO, "click on Book your slot Button " );
 }
 public void bookingparking()	 
{ 
	 click(selectCar);
	 ExtentListeners.test.log(Status.INFO, "click on select your car Button " );
	 click(confirmBooking);
	 ExtentListeners.test.log(Status.INFO, "click on confirm your Booking Button " );
	 ExtentListeners.captureScreenShot();
	 click(confirmParking);	
	 ExtentListeners.test.log(Status.INFO, "click on confirm your parking Button " );
	 System.out.println("Message =" +displaymsgBtn.getText());
	 ExtentListeners.captureScreenShot();
	 click(BackBookingBtn);	 
	 ExtentListeners.test.log(Status.INFO, "Exit form your Booking Button " );
	 click(ReturnHomePage);
	 ExtentListeners.test.log(Status.INFO, "Return in Home page " );
	 
}	 
 public void VerifyBooking()
 {
	 System.out.println("Text = "+actualData2.getText());
	 System.out.println("Text = "+actualData3.getText());
	 System.out.println("Text = "+actualData4.getText());
	 System.out.println("Text = "+actualData5.getText());
 }
 public void VerifyCurrentBooking()
 {
	 System.out.println("Text = "+actualData.getText());
	 assertEquals(actualData.getText(), PropertyUtility.getreaddata("BookingDetails"));
	 click(confirmBooking);
	 System.out.println("Text = "+actualData1.getText());
	 assertEquals(actualData1.getText(), PropertyUtility.getreaddata("BookingSuccessful"));
	 click(BackBookingBtn);
	 
 }
}
