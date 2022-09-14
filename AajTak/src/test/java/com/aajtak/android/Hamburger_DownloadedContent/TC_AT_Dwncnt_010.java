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
 * Description : Verify that the user is able to clear all the stories from the Downloaded stories screen by tapping on Sabhi Saaf Kare
 */
public class TC_AT_Dwncnt_010 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to clear all the stories from the Downloaded stories screen by tapping on Sabhi Saaf Kare",priority = 10)
	public void AT_Dwncnt_010() throws InterruptedException {
		
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
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on story section in downloaded contents
		clickBtn(downloadedContent.getStorySection());
		
		//It will verify that sabhi Saf Karen is present or not
		isElementExist(downloadedContent.getSabhiSafKaren());
		
		//Click on sabhi Saf Karen
		clickBtn(downloadedContent.getSabhiSafKaren());
		
		//Verify that whether the Alert title is present or not
		isElementExist(downloadedContent.getAletrtTitleOnSabhiSafKaren());
		
		//Click on YES to delete all saved stories
		clickBtn(downloadedContent.getHaanOptionForClearDownloadedContent());
		
		//Get text of toast message
		downloadedContent.getToastMsg().getText();
		
		//It will verify that no content message is present or not
		isElementExist(downloadedContent.getContentMessage());
	}
}
