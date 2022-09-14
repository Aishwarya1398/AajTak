package com.aajtak.android.Hamburger_AppShareKaren;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is App share kare Section From Aaj Tak Application
 * Description : Verify that when user tap on 'Cancel', user should go back to 'Settings' screen
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_APPShare_003 extends Aajtak_app_Util{

	@Test(description = "Description : Verify that when user tap on 'Cancel', user should go back to 'Settings' screen")
	public void AT_APPShare_003() throws InterruptedException {

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

		//Clicking on cancel in share pop up
		clickBtn(share.getShareCancel());

		//Validating after tapping on cancel whether any share options displayed or not
		boolean check = isElementDisplayed(share.getWhatsAppShare());
		Assert.assertEquals(false,check);		
		isElementExist(settings.getSettingsPageTitle());


	}

}
