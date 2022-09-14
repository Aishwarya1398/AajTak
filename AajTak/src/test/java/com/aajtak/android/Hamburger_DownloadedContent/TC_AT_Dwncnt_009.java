package com.aajtak.android.Hamburger_DownloadedContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * 
 * Description : Verify the message displayed when there is no Downloaded stories
 */
public class TC_AT_Dwncnt_009 extends Aajtak_app_Util {
	// 88
		@Test(description = "Verify the message displayed when there is no Downloaded stories",priority = 9)
		public void AT_Dwncnt_009() throws InterruptedException {
			
			//It will launch application
			launchApp();
			
			//It is used to load the complete Onboarding screen
//			compelteOnboarding();
			compelteOnboardingCopy();
			
			//Click on Hamburger Menu icon
//			clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
			clickBtn(homescreen.getNewHamburgerIcon(), "Hambergur Menu");
			
			//Click on Downloaded content in Hamburger Menu
//			clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
			clickBtn(hamburgerMenu.getDownloadcontentInHamburgerMenu(), "Downloaded Content");
			
			//It will verify that message that if there is no any saved content in downloaded content
//			isElementExist(downloadedContent.getContentMessage());
			isElementExist(downloadedContent.getNewcontentMessage());
		}
}
