package com.aajtak.android.Sudhakar;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;



@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_0011 extends Aajtak_app_Util {

	@Test
	public void AT_Home_0011() throws InterruptedException {
		
		
		launchApp();
		compelteOnboardingCopy();
		waitTillElementPresent(homescreen.getHomeSectionCopy(), 5);
		waitTillElementPresent(homescreen.getBharathSectioncopy(), 5);
		boolean check = homescreen.getBharathSectioncopy().isSelected();
		assertTrue(check, "Home Screen is selected");
		report(check, "HomeScreen is selected by default", "HomeScreen is not selected");
	}
}