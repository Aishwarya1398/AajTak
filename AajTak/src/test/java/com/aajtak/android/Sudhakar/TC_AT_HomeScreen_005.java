package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_005 extends Aajtak_app_Util {

	@Test(priority = 5)
	public void AT_Home_005() throws InterruptedException {


		launchApp();


		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);

		scrollToElement(homescreen.getFirstNews());


		scrollToElement(homescreen.getSecondStoryTitle());
		swipeRight();
		scrollToElement(homescreen.getRajnitiSection());

	
		//clickBtn(homescreen.getSecondStoryTitle(), "Second Story Exist");

		isElementExist(homescreen.getRajnitiSection());
	}
}