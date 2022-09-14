package com.aajtak.android.DailyCapsule;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights.Verify that the user is able to
 * view share options while tappin on the share sheet
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_010 extends Aajtak_app_Util {

	@Test(priority = 10, description = "Description: Verify that the user is able to view share options while tappin on the share sheet.")
	public void AT_DailyCapsule_010() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// click on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Validate if user is able to view share icon
		isElementExist(homescreen.getShareIcon(), "Share icon");

		// Click on share icon
		clickBtn(homescreen.getShareIcon(), "Share icon");

		// Wait till share sheet is opened
		waitTillElementPresent(share.getShareCancel(), 15);

		// Verify the share options
		List<AndroidElement> optionText = share.getShareOptionHighlights();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
	}

}