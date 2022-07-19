package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.Notification_Page;

public class Notification_Test extends BasePage
{
	Notification_Page ob;
	
@Test(priority = 1)
public void clickOnNotification()
{
	ob = new Notification_Page();
	ob.clickonnotofication();
}
@Test(priority = 2)
public void scrollToBottom()
{
	ob.homepageScroll();
}

}
