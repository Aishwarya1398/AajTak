package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BottomNavigationBar {
	
public static AndroidDriver<AndroidElement> aDriver;
	
	public BottomNavigationBar(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath ="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/fab_india_today']")
	private AndroidElement bottomNavigateRoundCube;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_top_news']")
	private AndroidElement badiKhabrein;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_watch_now']")
	private AndroidElement liveTv;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/circle_menu_title1']")
	private AndroidElement bottomCircleFirstOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/circle_menu_title2']")
	private AndroidElement bottomCircleSecondOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/circle_menu_title3']")
	private AndroidElement bottomCircleThirdOption;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='à¤•à¥‹à¤°à¥‹à¤¨à¤¾ à¤Ÿà¥�à¤°à¥ˆà¤•à¤° (à¤­à¤¾à¤°à¤¤)']")
	private AndroidElement thirdOptionDetailPage;
	
	 @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/fab_india_today']")
     private AndroidElement navigationBarCloseButton;
	
	public AndroidElement getNavigationBarCloseButton() {
		return navigationBarCloseButton;
	}

	public AndroidElement getBottomNavigateRoundCube() {
		return bottomNavigateRoundCube;
	}
	
	public AndroidElement getBadiKhabrein() {
		return badiKhabrein;
	}
	
	public AndroidElement getLiveTv() {
		return liveTv;
	}
	 
	public AndroidElement getBottomCircleFirstOption() {
		return bottomCircleFirstOption;
	}
	
	public AndroidElement getBottomCircleSecondOption() {
		return bottomCircleSecondOption;
	}
	
	public AndroidElement getBottomCircleThirdOption() {
		return bottomCircleThirdOption;
	}

}
