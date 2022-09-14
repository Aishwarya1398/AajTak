package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to Verify the message displayed when there is no bookmarked stories
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Bookmarkcontent_008 extends Aajtak_app_Util {
	@Test(description = "Verify the message displayed when there is no bookmarked stories",priority = 5)
	public void AT_Bookmarkcontent_008() throws Exception
	{
		//Launching the app
		launchApp();

		//Complete onbaord set up
		compelteOnboarding();

		//Clicking on hambergur menu icon 
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");

		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(),"Bookmark Content");

		//Verifying the story section in bookmark content
		isElementExist(bookmarkContent.getStorySection());

		//Verifying the content message
		isElementExist(bookmarkContent.getContentMessage());
	}


}
