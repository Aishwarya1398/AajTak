package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditProfile {
	
	private static AndroidDriver<AndroidElement> aDriver;
	public EditProfile (AndroidDriver<AndroidElement> aDriver) {
		EditProfile.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement editProfileTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/ed_save']")
	private AndroidElement saveKaren;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_info']")
	private AndroidElement samanyaJankaari;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/profilepic']")
	private AndroidElement profilePicTitle;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_photoselection']")
	private AndroidElement profileSelection;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='android:id/text1'])[1]")
	private AndroidElement camera;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='android:id/text1'])[2]")
	private AndroidElement gallery;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/ed_firstname']")
	private AndroidElement editUserName;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/ed_gender']")
	private AndroidElement gender;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/alertTitle']")
	private AndroidElement selectAny;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='android:id/text1'])[1]")
	private AndroidElement selectPurush;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='android:id/text1'])[2]")
	private AndroidElement selectSthree;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/ed_location']")
	private AndroidElement userLocation;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/ed_dob']")
	private AndroidElement userDoB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private AndroidElement okInDoB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private AndroidElement cancelInDoB;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/date_picker_header_year']")
	private AndroidElement yearHeader;
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='android:id/prev']")
	private AndroidElement month;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_contactinfo']")
	private AndroidElement contactInfoText;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/ed_email']")
	private AndroidElement registeredEmail;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/edphone']")
	private AndroidElement registeredPhoneNum;
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	
	
	
	
	
	public AndroidElement getPhotoSelection() {
		return profileSelection;
	}

	
	public AndroidElement getCamera() {
		return camera;
	}

	
	public AndroidElement getGallery() {
		return gallery;
	}

	
	
	
	
	public AndroidElement getYearHeader() {
		return yearHeader;
	}

	public AndroidElement getMonth() {
		return month;
	}

	
	public AndroidElement getOkInDoB() {
		return okInDoB;
	}

	public AndroidElement getCancelInDoB() {
		return cancelInDoB;
	}

	
	
	public AndroidElement getUserDoB() {
		return userDoB;
	}
	
	public AndroidElement getEditProfileTitle() {
		return editProfileTitle;
	}
	
	public AndroidElement getSaveKaren() {
		return saveKaren;
	}
	
	public AndroidElement getSamanyaJankaari() {
		return samanyaJankaari;
	}
	
	public AndroidElement getProfilePicTitle() {
		return profilePicTitle;
	}
	
	public AndroidElement getEditUserName() {
		return editUserName;
	}
	
	public AndroidElement getGender() {
		return gender;
	}
	
	public AndroidElement getSelectAny() {
		return selectAny;
	}
	
	public AndroidElement getSelectPurush() {
		return selectPurush;
	}
	
	public AndroidElement getSelectSthree() {
		return selectSthree;
	}
	
	public AndroidElement getUserLocation() {
		return userLocation;
	}
	
	public AndroidElement getContactInfoText() {
		return contactInfoText;
	}
	
	public AndroidElement getRegisteredEmail() {
		return registeredEmail;
	}
	
	public AndroidElement getRegisteredPhoneNum() {
		return registeredPhoneNum;
	}
	
	
	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}
	
	public AndroidElement getToastMsg() {
		return toastmsg;
	}


}
