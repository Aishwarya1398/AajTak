package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to Verify the title and time of the gallery
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_012 extends Aajtak_app_Util {

	@Test(description = "Description : Verify the title and time of the gallery")
	public void AT_Bookmarkcontent_012() throws InterruptedException {

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

		//Validating the photo title in photo list
		String PhotoActualTitle = photoList.getVerifyPhotoTitle().getText();

		//Validating photo time in photo list
		String PhotoTime = photoList.getPhotoGalleryDate().getText();

		//Clicking bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");

		//Clicking on tasvire section on bookmark content
		clickBtn(bookmarkContent.getTasvireSection());

		//Validating the bookmarked phot title
		String BookmarkedPhotoTitle = bookmarkContent.getVerifyPhotoTitle().getText();

		//Validating bookmarked photo gallery time
		String BookmarkedPhotoTime = bookmarkContent.getContentDate().getText();	

		//Validating both are matching
		verifyTwoText(PhotoActualTitle, BookmarkedPhotoTitle);
		verifyTwoText(PhotoTime, BookmarkedPhotoTime);



	}

}
