package com.aajtak.android.LiveTvWidget;


import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
import com.aajtak.android.listener.MyExtentListners;


/**
 * Date : 6 July 2021 This is Video TV module of AajTak Application
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Video_014 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that user is able to swipe to close the video after minimizing")
	public void AT_Video_014() throws Exception {

		launchApp();
		compelteOnboarding();
		selectSectionInHomeScreen(homescreen.getVideoTab());
		waitTillElementPresent(videoList.getVideoTitle(), 20);
		clickBtn(videoList.getVideoTitle());
		waitTillElementPresent(videoDetail.getVideoDetailTitle(),3);
		clickBtn(videoDetail.getVideoMinimizeIcon(),"Video minimize icon");
		isElementExist(videoDetail.getMinimizedVideoPlayer(),"Video miniplayer");
		longPressAndSwipeToCloseVideo(videoDetail.getMinimizedVideoPlayer(), 810, 1985, 0, 1985);
		
	}
}

