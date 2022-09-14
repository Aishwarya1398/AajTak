package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgotPassword {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public ForgotPassword(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement passwordBhulGayeText;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/userId']")
	private AndroidElement emailOrPhone;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/btn_rst']")
	private AndroidElement okayButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_close']")
	private AndroidElement closeIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/info_tv']")
	private AndroidElement verificationNum_Email_text;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/notp_tv']")
	private AndroidElement OTPnahiMila;
	
	@AndroidFindBy(xpath = "//android.widget.TextView{@resource-id='in.AajTak.headlines:id/resend_in_tv']")
	private AndroidElement resendOTP;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement forgotPasswordTitle;
	
	public AndroidElement getPasswordBhulGayeText() {
		return passwordBhulGayeText;
	}
	
	public AndroidElement getEmailOrPhone() {
		return emailOrPhone;
	}
	
	public AndroidElement getOkayButton() {
		return okayButton;
	}
	
	public AndroidElement getVerificationNum_Email_text() {
		return verificationNum_Email_text;
	}
	
	public AndroidElement getOTPnahiMila() {
		return OTPnahiMila;
	}
	
	public AndroidElement getResendOTP() {
		return resendOTP;
	}
	
	public AndroidElement getCloseIcon() {
		return closeIcon;
	}
	
	public AndroidElement getBackArrowButton() {
    	return backArrowButton;
    }
	

	public AndroidElement getforgotPasswordTitle() {
		return forgotPasswordTitle;
	}

}
