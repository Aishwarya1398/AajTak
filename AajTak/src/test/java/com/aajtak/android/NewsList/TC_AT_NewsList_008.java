package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: This is Newslist module of AajTak Application.
 * Verify that user is able to view the offlined story is available in
 * 'Downloaded Content' tab
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_008 extends Aajtak_app_Util {

	@Test(priority = 8, description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_Newslist_008() throws InterruptedException {
		
		// launch app
		launchApp();
		
		// complete onboarding set up
		compelteOnboarding();
		
		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());
		
		// Wait till the screen loads
		waitTillElementPresent(newsList.getdownloadIcon(), 60);
		
		// Get the title of the story to be downloaded
		String expectedTitle = newsList.getnewslistfirsttitle().getText();
		
		// Tap on save icon
		clickBtn(newsList.getdownloadIcon(), "Save icon");
		
		// Tap on hamburger menu
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");
		
		// Navigated to downloaded content
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		// Wait till the story is present in the downloaded content
		waitTillElementPresent(downloadedContent.getVerifyStoryTitle(), 15);
		
		// Verify if the story is downloaded
		isElementExist(downloadedContent.getVerifyStoryTitle(), "Saved Story");
		
		// Get text of the downloaded story
		String actualTitle = downloadedContent.getVerifyStoryTitle().getText();
		
		// Verify the title of the story that is downloaded from the newslist screen and
		// the title of the story present in the downloaded content
		
		verifyStoryTitles(expectedTitle, actualTitle);
	}

}
