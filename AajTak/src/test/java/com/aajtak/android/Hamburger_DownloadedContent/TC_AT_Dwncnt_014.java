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
 * Description : Verify that when user clicks on any gallery get navigated to the photo detail page
 */
public class TC_AT_Dwncnt_014 extends Aajtak_app_Util {
	@Test(description = "Verify that when user clicks on any gallery get navigated to the photo detail page",priority = 13)
	public void AT_Dwncnt_014() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till offline icon is visible
		waitTillElementPresent(photoList.getDownloadIcon(), 30);
		
		//Click on first photo title
		clickBtn(photoList.getVerifyPhotoTitle());
		
		//Click on Tike samaj agaya option
		clickBtn(photoDetail.getTikeSamajAgaya());
		
		//Get the text of title of photo
		String ExpectedTitle = photoDetail.getphotoTitle().getText();
		
		//Click on Offline or Save Icon
		clickBtn(photoDetail.getDownloadIcon(), "Save icon");
		
		//Click on close button to close gallery
		clickBtn(photoDetail.getCloseGallery(), "Close Gallery");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(),"Downloaded Content");
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will wait till 30 sec
		customWait(30);
		
		//Click on title of saved story
		clickBtn(downloadedContent.getVerifyPhotoTitle());
		
		//Get the text of title of photo
		String ActualTitle = photoDetail.getphotoTitle().getText();
		
		//Compare and both should be same
		verifyStoryTitles(ActualTitle, ExpectedTitle);
	}
}
