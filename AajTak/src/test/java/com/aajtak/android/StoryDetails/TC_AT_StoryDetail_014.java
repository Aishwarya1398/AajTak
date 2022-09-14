package com.aajtak.android.StoryDetails;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;
/**
 * Date : 1 June 2021 This is Story Detail module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user is able to share story by tapping on the 'Share' icon.
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_014 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that user is able to share story by tapping on the 'Share' icon ")
	public void AT_StoryDetail_014() throws Exception {
		
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
		
		//Click on share icon which is present in action over flow
		clickBtn(storyDetail.getShareIconInActionOverflow(), "Share icon");
				
		//It will wait till other share options to be loaded
		waitTillElementPresent(share.getOtherShare(), 60);
				
		//It will fetch the text of all other share options
		List<AndroidElement> optionText = share.getShareOptionHighlights();
				
		//It will verify all other share options are present or not
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
				
		//click on cancel button
		clickBtn(share.getShareCancel());
	}

}
