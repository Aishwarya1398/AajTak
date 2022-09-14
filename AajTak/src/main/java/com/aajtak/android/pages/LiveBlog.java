package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveBlog {
	
	public static AndroidDriver<AndroidElement> aDriver;
	
	public LiveBlog(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBlogTitle' and @index=1]")
	private AndroidElement liveBlogTitle;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index=0]//android.widget.TextView[@index=1 and @resource-id='in.AajTak.headlines:id/tvBlogTime']")
	private AndroidElement firstBlogTime;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index=3]//android.view.ViewGroup[@index=0]//android.widget.TextView[@index=2 and @resource-id='in.AajTak.headlines:id/tvBlogDes']")
	private AndroidElement firstBlogDescription;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index=1]//android.widget.TextView[@index=1 @resource-id='in.AajTak.headlines:id/tvBlogTime']")
	private AndroidElement secondBlogTime;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index=3]//android.view.ViewGroup[@index=1]//android.widget.TextView[@index=2 and @resource-id='in.AajTak.headlines:id/tvBlogDes']")
	private AndroidElement secondBlogDescription;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index=2]//android.widget.TextView[@index=1 and @resource-id='in.AajTak.headlines:id/tvBlogTime']")
	private AndroidElement thirdBlogTime;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index=3]//android.view.ViewGroup[@index=2]//android.widget.TextView[@index=2 and @resource-id='in.AajTak.headlines:id/tvBlogDes']")
	private AndroidElement thirdBlogDescription;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index=3]//android.widget.TextView[@index=1 and @resource-id='in.AajTak.headlines:id/tvBlogTime']")
	private AndroidElement fourthBlogTime;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index=3]//android.view.ViewGroup[@index=3]//android.widget.TextView[@index=2 and @resource-id='in.AajTak.headlines:id/tvBlogDes']")
	private AndroidElement fourthBlogDescription;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup[@index=4]//android.widget.TextView[@index=1 and @resource-id='in.AajTak.headlines:id/tvBlogTime']")
	private AndroidElement fifthBlogTime;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index=3]//android.view.ViewGroup[@index=4]//android.widget.TextView[@index=2 and @resource-id='in.AajTak.headlines:id/tvBlogDes']")
	private AndroidElement fifthBlogDescription;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index=3]//android.view.ViewGroup[@index=5]//android.widget.TextView[@index=2 and @resource-id='in.AajTak.headlines:id/tvBlogDes']")
	private AndroidElement sixthBlogDescription;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_widget_share']")
	private AndroidElement blogShare;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement detailBlogTitle;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/button_new_blog_item_update']")
	private AndroidElement updateLiveBlog;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_article_title']")
	private AndroidElement liveBlogHeading;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_article_date_and_location']")
	private AndroidElement liveBlogDate;
	
	public AndroidElement getLiveBlogTitle() {
		return liveBlogTitle;
	}
	
	public AndroidElement getFirstBlogTime() {
		return firstBlogTime;
	}
	
	public AndroidElement getFirstBlogDescription() {
		return firstBlogDescription;
	}
	
	public AndroidElement getSecondBlogTime() {
		return secondBlogTime;
	}
	
	public AndroidElement getSecondBlogDescription() {
		return secondBlogDescription;
	}
	
	public AndroidElement getThirdBlogTime() {
		return thirdBlogTime;
	}
	
	public AndroidElement getThirdBlogDescription() {
		return thirdBlogDescription;
	}
	
	public AndroidElement getFourthBlogTime() {
		return fourthBlogTime;
	}
	
	public AndroidElement getFourthBlogDescription() {
		return fourthBlogDescription;
	}
	
	public AndroidElement getFifthBlogTime() {
		return fifthBlogTime;
	}
	
	public AndroidElement getFifthBlogDescription() {
		return fifthBlogDescription;
	}

	public AndroidElement getSixthBlogDescription() {
		return sixthBlogDescription;
	}
	
	public AndroidElement getBlogShare() {
		return blogShare;
	}
	
	public AndroidElement getDetailBlogTitle() {
		return detailBlogTitle;
	}
	
	public AndroidElement getUpdateLiveBlog() {
		return updateLiveBlog;
	}
	
	public AndroidElement getLiveBlogHeading() {
		return liveBlogHeading;
	}
	
	public AndroidElement getLiveBlogDate() {
		return liveBlogDate;
	}
	

}
