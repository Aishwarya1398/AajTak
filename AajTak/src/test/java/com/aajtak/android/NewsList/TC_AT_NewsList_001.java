package com.aajtak.android.NewsList;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021 
 * 
 * Description: Verify that the user is able to navigate to
 * the news listing screen from hamburger menu. Tap on a newslist section from
 * the hamburger menu and verify if the user is in the same section in the
 * horizontal menu.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_001 extends Aajtak_app_Util {

	@Test(priority = 1, description = "Description: Verify that the user is able to navigate to the news listing screen from hamburger menu")
	public void AT_Newslist_001() throws InterruptedException {
		
		// Launch app
		launchApp();
		
		// Complete Onboarding set up
		compelteOnboarding();
		
		// Tap on Hamburger meny
		clickBtn(homescreen.getHamburgerIcon(), "Hamburgur Menu");
		
		// Get text of the newslist section in hamburger menu
		String hamburgerSection = hamburgerMenu.getManorajanInTopCategory().getText();
		
		// Tap on the newslist section in hamburger menu
		clickBtn(hamburgerMenu.getManorajanInTopCategory(), "Newslist section");
		
		// Wait till the selected tab appears
		waitTillElementPresent(homescreen.getManoranjanTab(), 10);
		String horizontalSection = homescreen.getManoranjanTab().getText();
		
		// Validate if user is in the newslist tab selected
		isElementExist(homescreen.getManoranjanTab());
		
		// Validate if user is navigated to Same section in the Horizontal menu
		verifyTwoText(hamburgerSection, horizontalSection);
		boolean check = homescreen.getManoranjanTab().isSelected();
		assertTrue(check, "Manoranjan Section is selected");
	}

}
