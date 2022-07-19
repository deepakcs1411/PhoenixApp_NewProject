package phoenixtesting;

import org.testng.annotations.Test;

import basepage.BasePage;
import phoenixpages.AddyourCar_Page;

public class AddyourCar_Test extends BasePage
{
	AddyourCar_Page ob;
@Test	
public void addyourCar()
{
	ob = new AddyourCar_Page();
	ob.addYourCar();
}
}
