package com.aajtak.android.AppLaunch;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class trialBAse  {
	
		public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
		{
			
		AndroidDriver<AndroidElement>  driver;

		// TODO Auto-generated method stub
	 //File appDir = new File("src");
	 File app = new File("C:\\Users\\Sudhakar Metri\\git\\gitAajTak\\AajTak-master\\AajTak\\src\\main\\resources\\app-production-release_9.88.4.apk");
	 DesiredCapabilities cap = new DesiredCapabilities();
	 cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_X00TD");
	 cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	
	

	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20");
	cap.setCapability("appPackage", "in.AajTak.headlines");
	cap.setCapability("appActivity","com.android.kotlinbase.splash.SplashActivity" );
	driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;
	
	    
	 
	}
	}



