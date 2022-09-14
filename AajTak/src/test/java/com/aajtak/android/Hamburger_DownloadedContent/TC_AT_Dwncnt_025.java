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
 * Description :  Verify the message displayed while saving the stories,photos or videos
 */
public class TC_AT_Dwncnt_025 extends Aajtak_app_Util{
	
	@Test(description = "Description : Verify the message displayed while saving the stories,photos or videos")
	public void AT_Dwncnt_025() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Video tab present in horizontal menu
		clickBtn(homescreen.getVideoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(videoList.getDownloadIcon(), 15);
		
		//Click on Offline or Save Icon
		clickBtn(videoList.getDownloadIcon(), "Save Icon");
		
		//Get the text of toast message
		videoList.getToastmsg().getText();
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(photoList.getDownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(photoList.getDownloadIcon(), "Save Icon");
		
		//Get the text of toast message
		videoList.getToastmsg().getText();
		
		//Click on Corona tab present in horizontal menu
		clickBtn(homescreen.getCoranaTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(newsList.getdownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(newsList.getdownloadIcon(), "Save Icon");
		
		//Get the text of toast message
		videoList.getToastmsg().getText();
		
	}

}
