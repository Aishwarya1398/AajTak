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
 * This test case is to verify that user is able to tap on aajtak icon from podcast page. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Pod_006 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able to tap on aajtak icon from podcast page")
	public void AT_Pod_006() throws Exception
	{
		//Launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on podcast radio icon
		clickBtn(homescreen.getPodcastRadio(),"Podcast radio");
		
		//Click on aajtak logo present on podcast page
		clickBtn(podcast.getAajTakLogo(),"Aajtak Logo");
		
		//It will verify daily capsule present on homescreen
		isElementExist(homescreen.getDailycapBannerMessage());
	}
}
