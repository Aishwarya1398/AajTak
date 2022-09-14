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
 * This test case is to verify that user is able to view the below options on the Action overflow button: 
 * Comments icon, Bookmark icon, Offline Story icon, Text size and Share icon. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_003 extends Aajtak_app_Util{
	
	@Test(description = " Description : Verify that user is able to view the below options on the Action overflow button: Comments icon, Bookmark icon, Offline Story icon, Text size and Share icon")
	public void AT_StoryDetail_003() throws Exception, IOException {
		
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
				
		//It will verify comments icon is present or not
		isElementExist(storyDetail.getCommentsIconInActionOverflow(), "Comments icon");
				
		//It will verify bookmark icon is present or not
		isElementExist(storyDetail.getBookmarkIconInActionOverflow(), "Bookmark icon");
				
		//It will verify offline story icon is present or not
		isElementExist(storyDetail.getOfflineStoryInActionOverflow(), "Offile Story icon");
				
		//It will verify text size icon is present or not
		isElementExist(storyDetail.getTextSizeIconInActionOverflow(), "Text Size icon");
				
		//It will verify share icon is present or not
		isElementExist(storyDetail.getShareIconInActionOverflow(), "Share icon");
	}


}
