package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :Verify that user is navigated to previous screen by tapping on back button from Bookmarked contents
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_028 extends Aajtak_app_Util {
	//126
	@Test(description="Description : Verify that user is navigated to previous screen by tapping on back button from Bookmarked contents",priority = 18)
	public void  AT_Bookmarkcontent_028()  throws InterruptedException
	{
		
		//Launching the app
		launchApp();
		
		//Complete onbqord set up
		compelteOnboarding();
		
		//clicking on hambergur icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
		
		//clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(),"Bookmarks Content");
		
		//clicking on device back button
		clickDeviceBackButton(1);
		
		//validating the hambergur menu icon
		isElementExist(homescreen.getHamburgerIcon(),"Hamburger Icon");
	}
}
