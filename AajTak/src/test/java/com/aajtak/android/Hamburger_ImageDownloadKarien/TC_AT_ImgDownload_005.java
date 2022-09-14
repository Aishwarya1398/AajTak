package com.aajtak.android.Hamburger_ImageDownloadKarien;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_ImageDownloadKarien Module From AajTak Application
 * Description :  Verify that if user can select only 2G
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ImgDownload_005 extends Aajtak_app_Util {
	
	@Test(description="Description :Verify that if user can select only 2G",priority = 6)
	public void AT_ImgDwnload_005()  throws InterruptedException 
	{
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
		
		//Click on 3G Option and it should disabled
		clickBtn(imageDownloadKaren.getThree_G_ToggleOn());
		
		//It will verify that 3G option is present or not and it is disabled or not
		verifyIfBothTextsPresent(imageDownloadKaren.getThree_Four_G() , imageDownloadKaren.getThree_G_ToggleOff());
		
		//Click on WiFi Option and it should disabled
		clickBtn(imageDownloadKaren.getWifiToggleOn());
		
		//It will verify that WiFi option is present or not and it is disabled or not
		verifyIfBothTextsPresent(imageDownloadKaren.getWifi() , imageDownloadKaren.getWifiToggleOff());		
		
		//It will verify that 2G option is present or not and it is enabled or not
		verifyIfBothTextsPresent(imageDownloadKaren.getTwo_G () , imageDownloadKaren.getTwo_G_ToggleOn());
			
	}
}



