package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrivacyPolicy {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public PrivacyPolicy(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.webkit.WebView//android.view.View[@index=1]")
	private AndroidElement privacyPOlicyObejectiveAndScope;
	
	public AndroidElement getPrivacyPOlicyObejectiveAndScope() {
		return privacyPOlicyObejectiveAndScope;
	}

}
