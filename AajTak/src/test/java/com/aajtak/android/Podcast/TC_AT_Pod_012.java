package com.aajtak.android.Podcast;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 22 June 2021 This is Podcast module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user is able to scroll down/up through podcast home screen. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Pod_012 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that user is able to scroll down / up thorugh podcast home screen")
	public void AT_Pod_012() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 30);
		
		//Click on Mini player icon
		clickBtn(podcast.getMiniPlayerPlayIcon(), "Mini player icon");
		
		//Scroll to last podcast section
		scrollToElement(podcast.getLastPodcastSection());
		
		//It will verify Last podcast section is present or not
		isElementExist(podcast.getLastPodcastSection());
	}

}
