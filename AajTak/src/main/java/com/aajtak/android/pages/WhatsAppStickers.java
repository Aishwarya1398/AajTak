package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WhatsAppStickers {

	public static AndroidDriver<AndroidElement> aDriver;
	
	public WhatsAppStickers(AndroidDriver<AndroidElement> aDriver) {
		WhatsAppStickers.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_packname']")
	private AndroidElement stickerHeading;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/sticker_share']")
	private AndroidElement shareIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_add_to_wtsp']")
	private AndroidElement shareOnWhatsApp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_otherStickers']")
	private AndroidElement anyaSticker;
	
	@AndroidFindBy(xpath = "//android.widget.GridView[@resource-id='in.AajTak.headlines:id/stickerdetailGridview']")
	private AndroidElement featuredStickerGrid;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_ad_text']")
	private AndroidElement ads;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement downloadingStickers;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Already added']")
	private AndroidElement alreadyadded;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.whatsapp:id/message_text_view']")
	private AndroidElement stickerAddedMessage;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.whatsapp:id/add_button']")
	private AndroidElement add;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.whatsapp:id/cancel_button']")
	private AndroidElement cancel;
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/viewAll']")
	private AndroidElement viewAll;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/packname']")
	private AndroidElement whatsAppStickPacket;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/packname']")
	private List<AndroidElement> whatsAppStickAllPackets;
	
	
	
	public AndroidElement getWhatsAppStickPacket() {
		return whatsAppStickPacket;
	}
	
	
	public List<AndroidElement> getWhatsAppStickAllPackets() {
		return whatsAppStickAllPackets;
	}
	
	
	public AndroidElement getViewAll() {
		return viewAll;
	}
	
	
	
	
	public AndroidElement getAdd() {
		return add;
	}
	
	public AndroidElement getCancel() {
		return cancel;
	}
	
	public AndroidElement getFeaturedStickerGrid() {
		return featuredStickerGrid;
	}
	
	
	public AndroidElement getStickerPopUpMessage() {
		return stickerAddedMessage;
	}
	
	public AndroidElement getAlreadyadded() {
		return alreadyadded;
	}
	
	public AndroidElement getDownloadingStickers() {
		return downloadingStickers;
	}
	public AndroidElement getAnyaSticker() {
		return anyaSticker;
	}
	
	public AndroidElement getAds() {
		return ads;
	}
	
	
	public AndroidElement getshareOnWhatsApp() {
		return shareOnWhatsApp;
	}
	
	
	public AndroidElement getShareIcon() {
		return shareIcon;
	}
	public AndroidElement getstickerHeading() {
		return stickerHeading;
	}
	
}
