//package com.aajtak.android.NonFunctional;
//
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.aajtak.android.init.Aajtak_app_Util;
///**
// * Date : 2 June 2021 This is Nonfunctional module of AajTak Application
// * 
// * @author Archana George
// * @version 9.37(417)
// *
// */
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class NonFunctional_Module extends Aajtak_app_Util {
//
//	@Test(priority = 1, description = "Description: Verify app installation is successful")
//	public void AT_NonFunctional_001() throws Exception {
//		boolean status = aDriver.isAppInstalled(properties.getProperty("appPackage"));
//		report(status, "App successfully Installed", "App is not installed");
//	}
//
//	@Test(priority = 2, description = "Description: Verify that the user is able to view splash screen")
//	public void AT_NonFunctional_002() throws Exception {
//		launchApp();
//		boolean status = isElementExist(nonFunctional.getSplashImage(), "SplashScreen");
//		report(status, "Splash Screen is Present", "Splash Screen is not displayed ");
//	}
//
//	@Test(priority = 3, description = "Description: Verify the user is able to view the app icon in the device")
//	public void AT_NonFunctional_003() throws Exception {
//		aDriver.closeApp();
//		boolean status = isElementDisplayed(nonFunctional.getAppIcon());
//		report(status, "App icon is present", "App icon is not present");
//
//	}
//
//	@Test(priority = 4, description = "Description: Verify the user is able to launch the application")
//	public void AT_NonFunctional_004() throws Exception {
//		launchApp();
//		boolean status = isElementDisplayed(nonFunctional.getAppLogo());
//		report(status, "App logo is present", "App logo is not present");
//
//	}
//
//	/*
//	 * @Test(priority = 5,description="Description: Verify that 'aap abhi offline hai' message
//	 * is displaying when the internet is turned off") public void
//	 * AT_NonFunctional_005() throws Exception { reOpenApp();
//	 * onboarding.compelteOnboarding(); aDriver.setConnection(new
//	 * ConnectionStateBuilder().withDataEnabled().withWiFiEnabled().build());
//	 * aDriver.setConnection(new
//	 * ConnectionStateBuilder().withDataDisabled().withWiFiDisabled().build());
//	 * aDriver.setConnection(new ConnectionState(1)); Thread.sleep(10000);
//	 * System.out.println("Data Off");
//	 * isElementExist(nonFunctional.getOfflineToast());
//	 * clickBtn(nonFunctional.getPhotoTab());
//	 * isElementExist(nonFunctional.getOfflineText());
//	 * clickBtn(nonFunctional.getVideoTab());
//	 * isElementExist(nonFunctional.getOfflineText()); // aDriver.toggleData();
//	 * aDriver.setConnection(new
//	 * ConnectionStateBuilder().withWiFiEnabled().withDataEnabled().build());
//	 * System.out.println("Data On"); aDriver.setConnection(new ConnectionState(1));
//	 * }
//	 */
//
//	@Test(priority = 6,description="Description: Verify that user is able to uninstall the app")
//	public void AT_NonFunctional_006() throws Exception {
//		aDriver.removeApp(properties.getProperty("appPackage"));
//		Thread.sleep(3000);
//		boolean status = aDriver.isAppInstalled(properties.getProperty("appPackage"));
//		unnistallReport(status, "App uninstall - Successfull", "App uninstall - unsuccessfull");
//
//	}
//
//	@Test(priority = 7,description="Description: Verify that the application should not appear after uninstallation.")
//	public void AT_NonFunctional_007() throws Exception {
//		aDriver.closeApp();
//		Thread.sleep(5000);
//		boolean status = isElementDisplayed(nonFunctional.getAppIcon());
//		unnistallReport(status, "App icon removed after uninstall", "App icon not removed after uninstall");
////	assertFalse(status, "App icon removed after uninstall");
//
//	}
//
//}
