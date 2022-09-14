package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OtherAppsFromIndiaToday {

	public static AndroidDriver<AndroidElement> aDriver;

	public OtherAppsFromIndiaToday(AndroidDriver<AndroidElement> aDriver) {
		OtherAppsFromIndiaToday.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='इंडिया टुडे ग्रुप के अन्य ऐप्स']")
	private AndroidElement otherAppsIndiaToday;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='India Today']")
	private AndroidElement indiaTodayApp;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_app_rating']")
	private AndroidElement indiaTodayAppRating;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Today']")
	private AndroidElement businessTodayApp;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index=1 and @resource-id='in.AajTak.headlines:id/other_apps_view']//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_app_rating']")
	private AndroidElement businessTodayAppRating;	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='The Lallantop']")
	private AndroidElement theLallantopApp;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index=2 and @resource-id='in.AajTak.headlines:id/other_apps_view']//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_app_rating']")
	private AndroidElement theLallantopAppRating;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Google Play Store']")
	private AndroidElement googlePlayStore;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TV Today Network Limited']")
	private AndroidElement tvTodayNewtworkLimited;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;


	public AndroidElement getOtherAppsFromIndiaToday() {
		return otherAppsIndiaToday;
	}

	public AndroidElement getIndiaTodayApp() {
		return indiaTodayApp;
	}

	public AndroidElement getIndiaTodayAppRating() {
		return indiaTodayAppRating;
	}

	public AndroidElement getBusinessTodayApp() {
		return businessTodayApp;
	}

	public AndroidElement getBusinessTodayAppRating() {
		return businessTodayAppRating;
	}

	public AndroidElement getTheLallantopApp() {
		return theLallantopApp;
	}

	public AndroidElement getTheLallantopAppRating() {
		return theLallantopAppRating;
	}

	public AndroidElement getGooglePlayStore() {
		return googlePlayStore;
	}

	public AndroidElement getTvTodayNewtworkLimited() {
		return tvTodayNewtworkLimited;
	}

	public AndroidElement getArrowButton() {
		return backArrowButton;
	}


}
