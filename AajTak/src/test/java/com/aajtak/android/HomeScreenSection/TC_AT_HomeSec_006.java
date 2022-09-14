package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that user is able navigate to comments page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_006 extends Aajtak_app_Util{

	@Test(description = "Description : Verify that user is able navigate to comments page",priority = 6)
	public void AT_HomeSec_006() throws InterruptedException {

		//Lauching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Scrolling till khel section in homescreen
		scrollToElement(homescreen.getKhelSection());

		//verifying khel section in homescreen
		isElementExist(homescreen.getKhelSection());

		// Scrolling till comment icon is present
		scrollToElement(homescreen.getCommentIcon());

		//clicking on comment icon
		clickBtn(homescreen.getCommentIcon(), "Comment icon");

		//Waiting till the comment detail get load for 30 secs
		waitTillElementPresent(comments.getCommentTextHeading(), 30);

		//verifying comment text heading in commment detail page
		isElementExist(comments.getCommentTextHeading());

		//clicking on device back button
		clickDeviceBackButton(1);

		//Scrolling till manoranjan section in homescreen
		scrollToElement(homescreen.getManoranjanSection());

		//verifying manoranjan section in homescreen
		isElementExist(homescreen.getManoranjanSection());

		// Scrolling till comment icon is present
		scrollToElement(homescreen.getCommentIcon());

		//clicking on comment icon
		clickBtn(homescreen.getCommentIcon(), "Comment icon");

		//Waiting till the comment detail get load for 30 secs
		waitTillElementPresent(comments.getCommentTextHeading(), 30);

		//verifying comment text heading in commment detail pa
		isElementExist(comments.getCommentTextHeading());

		//clicking on device back button
		clickDeviceBackButton(1);

	}

}
