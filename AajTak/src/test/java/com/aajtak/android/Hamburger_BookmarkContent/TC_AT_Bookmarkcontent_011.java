package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to view photos section in Bookmark
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Bookmarkcontent_011 extends Aajtak_app_Util {
	@Test(description = "Verify the photos section in Bookmark",priority = 7)
	public void AT_Bookmarkcontent_011() throws InterruptedException
	{
		//Launching the app
		launchApp();
		
		//Complete onboard set up
		compelteOnboarding();
		
		//Clicking on photo section
		clickBtn(homescreen.getPhotoTab());
		
		//Validating the photo title from photo section
		String expectedPhotoTitle = photoList.getVerifyPhotoTitle().getText();
		
		//Waiting till the element bookmark icon is present for 15 secs
		waitTillElementPresent(photoList.getBookmarkIcon(), 15);
		
		//Clicking on bookmark icon in photo section
		clickBtn(photoList.getBookmarkIcon(),"Bookmark icon");
		
		//Clicking on hambergur menu icon in homescren
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
		
		//clicking on  bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//clicking on photo section in bookmark content page
		clickBtn(bookmarkContent.getTasvireSection());
		
		//Validating bookmarked title and ttitle present in tasvire section bookmark
		String actualPhotoTitle = bookmarkContent.getVerifyPhotoTitle().getText();
		verifyStoryTitles(actualPhotoTitle, expectedPhotoTitle);
	}

}
