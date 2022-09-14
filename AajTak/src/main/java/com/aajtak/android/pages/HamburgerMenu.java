package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HamburgerMenu {
	
public static AndroidDriver<AndroidElement> aDriver;
	
	public HamburgerMenu(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgur_icon")
	private AndroidElement hamburgerIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/signup_body")
    private AndroidElement loginOrRegister;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/nav_close")
    private AndroidElement closeHamburgerMenu;

	@AndroidFindBy(id = "in.AajTak.headlines:id/rel_savedcontents")
    private AndroidElement downloadInHamburgerMenu;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivDownloaded")
    private AndroidElement downloadcontentInHamburgerMenu;
	
	public AndroidElement getDownloadcontentInHamburgerMenu() {
		return downloadcontentInHamburgerMenu;
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/rel_settings")
    private AndroidElement bookmarkInHamburgerMenu;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/rel_notification")
    private AndroidElement notificationInHamburgerMenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/menuheader' and @text='टॉप कैटेगरी']")
    private AndroidElement topCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/menuheader' and @text='अन्य कैटेगरी']")
    private AndroidElement anyaCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='होम']")
    private AndroidElement homeInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='लाइव टीवी']")
    private AndroidElement liveTVInTopCategory;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='भारत']")
    private AndroidElement bharathInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='फोटो']")
    private AndroidElement photoInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='वीडियो']")
    private AndroidElement videoInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='मनोरंजन']")
    private AndroidElement manorajanInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='आजतक HD']")
    private AndroidElement aajTakHDInTopCategory;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='डेली हाइलाइट्स']")
    private AndroidElement dailyHighlightesInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='जुर्म']")
    private AndroidElement jurmInTopCategory;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='टेक्नोलॉजी']")
    private AndroidElement technologyInTopCategory;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='खेल']")
    private AndroidElement khelInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='धर्म']")
    private AndroidElement dharmInTopCategory;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='बिजनेस']")
    private AndroidElement businessInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='ट्रेंडिंग']")
    private AndroidElement tradingInTopCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='जॉब्स एंड एजुकेशन']")
    private AndroidElement jobAndEducationInAnyaCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='कार्यक्रम']")
    private AndroidElement karyakramInAnyaCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='फैक्ट चेक']")
    private AndroidElement phaiktChekInAnyaCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='इंडिया टुडे']")
    private AndroidElement indiaTodayInAnyaCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='तेज़']")
    private AndroidElement tezInAnyaCategory;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='सेटिंग्स']")
    private AndroidElement settingsInAnyaCategorys;

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='हमारे बारे में']")
    private AndroidElement hamaareBaareMeinInAnyaCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='इंडिया टुडे ग्रुप के अन्य ऐप्स']")
    private AndroidElement indiaTodaygroupKeAnyaAppsInAnyaCategory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='टॉप कैटेगरी']/..//android.widget.TextView")
	private List<AndroidElement> subCategoriesInTop;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अन्य कैटेगरी']/..//android.widget.TextView")
	private List<AndroidElement> subCategoriesInAnya;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='लॉगआउट']")
	private AndroidElement logout;


	public AndroidElement getHamburgerIcon() {
		return hamburgerIcon;
	}

	public AndroidElement getLoginOrRegister() {
		return loginOrRegister;
	}

	public AndroidElement getCloseHamburgerMenu() {
		return closeHamburgerMenu;
	}

	public AndroidElement getDownloadInHamburgerMenu() {
		return downloadInHamburgerMenu;
	}

	public AndroidElement getBookmarkInHamburgerMenu() {
		return bookmarkInHamburgerMenu;
	}

	public AndroidElement getNotificationInHamburgerMenu() {
		return notificationInHamburgerMenu;
	}

	public AndroidElement getTopCategory() {
		return topCategory;
	}

	public AndroidElement getAnyaCategory() {
		return anyaCategory;
	}

	public AndroidElement getHomeInTopCategory() {
		return homeInTopCategory;
	}

	public AndroidElement getLiveTVInTopCategory() {
		return liveTVInTopCategory;
	}

	public AndroidElement getBharathInTopCategory() {
		return bharathInTopCategory;
	}

	public AndroidElement getPhotoInTopCategory() {
		return photoInTopCategory;
	}

	public AndroidElement getVideoInTopCategory() {
		return videoInTopCategory;
	}

	public AndroidElement getManorajanInTopCategory() {
		return manorajanInTopCategory;
	}

	public AndroidElement getAajTakHDInTopCategory() {
		return aajTakHDInTopCategory;
	}

	public AndroidElement getDailyHighlightesInTopCategory() {
		return dailyHighlightesInTopCategory;
	}

	public AndroidElement getJurmInTopCategory() {
		return jurmInTopCategory;
	}

	public AndroidElement getTechnologyInTopCategory() {
		return technologyInTopCategory;
	}

	public AndroidElement getKhelInTopCategory() {
		return khelInTopCategory;
	}

	public AndroidElement getDharmInTopCategory() {
		return dharmInTopCategory;
	}

	public AndroidElement getBusinessInTopCategory() {
		return businessInTopCategory;
	}

	public AndroidElement getTradingInTopCategory() {
		return tradingInTopCategory;
	}

	public AndroidElement getJobAndEducationInAnyaCategory() {
		return jobAndEducationInAnyaCategory;
	}

	public AndroidElement getKaryakramInAnyaCategory() {
		return karyakramInAnyaCategory;
	}

	public AndroidElement getPhaiktChekInAnyaCategory() {
		return phaiktChekInAnyaCategory;
	}

	public AndroidElement getIndiaTodayInAnyaCategory() {
		return indiaTodayInAnyaCategory;
	}

	public AndroidElement getTezInAnyaCategory() {
		return tezInAnyaCategory;
	}

	public AndroidElement getSettingsInAnyaCategorys() {
		return settingsInAnyaCategorys;
	}

	public AndroidElement getHamaareBaareMeinInAnyaCategory() {
		return hamaareBaareMeinInAnyaCategory;
	}

	public AndroidElement getIndiaTodaygroupKeAnyaAppsInAnyaCategory() {
		return indiaTodaygroupKeAnyaAppsInAnyaCategory;
	}
	
	public List<AndroidElement> getSubCategoriesInAnya() {
		return subCategoriesInAnya;
	}
	
	public List<AndroidElement> getSubCategoriesInTop() {
		return subCategoriesInTop;
	}
	
	public AndroidElement getLogout() {
		return logout;
	}


}
