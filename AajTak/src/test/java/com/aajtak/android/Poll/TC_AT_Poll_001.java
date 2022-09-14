package com.aajtak.android.Poll;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Poll Section Module From Aaj Tak Application
 * Description :  Verify that user is able to view poll section in home screen
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Poll_001 extends Aajtak_app_Util{

	@Test(description = "Description : Verify poll section is present in home screen", priority = 1)
	public void AT_Poll_001() throws Exception {

		//Launch the App
		launchApp();

		//Complete onboarding set up 
		compelteOnboarding();

		//Scrolling till poll section is present
		scrollToElement(poll.getPollClick());

		//validating the Poll element in homescreen
		isElementExist(poll.getPollClick());
	}

}