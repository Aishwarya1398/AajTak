package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Settings {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public Settings(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement settingsPageTitle;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/notification_settings']//android.widget.TextView")
	private AndroidElement notification;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/toggle_notification' and @text='OFF']")
	private AndroidElement notificationToggleOff;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/toggle_notification' and @text='ON']")
	private AndroidElement notificationToggleOn;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/saved_content']//android.widget.TextView")
	private AndroidElement offlinePade;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/download_image']//android.widget.TextView")
	private AndroidElement imageDownloadKaren;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/autoplay']//android.widget.TextView")
	private AndroidElement videoAutoPlay;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/toggle_auto_play' and @text='OFF']")
	private AndroidElement videoAutoPlayToggleOff;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/toggle_auto_play' and @text='ON']")
	private AndroidElement videoAutoPlayToggleOn;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/customize_section']//android.widget.TextView")
	private AndroidElement customizeSection;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/widget_settings']//android.widget.TextView")
	private AndroidElement widgetSettings;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/clear_app']//android.widget.TextView")
	private AndroidElement appMemoryClearKaren;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/rate_app']//android.widget.TextView")
	private AndroidElement appRatingKaren;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/share_app']//android.widget.TextView")
	private AndroidElement appShareKaren;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/feedback']//android.widget.TextView")
	private AndroidElement feedBack;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/version']//android.widget.TextView")
	private AndroidElement appVersion;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/privacy']//android.widget.TextView")
	private AndroidElement privacyPolicy;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/terms']//android.widget.TextView")
	private AndroidElement sevaKiSharte;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title' and @text='सेटिंग्स']" )
	 private AndroidElement settingsVerificationTitle;
	 

	
	public static AndroidDriver<AndroidElement> getaDriver() {
		return aDriver;
	}
	
	public AndroidElement getSettingsPageTitle() {
		return settingsPageTitle;
	}

	public AndroidElement getVideoAutoPlayToggleOn() {
		return videoAutoPlayToggleOn;
	}

	public AndroidElement getSettingsVerificationTitle() {
		return settingsVerificationTitle;
	}

	public AndroidElement getNotification() {
		return notification;
	}
	
	public AndroidElement getNotificationToggleOff() {
		return notificationToggleOff;
	}
	
	public AndroidElement getNotificationToggleOn() {
		return notificationToggleOn;
	}
	
	public AndroidElement getOfflinePade() {
		return offlinePade;
	}
	
	public AndroidElement getImageDownloadKaren() {
		return imageDownloadKaren;
	}
	
	public AndroidElement getVideoAutoPlay() {
		return videoAutoPlay;
	}
	
	public AndroidElement getVideoAutoPlayToggleOff() {
		return videoAutoPlayToggleOff;
	}
	
	public AndroidElement getvideoAutoPlayToggleOn() {
		return videoAutoPlayToggleOn;
	}
	
	public AndroidElement getCustomizeSection() {
		return customizeSection;
	}
	
	public AndroidElement getWidgetSettings() {
		return widgetSettings;
	}
	
	public AndroidElement getAppMemoryClearKaren() {
		return appMemoryClearKaren;
	}
	
	public AndroidElement getAppRatingKaren() {
		return appRatingKaren;
	}
	
	public AndroidElement getAppShareKaren() {
		return appShareKaren;
	}
	
	public AndroidElement getFeedBack() {
		return feedBack;
	}
	
	public AndroidElement getAppVersion() {
		return appVersion;
	}
	
	public AndroidElement getPrivacyPolicy() {
		return privacyPolicy;
	}
	
	public AndroidElement getSevaKiSharte() {
		return sevaKiSharte;
	}
	
	public AndroidElement getBackArrowButton() {
    	return backArrowButton;
    }
	
}
