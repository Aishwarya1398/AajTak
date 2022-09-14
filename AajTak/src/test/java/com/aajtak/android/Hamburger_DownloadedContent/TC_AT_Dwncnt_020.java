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
 * Description : Verify that the user is able to navigated to the video detail page in downloaded content
 */
public class TC_AT_Dwncnt_020 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to navigated to the video detail page in downloaded content",priority = 20)
	public void AT_Dwncnt_020()  throws InterruptedException 
	{
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//It will scroll till to video title
		clickBtn(homescreen.getVideoTab());
		
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
		
		//It will wait saved video title is visible
		waitTillElementPresent(downloadedContent.getVerifyVideoTitle(), 10);
		
		//It will verify that whether the saved video title is present or not
		isElementExist(downloadedContent.getVerifyVideoTitle());
		
		//Click on saved video title
		clickBtn(downloadedContent.getVerifyVideoTitle());
		
		//Verify that the video title is present on video detail page
		isElementExist(videoDetail.getVideoDetailTitle());
		
	}
		}
