package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Share {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public Share(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(id="in.AajTak.headlines:id/ic_share")
	private AndroidElement shareIcon;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_facebook")
	private AndroidElement faceBookShare;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_whatsapp")
	private AndroidElement whatsAppShare;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_twitter")
	private AndroidElement twitterShare;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_other")
	private AndroidElement otherShare;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_cancel")
	private AndroidElement shareCancel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='के जरिये शेयर करें']")
	private AndroidElement anyaShareText;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/design_bottom_sheet']//android.widget.TextView")
	private List<AndroidElement> shareOptionHighlights;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
	private List<AndroidElement> anyaShareOptions;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private AndroidElement whatsappBack;
	
	public AndroidElement getWhatsappBack() {
		return whatsappBack;
	}

	public AndroidElement getShareIcon() {
		return shareIcon;
	}
	
	public AndroidElement getFaceBookShare() {
		return faceBookShare;
	}
	
	public AndroidElement getWhatsAppShare() {
		return whatsAppShare;
	}
	
	public AndroidElement getTwitterShare() {
		return twitterShare;
	}
	
	public AndroidElement getShareCancel() {
		return shareCancel;
	}
	
	public AndroidElement getOtherShare() {
		return otherShare;
	}
	
	public AndroidElement getAnyaShareText() {
		return anyaShareText;
	}
	
	public List<AndroidElement> getShareOptionHighlights() {
		return shareOptionHighlights;
	}
	
	public List<AndroidElement> getAnyaShareOptions() {
		return anyaShareOptions;
	}
}
