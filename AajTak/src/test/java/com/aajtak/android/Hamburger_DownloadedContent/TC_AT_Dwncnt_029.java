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
 * Description : Verify that the user is able to view the count of how many photos downloaded, while downloading
 */
public class TC_AT_Dwncnt_029 extends Aajtak_app_Util{
	
	@Test(description = "Description : Verify that the user is able to view the count of how many photos downloaded, while downloading")
	public void AT_Dwncnt_029() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//Click on Video tab present in horizontal menu
		waitTillElementPresent(photoList.getDownloadIcon(), 30);
		
		//Click on first sub category of photo
		clickBtn(photoList.getFirstSubCategory());
		
		//It will save the more than one story
		saveManyStories();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will verify that whether that size of photo is present or not
		isElementExist(downloadedContent.getDownloadSize());
	}

}
