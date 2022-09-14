package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_010 extends Aajtak_app_Util {

	@Test(description="Access the daily highlight under bottom navigation bar when no net connection No internet connection Toast message should be displayed")
	public void AT_BNB_010() throws Exception {
		//	launchApp();
	//	onboarding.compelteOnboarding();
		reOpenApp();
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 20);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube());
		clickBtn(bottomNavigationBar.getBottomCircleFirstOption());
		
		//verification left
		//internet off method needed
		
		
	}
}
