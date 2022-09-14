package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_013 extends Aajtak_app_Util {

	@Test(priority = 13, description = "Description: Verify that when user taps on 'Cancel' or any where on the screen in the anya share sheet, user navigates to 'Home' screen")
	public void AT_Home_013() throws InterruptedException {


		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

	
		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		clickBtn(share.getShareIcon(), "Share icon");

		waitTillElementPresent(share.getOtherShare(), 30);

		clickBtn(share.getOtherShare());

		clickDeviceBackButton(1);

		isElementExist(homescreen.getAajTakHomeLogo(), "AajTak Home");

	}
}