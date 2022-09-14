package com.aajtak.android.Podcast;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

/**
 * Date : 22 June 2021 This is Podcast module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user is able to swipe up the mini player. 
 *
 */
public class TC_AT_Pod_004 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able to swipe up the mini player")
	public void AT_Pod_004() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 10);
		
		//Click on audio end duration
		clickBtn(podcast.getAudioEndDuration());
		
		//It will verify mini player podcast page is present or not
		isElementExist(podcast.getMiniPlayerPodcastPage());
	}
}
