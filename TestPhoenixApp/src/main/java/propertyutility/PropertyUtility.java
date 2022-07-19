package propertyutility ;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{
 public static String path ="C:\\Users\\Lenovo\\OneDrive\\Desktop\\New folder\\TestPhoenixApp\\src\\test\\resources\\confiq.properties";
 public static Properties props=new Properties();
 
 public static String getreaddata(String Key)
 {
	 String value="";
	 try {
		 
		 FileInputStream fis = new FileInputStream(path);
		
		 props.load(fis);
		 value=props.getProperty(Key);
		 		
	} catch (Exception e) {
		System.out.println("Issue in GetRead Data" +e);
	}
	  
	return value;
	 
 }
 
 
}
