package waitutility;

import java.util.concurrent.TimeUnit;

import basepage.BasePage;


public class WaitUtility extends BasePage
{

public static final long WAIT= 20;		
	
public static void implicitwait(int time)
{
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}
}