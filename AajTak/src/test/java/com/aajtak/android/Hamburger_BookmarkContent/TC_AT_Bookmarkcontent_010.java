package com.aajtak.android.Hamburger_BookmarkContent;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to remove the individual story from the bookmark page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Bookmarkcontent_010 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to remove the individual story from the bookmark page",priority = 6)
	public void AT_Bookmarkcontent_010() throws Exception
	{
		
		 //Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on corona news list section
		clickBtn(homescreen.getCoranaTab());
		
		//Scrolling till story is present
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//Scrolling till the bookmark icon present
		scrollToElement(newsList.getbookmarkIcon());
		
		//Waiting till bookmark icon element present for 15secs
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//Clicking bookmark icon in newslist section
		clickBtn(newsList.getbookmarkIcon(),"Bookmark icon");
		
		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//Clicking on delete icon in story section
		clickBtn(bookmarkContent.getDeleteSingleStory_Video(), "Delete Icon");
		
		//Validating the toast message after deleting
		String mesg = bookmarkContent.getToastMsg().getText();
		verifyTwoText(mesg, "बुकमार्क हटाया गया");
		Boolean check = isElementDisplayed(bookmarkContent.getVerifyStoryTitle());
		Assert.assertEquals(false, check);
	}	
}
