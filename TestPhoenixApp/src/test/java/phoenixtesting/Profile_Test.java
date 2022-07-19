package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.Profile_Page2;

public class Profile_Test extends BasePage
{
	Profile_Page2 ob;

@Test(priority = 1)
 public void editprofilesectionName()
 {
	ob=new Profile_Page2();
	 ob.editprofileName();
 }
@Test(priority = 2)
public void editprofilesectionMail()
{
	 ob.editprofileMail();
}
@Test(priority = 3)
public void selectgender()
{
	 ob.selectgender();
}
@Test(priority = 4)
public void Scroll()
{
	ob.performScroll();
}
@Test(priority = 5)
public void SaveBirthDayDate()
{
    ob.savebirthday();
}
@Test(priority = 6)
public void SaveAniversayDate()
{
    ob.saveAnniversary();
}
}