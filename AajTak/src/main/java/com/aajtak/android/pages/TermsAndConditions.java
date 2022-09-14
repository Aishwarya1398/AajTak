package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TermsAndConditions {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public TermsAndConditions(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.webkit.WebView//android.view.View[@index=1]")
	private AndroidElement termsAndConditons;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}

	public AndroidElement getTermsAndConditons() {
		return termsAndConditons;
	}

}
