package com.aajtak.android.HomeScreenSection;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that the user is able to offline for each stories listed
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_007 extends Aajtak_app_Util {

	@Test(description ="Description : Verify that the user is able to offline for each stories listed",priority = 7)
	public void AT_HomeSec_007() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Scrolling till khel section in homescreen
		scrollToElement(homescreen.getKhelSection());

		//verifying khel section in homescreen
		isElementExist(homescreen.getKhelSection());

		//Scroll up in homescreen for a while
		scrollUp();

		//Scrolling till element till offline icon
		scrollToElement(homescreen.getOfflineIcon());

		//Clicking on save icon
		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		//verifying the message when user taps on offline icon with the help of two text method for aajtak util
		String mesg = homescreen.getToastmsg().getText();
		verifyTwoText(mesg, "सेव किया गया :)");

		//Scrolling till manoranjan section in homescreen
		scrollToElement(homescreen.getManoranjanSection());

		//verifying khel section in homescreen
		isElementExist(homescreen.getManoranjanSection());

		//scroll up in homescreen for a while
		scrollUp();

		//Scrolling till element till offline icon
		scrollToElement(homescreen.getOfflineIcon());

		//Clicking on save icon
		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		//verifying the message when user taps on offline icon with the help of two text method for aajtak util
		String mesg1 = homescreen.getToastmsg().getText();
		verifyTwoText(mesg1, "सेव किया गया :)");
	}

}
