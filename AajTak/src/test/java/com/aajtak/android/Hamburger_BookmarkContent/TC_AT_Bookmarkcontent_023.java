package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :  Verify that the user is able to view message displayed when there is no videos displayed
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_023 extends Aajtak_app_Util {
	@Test(description="Verify the message displayed when there is no videos displayed",priority=13)
	public void  AT_Bookmarkcontent_023	() throws InterruptedException {

		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on hambergur menu in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
		
		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark content");
		
		//verifying the video section in bookmark content
		isElementExist(bookmarkContent.getVideoSection());
		
		//Clicking video section
		clickBtn(bookmarkContent.getVideoSection());
		
		//verifying content message when no videos are bookmarked
		isElementExist(bookmarkContent.getContentMessage());
	}

}
