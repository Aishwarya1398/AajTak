package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Podcast {

	public static AndroidDriver<AndroidElement> aDriver;

	public Podcast(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/ib_pause_play_big']")
	private AndroidElement miniPlayerPlayIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/ib_backward']")
	private AndroidElement miniPlayerBackwardIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/ib_forward']")
	private AndroidElement miniPlayerForwardIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/exo_position']")
	private AndroidElement audioStartDuration;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/exo_duration']")
	private AndroidElement audioEndDuration;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement aajTakLogo;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyCloseButton']")
	private AndroidElement closeIconInStickyPlayer;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyPlayPause']")
	private AndroidElement playPauseInStickyPlayer;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyBackward']")
	private AndroidElement stickyBackwardIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyForward']")
	private AndroidElement stickyForwardIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyCollapseButton']")
	private AndroidElement stickyCollapseButton;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyMiniCloseButton']")
	private AndroidElement stickyMiniCloseButton;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyMiniExpandButton']")
	private AndroidElement stickyMiniExpandButton;

	@AndroidFindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout//android.widget.RelativeLayout[@index=18]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title']")
	private AndroidElement lastPodcastSection;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/ib_play_pause']")
	private AndroidElement playPauseIconInThumbnail;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_see_more']")
	private AndroidElement aurSune;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/fl_thumbnail']")
	private AndroidElement firstPodcastAudio;

	@AndroidFindBy(id = "in.AajTak.headlines:id/rv_podcast")
	private AndroidElement miniPlayerPodcastPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title_podcast' and @index=4]")
	private AndroidElement firstPodcastTitle;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title_player")
	private AndroidElement verifyPlayerTitle;

	@AndroidFindBy(id = "in.AajTak.headlines:id/recycler_more_similar")
	private AndroidElement similarPlayers;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title_more")
	private AndroidElement yeBheeSunie;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_section_desc")
	private AndroidElement podcasContentDescription;

	public AndroidElement getMiniPlayerPlayIcon() {
		return miniPlayerPlayIcon;
	}

	public AndroidElement getMiniPlayerBackwardIcon() {
		return miniPlayerBackwardIcon;
	}

	public AndroidElement getMiniPlayerForwardIcon() {
		return miniPlayerForwardIcon;
	}

	public AndroidElement getAudioStartDuration() {
		return audioStartDuration;
	}

	public AndroidElement getAudioEndDuration() {
		return audioEndDuration;
	}

	public AndroidElement getAajTakLogo() {
		return aajTakLogo;
	}

	public AndroidElement getCloseIconInStickyPlayer() {
		return closeIconInStickyPlayer;
	}

	public AndroidElement getPlayPauseInStickyPlayer() {
		return playPauseInStickyPlayer;
	}

	public AndroidElement getStickyBackwardIcon() {
		return stickyBackwardIcon;
	}

	public AndroidElement getStickyForwardIcon() {
		return stickyForwardIcon;
	}

	public AndroidElement getStickyCollapseButton() {
		return stickyCollapseButton;
	}

	public AndroidElement getStickyMiniCloseButton() {
		return stickyMiniCloseButton;
	}

	public AndroidElement getStickyMiniExpandButton() {
		return stickyMiniExpandButton;
	}

	public AndroidElement getLastPodcastSection() {
		return lastPodcastSection;
	}

	public AndroidElement getPlayPauseIconInThumbnail() {
		return playPauseIconInThumbnail;
	}

	public AndroidElement getAurSune() {
		return aurSune;
	}

	public AndroidElement getFirstPodcastAudio() {
		return firstPodcastAudio;
	}

	public AndroidElement getMiniPlayerPodcastPage() {
		return miniPlayerPodcastPage;
	}

	public AndroidElement getFirstPodcastTitle() {
		return firstPodcastTitle;
	}

	public AndroidElement getVerifyPlayerTitle() {
		return verifyPlayerTitle;
	}

	public AndroidElement getSimilarPlayers() {
		return similarPlayers;
	}

	public AndroidElement getYeBheeSunie() {
		return yeBheeSunie;
	}

	public AndroidElement getPodcasContentDescription() {
		return podcasContentDescription;
	}

}
