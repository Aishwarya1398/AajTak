package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that user is able to navigate to comments screen by
 * tapping on 'Comments' icon below any story
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_005 extends Aajtak_app_Util {

	@Test(priority = 5, description = "Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
	public void AT_Newslist_005() throws InterruptedException {

		// launch app
		launchApp();

		// complete onboarding set up
		compelteOnboarding();

		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());

		// Wait till the screen loads
		waitTillElementPresent(newsList.getcommenticon(), 15);

		// Tap on comments icon
		clickBtn(newsList.getcommenticon(), "Comment icon");

		// Validate that the comments screen is loaded
		isElementExist(comments.getCommentTextHeading(), "Comments Page");// To be made robust by identifying a web
																			// element in comment detail page
	}

}
