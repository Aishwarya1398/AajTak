package com.aajtak.android.Hamburger_BookmarkContent;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to remove the gallery from bookmarked content
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_013 extends Aajtak_app_Util{

	@Test(description = "Description : Verify that user is able to remove the gallery from bookmarked content")
	public void AT_Bookmarkcontent_013() throws InterruptedException {

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

		//Waiting delete icon is present 
		waitTillElementPresent(bookmarkContent.getDeleteSinglePhoto(), 120);

		//Clcking on delete icon
		clickBtn(bookmarkContent.getDeleteSinglePhoto(), "Delete Icon");

		//Verifying the toast message after deleting the photo
		String mesg = bookmarkContent.getToastMsg().getText();
		verifyTwoText(mesg, "बुकमार्क हटाया गया");

		//Verifying the content message when no photo are saved
		isElementExist(bookmarkContent.getContentMessage());
	}

}
