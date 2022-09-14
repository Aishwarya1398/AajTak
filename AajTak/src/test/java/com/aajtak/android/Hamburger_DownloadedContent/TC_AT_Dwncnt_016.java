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
 * Description : Verify that the user is able to clear all the photo galleries from the Downloaded content page by tapping on Sabhi Saaf Kare
 */
public class TC_AT_Dwncnt_016 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to clear all the photo galleries from the Downloaded content page by tapping on Sabhi Saaf Kare",priority = 16)
	public void AT_Dwncnt_016() throws InterruptedException {
		
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
		
		//Click on sabhi saa karen option
		clickBtn(downloadedContent.getSabhiSafKaren());
		
		//Click on Yes on alert pop up
		clickBtn(downloadedContent.getHaanOptionForClearDownloadedContent());
		
		//Get the text of toast message
		String mesg = downloadedContent.getToastMsg().getText();
		
		//Compare the toast messages it should be same
		verifyTwoText(mesg, "क्लीयर हुआ");
		
		//It will verify that whether the no content message is present or not
		isElementExist(downloadedContent.getContentMessage());
	}
}
