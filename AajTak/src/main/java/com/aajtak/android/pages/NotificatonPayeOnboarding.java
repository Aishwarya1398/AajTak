package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotificatonPayeOnboarding {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public NotificatonPayeOnboarding(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/indicator']//android.view.View[@index=1]")
	private AndroidElement notificationPageIndicator;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/indicator']//android.view.View[@index=1]")
	private AndroidElement autoplayPageIndicator;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/indicator']//android.view.View[@index=2]")
	private AndroidElement offlinePageIndicator;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/indicator']//android.view.View[@index=3]")
	private AndroidElement preferenceScreenIndicator;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_skip")
	private AndroidElement aageBadeTxt;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/img_skip")
	private AndroidElement aageBadeArrow;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_notification_info")
	private AndroidElement notificationPayeTxt;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/enableNotificationToggleButton")
	private AndroidElement notificationPayeToggle;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_more_settings")
	private AndroidElement anyaSetting;
	
	public AndroidElement getNotificationPageIndicator() {
		return notificationPageIndicator;
	}
	public AndroidElement getAutoplayPageIndicator() {
		return autoplayPageIndicator;
	}
	public AndroidElement getOfflinePageIndicator() {
		return offlinePageIndicator;
	}
	public AndroidElement getPreferenceScreenIndicator() {
		return preferenceScreenIndicator;
	}
	public AndroidElement getAageBade() {
		return aageBadeTxt;
	}
	public AndroidElement getAageBadeArrow() {
		return aageBadeArrow;
	}
	public AndroidElement getNotificationPayeTxt() {
		return notificationPayeTxt;
	}
	public AndroidElement getNotificationPayeToggle() {
		return notificationPayeToggle;
	}
	public AndroidElement getAnyaSetting() {
		return anyaSetting;
	}
}
