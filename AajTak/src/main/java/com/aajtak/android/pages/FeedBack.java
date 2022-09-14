package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FeedBack {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public FeedBack(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='फीडबैक']")
	private AndroidElement  feedbackInSettings;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='i1']")
	private AndroidElement nameTitle;

	@AndroidFindBy(xpath="//android.view.View[@resource-id='i5']")
	private AndroidElement emailTitle;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='i9']")
	private AndroidElement phoneTitle;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='i13']")
	private AndroidElement commentTitle;
	
	@AndroidFindBy(xpath ="//android.view.View[@text='आपका नाम Required question']/../..//android.widget.EditText[@index=0]")
	private AndroidElement  NameEditable;

	@AndroidFindBy(xpath ="//android.view.View[@text='आपका ईमेल आईडी Required question']/../..//android.widget.EditText[@index=0]")
	private AndroidElement  EmailEditable;


	@AndroidFindBy(xpath ="//android.view.View[@text='आपका मोबाइल नंबर']/../..//android.widget.EditText[@index=0]")
	private AndroidElement  phoneNumberEditable;

	@AndroidFindBy(xpath ="//android.view.View[@text='ऐप के बारे में आपकी प्रतिक्रिया Required question']/../..//android.widget.EditText[@index=0]")
	private AndroidElement  PrathikriyaEditable;

	@AndroidFindBy(xpath ="//android.widget.Button[@text='Submit']")
	private AndroidElement  submit;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Submit another response']")
	private AndroidElement  submitAnotherRespone;
	
	@AndroidFindBy(xpath ="//android.view.View[@text='कृपया ऐप के बारे में अपनी प्रतिक्रिया दें']/../android.view.View[@index=2]")
	private AndroidElement  feedbackConfirmation;


	@AndroidFindBy(xpath ="//android.webkit.WebView[@text='कृपया ऐप के बारे में अपनी प्रतिक्रिया दें']")
	private AndroidElement  anotherFeedBackForm;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Please enter a valid name']")
	private AndroidElement  WarrningMessageInName;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Please enter a valid email ID.']")
	private AndroidElement  WarrningMessageInEmailID;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Please enter a valid mobile number']")
	private AndroidElement  WarrningMessageInPhoneNum;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Word count must be atleast 10 words']")
	private AndroidElement  WarrningMessageInPrathikriya;


public AndroidElement getWarrningMessageInName() {
		return WarrningMessageInName;
	}
	public AndroidElement getWarrningMessageInEmailID() {
		return WarrningMessageInEmailID;
	}
	public AndroidElement getWarrningMessageInPhoneNum() {
		return WarrningMessageInPhoneNum;
	}
	public AndroidElement getWarrningMessageInPrathikriya() {
		return WarrningMessageInPrathikriya;
	}
	public AndroidElement getEmailEditable() {
		return EmailEditable;
	}
	public AndroidElement getPhoneNumberEditable() {
		return phoneNumberEditable;
	}
	public AndroidElement getPrathikriyaEditable() {
		return PrathikriyaEditable;
	}
	public AndroidElement getSubmit() {
		return submit;
	}
	
	public AndroidElement getFeedbackConfirmation() {
		return feedbackConfirmation;
	}
	public AndroidElement getSubmitAnotherRespone() {
		return submitAnotherRespone;
	}
	public AndroidElement getAnotherFeedBackForm() {
		return anotherFeedBackForm;
	}

	public AndroidElement getFeedbackInSettings() {
		return feedbackInSettings;
	}
	public AndroidElement getNameEditable() {
		return NameEditable;
	}

	public AndroidElement getNameTitle() {
		return nameTitle;
	}
	public AndroidElement getEmailTitle() {
		return emailTitle;
	}
	public AndroidElement getPhoneTitle() {
		return phoneTitle;
	}
	public AndroidElement getCommentTitle() {
		return commentTitle;
	}

}
