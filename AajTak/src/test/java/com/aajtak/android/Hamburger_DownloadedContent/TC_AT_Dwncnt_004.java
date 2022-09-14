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
 * Description : Verify that there is an option to remove the story from Downloaded content
 */
public class TC_AT_Dwncnt_004 extends Aajtak_app_Util {
	// 85
			@Test(description = "Verify that there is an option to remove the story from Downloaded content",priority = 4)
			public void AT_Dwncnt_004() throws InterruptedException {
				
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
				clickBtn(newsList.getdownloadIcon(),"Download Icon");
				
				//It will get text of toast message like save kiya gaya
				String expectedMessage= newsList.getToastMsg().getText();
				
				//Click on Hamburger menu icon
				clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
				
				//Click on Downloaded content in Hamburger Menu
				clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Download Content");
				
				//Click on story section in downloaded content
				clickBtn(downloadedContent.getStorySection());
				
				//Click on delete icon of story
				clickBtn(downloadedContent.getDeleteSingleStory_Video(),"Delete Icon");
				
				//It will get text of toast message like story is deleted
				String actualMessage = downloadedContent.getToastMsg().getText();
				
				//Compare expected and actual toast messages and those should not be same
				verifyTwodifferentString(expectedMessage, actualMessage);
				
			}
}
