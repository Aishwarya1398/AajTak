package com.aajtak.android.AppLaunch;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 1 June 2021 This is App Launch module of AajTak Application
 * Description: Verify that user is able to launch the app by tapping on app icon. 
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppLaunch_002 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that user is able to launch the app by tapping on app icon", priority = 1)
	public void AT_AppLaunch_002() throws Exception {
		//launch the App
		launchApp();
		
		//Onboarding set up
		compelteOnboarding();
		
		//Wait till homescreen loads
		waitTillElementPresent(homescreen.getAajTakHomeLogo(),60);
		
		//Close the app
		aDriver.closeApp();
		
		waitTillElementPresent(shuruKarienOnboarding.getAppIcon(), 10);
		//Launch the app again by tapping on the icon
		clickBtn(shuruKarienOnboarding.getAppIcon(),"App Icon");
		
		//Validate if the app is launched and user is in homescreen
		isElementExist(homescreen.getAajTakHomeLogo(), "AajTak Home Logo");
	}
}