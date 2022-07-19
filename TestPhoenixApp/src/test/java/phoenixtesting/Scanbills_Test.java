package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.Scanbills_Page;

public class Scanbills_Test extends BasePage
{
	Scanbills_Page ob;
@Test	
public void clickOnScanBills()
{
	ob = new Scanbills_Page();
	ob.clickonScanBill();	
}	
}
