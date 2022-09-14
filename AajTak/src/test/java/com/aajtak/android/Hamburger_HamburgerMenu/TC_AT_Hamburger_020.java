package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description: Verify that the user is able to get different options under 'Settings'.
 * @author Archana George
 * @version 9.37(417)
 */
public class TC_AT_Hamburger_020 extends Aajtak_app_Util {


	@Test(description = "Verify that the user is able to get different options under 'Settings'", priority = 12)
	public void AT_Hamburger_020() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till to Anya Category 
		scrollToElement(hamburgerMenu.getAnyaCategory());
		
		//It will verify that Anya Category is present or not in Hamburger Menu
		isElementExist(hamburgerMenu.getAnyaCategory());
		
		//It will scroll up little
		scrollUp();
		
		//It will scroll till setting in Anya Category
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will verify that Notification is present or not in settings
		isElementExist(settings.getNotification());
		
		//It will verify that OfflinePade is present or not in settings
		isElementExist(settings.getOfflinePade());
		
		//It will verify that ImageDownloadKaren is present or not in settings
		isElementExist(settings.getImageDownloadKaren());
		
		//It will verify that VideoAutoPlay is present or not in settings
		isElementExist(settings.getVideoAutoPlay());
		
		//It will verify that CustomizeSection is present or not in settings
		isElementExist(settings.getCustomizeSection());
		
		//It will verify that Notification is present or not in settings
		isElementExist(settings.getWidgetSettings());
		
		//It will verify that AppMemoryClearKaren is present or not in settings
		isElementExist(settings.getAppMemoryClearKaren());
		
		//It will verify that AppRatingKaren is present or not in settings
		isElementExist(settings.getAppRatingKaren());
		
		//It will scroll little up
		scrollUp();
		
		//It will verify that AppShareKaren is present or not in settings
		isElementExist(settings.getAppShareKaren());
		
		//It will verify that FeedBack is present or not in settings
		isElementExist(settings.getFeedBack());
		
		//It will verify that AppVersion is present or not in settings
		isElementExist(settings.getAppVersion());
		
		//It will verify that PrivacyPolicy is present or not in settings
		isElementExist(settings.getPrivacyPolicy());
		
		//It will verify that SevaKiSharte is present or not in settings
		isElementExist(settings.getSevaKiSharte());
	}

}