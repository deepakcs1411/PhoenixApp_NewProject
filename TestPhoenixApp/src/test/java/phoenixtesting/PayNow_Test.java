package phoenixtesting;

import org.testng.annotations.Test;


import basepage.BasePage;
import phoenixpages.PayNow_Page;

public class PayNow_Test extends BasePage
{
	PayNow_Page ob;
@Test	
public void ClickonPayNow()
{
	ob= new PayNow_Page();
	ob.ClickOnPayNow();	
}
	
}
