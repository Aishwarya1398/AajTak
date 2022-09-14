package com.aajtak.android.Hamburger_SectionCustomizeKarein;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Section customization module From Aaj Tak Application
 * Description :Verify that the user has to save the changes by tapping on the 'Save Kare' button
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_SecCustKa_004 extends Aajtak_app_Util {

	@Test(description = "Description : Verify that the user has to save the changes by tapping on the 'Save Kare' button")
	public void AT_SecCustKa_004() throws InterruptedException {

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

		//Verifying manoranjan section is available or not
		isElementExist(sectionCustomizeKaren.getManoranjan());

		//Clicking on the check box of manoranjan section
		clickBtn(sectionCustomizeKaren.getSelectManoranjan(), "Check BoxS");

		//Clicking on save kare option
		clickBtn(sectionCustomizeKaren.getSaveKaren(), "Save Kare");

		//Validating the toast message 
		String mesg = sectionCustomizeKaren.getToastMsg().getText();
		verifyTwoText(mesg, "सेव किया गया :)");

		//Clicking on device back button twice
		clickDeviceBackButton(2);

		//Scrolling till poll section and validating if manoranjan is disabled or not
		scrollToSections(homescreen.getAnyaPollOption());
		boolean check = isElementDisplayed(homescreen.getManoranjanSection());
		Assert.assertEquals(false,check);
		/*
		 *  boolean check =
		 * isElementDisplayed(homescreen.getManoranjanSection());
		 * Assert.assertEquals(false,check);
		 */
	}

}
