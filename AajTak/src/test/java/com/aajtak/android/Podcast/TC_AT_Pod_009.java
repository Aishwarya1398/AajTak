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
public class TC_AT_Pod_009 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able to tap on 'aur sune' in podcast audio listed")
	public void AT_Pod_009() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 10);
		
		//Scroll to AureSune which is present in podcast page
		scrollToElement(podcast.getAurSune());
		
		//Click on AureSune
		clickBtn(podcast.getAurSune());
		
		//It will verify content description of podcast
		isElementExist(podcast.getPodcasContentDescription());	
	}
}
