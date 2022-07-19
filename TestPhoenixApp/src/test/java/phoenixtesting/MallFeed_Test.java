package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.MallFeed_Page;

public class MallFeed_Test extends BasePage
{
	MallFeed_Page ob;
@Test(priority = 1)	
public void clickOnMallFeed()
{
	ob = new MallFeed_Page();
	ob.clickOnMallFeed();
}
@Test(priority = 2)	
public void createNewVisit()
{
	ob.createNewVisit();
}
@Test(priority = 3)	
public void viewSavedVisit()
{
	ob.viewSavedVisit();
}
@Test(priority = 4)	
public void clickOnNavigateBtn()
{
	ob.clickOnNavigateBtn();
}
@Test(priority = 5)
public void exitOnMallFeed()
{
	ob.exitMallFeed();
}
}
