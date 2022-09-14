package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that View more from section name text at the end of Top stories section
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_002 extends Aajtak_app_Util{

	@Test(description="Description : Verify that View more from section name text at the end of Top stories section",priority = 2)
	public void AT_HomeSec_002() throws InterruptedException {

		//Launching the App
		launchApp();

		//Complete onboard setup
		compelteOnboarding();

		// calling scroll to section method from aajtak app util class 
		// where in we are scrolling till poll section and validating each section name wlong with stories present or not
		scrollToSections(homescreen.getAnyaPollOption());
	}
}
