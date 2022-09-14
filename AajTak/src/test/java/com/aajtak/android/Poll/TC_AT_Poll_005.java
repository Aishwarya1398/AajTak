package com.aajtak.android.Poll;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Poll Section Module From Aaj Tak Application
 * Description :  Verify user is able to navigate to Running and Closed poll descripton page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Poll_005 extends Aajtak_app_Util{

	@Test(description = "Description : Verify user is able to navigate to Running and Closed poll descripton page " ,priority = 5)
	public void AT_Poll_005() throws InterruptedException {

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
		
		//clicking on Running Option
		clickBtn(poll.getRunningPoll());
		
		//Validating Running description page by checking ab vote kare option
		isElementExist(poll.getAbVoteKare());
		
		//Clicking on Closed Option
		clickBtn(poll.getClosedPoll());
		
		//Validating Running description page by checking parinam dikhaye option
		isElementExist(poll.getParinamDikhaye());
	}

}
