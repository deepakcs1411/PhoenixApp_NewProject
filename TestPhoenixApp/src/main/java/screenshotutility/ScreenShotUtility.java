package screenshotutility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basepage.BasePage;

public class ScreenShotUtility extends BasePage
{
 public static void takeScreenshot()
 {
	 Date d =new Date();
	 String fileName = d.toString().replace(":", "_")+ ".jpg";
	
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 try {
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +"\\screenshot\\"+fileName));
	} catch (IOException e) {
		
		System.out.println("Exception in ScreenShot" +e);
	}
 }
}
