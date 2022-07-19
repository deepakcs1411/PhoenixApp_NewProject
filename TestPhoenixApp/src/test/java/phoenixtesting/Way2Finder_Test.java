package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.Way2Finder_Page;

public class Way2Finder_Test extends BasePage
{
	Way2Finder_Page ob;

@Test	
public void ClickOnWayFinder()
{
	ob= new Way2Finder_Page();
	ob.ClickonWay2Finder();
}
	
	
}
