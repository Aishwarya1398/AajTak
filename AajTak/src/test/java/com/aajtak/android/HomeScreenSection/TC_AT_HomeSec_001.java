package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify Badi khabre ki anya khabr text is vsisble at the end of Top stories section
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_001 extends Aajtak_app_Util{

	@Test(description="Description : Verify Badi khabre ki anya khabr text is vsisble at the end of Top stories section",priority = 1)
	public void AT_HomeSec_001() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete onboard set up
		compelteOnboarding();

		//Scrolling till the top stories element
		scrollToElement(homescreen.getTopStoriesSeeMoreLabel());

		//Verifying top stories ki other stories element
		verifyAnyaStoriesofSection(homescreen.getTopStoriesSeeMoreLabel(),
				homescreen.getOtherStoriesfromSectionTxt());
	}

}
