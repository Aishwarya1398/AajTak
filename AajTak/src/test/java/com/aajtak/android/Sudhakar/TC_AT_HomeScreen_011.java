package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_011 extends Aajtak_app_Util {
	@Test(priority = 11, description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to 'Home' screen")
	public void AT_Home_011() throws InterruptedException {

		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		clickBtn(share.getShareIcon(), "Share icon");

		waitTillElementPresent(share.getShareCancel(), 30);

		clickBtn(share.getShareCancel());

		isElementExist(homescreen.getShareIcon(), "Share icon");
	}

}