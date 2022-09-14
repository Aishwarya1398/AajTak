package com.aajtak.android.Hamburger_DownloadedContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * 
 * Description : Verify that the user is able to navigate to the article description page
 */
public class TC_AT_Dwncnt_006 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to navigate to the article description page",priority = 6)
	public void AT_Dwncnt_006() throws InterruptedException {
		
		//It will launch application
		launchApp();
	
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Corona tab present in horizontal menu
		clickBtn(homescreen.getCoranaTab());
		
		//Scroll to first news title of Corona
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//It will wait till first title is present
		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
		
		//Click on offline or save icon
		clickBtn(newsList.getdownloadIcon());
		
		//It will Fetch the text of first title of Corona
		String expectedTitle = newsList.getnewslistfirsttitle().getText();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on story section in downloaded contents
		clickBtn(downloadedContent.getStorySection());
		
		//Click on saved story in downoaded content
		clickBtn(downloadedContent.getVerifyStoryTitle());
		
		//It will wait till story description is loaded
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(),120);
		
		//Click on tike samaj aagaya present on story detail walkthrough page
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//Get the text of title of story in story description page
		String actualTitle = storyDetail.getTitleOfAnyStory().getText();
		
		//It will compare both the titles and those should be same
		verifyStoryTitles(actualTitle, expectedTitle);
		
	}
}
