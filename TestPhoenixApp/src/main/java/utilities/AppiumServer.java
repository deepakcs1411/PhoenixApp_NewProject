package utilities;

import java.net.ServerSocket;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer 
{
	public static AppiumDriverLocalService service;
	
	public static AppiumDriverLocalService start()
	{
	boolean flag =	checkIfserverIsRunning(4723);
	if(!flag)
	{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	return service;
}
	public static boolean checkIfserverIsRunning(int Port)
	{
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			
			serverSocket = new ServerSocket(Port);
			serverSocket.close();
			
		} catch (Exception e) {
			isServerRunning = true;
		}
		finally {
			serverSocket = null;
		}
		
		return isServerRunning;
			
	}
	
	public static void stop()
	{
		service.stop();
	}

}
