package com.aajtak.android.Hamburger_DownloadedContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * 
 * Description : Verify that the user is able to view how much MB downloaded for video
 */
public class TC_AT_Dwncnt_028 extends Aajtak_app_Util{
	
	@Test(description = "Description : Verify that the user is able to view how much MB downloaded for video")
	public void AT_Dwncnt_028() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 45);
		
		//Click on second sub category of video
		clickBtn(videoList.getSecondSubCategory());
		
		//It will save the more than one story
		saveManyStories();
		/*
		 * clickBtn(videoList.getDownloadIcon(), "Save Icon"); scrollUp();
		 * clickBtn(videoList.getDownloadIcon(), "Save Icon");
		 */
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on video section in downloaded contents
		clickBtn(downloadedContent.getVideoSection());
		
		//It will verify that whether the size of video is present or not
		isElementExist(downloadedContent.getDownloadSize());
		
	}

}
