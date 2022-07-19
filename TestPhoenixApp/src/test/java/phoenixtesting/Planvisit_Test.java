package phoenixtesting;

import org.testng.annotations.Test;


import basepage.BasePage;
import phoenixpages.PlanVisit_Page;

public class Planvisit_Test extends BasePage
{
	PlanVisit_Page ob;
	
	@Test(priority = 1)
	public void ClickOnPlanToVisit()
	{
		ob=new PlanVisit_Page();
		
		ob.ClickonPlanVisit();	
	}
	@Test(priority = 2)
	public void SavedPlanvisit()
	{
	
		ob.ViewSavedVisit();
	}
}
