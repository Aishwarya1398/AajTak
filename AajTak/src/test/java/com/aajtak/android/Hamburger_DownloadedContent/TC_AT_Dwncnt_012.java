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
public class TC_AT_Dwncnt_012 extends Aajtak_app_Util {
	@Test(description = "Verify the title and date of the gallery",priority = 12)
	public void AT_Dwncnt_012() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till  photo title is visible
		waitTillElementPresent(photoList.getVerifyPhotoTitle(), 30);
		
		//Get the text of title of photo
		String expectedTitle= photoList.getVerifyPhotoTitle().getText();
		
		//Get the text of Date of photo
		String expectedDate = photoList.getPhotoGalleryDate().getText();
		
		//Click on Offline or Save Icon
		clickBtn(photoList.getDownloadIcon(),"Save Icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//Click on title of saved story
		clickBtn(downloadedContent.getVerifyPhotoTitle());
		
		//Get the text of saved photo title in downloaded content
		String actualTitle  = downloadedContent.getVerifyPhotoTitle().getText();
		
		//Get the text of saved photo date in downloaded content
		String actualDate = downloadedContent.getVerifyContentDate().getText();
		
		// verify  and compare both titles and those should be same
		verifyStoryTitles(expectedTitle, actualTitle);
		
		// verify  and compare both dates and those should be same
		verifyTwoText(expectedDate, actualDate);
	}
}
