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
 * This test case is to verify that user is able to scroll down / up through podcast listing screen. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Pod_013 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that user is able to scroll down / up thorugh podcast listing screen")
	public void AT_Pod_013() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 10);
		
		//Click on Mini player icon
		clickBtn(podcast.getMiniPlayerPlayIcon(), "Mini player icon");
		
		//Click on first  podcast audio
		clickBtn(podcast.getFirstPodcastAudio(),"First podcast audio");
		
		//Scroll to yebheesunie option
		scrollToElement(podcast.getYeBheeSunie());
		
		//It will verify that similar podcast players are present.
		isElementExist(podcast.getSimilarPlayers());

		
	}

}
