package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.touch.TapOptions;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_006 extends Aajtak_app_Util {

	@Test(priority = 6)
	public void AT_Home_006() throws InterruptedException {
		launchApp();
		compelteOnboardingCopy();
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
		//clickBtn(homescreen.getBadiKahbreinSection());
		scrollToElement(homescreen.getBadiKahbreinSection());
	scrollToElement(homescreen.getVisualStory());
		swipeRight();
		swipeRight();
	clickBtn(homescreen.getVisualStoryTitle());
		TapOptions.tapOptions().withTapsCount(4);
		
	}

}