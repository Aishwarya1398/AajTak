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
public class TC_AT_Video_013 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that the user is able to go to any point in video by using the slider")
	public void AT_Video_013() throws Exception {

		launchApp();
		compelteOnboarding();
		selectSectionInHomeScreen(homescreen.getVideoTab());
		waitTillElementPresent(videoList.getVideoTitle(), 20);
		clickBtn(videoList.getVideoTitle());
		waitTillElementPresent(videoDetail.getVideoDetailTitle(),3);
		longPressAndSlide(videoDetail.getVideoProgressBar(), 260, 641, 720, 641);
		
	}
}
