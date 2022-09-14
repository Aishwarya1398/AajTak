package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomescreenWalkthrough {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public HomescreenWalkthrough(AndroidDriver<AndroidElement> aDriver) {
		HomescreenWalkthrough.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_pullDown")
	private AndroidElement pullDownBtn;

	public AndroidElement getPullDownBtn() {
		return pullDownBtn;
	}

}
