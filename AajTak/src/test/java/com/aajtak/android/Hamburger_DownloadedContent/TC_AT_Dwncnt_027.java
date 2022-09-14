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
 * Description : Verify that the progress bar should visible in the Downloaded content while downloading
 */
public class TC_AT_Dwncnt_027 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that the progress bar should visible in the Downloaded content while downloading")
	public void AT_Dwncnt_027() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(photoList.getDownloadIcon(), 20);
		/*
		 * clickBtn(photoList.getDownloadIcon(), "Save Icon"); scrollUp();
		 * clickBtn(videoList.getDownloadIcon(), "Save Icon");
		 */
		
		//It will save more than one story
		saveManyStories();
		
		//Click on Hamburger Menu icon 
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will wait till progress bar is visible
		waitTillElementPresent(downloadedContent.getProgressBar(), 30);
		
		//It will check that whether the progress bar is present or not
		isElementExist(downloadedContent.getProgressBar(), "Progress bar");
		
		//It will reopen the application
		reOpenApp();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 20);
		
		//Click on second sub category
		clickBtn(videoList.getSecondSubCategory());
		/*
		 * clickBtn(videoList.getDownloadIcon(), "Save Icon"); scrollUp();
		 * clickBtn(videoList.getDownloadIcon(), "Save Icon");
		 */
		
		//Save more than one story
		saveManyStories();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on video section in downloaded contents
		clickBtn(downloadedContent.getVideoSection());
		
		//It will wait till progress bar is visible
		waitTillElementPresent(downloadedContent.getProgressBar(),50);
		
		//It will check that whether the progress bar is present or not
		isElementExist(downloadedContent.getProgressBar(), "Progress bar");
		
	}

}
