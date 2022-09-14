package com.aajtak.android.Sudhakar;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_012 extends Aajtak_app_Util {
	@Test(priority = 12, description = "Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story")
	public void AT_Home_012() throws InterruptedException {

		launchApp();

		compelteOnboardingCopy();
		
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		clickBtn(share.getShareIcon(), "Share icon");

		waitTillElementPresent(share.getOtherShare(), 30);

		clickBtn(share.getOtherShare());

		isElementExist(share.getAnyaShareText());
		List<AndroidElement> optionText = share.getAnyaShareOptions();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
	}

}