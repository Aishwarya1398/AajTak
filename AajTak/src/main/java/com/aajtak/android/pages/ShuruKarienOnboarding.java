package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShuruKarienOnboarding {

	public static AndroidDriver<AndroidElement> aDriver;

	public ShuruKarienOnboarding(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/btn_get_started")
	private AndroidElement shuruKarein;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"आगे बढ़ें\"]")
	private AndroidElement AageBado;

	@AndroidFindBy(id = "in.AajTak.headlines:id/app_logo")
	private AndroidElement appLogo;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Aaj Tak']")
	private AndroidElement appIcon;

	public AndroidElement getShuruKarein() {
		return shuruKarein;
	}
	
	public AndroidElement getAageBado() {
		return AageBado;
	}
	
	public AndroidElement getAppIcon() {
		return appIcon;
	}
	public AndroidElement getAppLogo() {
		return appLogo;
	}
}
