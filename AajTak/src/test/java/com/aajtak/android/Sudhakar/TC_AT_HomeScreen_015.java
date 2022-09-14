package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_015 extends Aajtak_app_Util {
	@Test(priority = 15, description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_Home_015() throws InterruptedException {

	
		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");

		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");

		isElementExist(downloadedContent.getVerifyStoryTitle());
	}
}