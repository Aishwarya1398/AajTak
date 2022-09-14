package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PasandidaSetKareinOnboarding {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public PasandidaSetKareinOnboarding(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_preference_title")
	private AndroidElement pasandidaSetTxt;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/img_skip")
	private AndroidElement hoGayaBtn;

	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_skip")
	private AndroidElement hoGayaTxt;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/preference_name")
	private List<AndroidElement>  allPreferenceOptions;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/preference_check")
	private List<AndroidElement>  allPreferenceChecks;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement liveTv;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement khel;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement manoranjan;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=3]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement bharath;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=4]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement jurm;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=5]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement trending;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=6]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement technology;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=7]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement business;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=8]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement dharm;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=9]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
	private AndroidElement lifeStyle;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectLiveTv;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=1]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectKhel;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=2]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectManoranjan;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=3]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectBharath;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=4]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectJurm;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=5]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectTrending;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=6]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectTechnology;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=7]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectBusiness;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=8]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectDharm;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=9]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
	private AndroidElement selectLifeStyle;
	
	public AndroidElement getPasandidaSetTxt() {
		return pasandidaSetTxt;
	}
	public AndroidElement getHoGayaBtn() {
		return hoGayaBtn;
	}
	public AndroidElement getHoGayaTxt() {
		return hoGayaTxt;
	}
	public List<AndroidElement>  getAllPreferenceOptions() {
		return allPreferenceOptions;
	}
	public List<AndroidElement>  getAllPreferenceChecks() {
		return allPreferenceChecks;
	}
	
	public AndroidElement getLiveTv() {
	return liveTv;
	}

	public AndroidElement getKhel() {
	return khel;
	}

	public AndroidElement getManoranjan() {
	return manoranjan;
	}

	public AndroidElement getBharath() {
	return bharath;
	}

	public AndroidElement getJurm() {
	return jurm;
	}

	public AndroidElement getTrending() {
	return trending;
	}

	public AndroidElement getTechnology() {
	return technology;
	}

	public AndroidElement getBusiness() {
	return business;
	}

	public AndroidElement getDharm() {
	return dharm;
	}

	public AndroidElement getLifeStyle() {
	return lifeStyle;
	}

	public AndroidElement getSelectLiveTv() {
	return selectLiveTv;
	}

	public AndroidElement getSelectKhel() {
	return selectKhel;
	}

	public AndroidElement getSelectManoranjan() {
	return selectManoranjan;
	}

	public AndroidElement getSelectBharath() {
	return selectBharath;
	}

	public AndroidElement getSelectJurm() {
	return selectJurm;
	}

	public AndroidElement getSelectTrending() {
	return selectTrending;
	}

	public AndroidElement getSelectTechnology() {
	return selectTechnology;
	}

	public AndroidElement getSelectBusiness() {
	return selectBusiness;
	}

	public AndroidElement getSelectDharm() {
	return selectDharm;
	}

	public AndroidElement getSelectLifeStyle() {
	return selectLifeStyle;
	}
}
