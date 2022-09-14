package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to Verify that there is an option to remove the story from bookmarked content
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Bookmarkcontent_004 extends Aajtak_app_Util {
	// 108
	@Test(description = "Verify that there is an option to remove the story from bookmarked content",priority = 2)
	public void AT_Bookmarkcontent_004() throws InterruptedException {
		
		//Lauching the app
		launchApp();
		
		//Complete onboard set up
		compelteOnboarding();
		
		//clciking on corona news list section
		clickBtn(homescreen.getCoranaTab());
		
		//scrolling till story title in newslist
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//waiting till the bookmark icon element present
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//clicking on bookmark icon in newslit section
		clickBtn(newsList.getbookmarkIcon(),"Bookmark icon");
		
		//clicking in hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//deleting the single story from bookmark content
		isElementExist(bookmarkContent.getDeleteSingleStory_Video(), "Delete Icon");
	}
	
}
