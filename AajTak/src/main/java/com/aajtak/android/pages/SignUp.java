package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUp {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public SignUp(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_firstname']")
	private AndroidElement firstName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_username']")
	private AndroidElement emailOrPhone;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_password']")
	private AndroidElement password;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/btn_signup']")
	private AndroidElement signUp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_account']")
	private AndroidElement alreadyMember;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login']")
	private AndroidElement login;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_loginwith']")
	private AndroidElement signUpWith;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/facebookView']")
	private AndroidElement facebookLogin;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/bt_twitter_login']")
	private AndroidElement twitterLogin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/gdpr_text']")
	private AndroidElement privacyPolicy;
	
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='in.AajTak.headlines:id/gdpr_checkbox']")
	private AndroidElement agreeTermsAndConditions;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_close']")
	private AndroidElement closeIcon;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textinput_error'])[1]")
	private AndroidElement nameInputErrorText;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textinput_error'])[2]")
	private AndroidElement emailInputErrorText;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textinput_error'])[3]")
	private AndroidElement passwordInputErrorText;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-ic='in.AajTak.headlines:id/text_input_end_icon']")
	private AndroidElement passwordHideIcon;
	
	
	public AndroidElement getFirstName() {
		return firstName;
	}
	
	public AndroidElement getEmailOrPhone() {
		return emailOrPhone;
	}
	
	public AndroidElement getPassword() {
		return password;
	}
	
	public AndroidElement getSignUp() {
		return signUp;
	}
	
	public AndroidElement getAlreadyMember() {
		return alreadyMember;
	}
	
	public AndroidElement getLogin() {
		return login;
	}
	
	public AndroidElement getSignUpWith() {
		return signUpWith;
	}
	
	public AndroidElement getFacebookLogin() {
		return facebookLogin;
	}
	
	public AndroidElement getTwitterLogin() {
		return twitterLogin;
	}
	
	public AndroidElement getPrivacyPolicy() {
		return privacyPolicy;
	}
	
	public AndroidElement getAgreeTermsAndConditions() {
		return agreeTermsAndConditions;
	}
	
	public AndroidElement getCloseIcon() {
		return closeIcon;
	}
	
	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}
	
	public AndroidElement getNameInputErrorText() {
		return nameInputErrorText;
	}
	
	public AndroidElement getEmailInputErrorText() {
		return emailInputErrorText;
	}
	
	public AndroidElement getPasswordInputErrorText() {
		return passwordInputErrorText;
	}
	
	public AndroidElement getPasswordHideIcon() {
		return passwordHideIcon;
	}
	

}
