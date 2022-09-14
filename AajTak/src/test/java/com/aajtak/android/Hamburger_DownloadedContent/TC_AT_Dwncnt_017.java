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
 * Description : Verify the video section in downloaded content
 */
public class TC_AT_Dwncnt_017 extends Aajtak_app_Util {
	@Test(description = "Verify the video section in downloaded content",priority = 17)
	public void AT_Dwncnt_017() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will scroll till to video title
		scrollToElement(videoList.getVideoTitle());
		
		//Fetch the text of video title
		String expectedTitle = videoList.getVideoTitle().getText();
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 15);
		
		//Click on Offline or Save Icon
		clickBtn(videoList.getDownloadIcon(),"Download icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on video section in downloaded contents 
		clickBtn(downloadedContent.getVideoSection());
		
		//It ill verify that saved video is present or not
		isElementExist(downloadedContent.getVerifyVideoTitle());
		
		//Fetch the text of saved video title in downloaded content
		String actualTitle = downloadedContent.getVerifyVideoTitle().getText();
		
		//Compare the titles both should be same
		verifyStoryTitles(actualTitle, expectedTitle);
	}
	}
