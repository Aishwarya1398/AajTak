//package com.aajtak.android.Onboarding;
//
//
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.aajtak.android.init.Aajtak_app_Util;
//
//
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class Onboarding_Module extends Aajtak_app_Util {
//
//	@Test(priority=1,description="Description: Verify that the user get navigated to the next screen when clicking 'Shuru Kare' button")
//	public void AT_Onboarding_001() throws InterruptedException {
//		launchApp();
//		clickBtn(onboarding.getSuruKarean());
//		isElementExist(onboarding.getOnboardingNotificationTxt());
//	}
//
//	@Test(priority=2,description="Description: Verify that the user get navigated to Settings screen when user taps on Anya settings link")
//	public void AT_Onboarding_002(){
//		launchApp();
//		clickBtn(onboarding.getSuruKarean());
//		isElementExist(onboarding.getOnboardingNotificationTxt());
//		clickBtn(onboarding.getAnyaSetting());
//		isElementExist(onboarding.getNotificationSetting());
//		isElementExist(onboarding.getOffLinePadoSetting());
//		isElementExist(onboarding.getImageDownloadSetting());
//		isElementExist(onboarding.getVideoAutoPlaySetting());
//		isElementExist(onboarding.getSectionCustomizeSetting());
//		isElementExist(onboarding.getWidgedSetting());
//		isElementExist(onboarding.getAppMemoryClearSetting());
//
//	}
//
//	@Test(priority=3,description="Description: Verify that the user get navigated to next screen by swiping horizontally")
//	public void AT_Onboarding_003() throws InterruptedException{
//		launchApp();
//		clickBtn(onboarding.getSuruKarean());
//		isElementExist(onboarding.getOnboardingNotificationinfo());
//		swipeRight();
//		isElementExist(onboarding.getOnboardingAutoPlayinfo());
//		clickDeviceBackButton(1);
//	}
//	
//	@Test(priority=4,description="Description: Verify that the user is able to go to Set Preferences screen")
//	public void AT_Onboarding_004() throws InterruptedException{
//		launchApp();
//		clickBtn(onboarding.getSuruKarean());
//		isElementExist(onboarding.getOnboardingNotificationinfo());
//		swipeRight();
//		isElementExist(onboarding.getOnboardingAutoPlayinfo());
//		swipeRight();
//		swipeRight();
//		isElementExist(onboarding.getPasandidaSetTxt());
//	}
//
//
//}
