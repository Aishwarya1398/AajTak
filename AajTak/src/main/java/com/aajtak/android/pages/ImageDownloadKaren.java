package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ImageDownloadKaren {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public ImageDownloadKaren(AndroidDriver<AndroidElement> aDriver) {
		ImageDownloadKaren.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	/*
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/activity_main']//android.widget.LinearLayout[@index=0]//android.widget.TextView)[1]")
	 * private AndroidElement imageDownload_2G;
	 */
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2जी']")
	private AndroidElement imageDownload_2G;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/togglebtn_2g' and @text='OFF']")
	private AndroidElement two_G_ToggleOff;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/togglebtn_2g' and @text='ON']")
	private AndroidElement two_G_ToggleOn;
	
	/*
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/activity_main']//android.widget.LinearLayout[@index=2]//android.widget.TextView)[1]")
	 * private AndroidElement imageDownload_3G_4G;
	 */
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3जी/4जी']")
	private AndroidElement imageDownload_3G_4G;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/togglebtn_3g' and @text='OFF']")
	private AndroidElement three_G_ToggleOff;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/togglebtn_3g' and @text='ON']")
	private AndroidElement three_G_ToggleOn;
	
	/*
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/activity_main']//android.widget.LinearLayout[@index=4]//android.widget.TextView)[1]")
	 * private AndroidElement imageDownload_wifi;
	 */
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाई फाई']")
	private AndroidElement imageDownload_wifi;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/toggle_wifi' and @text='OFF']")
	private AndroidElement wifiToggleOff;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/toggle_wifi' and @text='ON']")
	private AndroidElement wifiToggleOn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2जी']|//android.widget.TextView[@text='3जी/4जी']|//android.widget.TextView[@text='वाई फाई']|//android.widget.Switch")
	private List<AndroidElement> TextAndSwitchInImageDownload;

	public List<AndroidElement> getTextAndSwitchInImageDownload() {
		return TextAndSwitchInImageDownload;
	}
	
	public AndroidElement getTwo_G(){
		return imageDownload_2G;
	}
	
	public AndroidElement getTwo_G_ToggleOff() {
		return two_G_ToggleOff;
	}
	
	public AndroidElement getTwo_G_ToggleOn() {
		return two_G_ToggleOn;
	}
	
	public AndroidElement getThree_Four_G(){
		return imageDownload_3G_4G;
	}
	
	public AndroidElement getThree_G_ToggleOff() {
		return three_G_ToggleOff;
	}
	
	public AndroidElement getThree_G_ToggleOn() {
		return three_G_ToggleOn;
	}
	
	public AndroidElement getWifi() {
		return imageDownload_wifi;
	}
	
	public AndroidElement getWifiToggleOff() {
		return wifiToggleOff;
	}
	
	public AndroidElement getWifiToggleOn() {
		return wifiToggleOn;
	}
	
	public AndroidElement getBackArrowButton() {
    	return backArrowButton;
    }


}
