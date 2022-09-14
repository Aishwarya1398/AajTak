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
 * This test case is to verify that user is able to close icon in sticky player. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Pod_015 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able to close icon in sticky player")
	public void AT_Pod_015() throws InterruptedException
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//It will wait till mini player is present
		waitTillElementPresent(podcast.getMiniPlayerPlayIcon(), 10);
		
		//Click on aajtak logo
		clickBtn(podcast.getAajTakLogo(),"Aajtak Logo");
		
		//Click on close icon sticky mini player
		clickBtn(podcast.getStickyMiniCloseButton(),"Close icon in Sticky Mini Player");
		
		//Click on close icon in sticky player
		clickBtn(podcast.getCloseIconInStickyPlayer(),"Close icon in Sticky Player");
		
		//It will verify daily capsule present on homescreen
		isElementExist(homescreen.getDailycapBannerMessage());		
	}
}
