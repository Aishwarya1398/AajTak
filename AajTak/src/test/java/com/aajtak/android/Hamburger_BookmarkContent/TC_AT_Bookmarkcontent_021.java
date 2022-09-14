package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :  Verify that the user is able to view Verify the title and time of the vedio
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_021 extends Aajtak_app_Util {
	//120
	@Test(description="Verify that the user is able to navigated to the video detail page",priority=12)
	public void AT_Bookmarkcontent_021() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on video tab
		clickBtn(homescreen.getVideoTab());

		//Scrolling till video title present
		scrollToElement(videoList.getVideoTitle());

		//Waiting till bookmark icon is present for 15 secs
		waitTillElementPresent(videoList.getBookmarkIcon(), 15);

		//Clicking on bookmark icon in video list 
		clickBtn(videoList.getBookmarkIcon(),"Bookmark icon");

		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");

		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");

		//Clicking on video section in bookmarked content
		clickBtn(bookmarkContent.getVideoSection());

		//verifying the video title in bookmark video section
		isElementExist(bookmarkContent.getVerifyVideoTitle());

		//Clicking on video from bookmarked section
		clickBtn(bookmarkContent.getVerifyVideoTitle());
	}	
}
