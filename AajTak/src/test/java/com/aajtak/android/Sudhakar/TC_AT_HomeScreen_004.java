package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_004 extends Aajtak_app_Util {
	@Test(priority = 4)
	public void AT_Home_004() throws InterruptedException {

		launchApp();

		
		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
		
		scrollToElement(homescreen.getSecondStoryTitle());
	
		//scrollToElement(homescreen.getManoranjanSection());

		isElementExist(homescreen.getSecondStoryTitle());
	}
}