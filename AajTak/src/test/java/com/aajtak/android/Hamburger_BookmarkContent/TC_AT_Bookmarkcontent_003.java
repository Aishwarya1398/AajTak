package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to verify the contents of the story page in bookmark
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Bookmarkcontent_003 extends Aajtak_app_Util {
	// 107
		@Test(description = "Verify the contents of the story page in bookmark",priority = 1)
		public void AT_Bookmarkcontent_003() throws InterruptedException
		{
			//Launching the app
			launchApp();
			
			//Complete on board set up
			compelteOnboarding();
			
			//Clicking on the corona news list section 
			clickBtn(homescreen.getCoranaTab());
			
			//Scrolling till the story element is present
			scrollToElement(newsList.getnewslistfirsttitle());
			
			//Clicking on story detail
			clickBtn(storyDetail.getFirstStoryTitle());
			
			//clicking on thike samajh agaya in walkthrough screen
			clickBtn(storyDetail.getTikeSamajAgaya());
			
			//Waiting till the story title element is present for2 mins
			waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
			
			//Verifying the story title form story detail
			String expectedTitle = storyDetail.getTitleOfAnyStory().getText();
			
			//clicking on the action over flow button from story detail screen
			clickBtn(storyDetail.getActionOverflowBtn(), "Action overflow button");
			
			//clicking on bookmark icon in action over flow button
			clickBtn(storyDetail.getBookmarkIconInActionOverflow(),"Bookmark icon");
			
			//clicking on device back button
			clickDeviceBackButton(1);
			
			//clicking on hambergur menu icon in homescreen
			clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
			
			//clicking on bookmark content in hambergur menu
			clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
			
			//verifying story title in bookmark content
			isElementExist(bookmarkContent.getVerifyStoryTitle());
			
			//clicking on the stroy from bookmark content
			clickBtn(bookmarkContent.getVerifyStoryTitle());
			
			//waiting till the story title element present
			waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
			
			//validating the story title from bookmark content and bookmarked story from newslist screen
			String actualTitle = storyDetail.getTitleOfAnyStory().getText();
			verifyStoryTitles(expectedTitle, actualTitle);
		}

}
