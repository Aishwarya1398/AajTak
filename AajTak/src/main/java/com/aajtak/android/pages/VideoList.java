package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VideoList {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public VideoList(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/header_view']//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_title'])[1]")
    private AndroidElement videoTitle;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_comment")
	private AndroidElement commentIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_bookmark")
	private AndroidElement bookmarkIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_download")
	private AndroidElement downloadIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_share")
	private AndroidElement shareIcon;

	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_refresh_text")
	private AndroidElement refreshedText;

	@AndroidFindBy(id = "in.AajTak.headlines:id/lav_refresh")
	private AndroidElement refreshingText;

	@AndroidFindBy(id = "in.AajTak.headlines:id/news_date")
	private AndroidElement videodate;

	

	public AndroidElement getCommentIcon() {
		return commentIcon;
	}

	public AndroidElement getBookmarkIcon() {
		return bookmarkIcon;
	}

	public AndroidElement getDownloadIcon() {
		return downloadIcon;
	}

	public AndroidElement getShareIcon() {
		return shareIcon;
	}

	public AndroidElement getToastmsg() {
		return toastmsg;
	}

	public AndroidElement getRefreshedText() {
		return refreshedText;
	}

	public AndroidElement getRefreshingText() {
		return refreshingText;
	}

	public AndroidElement getVideodate() {
		return videodate;
	}
	
	public AndroidElement getVideoTitle() {
		return videoTitle;
	}
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//androidx.appcompat.app.ActionBar.Tab[@index=3]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement fourthSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//androidx.appcompat.app.ActionBar.Tab[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement firstSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//androidx.appcompat.app.ActionBar.Tab[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement thirdSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//androidx.appcompat.app.ActionBar.Tab[@index=4]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement fifthSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//androidx.appcompat.app.ActionBar.Tab[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement secondSubCategory;
	

	public AndroidElement getFirstSubCategory() {
		return firstSubCategory;
	}

	public AndroidElement getThirdSubCategory() {
		return thirdSubCategory;
	}

	public AndroidElement getFifthSubCategory() {
		return fifthSubCategory;
	}

	public AndroidElement getSecondSubCategory() {
		return secondSubCategory;
	}

	public AndroidElement getFourthSubCategory() {
		return fourthSubCategory;
	}
	

}
