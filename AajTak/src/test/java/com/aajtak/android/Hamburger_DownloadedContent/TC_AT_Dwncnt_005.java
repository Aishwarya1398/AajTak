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
 * Description : Verify that when user clicks on delete, story is removed
 */
public class TC_AT_Dwncnt_005 extends Aajtak_app_Util {
	@Test(description = "Verify that when user clicks on delete, story is removed",priority = 5)
	public void AT_Dwncnt_005() throws InterruptedException {
		
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
		clickBtn(newsList.getdownloadIcon(), "Download Icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(),"Downloaded Content");
		
		//Click on story section in downloaded contents
		clickBtn(downloadedContent.getStorySection());
		
		//Click on delete icon of story
		clickBtn(downloadedContent.getDeleteSingleStory_Video(), "Delete Icon");
		
		//Get the toast message like content is deleted
		String mesg = downloadedContent.getToastMsg().getText();
		
		//Verify the toast message and should be match
		verifyTwoText(mesg, "डाउनलोडेड कंटेंट हटाया गया");
	}
}
