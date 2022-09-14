package com.aajtak.android.LiveTvWidget;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


/**
 * Date : 6 July 2021 This is Video TV module of AajTak Application
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Video_005 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that the user can save the similar videos listed videos")
	public void AT_Video_005() throws Exception {

		launchApp();
		compelteOnboarding();
		selectSectionInHomeScreen(homescreen.getVideoTab());
		waitTillElementPresent(videoList.getVideoTitle(), 20);
		clickBtn(videoList.getVideoTitle());
		waitTillElementPresent(videoDetail.getVideoDetailTitle(),3);
		scrollUp();
		clickBtn(videoDetail.getMoreVideosDownloadIcon(), "Download icon");
		reOpenApp();
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Bookmarks");
		clickBtn(downloadedContent.getVideoSection());
		isElementExist(downloadedContent.getVerifyVideoTitle());
		
	}
}
