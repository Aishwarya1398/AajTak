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
 * Description : Verify that the title and time of video should appear below each of the section
 */
public class TC_AT_Dwncnt_019 extends Aajtak_app_Util {
	@Test(description = "Verify that the title and time of video should appear below each of the section",priority = 19)
	public void AT_Dwncnt_019() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will wait till title of video is present
		waitTillElementPresent(videoList.getVideoTitle(), 30);
		
		//Fetch the text title of video
		String expectedTitle= videoList.getVideoTitle().getText();
		
		//Get the text of date of video
		String expectedDate = videoList.getVideodate().getText();
		
		//Click on Offline or Save Icon
		clickBtn(videoList.getDownloadIcon(),"Save Icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on video section in downloaded contents 
		clickBtn(downloadedContent.getVideoSection());
		
		//Click on saved video title
		clickBtn(downloadedContent.getVerifyVideoTitle());
		
		//Fetch the text of saved video title
		String actualTitle  = downloadedContent.getVerifyVideoTitle().getText();
		
		//Get the text of saved video date
		String actualDate = downloadedContent.getVerifyContentDate().getText();
		
		//Verify the titles before saving and after saved both should be same
		verifyStoryTitles(expectedTitle, actualTitle);
		
		//Verify the date before saving and after saved both should be same
		verifyTwoText(expectedDate, actualDate);
	}
	}
