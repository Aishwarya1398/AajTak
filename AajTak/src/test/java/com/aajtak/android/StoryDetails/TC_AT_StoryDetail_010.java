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
 * This test case is to verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon
 *  of bookmarked story. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
class TC_AT_StoryDetail_010 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
	public void AT_StoryDetail_010() throws Exception {
		
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
										
		//Click on Action over flow icon
		clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
										
		//Click on bookmark icon which is present in action over flow
		clickBtn(storyDetail.getBookmarkIconInActionOverflow(), "Bookmark icon");
						
		//Click on Action over flow icon
		clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
												
		//Click on bookmark icon which is present in action over flow
		clickBtn(storyDetail.getBookmarkIconInActionOverflow(), "Bookmark icon");
				
		//Get toast message like bookmark hataya gaya
		String mesg = storyDetail.getToastMsg().getText();
				
		//Compare with toast message
		verifyTwoText(mesg, "बुकमार्क हटाया गया");
	}

}
