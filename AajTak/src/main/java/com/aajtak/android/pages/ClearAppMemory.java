package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClearAppMemory {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public ClearAppMemory(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
	private AndroidElement aletrtTitleOnClearAppMemory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement aletrtMessageOnClearAppMemory;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private AndroidElement haanOptionForClearAppMemory;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private AndroidElement  nahiOptionForClearAppMemory;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	public AndroidElement getToastmsg() {
		return toastmsg;
	}

	public AndroidElement getAletrtTitleOnClearAppMemory() {
		return aletrtTitleOnClearAppMemory;	
	}
	
	public AndroidElement getAletrtMessageOnClearAppMemory() {
		return aletrtMessageOnClearAppMemory;	
	}
	
	public AndroidElement getNahiOptionForClearAppMemory() {
		return nahiOptionForClearAppMemory;
	}
	
	public AndroidElement getHaanOptionForClearAppMemory() {
		return haanOptionForClearAppMemory;	
	}
	
}
