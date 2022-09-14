package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PermssionMessage {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public PermssionMessage(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private AndroidElement allowBtn;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private AndroidElement locationpermission;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	private AndroidElement denyBtn;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_message")
	private AndroidElement locationPermissionMessage;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_icon")
	private AndroidElement locationPermissionIcon;

	public AndroidElement getAllowBtn() {
		return allowBtn;
	}

	public AndroidElement getDenyBtn() {
		return denyBtn;
	}

	public AndroidElement getLocationPermissionMessage() {
		return locationPermissionMessage;
	}

	public AndroidElement getLocationPermissionIcon() {
		return locationPermissionIcon;
	}

}
