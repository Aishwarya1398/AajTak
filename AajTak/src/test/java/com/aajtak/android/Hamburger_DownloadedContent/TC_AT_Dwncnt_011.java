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
 * Description : Verify the photos section in downloaded content
 */
public class TC_AT_Dwncnt_011 extends Aajtak_app_Util {
	@Test(description = "Verify the photos section in downloaded content",priority = 11)
	public void AT_Dwncnt_011() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till offline icon is visible
		waitTillElementPresent(photoList.getDownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(photoList.getDownloadIcon(),"Save Icon");
		
		//Get the text of title of photo
		String expectedPhotoTitle = photoList.getVerifyPhotoTitle().getText();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
				
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(),"Downloaded Content");
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//Get the text of saved photo in downloaded content
		String actualPhotoTitle = photoList.getVerifyPhotoTitle().getText();
		
		//Compare both the photo titles and it should be same
	    verifyTwoText(actualPhotoTitle, expectedPhotoTitle);
	}
}
