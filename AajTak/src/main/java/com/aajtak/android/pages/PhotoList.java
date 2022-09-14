package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PhotoList {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public PhotoList(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab']")
	private AndroidElement photoSectionFromHorizontalMenu;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.ExpandableListView//android.widget.RelativeLayout[@index=4]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems']")
	private AndroidElement photoListFromHambergurMenu;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/img_count']")
	private AndroidElement photoCount;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_bookmark")
	private AndroidElement bookmarkIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_download")
	private AndroidElement downloadIcon;
	
	
	@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_download'])[1]")
	private AndroidElement downloadIcon1;
	
	@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_download'])[2]")
	private AndroidElement downloadIcon2;
	
	@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_download'])[3]")
	private AndroidElement downloadIcon3;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_share")
	private AndroidElement shareIcon;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView[@resource-id='in.AajTak.headlines:id/subsection_tab'])")
	private AndroidElement subCategoriesOfPhotolistSection;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement firstSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement secondSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement thirdSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=3]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement fourthSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=4]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement fifthSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=5]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement sixthSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=6]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement seventhSubCategory;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=7]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[2]")
	private AndroidElement eighthSubCategory;
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/photo_parent_view']//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_title'])[1]")
    private AndroidElement verifyPhotoTitle;
	
	public AndroidElement getVerifyPhotoTitle() {
		return verifyPhotoTitle;
	}
	
	public AndroidElement getPhotoCount() {
		return photoCount;
	}


	public AndroidElement getThirdSubCategory() {
		return thirdSubCategory;
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_date']")
	private AndroidElement PhotoGalleryDate;
	
	
	public AndroidElement getPhotoGalleryDate() {
		return PhotoGalleryDate;
	}
	
	
	public AndroidElement getPhotoSectionFromHorizontalMenu() {
		return photoSectionFromHorizontalMenu;
	}
	
	public AndroidElement getPhotoListFromHambergurMenu() {
		return photoListFromHambergurMenu;
	}
		
	public AndroidElement getphotoCount() {
		return photoCount;
	}
	
	public AndroidElement getBookmarkIcon() {
		return bookmarkIcon;
	}
	public AndroidElement getDownloadIcon() {
		return downloadIcon;
	}
		
	public AndroidElement getDownloadIcon1() {
		return downloadIcon1;
	}
	public AndroidElement getDownloadIcon2() {
		return downloadIcon2;
	}
	public AndroidElement getDownloadIcon3() {
		return downloadIcon3;
	}
		
	public AndroidElement getShareIcon() {
		return shareIcon;
	}
	
	public AndroidElement getToastmsg() {
		return toastmsg;
	}
	
	public AndroidElement getSubCategoriesOfPhotolistSection() {
		return subCategoriesOfPhotolistSection;
	}
	public AndroidElement getFirstSubCategory() {
		return firstSubCategory;
	}
		
	public AndroidElement getSecondSubCategory() {
		return secondSubCategory;
	}
	
	public AndroidElement getFourthSubCategory() {
		return fourthSubCategory;
	}
	
	public AndroidElement getFifthSubCategory() {
		return fifthSubCategory;
	}
	
	public AndroidElement getSixthSubCategory() {
		return sixthSubCategory;
	}
	
	public AndroidElement getSeventhSubCategory() {
		return seventhSubCategory;
	}
	
	public AndroidElement getEighthSubCategory() {
		return eighthSubCategory;
	}
	
	
}
