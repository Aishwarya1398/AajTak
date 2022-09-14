package com.aajtak.android.Hamburger_SectionCustomizeKarein;

import java.util.List;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;
import io.appium.java_client.android.AndroidElement;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Section customization module From Aaj Tak Application
 * Description : Verify that once user taps on 'Section Customize Kare' it should show up with different sections
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_SecCustKa_002 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that once user taps on 'Section Customize Kare' it should show up with different sections",priority = 2)
	public void AT_SecCustKa_002() throws InterruptedException {
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
		
		//Scrolling up for a while
		scrollUp();
		
		//Validating and fetching all the available options in section custamization
		List<AndroidElement> section = sectionCustomizeKaren.getOptionInSectionCustomization();
		for (AndroidElement list1 : section) {
			isElementExist(list1);
		}
	}


}
