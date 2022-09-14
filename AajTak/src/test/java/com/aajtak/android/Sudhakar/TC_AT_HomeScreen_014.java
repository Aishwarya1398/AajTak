package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;



@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_014 extends Aajtak_app_Util {

	@Test(priority = 14, description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark'tab")
	public void AT_Home_014() throws InterruptedException {

	
		launchApp();

		compelteOnboardingCopy();
		
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		scrollToElement(homescreen.getOtherStoryTitle());

		clickBtn(homescreen.getBookmarkIcon(), "Bookmark Icon");

		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");

		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmarks");

		isElementExist(bookmarkContent.getVerifyStoryTitle());
	}
}