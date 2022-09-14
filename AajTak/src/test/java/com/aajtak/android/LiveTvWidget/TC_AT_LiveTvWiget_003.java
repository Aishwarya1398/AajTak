package com.aajtak.android.LiveTvWidget;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

/**
 * Date : 6 July 2021 This is Live TV module of AajTak Application
 * 
 * Description: Verify that user is able to view Live TV Share options. Tap on
 * the share icon at the top of the widget. User should be able to view the
 * share options.
 * 
 * @author Archana George
 * @version dev 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_LiveTvWiget_003 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that user is able to view Live TV Share options")
	public void AT_LiveTvWiget_003() throws Exception {

		launchApp();
		compelteOnboarding();
		waitTillElementPresent(liveTvWidget.getLiveTvWidget(), 20);
		isElementExist(liveTvWidget.getWidgetShareIcon(), "Widget Share icon");
		clickBtn(liveTvWidget.getWidgetShareIcon(), "Share icon");
		waitTillElementPresent(share.getShareCancel(), 10);
		List<AndroidElement> optionText = share.getShareOptionHighlights();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
		uninstallApp();
		installProdApp();
		minWait();
	}
}
