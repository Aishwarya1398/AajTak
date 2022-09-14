package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Comments {
	
public static AndroidDriver<AndroidElement> aDriver;
	
	public Comments(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(id="in.AajTak.headlines:id/tv_count")
	private AndroidElement commentTextHeading;

	@AndroidFindBy(id = "in.AajTak.headlines:id/rlayout")
	private AndroidElement commentScreen;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_close")
	private AndroidElement closeCommentsScreen;

	public AndroidElement getCommentTextHeading() {
		return commentTextHeading;
	}
	
	public AndroidElement getCommentScreen() {
		return commentScreen;
	}

	public AndroidElement getCloseCommentsScreen() {
		return closeCommentsScreen;
	}

	

}
