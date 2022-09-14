package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to delete all the photo in the bookmark page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_017 extends Aajtak_app_Util {
	@Test(description ="Verify that the user is able to delete all the photo in the bookmark page", priority=9)
	public void AT_Bookmarkcontent_017() throws InterruptedException {

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

		//clicking sabhi saf karen in tasvire section
		clickBtn(bookmarkContent.getSabhiSafKaren());

		//Clicking on yes on sabhi saf karen option
		clickBtn(bookmarkContent.getHaanOptionForClearBookmarkContent());

		//Validating toast message after deleting all the photos
		String mesg = bookmarkContent.getToastMsg().getText();
		verifyTwoText(mesg,"क्लीयर हुआ");

		//Validating the message after cleaing all photos
		isElementExist(bookmarkContent.getContentMessage());
	}
}
