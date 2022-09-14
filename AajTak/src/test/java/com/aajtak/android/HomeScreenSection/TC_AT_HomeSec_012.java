package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that when user Taps on video, it should go the video detail page containing this video
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_012 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that when user Taps on video, it should go the video detail page containing this video",priority = 11)
	public void AT_HomeSec_012() throws InterruptedException {

		//Launching the app
		launchApp();
		
		//Complete onboard set up
		compelteOnboarding();
		
		//Scrolling till video element present
		scrollToElement(homescreen.getFirstVideoInHomeScreen());
		
		//Verifying video is present in homescreen
		isElementExist(homescreen.getFirstVideoInHomeScreen(), "Video");
		
		//Scrolling till the video title is present
		scrollToElement(homescreen.getVideoTitle1());
		
		//clicking on video video play button in homescreen
		clickBtn(homescreen.getFirstVideoInHomeScreen(),"Video Play button");
		
		//Waiting till video detail title appears
		waitTillElementPresent(videoDetail.getVideoDetailTitle(), 10);
		
		//Validating the video title in video detail screen
		isElementExist(videoDetail.getVideoDetailTitle());
	}
}
