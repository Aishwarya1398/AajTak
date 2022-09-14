package com.aajtak.android.Hamburger_ImageDownloadKarien;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_ImageDownloadKarien Module From AajTak Application
 * Description : Verify that 2G, 3G/4G & WiFi is enabled by default once user taps 'Image Download Karae'
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ImgDownload_002 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that 2G, 3G/4G & WiFi is enabled by default once user taps 'Image Download Karae'",priority = 2)
	public void AT_ImgDownload_002() throws InterruptedException {
		
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
		
		//It will verify that 2G option is present or not and it is enabled or not
		verifyIfBothTextsPresent(imageDownloadKaren.getTwo_G () , imageDownloadKaren.getTwo_G_ToggleOn());
		
		//It will verify that 3G/4G option is present or not and it is enabled or not
		verifyIfBothTextsPresent(imageDownloadKaren.getThree_Four_G () , imageDownloadKaren.getThree_G_ToggleOn());
		
		//It will verify that WiFi option is present or not and it is enabled or not
		verifyIfBothTextsPresent(imageDownloadKaren.getWifi () , imageDownloadKaren.getWifiToggleOn());

	}

}
