package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_004 extends Aajtak_app_Util {
	// 404
	@Test(description = "Access the Podcast under bottom navigation bar when data is off -'Aap abhi offline hai' message should be displayed")
	public void AT_BNB_004() throws Exception {
		//launchApp();
		//compelteOnboarding();
		reOpenApp();
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube());
		isElementExist(bottomNavigationBar.getBottomCircleSecondOption(), "Podcast");
		clickBtn(bottomNavigationBar.getBottomCircleSecondOption(), "Podcast");
		aDriver.closeApp();
					// internet off method needed
					// verification left

	}

}
