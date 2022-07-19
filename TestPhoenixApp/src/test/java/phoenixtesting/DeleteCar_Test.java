package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.DeleteCar_Page;

public class DeleteCar_Test extends BasePage
{
	DeleteCar_Page ob;
@Test(priority = 1)	
public void viewPreviousBooking()
{
	ob = new DeleteCar_Page();
	ob.viewpreviousBooking();
}
@Test(priority = 2)
public void deleteYourCar()
{
	ob.deleteyourCar();
}
}
