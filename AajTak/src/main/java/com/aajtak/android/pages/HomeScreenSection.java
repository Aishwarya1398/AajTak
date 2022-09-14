
package com.aajtak.android.pages;


import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreenSection {

	public static AndroidDriver<AndroidElement> aDriver;

	public HomeScreenSection(AndroidDriver<AndroidElement> aDriver) {
		HomeScreenSection.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='बड़ी ख़बरें']")
	private AndroidElement topStories;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='भारत']")
	private AndroidElement bharathSection;

	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='खेल']")
	private AndroidElement khelSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='मनोरंजन']")
	private AndroidElement manoranjanSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='पॉजिटिव स्टोरीज']")
	private AndroidElement positiveStoriesSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='जुर्म']")
	private AndroidElement jurmSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='ट्रेंडिंग']")
	private AndroidElement trendingSection;

	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='टेक्नोलॉजी']")
	private AndroidElement technologySection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='धर्म']")
	private AndroidElement dharmSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='बिजनेस']")
	private AndroidElement businessSection;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='भारत' and @text='की अन्य ख़बरें]")
	private AndroidElement otherStoriesfromBharathSection;
	
	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/view_pager']//following::android.widget.ImageView[@resource-id='in.AajTak.headlines:id/slide_imageView'])[1]")
    private AndroidElement galleryInHomeScreen;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_description'])[1]")
	private AndroidElement storyInHomeScreen;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/btn_play'])[1]")
	private AndroidElement videoInHomeScreen;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_facebook")
	private AndroidElement faceBook;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_whatsapp")
	private AndroidElement whatsApp;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_twitter")
	private AndroidElement twitter;
	
	@AndroidFindBy(accessibility="Navigate up")
	private AndroidElement navigateup;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/ic_comment")
	private AndroidElement commentIcon;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/tv_count")
	private AndroidElement commentTextHeading;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='खेल']")
	private AndroidElement khel;
	
	@AndroidFindBy(xpath ="(//android.widget.TextView[@text='मनोरंजन'])[2]")
	private AndroidElement ManoranjanInHomeScreen;
	
	@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_share'])[2]")
	private AndroidElement shareIconAndScroll;
	
	@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ic_comment'])[2]")
	private AndroidElement commentIconAndScroll;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/ic_share")
	private AndroidElement shareIcon;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView [@resource-id=\"in.AajTak.headlines:id/ic_download\"]")
	private AndroidElement offline;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/news_title")
	private AndroidElement tapOnStory;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title']")
	private AndroidElement Section;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore']")
	private AndroidElement otherStoriesfromSection;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label']")
	private AndroidElement sectionLabel;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/btn_okay")
	private AndroidElement tikeSamajAgaya;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/text_more_episodes']")
	private AndroidElement moreVideosFromVideoDetail;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/img_count']")
	private AndroidElement imageCountInPhotoDetail;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/photo_source']")
	private AndroidElement imageGallerySource;
  

	
	public AndroidElement getotherStoriesfromSection(){
		return otherStoriesfromSection;
	}
	
	public AndroidElement getSection(){
		return Section;
	}
	
	public AndroidElement getASeemoreSection(){
		return sectionLabel;
    }
	
	public AndroidElement getTapOnStory() {
		return tapOnStory;
	}	
	
	public AndroidElement getCommentIconAndScroll() {
		return commentIconAndScroll;
	}
	
	public AndroidElement getShareIconAndScroll() {
		return shareIconAndScroll;
	}
	
	public AndroidElement getManoranjanInHomeScreen() {
		return ManoranjanInHomeScreen;
	}
	
	public AndroidElement getShareIcon() {
		return shareIcon;
	}
	
	public AndroidElement getCommentIcon() {
		return commentIcon;
	}
	
	public AndroidElement getCommentTextHeading() {
		return commentTextHeading;
	}
	
	public AndroidElement getKhel() {
		return khel;
	}
	
	public AndroidElement getcommentTextHeading(){
		return commentTextHeading;
	}
	
	public AndroidElement getcommenticon(){
		return commentIcon;
	}
	
	public AndroidElement getNavigateup() {
		return navigateup;
	}

	public AndroidElement getFaceBook() {
		return faceBook;
	}

	public AndroidElement getWhatsApp() {
		return whatsApp;
	}

	public AndroidElement getTwitter() {
		return twitter;
	}
	
	public AndroidElement getBharathSection(){
		return bharathSection;
		}
	
	public AndroidElement getKhelSection(){
		return khelSection;
		}
	
	public AndroidElement getManoranjanSection(){
		return manoranjanSection;
		}
	
	public AndroidElement getPositiveStoriesSection(){
		return positiveStoriesSection;
		}
	
	public AndroidElement getTrendingSection(){
		return trendingSection;
		}

	public AndroidElement getJurmSection() {
		return jurmSection;
		} 
	
	public AndroidElement getTechnologySection() {
		return technologySection;
		} 
	
	public AndroidElement getDharmSection() {
		return dharmSection;
		}
	
	public AndroidElement getBusinessSection() {
		return businessSection;
		}
	
	public AndroidElement getTopStories() {
		return topStories;
		}
	
	public AndroidElement getGalleryInHomeScreen() {
		return galleryInHomeScreen;
	}
	
	public AndroidElement getStoryInHomeScreen() {
		return storyInHomeScreen;
	}
	
	public AndroidElement getVideoInHomeScreen() {
		return videoInHomeScreen;
	}
	
	public AndroidElement getToastMsg() {
		return toastmsg;
	}
	
	public AndroidElement getOffline() {
		return offline;
	}
	
	public AndroidElement getTikeSamajAgaya(){
		return tikeSamajAgaya;
	}
	
	public AndroidElement getMoreVideosFromVideoDetail() {
		return moreVideosFromVideoDetail;
	}
	
	public AndroidElement getImageCountInGallery() {
		return imageCountInPhotoDetail;
	}
	
	public AndroidElement getImageGallerySource() {
		return imageGallerySource;
	}

}
