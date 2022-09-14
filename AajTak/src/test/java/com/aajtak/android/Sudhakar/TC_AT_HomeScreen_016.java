package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_016 extends Aajtak_app_Util {

	@Test(priority = 16, description = "Description: Verify that user is able to tap on already added 'Offline Story' icon and view message stating the content is already been added")
	public void AT_Home_016() throws InterruptedException {

	
		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		scrollToElement(homescreen.getOfflineIcon());
		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		clickBtn(homescreen.getOfflineIcon(), "Save icon");
	}
}