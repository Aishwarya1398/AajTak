package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able view message displayed when there is no bookmarked photos
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_016 extends Aajtak_app_Util {
	@Test(description ="Verify the message displayed when there is no bookmarked photos", priority=9)
	public void AT_Bookmarkcontent_016() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");

		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark content");

		//Verifying the photo section in bookamrked content
		isElementExist(bookmarkContent.getTasvireSection());

		//Clicking on photo section on bookmarked content
		clickBtn(bookmarkContent.getTasvireSection());

		//Validating the content message 
		isElementExist(bookmarkContent.getContentMessage());
	}
}
