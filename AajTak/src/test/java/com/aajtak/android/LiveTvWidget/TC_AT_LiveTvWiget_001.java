package com.aajtak.android.LiveTvWidget;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 6 July 2021
 * 
 * Description: Verify that the live tv is not cropped. This testcase compares
 * the expected dimension of the widget with the actual dimension of the widget.
 * 
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_LiveTvWiget_001 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify that the live tv is not cropped")
	public void AT_LiveTvWiget_001() throws Exception {

		// Launch the App
		launchApp();

		// Complete Onboarding
		compelteOnboarding();

		// Wait till the widget is loaded
		waitTillElementPresent(liveTvWidget.getLiveTvWidget(), 20);

		// Get the actual height of the widget
		int actualheight = liveTvWidget.getLiveTvWidgetSize().getSize().getHeight();

		// Get the actual width of the widget
		int actualwidth = liveTvWidget.getLiveTvWidgetSize().getSize().getWidth();

		// Get the expected height of the widget
		int expectedHeight = liveTvWidget.getContainerSize().getSize().getHeight();

		// Get the expected width of the widget
		int expectedWidth = liveTvWidget.getContainerSize().getSize().getWidth();

		// Validate the width
		verifyTwoSizes(expectedWidth, actualwidth);

		// Validate the height
		verifyTwoSizes(expectedHeight, actualheight);
	}
}
