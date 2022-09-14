//package com.aajtak.android.AppLaunch;
//
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.aajtak.android.init.Aajtak_app_Util;
///**
// * Date : 1 June 2021 This is App Launch module of AajTak Application
// * 
// * @author Archana George
// * @version 9.37(417)
// *
// */
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class AppLaunch_Module extends Aajtak_app_Util {
//	
//	@Test(description = "Description: Verify that user is able to view the first onboarding screen with Shuru Karien button when user launch the App." , priority= 1)
//	public void AT_AppLaunch_001() throws Exception {
//		launchApp();
//		isElementExist(onboarding.getSuruKarean());
//	}
//	
//	@Test(description = "Description: Verify that user is able to launch the app by tapping on app icon." ,priority = 2)
//	public void AT_AppLaunch_002() throws Exception {
//		launchApp();
//		onboarding.compelteOnboarding();
//		waitTillElementPresent(nonFunctional.getHomeLogo(),60);
//		aDriver.closeApp();
//		clickBtn(nonFunctional.getAppIcon(),"App Icon");
//		isElementExist(nonFunctional.getHomeLogo(), "AajTak Home Logo");
//	}
//
//}
