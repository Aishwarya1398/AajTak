package com.aajtak.android.pages;


import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Poll {

	public static AndroidDriver<AndroidElement> aDriver;

	public Poll(AndroidDriver<AndroidElement> aDriver) {
		Poll.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='पोल'][1]")
	private AndroidElement pollClick;
	
	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='पोल']")
	//private AndroidElement poll;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='RUNNING']")
	private AndroidElement runningPoll;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/fragment_container']//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/poll_view']/android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_polls_status']")
	private AndroidElement abVoteKare;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='हां' and @resource-id='in.AajTak.headlines:id/tv_option']")
	private AndroidElement haanOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='नहीं' and @resource-id='in.AajTak.headlines:id/tv_option']")
	private AndroidElement nahiOption;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_percent']")
	private AndroidElement haaResultSatus;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_percent']")
	private AndroidElement nahiResultSatus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CLOSED']")
	private AndroidElement closedPoll;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@index=0]//android.widget.TextView[@text='परिणाम दिखाएं']")
	private AndroidElement parinamDikhaye;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/fragment_container']//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/poll_view']/android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_polls_status']")
	private AndroidElement voteKarChukeHain;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अन्य ']")
	private AndroidElement anyaPollOption;

	public AndroidElement getPollClick() {
		return pollClick;
	}

	public AndroidElement getRunningPoll() {
		return runningPoll;
	}

	public AndroidElement getAbVoteKare() {
		return abVoteKare;
	}

	public AndroidElement getHaanOption() {
		return haanOption;
	}

	public AndroidElement getNahiOption() {
		return nahiOption;
	}

	public AndroidElement getHaaResultSatus() {
		return haaResultSatus;
	}

	public AndroidElement getNahiResultSatus() {
		return nahiResultSatus;
	}

	public AndroidElement getClosedPoll() {
		return closedPoll;
	}

	public AndroidElement getParinamDikhaye() {
		return parinamDikhaye;
	}

	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}

	public AndroidElement getVoteKarChukeHain() {
		return voteKarChukeHain;
	}

	public AndroidElement getAnyPollOption() {
		return anyaPollOption;
	}
	
	/*
	 * public AndroidElement getPoll() { return poll; }
	 */
}
