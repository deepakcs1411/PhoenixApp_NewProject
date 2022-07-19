package applicationUtility;


import java.time.Duration;

import basepage.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ApplicationUtility extends BasePage
{
 public static void hidekeyboard() 
 {
	 driver.hideKeyboard();	 
 }
 
 public static void Scroll(int startx, int starty, int endX, int endY)
 {
	TouchAction slide= new TouchAction(driver);
 	 slide.press(PointOption.point(startx,starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
 	    .moveTo(PointOption.point(endX,endY)).release().perform(); 
 	 
 }
 public static void tap(int x, int y)
 {
	TouchAction tc= new TouchAction(driver);
	 tc.tap(PointOption.point(x, y)).perform();
 }
 
}
