package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VideoDetail {
	

	public static AndroidDriver<AndroidElement> aDriver;

	public VideoDetail(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/title']")
    private AndroidElement videoDetailTitle;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='in.AajTak.headlines:id/bottom_menu_video_layout']//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_bookmark']")
	private AndroidElement bookmarkIcon;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='in.AajTak.headlines:id/recycle_view']//android.widget.LinearLayout[@index=2]//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/bottom_menu']//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_download']")
	private AndroidElement moreVideosDownloadIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/date']")
    private AndroidElement VideoUploadTime;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_video_arrow']")
    private AndroidElement VideoMinimizeIcon;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/player_view']")
    private AndroidElement MinimizedVideoPlayer;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/remove_left")
	private AndroidElement leftSide;

	@AndroidFindBy(xpath = "//android.widget.SeekBar[@resource-id='in.AajTak.headlines:id/exo_progress']")
    private AndroidElement VideoProgressBar;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/exo_duration")
    private AndroidElement endDuration;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/exo_position")
    private AndroidElement videoPosition;
	
	
	public AndroidElement getEndDuration() {
		return endDuration;
	}

	public AndroidElement getVideoPosition() {
		return videoPosition;
	}

	public AndroidElement getVideoProgressBar() {
		return VideoProgressBar;
	}

	public AndroidElement getVideoDetailTitle() {
		return videoDetailTitle;
	}
	
	public AndroidElement getMoreVideosDownloadIcon() {
		return moreVideosDownloadIcon;
	}

	public AndroidElement getLeftSide() {
		return leftSide;
	}

	public AndroidElement getBookmarkIcon() {
		return bookmarkIcon;
	}
	
	public AndroidElement getVideoUploadTime() {
		return VideoUploadTime;
	}
	
	public AndroidElement getMinimizedVideoPlayer() {
		return MinimizedVideoPlayer;
	}

	public AndroidElement getVideoMinimizeIcon() {
		return VideoMinimizeIcon;
	}
}
