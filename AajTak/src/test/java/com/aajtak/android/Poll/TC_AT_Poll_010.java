package com.aajtak.android.Poll;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Poll Section Module From Aaj Tak Application
 * Description :  Verify that user is able to view vote kar chuke hain option when user vote
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Poll_010 extends Aajtak_app_Util {
	
	@Test(description="Description : Verify vote kar chuke hain option is available",priority = 10)
	public void AT_Poll_010() throws InterruptedException {
		

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

		//Validating Running description page by checking ab vote kare option
		isElementExist(poll.getAbVoteKare());

		//Validating Haa option 
		isElementExist(poll.getHaanOption());

		//Validating nahi option
		isElementExist(poll.getNahiOption());

		//clicking on haa option
		clickBtn(poll.getHaanOption());
		

		//Verifying back arrow button in poll description page
		clickBtn(poll.getBackArrowButton(), "BackArrow Button");
		
		//validating vote kar chuke hain option in poll pageSS
		isElementExist(poll.getVoteKarChukeHain());
	}

}
