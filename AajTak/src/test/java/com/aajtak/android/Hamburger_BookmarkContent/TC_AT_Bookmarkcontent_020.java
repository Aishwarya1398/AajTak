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
public class TC_AT_Bookmarkcontent_020 extends Aajtak_app_Util {

	@Test(description = " Description : Verify the title and time of the vedio")
	public void AT_Bookmarkcontent_020() throws InterruptedException {
		
		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on video tab
		clickBtn(homescreen.getVideoTab());
		
		//Scrolling till video title is present
		scrollToElement(videoList.getVideoTitle());
		
		//Waiting till the bookmark icon is present fro 15 secs
		waitTillElementPresent(videoList.getBookmarkIcon(), 15);
		
		//Clicking video in video section
		clickBtn(videoList.getVideoTitle());
		
		//verifying video title and video upload time
		String expectedTitle = videoDetail.getVideoDetailTitle().getText();
		waitTillElementPresent(videoDetail.getVideoUploadTime(),10);
		String expectedTime = videoDetail.getVideoUploadTime().getText();
		
		//clicking on bookmark icon in video list section
		clickBtn(videoDetail.getBookmarkIcon(), "Bookmark icon");
		
		//Re opening the app
		reOpenApp();
		
		//Waiting till the daily cpasule banner present
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);
		
		//Clicking on hambergur menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//Clicking on video section in bookmark content
		clickBtn(bookmarkContent.getVideoSection());
		
		//verifying video title in bookmark content
		isElementExist(bookmarkContent.getVerifyVideoTitle());
		
		//Clicking on video in bookmark content
		clickBtn(bookmarkContent.getVerifyVideoTitle());
		
		//Validating actual title and time of video in video detail
		String actualTitle = videoDetail.getVideoDetailTitle().getText();
		waitTillElementPresent(videoDetail.getVideoUploadTime(),10);
		String actualTime = videoDetail.getVideoUploadTime().getText(); 
		verifyTwoText(actualTime, expectedTime);
		verifyStoryTitles(actualTitle, expectedTitle);
	}

}
