package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DailyHighlights {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public DailyHighlights(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='डेली हाइलाइट्स']")
	private AndroidElement dailyhighlights;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_news_wrap_title")
	private AndroidElement newswraptitle1;

	@AndroidFindBy(id="in.AajTak.headlines:id/tv_newswrap_count")
	private AndroidElement newswrapcount;

	@AndroidFindBy(id="in.AajTak.headlines:id/ic_up_arrow")
	private AndroidElement swipeup;

	@AndroidFindBy(id="in.AajTak.headlines:id/ic_share")
	private AndroidElement shareicon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_newswrap_close")
	private AndroidElement closeBtn;
	
	public AndroidElement getDailyhighlights() {
		return dailyhighlights;
	}
	
	public AndroidElement getNewswarptitle() {
		return newswraptitle1;
	}
	public AndroidElement getNewswarpCount() {
		return newswrapcount;
	}
	public AndroidElement getSwipeUpBtn() {
		return swipeup;
	}
	public AndroidElement getShareButton() {
		return shareicon;
	}
	public AndroidElement getCloseBtn() {
		return closeBtn;
	}
	
}
