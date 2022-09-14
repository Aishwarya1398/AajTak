package com.aajtak.android.LiveBlogWidget;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 25 June 2021 This is Live Blog Widget module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.36(416)
 * 
 * This test case is to verify that user is able view five chunks in the  live blog widget 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)


public class TC_AT_LiveBlgWidget_001 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is able view five chunks in the widget")
	public void AT_LiveBlgWidget_001() throws Exception
	{
		//It will launch the application.
		launchApp();
				
		// It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Scroll until live Blog widget is present
		scrollToElement(liveBlog.getLiveBlogTitle());
		
		//It will verify whether Live Blog title is present or not
		isElementExist(liveBlog.getLiveBlogTitle());
		
		//It will verify whether first chunk is present or not in the widget
		isElementExist(liveBlog.getFirstBlogDescription());
		
		//It will verify whether second chunk is present or not in the widget
		isElementExist(liveBlog.getSecondBlogDescription());
		
		scrollToElement(liveBlog.getThirdBlogDescription());
		
		//It will verify whether third chunk is present or not in the widget
		isElementExist(liveBlog.getThirdBlogDescription());
		
		scrollToElement(liveBlog.getFourthBlogDescription());
		
		//It will verify whether fourth chunk is present or not in the widget
		isElementExist(liveBlog.getFourthBlogDescription());
		
		//It will verify whether fifth chunk is present or not in the widget
		isElementExist(liveBlog.getFifthBlogDescription());
		
		//Validate that only five chunks are displayed
		Boolean check = isElementDisplayed(liveBlog.getSixthBlogDescription());
		Assert.assertEquals(check, false);
	}
}
