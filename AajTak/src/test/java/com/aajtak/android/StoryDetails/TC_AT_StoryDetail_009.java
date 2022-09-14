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
 * This test case is to verify that user is able to view the bookmarked story is available in 'Bookmark' tab. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_009  extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark' tab")
	public void AT_StoryDetail_009() throws Exception, IOException {
		
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
				
		//It will wait till 30 sec
		maxWait();
				
		//Click on Action over flow icon
		clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
								
		//Click on bookmark icon which is present in action over flow
		clickBtn(storyDetail.getBookmarkIconInActionOverflow(), "Bookmark icon");
		
		//Click on back arrow
		clickBtn(storyDetail.getNavigatebackFromAnystory(),"navigate back");
				
		//Click on Hamburger icon which is present in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hanberger icon");
				
		//Click on bookmark in hamburger menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(),"Bookmark");
				
		//It will verify bookmarked story title
		isElementExist(bookmarkContent.getVerifyStoryTitle());
				
		//It will fetch the title of bookmarked story in the bookmark content
		String actualTitle = bookmarkContent.getVerifyStoryTitle().getText();
				
		//compare the titles both should be same
		verifyStoryTitles(expectedTitle, actualTitle);
				
	}

}
