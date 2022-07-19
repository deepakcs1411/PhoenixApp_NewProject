package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.PhoenixGiftCard_Page;

public class PhoenixGiftCard_Test extends BasePage
{
	PhoenixGiftCard_Page ob;
@Test(priority = 1)	
public void clickonPhoenixGiftCard()
{
	ob=new PhoenixGiftCard_Page();
	ob.clickonPhoenixGiftCard();
	
}
@Test(priority = 2)
public void scrollPage()
{
	ob.scollPage();
}
@Test(priority = 3)
public void enquiryCorporate()
{
	ob.enquirycorporate();
}
}
