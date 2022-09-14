package com.aajtak.android.Hamburger_ImageDownloadKarien;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_ImageDownloadKarien Module From AajTak Application
 * Description :  Verify that user is able to view three options for downloading images
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ImgDownload_001 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that user is able to view three options for downloading images",priority = 1)
	public void AT_ImgDownload_001() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till to settings option.
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on settings option
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on Image Download Karen option
		clickBtn(settings.getImageDownloadKaren());
		
		//It will verify that 2G option is present or not
		isElementExist(imageDownloadKaren.getTwo_G());
		
		//It will verify that 3G/4G option is present or not
		isElementExist(imageDownloadKaren.getThree_Four_G());
		
		//It will verify that WiFi option is present or not
		isElementExist(imageDownloadKaren.getWifi());
		
	}
}
