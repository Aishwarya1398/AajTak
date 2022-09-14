package com.aajtak.android.StoryDetails;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

/**
 * Date : 1 June 2021 This is Story Detail module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user is navigate to the story detail screen when user taps on a story. 
 *
 */

public class TC_AT_StoryDetail_001 extends Aajtak_app_Util {

	@Test(description = "Description : Verify that user is navigate to the story detail screen when user taps on a story")
	public void AT_StoryDetail_001() throws Exception {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Select the manoranjan option in horizontal menu
		clickBtn(homescreen.getManoranjanTab());
		
		//Scroll to first story title of manoranjan
		scrollToElement(storyDetail.getFirstStoryTitle());
		
		//It will fetch the title of the first story in manoranjan
		String expectedTitle = storyDetail.getFirstStoryTitle().getText();
				
		//Click on first story title of manoranjan
		clickBtn(storyDetail.getFirstStoryTitle());
				
		//Click on tike samaj aagaya in story detail walkthrough page
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//It will wait till description of story loaded
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
		
		//It will fetch the title of story in the story detail page
		String actualTitle = storyDetail.getTitleOfAnyStory().getText();
		
		//compare the titles both should be same
		verifyStoryTitles(expectedTitle, actualTitle);
	}
}
