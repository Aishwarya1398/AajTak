package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user clicks on any gallery user get navigated to the photo detail page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_014 extends Aajtak_app_Util {
	//115
	@Test(description = "Verify that when user clicks on any gallery user get navigated to the photo detail page",priority = 8)
	public void AT_Bookmarkcontent_014() throws InterruptedException
	{
		//Launching the app	
		launchApp();

		//Complete onbaord set up
		compelteOnboarding();

		//Clicking on photo tab in homescreen
		clickBtn(homescreen.getPhotoTab());

		//Waiiting til the element bookmark icon is present
		waitTillElementPresent(photoList.getBookmarkIcon(), 15);

		//Clicking on bookmark icon in photo list
		clickBtn(photoList.getBookmarkIcon(),"Bookmark icon");

		//Clcikning Hambergur menu in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");

		//clciking on bookamrk content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");

		//Clicking on tasvire section on bookmark content page
		clickBtn(bookmarkContent.getTasvireSection());

		//Validating the photo title in bookmarked photo section
		String expectedTitle = bookmarkContent.getVerifyPhotoTitle().getText();

		//Clicking on bookmarked photo
		clickBtn(bookmarkContent.getVerifyPhotoTitle());

		//Clicking on thike samajh agaya in walkthrough screen
		clickBtn(photoDetail.getTikeSamajAgaya());

		//Verifying the photo title in photo detail
		isElementExist(photoDetail.getphotoTitle());

		//Validating bookmarked photo title and photo detail title
		String actualTitle = photoDetail.getphotoTitle().getText();
		verifyStoryTitles(actualTitle, expectedTitle);
	}

}
