package com.aajtak.android.Hamburger_DownloadedContent;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * 
 * Description : Verify that the user is able to remove the video from Downloaded content section
 */
public class TC_AT_Dwncnt_018 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to remove the video from Downloaded content section",priority = 18)
	public void AT_Dwncnt_018() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will scroll till to video title
		scrollToElement(videoList.getVideoTitle());
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 15);
		
		//Click on Offline or Save Icon
		clickBtn(videoList.getDownloadIcon(),"Download icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Download Content");
		
		//Click on video section in downloaded contents
		clickBtn(downloadedContent.getVideoSection());
		
		//It will verify that saved video title is present or not
		isElementExist(downloadedContent.getVerifyVideoTitle());
		
		//Click on Delete icon of video
		clickBtn(downloadedContent.getDeleteSingleStory_Video(), "Delete Icon");
		
		//Get the text of toast message
		String mesg = downloadedContent.getToastMsg().getText();
		
		//Compare the toast messages and it should be same
		verifyTwoText(mesg, "डाउनलोडेड कंटेंट हटाया गया");
		
		//It will verify that delete icon is present or not after deleting the video
		Boolean check = isElementDisplayed(downloadedContent.getDeleteSingleStory_Video());
		
		//It will validate that delete icon should not be present
		Assert.assertEquals(false, check);
	}
	}
