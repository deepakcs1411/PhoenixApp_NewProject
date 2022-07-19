package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.BookingParking_Page;

public class BookingParking_Test extends BasePage
{
	BookingParking_Page ob;
	
@Test(priority = 1)
public void BookYourparking()
{
		ob=new BookingParking_Page();
		ob.bookMemberparking();	
}
@Test(priority = 2)	
public void bookingparking()
{
	ob.bookingparking();
}
}
