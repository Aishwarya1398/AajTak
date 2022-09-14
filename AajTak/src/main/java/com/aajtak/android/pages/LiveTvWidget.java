package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveTvWidget {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public LiveTvWidget(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/exo_overlay']")
	private AndroidElement liveTvWidget ;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/exo_ad_overlay")
	private AndroidElement liveTvWidgetSize ;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/videoContainerLayout")
	private AndroidElement containerSize ;
	
	
	
	public AndroidElement getContainerSize() {
		return containerSize;
	}

	public AndroidElement getLiveTvWidgetSize() {
		return liveTvWidgetSize;
	}

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='in.AajTak.headlines:id/iv_play_pause_button']")
	private AndroidElement playPauseIcon ;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=in.AajTak.headlines:id/iv_mute_button]")
	private AndroidElement muteIcon ;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/iv_widget_share")
	private AndroidElement widgetShareIcon;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/iv_widget_option")
	private AndroidElement widgetOptions;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/tv_widget_type")
	private AndroidElement widgetHeader;

	public AndroidElement getLiveTvWidget() {
		return liveTvWidget;
	}

	public AndroidElement getPlayPauseIcon() {
		return playPauseIcon;
	}

	public AndroidElement getMuteIcon() {
		return muteIcon;
	}

	public AndroidElement getWidgetShareIcon() {
		return widgetShareIcon;
	}

	public AndroidElement getWidgetOptions() {
		return widgetOptions;
	}

	public AndroidElement getWidgetHeader() {
		return widgetHeader;
	}

}
