package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PhotoDetail {

	public static AndroidDriver<AndroidElement> aDriver;

	public PhotoDetail(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/large_thumbnail']")
    private AndroidElement photoGalleryScreen;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/btn_okay")
	private AndroidElement tikeSamajAgaya;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/img_count']")
	private AndroidElement imageCountInPhotoDetail;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/photo_source']")
	private AndroidElement imageGallerySource;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/photo_desc']")
	private AndroidElement photoDescription;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/photo_title']")
	private AndroidElement photoTitle;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_slide_show']")
	private AndroidElement slideShowIcon;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_close']")
	private AndroidElement closeGallery;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_auto_play']")
	private AndroidElement nextGalleryPlayButton;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/btn_next_gallery']")
	private AndroidElement nextGalleryTab;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_bookmark")
	private AndroidElement bookmarkIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_offline")
	private AndroidElement downloadIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_share")
	private AndroidElement shareIcon;
	
	public AndroidElement getPhotoGalleryScreen() {
		return photoGalleryScreen;
	}	
		
	public AndroidElement getTikeSamajAgaya() {
		return tikeSamajAgaya;
	}
	
	public AndroidElement getImageCountInPhotoDetail() {
		return imageCountInPhotoDetail;
	}
	public AndroidElement getimageGallerySource() {
		return imageGallerySource;
	}
		
	public AndroidElement getphotoDescription() {
		return photoDescription;
	}
	
	public AndroidElement getphotoTitle() {
		return photoTitle;
	}
	
	public AndroidElement getSlideShowIcon() {
		return slideShowIcon;
	}
	
	public AndroidElement getCloseGallery() {
		return closeGallery;
	}
	
	public AndroidElement getNextGalleryPlayButton() {
		return nextGalleryPlayButton;
	}
	
	public AndroidElement getNextGalleryTab() {
		return nextGalleryTab;
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

}
