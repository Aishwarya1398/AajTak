package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
	
	
public class StoryDetail {
		
	public static AndroidDriver<AndroidElement> aDriver;

	public StoryDetail(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement firstStoryTitle;

	@AndroidFindBy(id = "in.AajTak.headlines:id/btn_okay")
    private AndroidElement tikeSamajAgaya;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/moreOptions")
    private AndroidElement moreOptions;
	
	@AndroidFindBy(accessibility = "More options")
    private AndroidElement actionOverflowBtn;
	
	@AndroidFindBy( accessibility = "Navigate up")
    private AndroidElement navigatebackFromAnystory;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_article_title")
    private AndroidElement titleOfAnyStory;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private AndroidElement commentsIconInActionOverflow;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    private AndroidElement bookmarkIconInActionOverflow;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
    private AndroidElement offlineStoryInActionOverflow;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout")
    private AndroidElement textSizeIconInActionOverflow;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement shareIconInActionOverflow;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/txt_article_date_and_location")
    private AndroidElement storyUpdatedTime;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/imageView_thumbnail")
	private AndroidElement embeddedVideo;
	
	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[1]")
	private AndroidElement inArticleLink1;
	

	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[2]")
	private AndroidElement inArticleLink2;
   
	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[1]//android.widget.TextView")
	private AndroidElement inArticleLink1Text;
	
	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[2]//android.widget.TextView")
	private AndroidElement inArticleLink2Text;
	
	public AndroidElement getFirstStoryTitle() {
		return firstStoryTitle;
	}

	public AndroidElement getTikeSamajAgaya() {
		return tikeSamajAgaya;
	}
	
	public AndroidElement getmoreOptions() {
		return moreOptions;
	}

	public AndroidElement getActionOverflowBtn() {
		return actionOverflowBtn;
	}

	public AndroidElement getNavigatebackFromAnystory() {
		return navigatebackFromAnystory;
	}

	public AndroidElement getTitleOfAnyStory() {
		return titleOfAnyStory;
	}

	public AndroidElement getCommentsIconInActionOverflow() {
		return commentsIconInActionOverflow;
	}

	public AndroidElement getBookmarkIconInActionOverflow() {
		return bookmarkIconInActionOverflow;
	}

	public AndroidElement getOfflineStoryInActionOverflow() {
		return offlineStoryInActionOverflow;
	}

	public AndroidElement getTextSizeIconInActionOverflow() {
		return textSizeIconInActionOverflow;
	}

	public AndroidElement getShareIconInActionOverflow() {
		return shareIconInActionOverflow;
	}
	public AndroidElement getToastMsg() {
		return toastmsg;
	}
	public AndroidElement getStoryUpdatedTime() {
		return storyUpdatedTime;
	}
	
	public AndroidElement getEmbeddedVideo() {
		return embeddedVideo;
	}

	public AndroidElement getInArticleLink1() {
		return inArticleLink1;
	}

	public AndroidElement getInArticleLink2() {
		return inArticleLink2;
	}

	public AndroidElement getInArticleLink1Text() {
		return inArticleLink1Text;
	}

	public AndroidElement getInArticleLink2Text() {
		return inArticleLink2Text;
	}
}
