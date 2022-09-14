package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description : Verify that the user is able to bookmark the story/photo/video for first click
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_026 extends Aajtak_app_Util {
	//124
	@Test(description="Description : Verify that the user is able to bookmark the story/photo/video for first click",priority = 16)
	public void AT_Bookmarkcontent_026()  throws InterruptedException 
	{
		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on video tab
		clickBtn(homescreen.getVideoTab());
		
		//Waiting till bookmark icon present
		waitTillElementPresent(videoList.getBookmarkIcon(), 15);
		
		//Clicking on bookmark icon
		clickBtn(videoList.getBookmarkIcon(), "Bookmark Icon");
		
		//Clicking on photo tab
		clickBtn(homescreen.getPhotoTab());
		
		//Waiting till bookmark icon present
		waitTillElementPresent(photoList.getBookmarkIcon(), 15);
		
		//Clicking on bookmark icon
		clickBtn(photoList.getBookmarkIcon(), "Bookmark Icon");
		
		//clicking on corona news list section
		clickBtn(homescreen.getCoranaTab());
		
		//Waiting till bookmark icon present
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//Clicking on bookmark icon
		clickBtn(newsList.getbookmarkIcon(), "Bookmark Icon");
		
		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Icon");
		
		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//Clicking on story section in bookmark content
		clickBtn(bookmarkContent.getStorySection());
		
		//Verifying the story title in bookmark content
		isElementExist(bookmarkContent.getVerifyStoryTitle());
		
		//Clicking on photo section in bookmark content
		clickBtn(bookmarkContent.getTasvireSection());
		
		//Verifying the photo title in bookmark content
		isElementExist(bookmarkContent.getVerifyPhotoTitle());
		
		//Clicking on video section in bookmark content
		clickBtn(bookmarkContent.getVideoSection());
		
		//Verifying the video title in bookmark content
		isElementExist(bookmarkContent.getVerifyVideoTitle());
	}	

}
