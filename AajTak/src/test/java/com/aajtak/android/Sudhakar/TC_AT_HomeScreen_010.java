package com.aajtak.android.Sudhakar;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_010 extends Aajtak_app_Util {
	@Test(priority = 10, description = "Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
	public void AT_Home_010() throws InterruptedException {

	
		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

	
		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		isElementExist(homescreen.getShareIcon(), "Share icon");

		clickBtn(homescreen.getShareIcon(), "Share icon");

		waitTillElementPresent(share.getOtherShare(), 30);

		List<AndroidElement> optionText = share.getShareOptionHighlights();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
	}
}