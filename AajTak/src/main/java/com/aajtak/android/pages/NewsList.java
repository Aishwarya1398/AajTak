package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NewsList {

public static AndroidDriver<AndroidElement> aDriver;
	
	public NewsList(AndroidDriver<AndroidElement> aDriver) {
		LoginOrRegister.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement newslistTitle;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_comment")
	private AndroidElement commentIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_bookmark")
	private AndroidElement bookmarkIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_download")
	private AndroidElement downloadIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ic_share")
	private AndroidElement shareIcon;

	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_refresh_text")
	private AndroidElement refreshedText;

	@AndroidFindBy(id = "in.AajTak.headlines:id/lav_refresh")
	private AndroidElement refreshingText;

	@AndroidFindBy(id = "in.AajTak.headlines:id/news_date")
	private AndroidElement storydate;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title'])[1]")
	private AndroidElement firstTitleOfPage;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Interstitial close button']")
	private AndroidElement adCloseBtn;

	public AndroidElement getAdCloseBtn() {
		return adCloseBtn;
	}

	public AndroidElement getFirstTitleOfPage() {
		return firstTitleOfPage;
	}

	public void setFirstTitleOfPage(AndroidElement firstTitleOfPage) {
		this.firstTitleOfPage = firstTitleOfPage;
	}

	public AndroidElement getnewslistfirsttitle() {
		return newslistTitle;
	}

	public AndroidElement getcommenticon() {
		return commentIcon;
	}

	public AndroidElement getbookmarkIcon() {
		return bookmarkIcon;
	}

	public AndroidElement getdownloadIcon() {
		return downloadIcon;
	}

	public AndroidElement getshareIcon() {
		return shareIcon;
	}

	public AndroidElement getToastMsg() {
		return toastmsg;
	}

	public AndroidElement getStoryDate() {
		return storydate;
	}

	public AndroidElement getRefreshedText() {
		return refreshedText;

	}

	public AndroidElement getRefreshinfText() {
		return refreshingText;
	}

}
