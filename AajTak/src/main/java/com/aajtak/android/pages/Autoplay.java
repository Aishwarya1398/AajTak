package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Autoplay {
	
	public static AndroidDriver<AndroidElement> aDriver;
	
	public Autoplay(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/toggleButton1")
	private AndroidElement autoplayToggleBtn;

	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_video_info")
	private AndroidElement autoPlayTxt;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/img_skip")
	private AndroidElement aageBadeArrow;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_skip")
	private AndroidElement aageBadeTxt;

	public AndroidElement getAutoplayToggleBtn() {
		return autoplayToggleBtn;
	}
	public AndroidElement getAutoPlayTxt() {
		return autoPlayTxt;
	}
	public AndroidElement getAageBade() {
		return aageBadeTxt;
	}
	public AndroidElement getAageBadeArrow() {
		return aageBadeArrow;
	}

}
