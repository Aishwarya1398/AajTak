package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description : Verify that the user is able to delete all the videos in the bookmark page by tapping on Sabhi Saaf Kare
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_024 extends Aajtak_app_Util {
	@Test(description="Description : Verify that the user is able to delete all the videos in the bookmark page by tapping on Sabhi Saaf Kare",priority = 14)
	public void AT_Bookmarkcontent_024()  throws InterruptedException 
	{
		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on video tab
		clickBtn(homescreen.getVideoTab());

		//Waiting till bookmark icon is present for 15 secs
		waitTillElementPresent(videoList.getBookmarkIcon(), 15);

		//Clicking on bookmark icon in video list 
		clickBtn(videoList.getBookmarkIcon(),"Bookmark icon");

		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");

		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//clicking on video section in bookmark content
		clickBtn(bookmarkContent.getVideoSection());

		//Clicking on sabhi saf karen in bookmark content
		clickBtn(bookmarkContent.getSabhiSafKaren());

		//Verifying the alert message on sabhi saf karen
		isElementExist(bookmarkContent.getAletrtMessageOnSabhiSafKaren());

		//Clicking on yes in sabhi saf karen
		clickBtn(bookmarkContent.getHaanOptionForClearBookmarkContent());

		//Validating the toast message after clearing the bookmarked video section
		String mesg = bookmarkContent.getToastMsg().getText();
		verifyTwoText(mesg,"क्लीयर हुआ");

		//Validating the content after deleting the videos
		isElementExist(bookmarkContent.getContentMessage());

	}

}
