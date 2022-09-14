package com.aajtak.android.Hamburger_SectionCustomizeKarein;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Section customization module From Aaj Tak Application
 * Description :  Verify that when user taps on back button without saving, user should receive warning popup
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_SecCustKa_008 extends Aajtak_app_Util{

	@Test(description = "Description: Verify that when user taps on back button without saving, user should receive warning popup",priority = 3)
	public void AT_SecCustKa_008() throws InterruptedException {
		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on hambergur menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");

		//Scrolling till settings element in hambergur menu
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

		//Clicking on settings option in hambergur menu
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

		//Clicking on section customization option
		clickBtn(settings.getCustomizeSection());

		//Verifying khel section is present
		isElementExist(sectionCustomizeKaren.getKhel());

		//Cliking on check box for khel option
		clickBtn(sectionCustomizeKaren.getSelectKhel(), "Check Box");

		//Cliking on back arrow button
		clickBtn(sectionCustomizeKaren.getBackArrowButton(), "Back Arrow Button");

		//Validating leave preference message
		isElementExist(sectionCustomizeKaren.getPreferenceMessage());
	}


}
