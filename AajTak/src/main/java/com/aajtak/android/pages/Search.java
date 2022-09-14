package com.aajtak.android.pages;


import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Search {
public static AndroidDriver<AndroidElement> aDriver;
	
	public Search(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_search']")
	private AndroidElement search;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Search articles']")
	private AndroidElement searchArticles;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_speech']")
	private AndroidElement voiceSearch;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Popular Searches']")
	private AndroidElement popularSearches;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/grid_popular']//android.view.View[@index=0]")
	private AndroidElement firstPopularSearch;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/grid_popular']//android.view.View[@index=1]")
	private AndroidElement secondPopularSearch;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/grid_popular']//android.view.View[@index=2]")
	private AndroidElement thirdPopularSearch;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/grid_popular']//android.view.View[@index=3]")
	private AndroidElement fourthPopularSearch;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/grid_popular']//android.view.View[@index=4]")
	private AndroidElement fifthPopularSearch;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/grid_popular']//android.view.View[@index=2]")
	private AndroidElement sixthPopularSearch;
	
	@AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='ALL']")
	private AndroidElement allResults;
	
	@AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='स्टोरी']")
	private AndroidElement storyResults;
	
	@AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='तस्वीरें']")
	private AndroidElement photoResults;
	
	@AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='वीडियो']")
	private AndroidElement videoResults;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_result']")
	private AndroidElement aboutResults;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_result")
	private AndroidElement resultsCount;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/news_title")
	private AndroidElement excpectedVideoTitle;
		
	@AndroidFindBy(id = "in.AajTak.headlines:id/news_title")
	private AndroidElement actualVideoTitle;
	
	public AndroidElement getSearch() {
		return search;
	}
	
	public AndroidElement getSearchArticles() {
		return searchArticles;
	}
	
	public AndroidElement getVoiceSearch() {
		return voiceSearch;
	}
	
	public AndroidElement getPopularSearches() {
		return popularSearches;
	}
	
	public AndroidElement getFirstPopularSearch() {
		return firstPopularSearch;
	}
	
	public AndroidElement getSecondPopularSearch() {
		return secondPopularSearch;
	}
	
	public AndroidElement getThirdPopularSearch() {
		return thirdPopularSearch;
	}
	
	public AndroidElement getFourthPopularSearch() {
		return fourthPopularSearch;
	}
	
	public AndroidElement getFifthPopularSearch() {
		return fifthPopularSearch;
	}
	
	public AndroidElement getSixthPopularSearch() {
		return sixthPopularSearch;
	}
	
	public AndroidElement getAllResults() {
		return allResults;
	}
	
	public AndroidElement getStoryResults() {
		return storyResults;
	}
	
	public AndroidElement getPhotoResults() {
		return photoResults;
	}
	
	public AndroidElement getVideoResults() {
		return videoResults;
	}
	
	public AndroidElement getAboutResults() {
		return aboutResults;
	}
	
	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}
	
	public AndroidElement getResultsCount()
	{
		return resultsCount;
	}
   
	public AndroidElement getExcpectedVideoTitle() {
		return excpectedVideoTitle;
	}

	public AndroidElement getActualVideoTitle() {
		return actualVideoTitle;
	}
}
