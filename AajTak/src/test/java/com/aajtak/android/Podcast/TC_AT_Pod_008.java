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
 * This test case is to verify that user is able to tap on podcast audio listed. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Pod_008 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able to tap on podcast audio listed")
	public void AT_Pod_008() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 60);
		
		//Fetch the first podcast title under latest
		String expectedPodcast = podcast.getFirstPodcastTitle().getText();
		
		//Print the podcast title
		System.out.println(expectedPodcast);
		
		//Click on first podcast title under latest
		clickBtn(podcast.getFirstPodcastAudio(),"First Podcast Section");
		
		//Fetch the title to verify
		String actualPodcast = podcast.getVerifyPlayerTitle().getText();
		
		//Print title which is used to verify
		System.out.println(actualPodcast);
		
		//Compare both titles should be same
		verifyTwoText(actualPodcast, expectedPodcast);
	}
}
