package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InArticleLink {
	
	public static AndroidDriver<AndroidElement> aDriver;
	
	public InArticleLink(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_article_title")
	private AndroidElement inarticleStoryHeader;
	
	@AndroidFindBy( accessibility = "Navigate up")
    private AndroidElement navigateback;

	public AndroidElement getInarticleStoryHeader() {
		return inarticleStoryHeader;
	}

	public AndroidElement getNavigateback() {
		return navigateback;
	}
	
	

}
