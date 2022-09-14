package com.aajtak.android.LiveTvWidget;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 6 July 2021 
 * 
 * Description: Verify the mute icon in the live tv widget. Audio should be mute when use taps on the mute icon.
 * 
 * @author Archana George
 * @version dev 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_LiveTvWiget_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify the mute icon")
	public void AT_LiveTvWiget_002() throws Exception {
		// Launch the App
		launchApp();

		// Complete the Onboarding set up
		compelteOnboarding();

		// Wait till the mute icon is present
		waitTillElementPresent(liveTvWidget.getMuteIcon(), 20);

		// Validate if the mute icon is present
		isElementExist(liveTvWidget.getMuteIcon(), "Mute icon");

		// Validate the functionality of mute icon
		clickBtn(liveTvWidget.getMuteIcon(), "Mute icon");

		// Incomplete

	}
}
