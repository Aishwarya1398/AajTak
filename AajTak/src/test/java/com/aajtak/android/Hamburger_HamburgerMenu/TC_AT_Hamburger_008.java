package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that on tapping 'Bookmarks' user is navigated to 'Bookmarks' screen.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_008 extends Aajtak_app_Util {

	@Test(description = "Verify that on tapping 'Bookmarks' user is navigated to 'Bookmarks' screen", priority = 8)
	public void AT_Hamburger_008() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Bookmark content icon in Hamburger Menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark content Icon");
		
		//It will verify that whether the header of Bookmark page is present or not
		verifyTwoText(bookmarkContent.getBookmarkPageTitle().getText(), "बुकमार्क कंटेंट");
		
		//It will verify that Story section is present or not in bookmark content page
		isElementExist(bookmarkContent.getStorySection(), " Story section");
		
		//It will verify that Photo section is present or not in Bookmark content page
		isElementExist(bookmarkContent.getTasvireSection(), "Tasvire section");
		
		//It will verify that Video section is present or not in Bookmark content page
		isElementExist(bookmarkContent.getVideoSection(), "Video section");
	}


}