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
 * Description : Verify that the user is able to Download the stories, photos or videos
 */
public class TC_AT_Dwncnt_024 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to Download the stories, photos or videos",priority = 22)
	public void AT_Dwncnt_024()  throws InterruptedException 
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
		clickBtn(videoList.getDownloadIcon());
		
		//Get the text of toast message
		String mesg1 = videoList.getToastmsg().getText();
		
		//It will compare the toast messages and both should be same
		verifyTwoText(mesg1, "सेव किया गया :)");
		
		//Click on Photo tab present in horizontal menu
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(photoList.getDownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(photoList.getDownloadIcon());
		
		//Get the text of toast message
		String mesg2 =photoList.getToastmsg().getText();
		
		//It will compare the toast messages and both should be same
		verifyTwoText(mesg2, "सेव किया गया :)");
		
		//Click on Corona tab present in horizontal menu
		clickBtn(homescreen.getCoranaTab());
		
		//It will wait till save icon is visible
		waitTillElementPresent(newsList.getdownloadIcon(), 30);
		
		//Click on Offline or Save Icon
		clickBtn(newsList.getdownloadIcon());
		
		//Get the text of toast message
		String mesg3 = newsList.getToastMsg().getText();
		
		//It will compare the toast messages and both should be same
		verifyTwoText(mesg3, "सेव किया गया :)");
	}




}
