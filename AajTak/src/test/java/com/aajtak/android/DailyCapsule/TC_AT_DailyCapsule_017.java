package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description:This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that user is able to
 * close the newspresso card by tapping on the close icon
 * 
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_017 extends Aajtak_app_Util {

	@Test(priority = 17,description="Description: Verify that user is able to close the newspresso card by tapping on the close icon")
	public void AT_DailyCapsule_017() throws InterruptedException {
		
		// Launch the App
		launchApp();
		
		// Complete Onboarding set up
		compelteOnboarding();
		
		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);
		
		//Tap on the daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());
		
		//Tap on close button
		clickBtn(dailyHighlights.getCloseBtn(),"Newspwrap Close Button");
		
		//Validate if user is able to close the newspresso card.
		isElementExist(homescreen.getDailycapBannerMessage(),"Daily Capsule Banner");
	}
}