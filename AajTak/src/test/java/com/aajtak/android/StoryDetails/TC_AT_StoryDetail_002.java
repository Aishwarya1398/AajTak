package com.aajtak.android.StoryDetails;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 1 June 2021 This is Story Detail module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user should be able view the time of updation of the story. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_002 extends Aajtak_app_Util{
	
	@Test(description = "Description : Verify that user should be able view the time of updation of the story")
	public void AT_StoryDetail_002() throws InterruptedException, IOException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Select the manoranjan option in horizontal menu
		selectSectionInHomeScreen(homescreen.getManoranjanTab());
		
		//Scroll to first story title of manoranjan
		scrollToElement(storyDetail.getFirstStoryTitle());
		
		//Click on first story title of manoranjan
		clickBtn(storyDetail.getFirstStoryTitle());
				
		//Click on tike samaj aagaya in story detail walkthrough page
		clickBtn(storyDetail.getTikeSamajAgaya());
				
		//It will wait till story updated time is visible
		waitTillElementPresent(storyDetail.getStoryUpdatedTime(), 120);
				
		//It will verify story updated time is present or not
		isElementExist(storyDetail.getStoryUpdatedTime());

	}
}


