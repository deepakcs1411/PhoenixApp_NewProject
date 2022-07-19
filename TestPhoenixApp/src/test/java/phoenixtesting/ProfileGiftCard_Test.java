package phoenixtesting;

import org.testng.annotations.Test;
import basepage.BasePage;
import phoenixpages.ProfileGiftCard_Page3;

public class ProfileGiftCard_Test extends BasePage
{
	ProfileGiftCard_Page3 ob;
	
@Test(priority = 1)
public void phoenixGiftCard()
{
	ob=new ProfileGiftCard_Page3();
	ob.PhoenixGiftCard();
}	
@Test(priority = 2)
public void ExitGiftCard()
{
	ob.EXitPhoenixGiftCard();
}	
@Test(priority = 3)	
public void clickonScrathcards()
{
	
	ob.ClickonScratchCard();
}
@Test(priority = 4)
public void ClickonWheelofFortune()
{
	
	ob.ClickonWheelofFortune();
}
@Test(priority = 5)
public void ClickonYourOffers()
{
	
	ob.ClickonYourOffers();	
}
@Test(priority = 6)
public void ClickonMallVsiit()
{
	
	ob.ClickonPlannedVisitMall();
}

@Test(priority = 7)
public void ClickonParkingBooking()
{
	
	ob.ClickonParkingBooking();	
}
@Test(priority = 8)
public void scrolldown() 
{
	
	ob.scrolldown();
}
@Test(priority = 9)
public void ClickonPaymentHistory()
{
	
	ob.ClickonPaymentHistory();	
}
@Test(priority = 10)
public void ClickonScanHistory()
{
	
	ob.ClickonScanHistory();
}
@Test(priority = 11)
public void ClickonFavStores()
{
	ob.ClickonFavStores();	
	
}
@Test(priority = 12)
public void ClickonYourActivities()
{
	ob.ClickonYourActivities();

}
@Test(priority = 13)
public void ClickonHelp()
{
	ob.ClickonHelp();	
	
}
@Test(priority = 14)
public void ClickonLogout()
{
	ob.ClickonLogout();
}
}
