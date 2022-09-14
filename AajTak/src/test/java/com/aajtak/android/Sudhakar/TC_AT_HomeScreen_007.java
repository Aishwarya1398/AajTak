package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_007 extends Aajtak_app_Util {

	@Test(priority = 7, description = "Description: Verify that user is able to tap 'Bookmark' icon below any story")
	public void AT_Home_007() throws InterruptedException {

	
		launchApp();

	
		compelteOnboardingCopy();
	
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);

		scrollToElement(homescreen.getBadiKahbreinSection());

		
		scrollToElement(homescreen.getVisualStoryTitle());
		clickBtn(homescreen.getVisualStoryTitle());

		clickBtn(homescreen.getBookmarkIcon(), "Bookmark Icon");

		String mesg = homescreen.getToastmsg().getText();

		verifyTwoText(mesg, "बुकमार्क किया गया :)");

	}
}