package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewProfile {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public ViewProfile(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/signup_body']")
	private AndroidElement viewProfile;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_mydownloads']")
	private AndroidElement myDownloadContent;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_mybookmarks']")
	private AndroidElement myBookmark;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/img_download")
	private AndroidElement myDownloadContentIcon;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/img_bookmark")
	private AndroidElement myBookmarkContentIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/overflow']")
	private AndroidElement actionOverFlow;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_edit_profile']")
	private AndroidElement editProfile;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_name']")
	private AndroidElement userName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_place']")
	private AndroidElement userPlace;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/message_profile_image']")
	private AndroidElement profileImage;

	public static AndroidDriver<AndroidElement> getaDriver() {
		return aDriver;
	}
	public AndroidElement getViewProfile() {
		return viewProfile;
	}

	public AndroidElement getMyDownloadContent() {
		return myDownloadContent;
	}

	public AndroidElement getMyBookmark() {
		return myBookmark;
	}
	
	public AndroidElement getMyDownloadContentIcon() {
		return myDownloadContentIcon;
	}
	public AndroidElement getMyBookmarkContentIcon() {
		return myBookmarkContentIcon;
	}

	public AndroidElement getActionOverFlow() {
		return actionOverFlow;
	}

	public AndroidElement getEditProfile() {
		return editProfile;
	}

	public AndroidElement getUserName() {
		return userName;
	}

	public AndroidElement getUserPlace() {
		return userPlace;
	}

	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}

	public AndroidElement getProfileImage() {
		return profileImage;
	}
	
}
