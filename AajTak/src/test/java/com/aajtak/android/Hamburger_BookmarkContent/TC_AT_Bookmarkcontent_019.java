package com.aajtak.android.Hamburger_BookmarkContent;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :  Verify that the user is able to remove the video from bookmark content section
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_019 extends Aajtak_app_Util {
	@Test(description ="Verify that the user is able to remove the video from bookmark content section",priority=11)
	public void AT_Bookmarkcontent_019	() throws InterruptedException {

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

		//Clicking on video section in bookmark content
		clickBtn(bookmarkContent.getVideoSection());

		//verifying the video title element in video section
		isElementExist(bookmarkContent.getVerifyVideoTitle());

		//Deleting the single video 
		clickBtn(bookmarkContent.getDeleteSingleStory_Video(), "Delete Icon");

		//Validating the toast message after deleting
		String mesg = bookmarkContent.getToastMsg().getText();
		verifyTwoText(mesg, "बुकमार्क हटाया गया");
		Boolean check = isElementDisplayed(bookmarkContent.getDeleteSingleStory_Video());
		Assert.assertEquals(false, check);

	}


}
