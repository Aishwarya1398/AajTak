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
 * This test case is to verify that user is able to view the offlined story is available in 'Downloaded Content' tab.
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_013 extends Aajtak_app_Util{
	
	@Test(description = "description : Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_StoryDetail_013() throws Exception {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Select the manoranjan option in horizontal menu
		selectSectionInHomeScreen(homescreen.getManoranjanTab());
		
		//Scroll to first story title of manoranjan
		scrollToElement(storyDetail.getFirstStoryTitle());
		
		//It will fetch the title of the first story in manoranjan
		String expectedTitle = storyDetail.getFirstStoryTitle().getText();
				
		//Click on first story title of manoranjan
		clickBtn(storyDetail.getFirstStoryTitle());
				
		//Click on tike samaj aagaya in story detail walkthrough page
		clickBtn(storyDetail.getTikeSamajAgaya());
				
		//Click on Action over flow icon
		clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
				
		//Click on offline icon which is present in action over flow
		clickBtn(storyDetail.getOfflineStoryInActionOverflow(), "Offline Story icon");
				
		//Click on back arrow from story detail page
		clickBtn(storyDetail.getNavigatebackFromAnystory(),"navigate back");
				
		//Click on Hamburger icon which is present in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
				
		//Click on downloaded content in hamburger menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(),"Downloaded content");
				
		//It will verify downloaded story title
		isElementExist(downloadedContent.getVerifyStoryTitle());
				
		//It will fetch the title of downloaded story in the downloaded content
		String actualTitle = downloadedContent.getVerifyStoryTitle().getText();
		
		//compare the titles both should be same
		verifyStoryTitles(expectedTitle, actualTitle);
	}

}
