package com.aajtak.android.LiveTvWidget;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


/**
 * Date : 6 July 2021 This is Video TV module of AajTak Application
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Program_002 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that the user is able to go to any point in video by using the slider")
	public void AT_Program_002() throws Exception {

		launchApp();
		compelteOnboarding();
		selectSectionInHomeScreen(homescreen.getKaryakramTab());
		waitTillElementPresent(videoList.getVideoTitle(), 20);
		clickBtn(videoList.getVideoTitle());
		waitTillElementPresent(videoDetail.getVideoDetailTitle(),5);
		scroll(455, 641, 455, 641);
		isElementExist(videoDetail.getVideoPosition());
		String startDuration = videoDetail.getVideoPosition().getText();
		System.out.println(startDuration);
		//longPressAndSlide(videoDetail.getVideoProgressBar(), 260, 641, 720, 641);
		System.out.println(videoDetail.getVideoProgressBar().getCenter()+"Centre");
		scroll(455, 641, 455, 641);
		scroll(455, 641, 455, 641);
		String currentDuration = videoDetail.getVideoPosition().getText();
		System.err.println(currentDuration);
		
	 
		
		
	}
}
