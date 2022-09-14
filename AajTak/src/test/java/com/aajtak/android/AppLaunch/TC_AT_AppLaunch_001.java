
package com.aajtak.android.AppLaunch;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
import com.aajtak.android.pages.ShuruKarienOnboarding;

/**
 * Date : 1 June 2021 This is App Launch module of AajTak Application 
 * Description: User should be able to view the first onboarding screen with Shuru Karien button when user launch the App.
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppLaunch_001 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that user is able to view the first onboarding screen with Shuru Karien button when user launch the App.", priority = 1)
	public void AT_AppLaunch_001() throws Exception {
		
//		ShuruKarienOnboarding shuruKarienOnboarding = new ShuruKarienOnboarding(aDriver);
		// launch the App
		launchApp();
		
		// Validation if user is able to view shuru karien button
		isElementExist(shuruKarienOnboarding.getShuruKarein());
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		isElementExist(shuruKarienOnboarding.getAageBado());
//		clickBtn(shuruKarienOnboarding.getAageBado());
	}

}
