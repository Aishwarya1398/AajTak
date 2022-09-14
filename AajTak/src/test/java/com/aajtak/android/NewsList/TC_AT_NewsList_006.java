package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'neswlist' screen
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_006 extends Aajtak_app_Util {

	@Test(priority = 6, description = "Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'neswlist' screen")
	public void AT_Newslist_006() throws InterruptedException {
		
		// launch app
		launchApp();
		
		// complete onboarding set up
		compelteOnboarding();
		
		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());
		
		// Wait till the screen loads
		waitTillElementPresent(newsList.getcommenticon(), 15);
		
		//Tap on comments icon
		clickBtn(newsList.getcommenticon(), "Comment icon");
		
		//Tap on close button
		clickBtn(comments.getCloseCommentsScreen(), "Close button");
		
		//Validate if the user is navigated to newslist screen 
		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
		isElementExist(homescreen.getManoranjanTab(), "Manoranjan");
	}

}
