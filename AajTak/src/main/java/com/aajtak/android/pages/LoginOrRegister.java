package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginOrRegister {
	
	public static AndroidDriver<AndroidElement> aDriver = null;
	
	public LoginOrRegister(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/signup_body']")
	private AndroidElement loginyaregister;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_login_username']")
	private AndroidElement emailyaphone;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/et_password']")
	private AndroidElement password;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/bt_login_login']")
	private AndroidElement login;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_close']")
	private AndroidElement closeIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_forget_pswd']")
	private AndroidElement forgotPassword;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_signup']")
	private AndroidElement signUpKaren;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/facebookView']")
	private AndroidElement facebookLogin;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/bt_twitter_login']")
	private AndroidElement twitterLogin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_loginwith']")
	private AndroidElement socialLoginKaren;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_account']")
	private AndroidElement accountNahiHain;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textinput_error']")
	private AndroidElement passwordInputErrorText;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-ic='in.AajTak.headlines:id/text_input_end_icon']")
	private AndroidElement passwordHideIcon;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	public AndroidElement getLoginOrRegister() {
		return loginyaregister;
	}
	
	public AndroidElement getEmailOrPhone() {
		return emailyaphone;
	}
	
	public AndroidElement getPassword() {
		return password;
	}
	
	public AndroidElement getLogin() {
		return login;
	}
	
	public AndroidElement getCloseIcon() {
		return closeIcon;
	}
	
	public AndroidElement getForgotPassword() {
		return forgotPassword;
	}
	
	public AndroidElement getSignUpKaren() {
		return signUpKaren;
	}
	
	public AndroidElement getFacebookLogin() {
		return facebookLogin;
	}
	
	public AndroidElement getTwitterLogin() {
		return twitterLogin;
	}
	
	public AndroidElement getSocialLoginKaren() {
		return socialLoginKaren;
	}
	
	public AndroidElement getAccountNahiHain() {
		return accountNahiHain;
	}
	
	public AndroidElement getPasswordInputErrorText() {
		return passwordInputErrorText;
	}
	
	public AndroidElement getPasswordHideIcon() {
		return passwordHideIcon;
	}
	public AndroidElement getToastMsg() {
		return toastmsg;
	}
	
}
