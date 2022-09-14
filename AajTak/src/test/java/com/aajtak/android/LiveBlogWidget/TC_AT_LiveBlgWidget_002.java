package com.aajtak.android.LiveBlogWidget;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 25 June 2021 This is Live Blog Widget module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.36(416)
 * 
 * This test case is to Verify that user is navigated to live blog detail screen when user taps on the widget 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_LiveBlgWidget_002 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that user is navigated to live blog detail screen when user taps on the widget")
	public void AT_LiveBlgWidget_002() throws Exception
	{
		//It is used to launch the aajtak application
		launchApp();
		
		// It is used to load the complete Onboardig screen
		Aajtak_app_Util.compelteOnboarding();
		
		//It will verify whether Live Blog title is present or not
		isElementExist(liveBlog.getLiveBlogTitle());
		
		//It will Scroll up the current page
		scrollUp();
		
		//Click on first chunk in the live blog widget
		clickBtn(liveBlog.getFifthBlogDescription());
		
		//It will verify header of the first blog is exist or not
		isElementExist(liveBlog.getLiveBlogHeading());
		
	}

}
