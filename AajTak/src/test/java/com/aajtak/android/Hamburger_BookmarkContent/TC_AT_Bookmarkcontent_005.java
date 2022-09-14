package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to to view date/time of the story appear on article
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Bookmarkcontent_005 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to view date/time of the story appear on article",priority = 3)
	public void AT_Bookmarkcontent_005() throws InterruptedException {
		
		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on corona news list section
		clickBtn(homescreen.getCoranaTab());
		
		//Waiting till story present in newslist section for 30 secs
		waitTillElementPresent(newsList.getnewslistfirsttitle(), 30);
		
		//Scrolling till story title is present
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//validating story date in newslist section
		String expectedTime = newsList.getStoryDate().getText();
		
		//waiting till the bookmark icon present
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//clicking on bookmark icon in newslist section
		clickBtn(newsList.getbookmarkIcon(),"Bookmark icon");
		
		//clicking on hambergur menu in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//clicking bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//validating story date present in bookmark story section and bookmarked story in news list section
		String actualTime = bookmarkContent.getContentDate().getText();
		verifyTwoText(actualTime, expectedTime);
	}


}
