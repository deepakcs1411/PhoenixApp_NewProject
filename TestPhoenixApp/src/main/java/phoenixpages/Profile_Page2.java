package phoenixpages;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import applicationUtility.ApplicationUtility;
import basepage.BasePage;
import extentlisteners.ExtentListeners;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import propertyutility.PropertyUtility;
import waitutility.WaitUtility;

public class Profile_Page2 extends BasePage
{
public Profile_Page2()
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this );
}

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgUser")
private MobileElement  clickonProfile;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgRightArrow")
private MobileElement  arrrowbtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgEditName")
private MobileElement  editNameBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/edtTxtFirstName")
private MobileElement  editFirstName;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/edtTxtLastName")
private MobileElement  editlastName;

@AndroidFindBy(xpath = "//*[@text='Save']")
private MobileElement  savebtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgEditEmail")
private MobileElement  maileditbtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/edtTxtEmail")
private MobileElement  maileditbtn1;

@AndroidFindBy(xpath  = "//*[@text='Send Verification Link']")
private MobileElement  verifymailBtn;

@AndroidFindBy(xpath  = "//*[@text='Verification Link Shared']")
private MobileElement  actualdata;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/touch_outside")
private MobileElement  exitmailbtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgEditGender")
private MobileElement  editgenderbtn;

@AndroidFindBy(xpath ="//*[@text='Male']")
private MobileElement  selectmalebtn;

@AndroidFindBy(xpath ="//*[@text='Female']")
private MobileElement  selectfemalebtn;

@AndroidFindBy(xpath ="//*[@text='Other']")
private MobileElement  selectotherbtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgEditBirthday")
private MobileElement  editbirthdayBtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/daysOfMonthPicker")
private MobileElement  datepicker;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/monthPicker")
private MobileElement  datepickermonth;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/yearPicker")
private MobileElement  datepickeryear;

@AndroidFindBy(xpath ="//*[@text='Save Birthday']")
private MobileElement  savebirthdaybtn;


@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/imgEditAnniversary")
private MobileElement  editanniverserybtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/daysOfMonthPicker")
private MobileElement  annidatepicker;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/monthPicker")
private MobileElement  annidatepickermonth;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/yearPicker")
private MobileElement  annidatepickeryear;

@AndroidFindBy(xpath ="//*[@text='Save Anniversary']")
private MobileElement  saveanniverserybtn;

@AndroidFindBy(id = "com.unifynd.lite.frt.pro:id/ivProfileBack")
private MobileElement  profilebackbtn;



public void editprofileName()
{
	WaitUtility.implicitwait(20);
	click(clickonProfile);
	ExtentListeners.test.log(Status.INFO, "Click on Profile Button" );
	click(arrrowbtn);
	ExtentListeners.test.log(Status.INFO, "Entering in Profile section" );
	click(editNameBtn);
	clear(editFirstName);
	sendkeys(editFirstName, PropertyUtility.getreaddata("First_Name"));
	ExtentListeners.test.log(Status.INFO, "Enter your First Name" );
	clear(editlastName);
	sendkeys(editlastName, PropertyUtility.getreaddata("Last_Name"));
	ExtentListeners.test.log(Status.INFO, "Enter your Last Name" );
	click(savebtn);	
	ExtentListeners.test.log(Status.INFO, "SuccessFully verified  your Full Name" );
}
public void editprofileMail()
{
	WaitUtility.implicitwait(30);
	click(maileditbtn);
	clear(maileditbtn1);
	sendkeys(maileditbtn1, PropertyUtility.getreaddata("Test_MailId"));
	ExtentListeners.test.log(Status.INFO, "Enter your E-mail id" );
	click(verifymailBtn);
	System.out.println("Successfully varified = "+actualdata.getText());
	Assert.assertEquals(actualdata.getText(), PropertyUtility.getreaddata("verfication.Link"));
	ExtentListeners.test.log(Status.INFO, "Successfully Verified Actula  and Expected Data" );
	ExtentListeners.test.log(Status.INFO, "capture Screenshot " );
	ExtentListeners.captureScreenShot();
	click(exitmailbtn);		
	ExtentListeners.test.log(Status.INFO, "Exit from e-mail section successfully " );
}
public void selectgender()
{try {
	
	WaitUtility.implicitwait(20);
	click(editgenderbtn);
	ExtentListeners.test.log(Status.INFO, "selecting Gender" );
	click(selectmalebtn);
	ExtentListeners.test.log(Status.INFO, "select Male Gender" );
	ApplicationUtility.hidekeyboard();
//	click(selectfemalebtn);
//	ExtentListeners.test.log(Status.INFO, "click on Fe-male Button" );
//	click(selectotherbtn);
//	ExtentListeners.test.log(Status.INFO, "click on other Button" );
	
} catch (Exception e) {
	System.out.println("Exception in Select Gender Button");
}	
}
public void performScroll()
{
	try
{
	Thread.sleep(2000);	
	ApplicationUtility.Scroll(494, 1666, 498, 805);
	ExtentListeners.test.log(Status.INFO, "Perform Scroll in profile section Page" );
} catch (Exception e) {
	System.out.println("Exception in swapping" +e);
}	
}
public void savebirthday()
{  try {
	click(editbirthdayBtn);
	ExtentListeners.test.log(Status.INFO, "edit your Birthday Date" );
	click(datepicker);
	click(datepickermonth);
	click(datepickeryear);
	click(savebirthdaybtn);
	ExtentListeners.test.log(Status.INFO, "Birthday Date Set SuccessFully" );
} catch (Exception e) {
	System.out.println("Exception in SaveBirthday " +e);
}
}

public void saveAnniversary()
{
	try {
		click(editanniverserybtn);
		ExtentListeners.test.log(Status.INFO, "edit your Anniversary Date" );
		click(annidatepicker);
		click(annidatepickermonth);
		click(annidatepickeryear);
		click(saveanniverserybtn);
		ExtentListeners.test.log(Status.INFO, "Anniversary Date Set SuccessFully" );
		click(profilebackbtn);
		ExtentListeners.test.log(Status.INFO, "Back to your profile section" );
	} catch (Exception e) {
		System.out.println("Exception in SaveAnniversary " +e);
	}
	
}
}