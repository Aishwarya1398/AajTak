package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to view verify the screen has three tab
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_002 extends Aajtak_app_Util{

	@Test(description = "Description : Verify the screen has three tab")
	public void AT_Bookmarkcontent_002 () throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on hambergur menu 
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");

		//clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");

		//Validating bookmark page 
		isElementExist(bookmarkContent.getBookmarkPageTitle());

		//Verifying story section in bookmark content
		isElementExist(bookmarkContent.getStorySection());

		//Verifying Phoyo section in bookmark content
		isElementExist(bookmarkContent.getTasvireSection());

		//Verifying video section in bookmark content
		isElementExist(bookmarkContent.getVideoSection());

	}

}
