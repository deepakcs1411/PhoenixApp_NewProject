package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.Offers_Page;

public class Offers_Test extends BasePage
{
	Offers_Page ob;
@Test(priority = 1)	
public void clickonOffers() 
	
	{
		ob = new Offers_Page();
		ob.clickonOffers();
	}
@Test(priority = 2)	
public void clickonRewards()
	{
		ob.clickonRewards();
		
	}
@Test(priority = 3)	
public void viewyourRewards()
	{
		ob.viewyourRewards();
	}
@Test(priority = 4)
public void viewyourcoupens()
	{
		ob.viewyourcoupens();
	}
@Test(priority = 5)	
public void exitoffers()
	{
		ob.exitoffers();
	}
}
