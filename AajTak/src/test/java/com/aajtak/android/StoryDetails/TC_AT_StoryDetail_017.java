package com.aajtak.android.StoryDetails;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
/**
 * Date : 1 June 2021 This is Story Detail module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that the user is able to swipe through the Article.
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_017 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that the user is able to swipe through the Article")
	public void AT_StoryDetail_017() throws Exception {
		
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
				
		//It will wait till 30 sec
		maxWait();
				
		//It will swipe right
		swipeRight();
				
		//It will wait until to story description gets loaded
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(),120);
				
		//It will verify the title of story after swiping right in the story detail page
		isElementExist(storyDetail.getTitleOfAnyStory());
	}

}
