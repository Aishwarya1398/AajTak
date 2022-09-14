package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WidgetSettings {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public WidgetSettings(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_widget_title']")
	private AndroidElement scoreCard;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_arrow'])[1]")
	private AndroidElement scoreCardDropDownIcon;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_widget_title']")
	private AndroidElement dailyHighlights;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_arrow'])[2]")
	private AndroidElement dailyHighlightsDropDownIcon;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_widget_title']")
	private AndroidElement liveStreamWidget;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_arrow'])[3]")
	private AndroidElement liveStreamWidgetDropDownIcon;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@index=3]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_widget_title']")
	private AndroidElement iplHighlights;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_arrow'])[4]")
	private AndroidElement iplHighlightsDropDownIconIcon;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_option'])[1]")
	private AndroidElement kabhiNaDikhaye;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/rb_option'])[1]")
	private AndroidElement selectKabhiNaDikhaye;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_option'])[2]")
	private AndroidElement hameshaDikhaye;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/rb_option'])[2]")
	private AndroidElement selectHameshaDikhaye;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_option'])[3]")
	private AndroidElement showOnceIn_24_Hours;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/rb_option'])[3]")
	private AndroidElement selectShowOnceIn_24_Hours;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	public AndroidElement getScoreCard() {
		return scoreCard;
	}
	
	public AndroidElement getScoreCardDropDownIcon() {
		return scoreCardDropDownIcon;
	}
	
	public AndroidElement getDailyHighlights() {
		return dailyHighlights;
	}
	
	public AndroidElement getDailyHighlightsDropDownIcon() {
		return dailyHighlightsDropDownIcon;
	}
	
	public AndroidElement getLiveStreamWidget() {
		return liveStreamWidget;
	}
	
	public AndroidElement getLiveStreamWidgetDropDownIcon() {
		return liveStreamWidgetDropDownIcon;
	}
	
	public AndroidElement getIplHighlights() {
		return iplHighlights;
	}
	
	public AndroidElement getIplHighlightsDropDownIconIcon() {
		return iplHighlightsDropDownIconIcon;
	}
	
	public AndroidElement getKabhiNaDikhaye() {
		return kabhiNaDikhaye;
	}
	
	public AndroidElement getSelectKabhiNaDikhaye() {
		return selectKabhiNaDikhaye;
	}
	
	public AndroidElement getHameshaDikhaye() {
		return hameshaDikhaye;
	}

	public AndroidElement getSelectHameshaDikhaye() {
		return selectHameshaDikhaye;
	}
	
	public AndroidElement getShowOnceIn_24_Hours() {
		return showOnceIn_24_Hours;
	}
	
	public AndroidElement getSelectShowOnceIn_24_Hours() {
		return selectShowOnceIn_24_Hours;
	}
	
	public AndroidElement getBackArrowButton() {
    	return backArrowButton;
    }
}
