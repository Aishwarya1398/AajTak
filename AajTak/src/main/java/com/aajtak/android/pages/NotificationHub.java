package com.aajtak.android.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NotificationHub {
	
	public NotificationHub(AndroidDriver<AndroidElement> aDriver) {
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='नोटिफिकेशन']")
	private AndroidElement TitleInNotificationHub;
	
	public AndroidElement getTitleInNotificationHub() {
		return TitleInNotificationHub;
	}

}
