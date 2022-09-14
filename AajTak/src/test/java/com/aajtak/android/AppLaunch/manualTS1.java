package com.aajtak.android.AppLaunch;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class manualTS1 
{
@Test
	public void Manual001() throws MalformedURLException {

	 File app = new File("C:\\Users\\Sudhakar Metri\\git\\gitAajTak\\AajTak-master\\AajTak\\src\\main\\resources\\app-production-release_9.88.4.apk");
	 DesiredCapabilities cap = new DesiredCapabilities();
	 cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_X00TD");
	 cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20");
	cap.setCapability("appPackage", "in.AajTak.headlines");
	cap.setCapability("appActivity","com.android.kotlinbase.splash.SplashActivity" );
	AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Button[@text='आगे बढ़ें']").click();
	
	}
	}

