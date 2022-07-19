package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.LoyaltyHub_Page;

public class LoyaltyHub_Test extends BasePage
{
	LoyaltyHub_Page ob;
@Test(priority = 1)	
public void clickonLoyaltyHub()
{
	ob = new LoyaltyHub_Page();
	ob.clickonLoyaltyHub();
}
@Test(priority = 2)
public void clickOnTnC()
{
	ob.clickOnTnC();
}
@Test(priority = 3)
public void clickonHelp()
{
	ob.clickonHelp();
}
@Test(priority = 4)
public void clickonPoints() 
{
	ob.clickonPoints();
}
@Test(priority = 5)
public void clickonGems()
{
	ob.clickonGems();
}
@Test(priority = 6)
public void clickonBlue()
{
	ob.clickonBlue();
}
}
