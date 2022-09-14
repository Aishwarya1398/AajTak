package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SectionCustomizeKaren {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public SectionCustomizeKaren(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	
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
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement preferenceMessage;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private AndroidElement nahiOption;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private AndroidElement haanOption;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_live_tv']")
	private AndroidElement saveKaren;
	
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/txt_preference_info']")
    private AndroidElement setPreferencesMessage;
    
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id= 'in.AajTak.headlines:id/preference_container']//android.widget.TextView")
	private List<AndroidElement> optionInSectionCustomization;

	public List<AndroidElement> getOptionInSectionCustomization() {
		return optionInSectionCustomization;
	}
	
    public AndroidElement getSetPreferencesMessage() {
		return setPreferencesMessage;
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
    
    public AndroidElement getToastMsg() {
		return toastmsg;
	}
    
    public AndroidElement getPreferenceMessage() {
    	return preferenceMessage;
    }
    
    public AndroidElement getNahiOption() {
    	return nahiOption;
    }
    
    public AndroidElement getHaanOption() {
    	return haanOption;
    }
    
    public AndroidElement getBackArrowButton() {
    	return backArrowButton;
    }
    
    public AndroidElement getSaveKaren() {
    	return saveKaren;
    }
}
