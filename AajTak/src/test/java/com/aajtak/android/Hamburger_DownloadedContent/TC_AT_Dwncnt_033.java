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
 * Description : Verify that the user is able to clear all the Video's from the Downloaded content page by tapping on Sabhi Saaf Kare
 */
public class TC_AT_Dwncnt_033 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to clear all the Video's from the Downloaded content page by tapping on Sabhi Saaf Kare",priority = 25)
	public void AT_Dwncnt_033() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen		
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will scroll till to offline or save icon
		scrollToElement(videoList.getDownloadIcon());
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(videoList.getDownloadIcon(),"Save icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on video section in downloaded contents
		clickBtn(downloadedContent.getVideoSection());
		
		//Click on Sabhi Saf Karen option
		clickBtn(downloadedContent.getSabhiSafKaren());
		
		//It will verify that Alert message is present or not
		isElementExist(downloadedContent.getAletrtMessageOnSabhiSafKaren());
		
		//Click on Yes to delete all content
		clickBtn(downloadedContent.getHaanOptionForClearDownloadedContent());
		
		//Get the text of toast message
		String mesg = downloadedContent.getToastMsg().getText();
		
		//It will compare and it should be same
		verifyTwoText(mesg, "क्लीयर हुआ");
		
		//It will verify that whether the no content message is present or not
		isElementExist(downloadedContent.getContentMessage());
	}
}
