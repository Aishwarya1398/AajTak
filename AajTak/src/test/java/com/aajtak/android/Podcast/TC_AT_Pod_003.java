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
 * This test case is to verify that audio is reversed(10sec) when user taps on forward icon. 
 *
 */
public class TC_AT_Pod_003 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that audio is reversed(10sec) when user taps on forward icon")
	public void AT_Pod_003() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 10);
		
		//It will wait till 30 sec
		maxWait();
		
		//Click on mini player icon
		clickBtn(podcast.getMiniPlayerPlayIcon(),"Mini player Icon");
		
		//It will fetch the start duration of an audio
		String expextedDuration = podcast.getAudioStartDuration().getText();
		
		//Print the start duration
		System.out.println(expextedDuration);
		
		//Click on backward icon of 10 sec
		clickBtn(podcast.getMiniPlayerBackwardIcon(),"Backward Icon to 10 sec");
		
		//It will fetch the start duration of an audio
		String actualDuration = podcast.getAudioStartDuration().getText();
		
		//Print the start duration
		System.out.println(actualDuration);
		
		//It will verify start duration before backwarding and start duration after backwarding
		verifyTwodifferentString(expextedDuration, actualDuration);
		
	}

}
