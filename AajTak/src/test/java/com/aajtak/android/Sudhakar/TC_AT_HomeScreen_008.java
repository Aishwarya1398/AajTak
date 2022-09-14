package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_008 extends Aajtak_app_Util {

	@Test(priority = 8, description = "Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
	public void AT_Home_008() throws InterruptedException {

		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getSecondStoryTitle());

		clickBtn(homescreen.getSharestory(), "Story shared");

		String mesg = homescreen.getSecondStoryTitle().getText();

		//minWait();

		//clickBtn(homescreen.getBookmarkIcon(), "Bookmark Icon");

		
	}
}