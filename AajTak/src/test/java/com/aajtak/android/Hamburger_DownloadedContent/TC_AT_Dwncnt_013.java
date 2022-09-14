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
 * Description : Verify that user is able to remove the gallery from Downloaded content
 */
public class TC_AT_Dwncnt_013 extends Aajtak_app_Util {
	@Test(description = "Verify that user is able to remove the gallery from Downloaded content",priority = 13)
	public void AT_Dwncnt_013() throws InterruptedException {
		
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
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//CLick on delete icon of photo
		clickBtn(downloadedContent.getDeleteSinglePhoto(),"Delete Button");
		
		//Get the toast message
		downloadedContent.getToastMsg().getText();
		
		//It will verify that whether the n content message is present or not
		isElementExist(downloadedContent.getContentMessage());

	}
}
