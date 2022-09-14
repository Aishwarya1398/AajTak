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

public class TC_AT_Bookmarkcontent_006 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to navigate to the article description page",priority = 4)
	public void AT_Bookmarkcontent_006() throws Exception {
		
		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on corona newslist section
		clickBtn(homescreen.getCoranaTab());
		
		//Scrolling till the story title present
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//Scrolling till the bookmark element 
		scrollToElement(newsList.getbookmarkIcon());
		
		//waiting till the bookmark icon present for 15 secs
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//Clicking on bookmark icon 
		clickBtn(newsList.getbookmarkIcon(),"Bookmark icon");
		
		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//verifying story title in bookmark content
		String expectedTitle = bookmarkContent.getVerifyStoryTitle().getText();
		
		//clciking on story title from bookmark content
		clickBtn(bookmarkContent.getVerifyStoryTitle());
		
		//Clicking on thike samajh agaya walkthorugh screen
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//waiting till the story detail element load
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 60);
		
		//verifying title of story in story detail
		isElementExist(storyDetail.getTitleOfAnyStory());
		
		//Validating the story detail title and bookmarked story detail
		String actualTitle = storyDetail.getTitleOfAnyStory().getText();
		verifyStoryTitles(expectedTitle, actualTitle);
		
	}
	
}
