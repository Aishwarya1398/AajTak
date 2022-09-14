package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Logout {

	public static AndroidDriver<AndroidElement> aDriver;

	public Logout(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='लॉगआउट']")
	private AndroidElement logout;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private AndroidElement cancel;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private AndroidElement logoutTap;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
	private AndroidElement aletrtTitleOnLogout;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement aletrtMessageOnOnLogout;

	
	
	public AndroidElement getAletrtTitleOnLogout() {
		return aletrtTitleOnLogout;
	}

	public AndroidElement getAletrtMessageOnOnLogout() {
		return aletrtMessageOnOnLogout;
	}

	public AndroidElement getLogout() {
		return logout;
	}

	public AndroidElement getCancel() {
		return cancel;
	}

	public AndroidElement getLogoutOnAlertPopUp() {
		return logoutTap;
	}
	
	public AndroidElement getToastMsg() {
		return toastmsg;
	}

}
