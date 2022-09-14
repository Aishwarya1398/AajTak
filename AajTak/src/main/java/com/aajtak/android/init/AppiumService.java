/* -------------------------------------------Appium server loader class---------------------------------------------------------------------
 * 							Starts an appium server on ip address and port specified..
 */


package com.aajtak.android.init;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumService extends GlobalVariables {

	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	private DesiredCapabilities cap;
	protected URL appiumServerURL;

	@BeforeSuite
	public void fileConfiguration() {
		try {
			properties = new Properties();
			inputStream = new FileInputStream(propertiesFileName);
			properties.load(inputStream);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeSuite	
	public void startServer() {
		//Set Capabilities
		cap = new DesiredCapabilities();
		cap.setCapability("noReset", "false");

		//Build the Appium service
		builder = new AppiumServiceBuilder();
		builder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
		builder.withAppiumJS(new File(System.getProperty("user.home")+"\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"));
		builder.withLogFile(new File (System.getProperty("user.home")+"\\AppiumServerLogs.txt"));
		builder.withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER, properties.getProperty("bootstrapPort"));
		//			System.out.println(System.getProperty("user.home"));
		builder.withIPAddress(properties.getProperty("hostAddress"));
		builder.usingPort(Integer.parseInt(properties.getProperty("port")));


		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

//		if (!this.checkIfServerIsRunning(port)) {
		//Start the server with the builder
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		appiumServerURL = service.getUrl();
		System.out.println("Appium URL - "+appiumServerURL);
		System.out.println("Appium Server Started");
	}

	public boolean checkIfServerIsRunning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();

		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;

		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
}
