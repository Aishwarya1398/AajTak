package com.aajtak.android.AppMessage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is App message Module From Aaj Tak Application
 * Description : Verify that user is able to view No saved stories/galleries/videos message in save content screen
 */


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppMsg_008 extends Aajtak_app_Util{

	@Test(description="Description : No saved stories/galleries/videos message in save content screen",priority = 2)
	public void AT_AppMsg_008() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete on board set upt
		compelteOnboarding();

		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hambergurmenu Icon");

		//verifying the downloaded content in hambergur menu
		isElementExist(hamburgerMenu.getDownloadInHamburgerMenu(),"Hamburger Mnenu");

		//Clicking on downloaded content in hambergur menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(),"Downloaded Content");

		//Verifying story section in downloaded content
		isElementExist(downloadedContent.getStorySection());

		//verifying the message when not stories are saved
		isElementExist(downloadedContent.getContentMessage());

		//Verifying photo section in downloaded conten
		isElementExist(downloadedContent.getTasvireSection());

		//Clicking on photo section
		clickBtn(downloadedContent.getTasvireSection());

		//verifying the message when not photos are saved
		isElementExist(downloadedContent.getContentMessage());

		//Verifying video section in downloaded content
		isElementExist(downloadedContent.getVideoSection());

		//Clicking on video section
		clickBtn(downloadedContent.getVideoSection());

		//verifying the message when not videos are saved
		isElementExist(downloadedContent.getContentMessage());

		//Clicking on device back button
		clickDeviceBackButton(1);
	}

}
