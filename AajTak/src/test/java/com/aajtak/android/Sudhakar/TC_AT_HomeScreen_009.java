package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_009 extends Aajtak_app_Util {

	@Test(priority = 9, description = "Description: Verify that user is able to tap 'Offline Story' icon below any story")
	public void AT_Home_009() throws InterruptedException {

	
		launchApp();

		compelteOnboardingCopy();
		
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

	
		scrollToElement(homescreen.getSecondStoryTitle());

		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		String mesg1 = homescreen.getToastmsg().getText();

		verifyTwoText(mesg1, "सेव किया गया :)");
	}
}