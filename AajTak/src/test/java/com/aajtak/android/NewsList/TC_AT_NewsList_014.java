package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date :  01 June 2021 
 * 
 * 
 * Description: Verify that each story under Newslist screen is showing up the uploaded time. This testcase verifies story date/time for 8-10 stories of two newslist sections.
 * 
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_014 extends Aajtak_app_Util {

	@Test(priority = 14, description = "Description: Verify that each story under Newslist screen is showing up the uploaded time")
	public void AT_Newslist_014() throws InterruptedException {
		
		// launch app
		launchApp();
		
		// complete onboarding set up
		compelteOnboarding();
		
		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());
		
		// Wait till the screen loads
		waitTillElementPresent(newsList.getStoryDate(), 30);
		
		// Validate the story upload time for 8-10 stories in one section
		getverifyStoryTitleWithUploadTime();
		
		// Navigate to Corona section
		clickBtn(homescreen.getCoranaTab());
		
		// Validate the story upload time for 8-10 stories in other section
		getverifyStoryTitleWithUploadTime();
	}

}
