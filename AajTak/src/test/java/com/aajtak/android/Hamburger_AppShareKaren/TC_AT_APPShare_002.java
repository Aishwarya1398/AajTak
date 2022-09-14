package com.aajtak.android.Hamburger_AppShareKaren;

import java.util.List;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;
import io.appium.java_client.android.AndroidElement;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is App share kare Section From Aaj Tak Application
 * Description : Verify that user is able to view all share options when user tap on 'Anya share' by tapping on 'App Share Kare
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_APPShare_002 extends Aajtak_app_Util {

	@Test(description = "Description : Verify that user is able to view all share options when user tap on 'Anya share' by tapping on 'App Share Kare'")
	public void AT_APPShare_002() throws InterruptedException {

		//Launching the app
		launchApp();

		//complete on board set up
		compelteOnboarding();

		//Clicking hambergur menu in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");

		//Scrolling till settings element in hambergur menu
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

		//verifying the settings option is available or not
		isElementExist(hamburgerMenu.getSettingsInAnyaCategorys());

		//Clicking settings option in hambergur menu
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

		//Scrolling till app share kare element
		scrollToElement(settings.getAppShareKaren());

		//Verifying app share karen element is available or not
		isElementExist(settings.getAppShareKaren());

		//Clicking on share kare option in settings screen
		clickBtn(settings.getAppShareKaren());


		//Clicking on anya share option
		clickBtn(share.getOtherShare());

		//Verifying anyashare is present
		isElementExist(share.getAnyaShareText());

		//verifying all anya share options available
		List<AndroidElement> optionText = share.getAnyaShareOptions();

		for(AndroidElement allText : optionText) {
			isElementExist(allText);
		}
	}

}
