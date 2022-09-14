package com.aajtak.android.Poll;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Poll Section Module From Aaj Tak Application
 * Description : Verify user is navigated to poll description page when user taps on anya poll option
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Poll_003 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify user is navigated to poll description page when user taps on anya poll option", priority = 3)
	public void AT_Poll_003() throws InterruptedException {
		
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
		
		//validating the poll description page by checking Running and Closed is available or not
		isElementExist(poll.getRunningPoll());
		isElementExist(poll.getClosedPoll());
	}

}
