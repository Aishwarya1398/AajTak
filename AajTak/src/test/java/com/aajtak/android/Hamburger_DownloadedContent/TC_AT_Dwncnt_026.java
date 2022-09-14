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
 * Description : Verify that as soon as user clicks on the button, it should appear in Downloaded content screen
 */
public class TC_AT_Dwncnt_026 extends Aajtak_app_Util {
	@Test(description = "Verify that as soon as user clicks on the button, it should appear in Downloaded content screen",priority = 23)
	public void AT_Dwncnt_026()  throws InterruptedException 
	{
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(videoList.getDownloadIcon(), "Download Icon");
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(photoList.getDownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(photoList.getDownloadIcon(), "Download Icon");
		
		//Click on Corona tab present in horizontal menu
		clickBtn(homescreen.getCoranaTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(newsList.getdownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(newsList.getdownloadIcon(), "Download Icon");
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hmabergur Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//Click on story section in downloaded contents
		clickBtn(downloadedContent.getStorySection());
		
		//It will verify that saved story title is present or not
		isElementExist(downloadedContent.getVerifyStoryTitle());
		
		//Click on photo section in downloaded contents
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will verify that saved photo title is present or not
		isElementExist(downloadedContent.getVerifyPhotoTitle());
		
		//Click on video section in downloaded contents
		clickBtn(downloadedContent.getVideoSection());
		
		//It will verify that saved video title is present or not
		isElementExist(downloadedContent.getVerifyVideoTitle());
	}

}
