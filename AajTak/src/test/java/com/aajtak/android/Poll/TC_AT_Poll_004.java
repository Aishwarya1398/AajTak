package com.aajtak.android.Poll;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Poll Section Module From Aaj Tak Application
 * Description : Verify user is able to view Running and Closed otion in Poll description page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Poll_004 extends Aajtak_app_Util{

	@Test(description = "Description : Verify Running and Closed option available" ,priority = 4)
	public void AT_Poll_004() throws InterruptedException {

		//Launch the App
		launchApp();

		//Complete onboarding set up 
		compelteOnboarding();

		//Scrolling till Anya poll option is present
		scrollToElement(poll.getAnyPollOption());

		//validating the Anya Poll element in homescreen
		isElementExist(poll.getAnyPollOption());

		//Clicking on Anya Poll option
		clickBtn(poll.getAnyPollOption());

		//validating Running option is available or not
		isElementExist(poll.getRunningPoll());
		
		//validating Closed option is available or not
		isElementExist(poll.getClosedPoll());
	}

}
