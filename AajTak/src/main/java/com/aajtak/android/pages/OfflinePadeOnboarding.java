package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OfflinePadeOnboarding {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public OfflinePadeOnboarding(AndroidDriver<AndroidElement> aDriver) {
		OfflinePadeOnboarding.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_offline_reading_feature")
	private AndroidElement OfflinePadeTxt;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/img_skip")
	private AndroidElement aageBadeArrow;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_skip")
	private AndroidElement aageBadeTxt;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_more_settings")
	private AndroidElement anyaSetting;

	public AndroidElement getOfflinePadeTxt() {
		return OfflinePadeTxt;
	}
	public AndroidElement getAnyaSetting() {
		return anyaSetting;
	}
	public AndroidElement getAageBade() {
		return aageBadeTxt;
	}
	public AndroidElement getAageBadeArrow() {
		return aageBadeArrow;
	}

}
