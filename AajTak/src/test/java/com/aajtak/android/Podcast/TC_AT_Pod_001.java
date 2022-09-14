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
 * This test case is to verify that user is able to play podcast by tapping on podcast icon present at the right corner. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Pod_001 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that user is able to play podcast by tapping on podcast icon present at the right corner")
	public void AT_Pod_001() throws Exception
	{
		//Launch the application
		launchApp();
				
		// It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
				
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
				
		//It will wait till 30 sec
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 120);
				
		//It will verify mini player icon is present or not
		isElementExist(podcast.getMiniPlayerPlayIcon());
	}

}
