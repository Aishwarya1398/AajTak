package com.aajtak.android.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.gherkin.model.And;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homescreen {
	
	public static AndroidDriver<AndroidElement> aDriver;

	public Homescreen(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar_title")
	private AndroidElement aajTakHomeLogo;

	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar_live_tv")
	private AndroidElement liveTv;

	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar_podcast_radio")
	private AndroidElement podcastRadio;

	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgur_icon")
	private AndroidElement hamburgerIcon;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement newhamburgerIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_topnews_dailycap_message")
	private AndroidElement dailycapBannerMessage;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/ll_topnews_tempLayout")
	private AndroidElement dailyCapsuleBanner;

	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Aaj Tak Image\"]")
	private AndroidElement dailyCapsuleBannnerCopy;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='राजनीति']")
	private AndroidElement rajnitiSection;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/tvHBITitle")
	private AndroidElement FirstNews;
	

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_goodmorning")
	private AndroidElement namaskar;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_topnews_temperature")
	private AndroidElement temperature;

	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_topnews_weather")
	private AndroidElement weather;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_topnews_temperature_value")
	private AndroidElement location;

	@AndroidFindBy(id = "in.AajTak.headlines:id/topnews_downarrow")
	private AndroidElement bannerDownArrow;

	@AndroidFindBy(id = "in.AajTak.headlines:id/design_bottom_sheet")
	private AndroidElement downArrowSheet;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_always")
	private AndroidElement alwaysShow;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_24hours")
	private AndroidElement showOnceinDay;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_never")
	private AndroidElement neverShow;

	// Title of first Story of every section in Homescreen
	@AndroidFindBy(id = "in.AajTak.headlines:id/news_title")
	private AndroidElement firstStoryTitleOfSection;

	@AndroidFindBy(id = "in.AajTak.headlines:id/news_description")
	private AndroidElement firstStoryDesc;

	@AndroidFindBy(id = "in.AajTak.headlines:id/photostroy_desc")
	private AndroidElement photoStoryDesc;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivHBILargeImg")
	private AndroidElement largephotooffirststory;
	

	// Other Stories title
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement otherStoryTitle;

	@AndroidFindBy(id ="(in.AajTak.headlines:id/tv_visualstory_title)[2]")
	private AndroidElement visualStoryTitle;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/clVisualStoriesBase")
	private AndroidElement visualStory;
	
	@AndroidFindBy(id ="in.AajTak.headlines:id/tvNewsTitle")
	private AndroidElement FirstNewstitle;
	// Title of Video in Homescreen
	@AndroidFindBy(id = "in.AajTak.headlines:id/news_title")
	private AndroidElement videoTitle;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_title'])[1]")
	private AndroidElement videoTitle1;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/btn_play")
	private AndroidElement videoPlayButton;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/btn_play'])[1]")
	private AndroidElement firstVideoInHomeScreen;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvRelatedNews")
	private AndroidElement firstVideonewsInHomeScreen;

	// Title Of Photo in Homescreen

	public AndroidElement getFirstVideonewsInHomeScreen() {
		return firstVideonewsInHomeScreen;
	}

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement photoTitle;

	@AndroidFindBy(id = "in.AajTak.headlines:id/slide_imageView")
	private AndroidElement photoThumbnail;

	@AndroidFindBy(id = "in.AajTak.headlines:id/photostory_heading")
	private AndroidElement photoCategory;

	@AndroidFindBy(id = "in.AajTak.headlines:id/photostory_layout")
	private AndroidElement photoHeader;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ll_gallry_more")
	private AndroidElement morePhotos;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='और तस्वीरें']")
	private AndroidElement morePhotosClick;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/view_pager']//following::android.widget.ImageView[@resource-id='in.AajTak.headlines:id/slide_imageView'])[1]")
	private AndroidElement firstGalleryInHomeScreen;
	
	@AndroidFindBy(xpath ="(//android.widget.ImageView[@content-desc=\"News Image\"])[1]")
	private AndroidElement firsttopvideoArticle;
	
	
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/clPhotoOrVideo'])")
	private AndroidElement firstVideoorPhotoInHomeScreen;
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/lav_loader")
	private AndroidElement homeScreenLoading;
	

	// News Date/time

	@AndroidFindBy(id = "in.AajTak.headlines:id/news_date")
	private AndroidElement newsDate;

	// Horizontal menu Sections

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab']")
	private List<AndroidElement> homeScreenTabElements;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='होम']")
	private AndroidElement HomeTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='फोटो']")
	private AndroidElement photoTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वीडियो']")
	private AndroidElement videoTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कोरोना']")
	private AndroidElement coranaTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='मनोरंजन']")
	private AndroidElement manoranjanTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='जुर्म']")
	private AndroidElement jurmTab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कार्यक्रम']")
	private AndroidElement karyakramTab;
	
	// HomescreenSubsections


	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label']")
	private AndroidElement subSectionName;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title']")
	private AndroidElement sectionName;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore']")
	private AndroidElement otherStoriesfromSectionTxt;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"बड़ी खबरें\"]")
	private AndroidElement badiKahbreinSection;

	@AndroidFindBy(xpath="//android.widget.Button[@text='स्टोरी शेयर करें']")
	private AndroidElement Sharestory;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='भारत']")
	private AndroidElement bharathSection;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"भारत\"]/android.widget.TextView")
	private AndroidElement BharathSectioncopy;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"होम\"]/android.widget.TextView")
	private AndroidElement HomeSectionCopy;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='खेल']")
	private AndroidElement khelSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='मनोरंजन']")
	private AndroidElement manoranjanSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='पॉजिटिव स्टोरीज']")
	private AndroidElement positiveStoriesSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='जुर्म']")
	private AndroidElement jurmSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='ट्रेंडिंग']")
	private AndroidElement trendingSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='टेक्नोलॉजी']")
	private AndroidElement technologySection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='धर्म']")
	private AndroidElement dharmSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_title' and @text='बिजनेस']")
	private AndroidElement businessSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='बड़ी ख़बरें']")
	private AndroidElement topStoriesSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='भारत']")
	private AndroidElement bharathSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='खेल']")
	private AndroidElement khelSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='मनोरंजन']")
	private AndroidElement manoranjanSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='पॉजिटिव स्टोरीज']")
	private AndroidElement positiveStoriesSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='जुर्म']")
	private AndroidElement jurmSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='ट्रेंडिंग']")
	private AndroidElement trendingSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='टेक्नोलॉजी']")
	private AndroidElement technologySeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='धर्म']")
	private AndroidElement dharmSeeMoreLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore_label' and @text='बिजनेस']")
	private AndroidElement businessSeeMoreLabel;
	
	@AndroidFindBy(id="in.AajTak.headlines:id/bottom_list")
	private AndroidElement bottomList;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomComment")
	private AndroidElement commentIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageView [@resource-id=\"in.AajTak.headlines:id/ivBottomDownload\"]")
	private AndroidElement offlineIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomBookmark")
	private AndroidElement bookmarkIcon;

	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomShare")
	private AndroidElement shareIcon;

	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_facebook")
	private AndroidElement faceBookShare;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_whatsapp")
	private AndroidElement whatsAppShare;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_twitter")
	private AndroidElement twitterShare;

	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_other")
	private AndroidElement otherShare;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='पोल' and @resource-id = 'in.AajTak.headlines:id/tv_topnews_title']")
	private AndroidElement pollClick;

	@AndroidFindBy(xpath = "in.AajTak.headlines:id/tv_polls_title")
	private AndroidElement pollTitle;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/fragment_container']//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/poll_view']/android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_polls_status']")
	private AndroidElement abVoteKare;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अन्य ']")
	private AndroidElement anyaPollOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']")
	private AndroidElement whatsappStickerHeader;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']")
	private AndroidElement whatsappStickerClick;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']/../androidx.viewpager.widget.ViewPager[@resource-id='in.AajTak.headlines:id/pager']/android.widget.LinearLayout")
	private AndroidElement stickerFrame;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']/../androidx.viewpager.widget.ViewPager[@resource-id='in.AajTak.headlines:id/pager']//android.widget.LinearLayout[@index=0]/android.widget.ImageView[@resource-id='in.AajTak.headlines:id/imageView']")
	private AndroidElement stickerImage;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']/../androidx.viewpager.widget.ViewPager[@resource-id='in.AajTak.headlines:id/pager']//android.widget.LinearLayout[@index=0]/android.widget.TextView[@resource-id='in.AajTak.headlines:id/bottom_text']")
	private AndroidElement stickerText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='और स्टिकर्स']")
	private AndroidElement othersStickers;
	
	
	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView")
	private List<AndroidElement> dot;
	
	public AndroidElement getHomeScreenLoading() {
		return homeScreenLoading;
	}

	public AndroidElement getFirstStoryTitleOfSection() {
		return firstStoryTitleOfSection;
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_description'])[1]")
	private AndroidElement storyInHomeScreen;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvNewsTitle'])[1]")
	private AndroidElement storyTitleInHomeScreen;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@content-desc=\"News Image\"])[2]")
	private AndroidElement SecondStoryTitle;

	public static AndroidDriver<AndroidElement> getaDriver() {
		return aDriver;
	}

	public AndroidElement getLargephotooffirststory() {
		return largephotooffirststory;
	}

	public AndroidElement getFirstVideoorPhotoInHomeScreen() {
		return firstVideoorPhotoInHomeScreen;
	}

	public AndroidElement getOthersStickers() {
		return othersStickers;
	}
	
	

	public AndroidElement getSharestory() {
		return Sharestory;
	}

	public AndroidElement getSecondStoryTitle() {
		return SecondStoryTitle;
	}

	public AndroidElement getStoryTitleInHomeScreen() {
		return storyTitleInHomeScreen;
	}

	public AndroidElement getFirstStoryDesc() {
		return firstStoryDesc;
	}
	
	
	
	public AndroidElement getVisualStory() {
		return visualStory;
	}

	public AndroidElement getlargephotooffirststory() {
		return largephotooffirststory;
	}
	public AndroidElement getPhotoStoryDesc() {
		return photoStoryDesc;
	}

	public AndroidElement getOtherStoryTitle() {
		return otherStoryTitle;
	}

	public AndroidElement getPhotoTitle() {
		return photoTitle;
	}

	public AndroidElement getPhotoThumbnail() {
		return photoThumbnail;
	}

	public AndroidElement getPhotoCategory() {
		return photoCategory;
	}

	public AndroidElement getPhotoHeader() {
		return photoHeader;
	}
	
	
	public AndroidElement getDailyCapsuleBannnerCopy() {
		return dailyCapsuleBannnerCopy;
	}

	public AndroidElement getMorePhotos() {
		return morePhotos;
	}

	public AndroidElement getMorePhotosClick() {
		return morePhotosClick;
	}

	public AndroidElement getFirstNewstitle() {
		return FirstNewstitle;
	}
	
	

	public AndroidElement getFirsttopvideoArticle() {
		return firsttopvideoArticle;
	}

	public AndroidElement getFirstGalleryInHomeScreen() {
		return firstGalleryInHomeScreen;
	}

	public AndroidElement getVideoTitle() {
		return videoTitle;
	}
	
	
	public AndroidElement getVideoTitle1() {
		return videoTitle1;
	}

	public AndroidElement getVideoPlayButton() {
		return videoPlayButton;
	}

	public AndroidElement getVisualStoryTitle() {
		return visualStoryTitle;
	}

	public AndroidElement getFirstVideoInHomeScreen() {
		return firstVideoInHomeScreen;
	}

	public AndroidElement getNewsDate() {
		return newsDate;
	}

	public AndroidElement getAajTakHomeLogo() {
		return aajTakHomeLogo;
	}

	public AndroidElement getLiveTv() {
		return liveTv;
	}

	public AndroidElement getPodcastRadio() {
		return podcastRadio;
	}

	public AndroidElement getHamburgerIcon() {
		return hamburgerIcon;
	}
	
	public AndroidElement getNewHamburgerIcon() {
		return newhamburgerIcon;
	}
	
	public AndroidElement getDailyCapsuleBanner() {
		return dailyCapsuleBanner;
	}
	

	public AndroidElement getNewhamburgerIcon() {
		return newhamburgerIcon;
	}

	public AndroidElement getFirstNews() {
		return FirstNews;
	}

	public AndroidElement getStickerFrame() {
		return stickerFrame;
	}

	public AndroidElement getStickerImage() {
		return stickerImage;
	}

	public AndroidElement getStickerText() {
		return stickerText;
	}

	public AndroidElement getDailycapBannerMessage() {
		return dailycapBannerMessage;
	}

	public AndroidElement getNamaskarTxt() {
		return namaskar;
	}

	public AndroidElement getWeather() {
		return weather;
	}

	public AndroidElement getTemperature() {
		return temperature;
	}

	public AndroidElement getLocation() {
		return location;
	}

	public AndroidElement getBannerDownArrow() {
		return bannerDownArrow;
	}

	public AndroidElement getDownArrowSheet() {
		return downArrowSheet;
	}

	public AndroidElement getAlwaysShow() {
		return alwaysShow;
	}

	public AndroidElement getShowOnceinDay() {
		return showOnceinDay;
	}

	public AndroidElement getNeverShow() {
		return neverShow;
	}

	public List<AndroidElement> gethomeScreenTabElements() {
		return homeScreenTabElements;
	}

	public AndroidElement getHomeTab() {
		return HomeTab;
	}

	public AndroidElement getPhotoTab() {
		return photoTab;
	}

	public AndroidElement getVideoTab() {
		return videoTab;
	}
	

	public AndroidElement getCoranaTab() {
		return coranaTab;
	}

	public AndroidElement getManoranjanTab() {
		return manoranjanTab;
	}

	public AndroidElement getJurmTab() {
		return jurmTab;
	}
	public AndroidElement getNamaskar() {
		return namaskar;
	}

	public List<AndroidElement> getHomeScreenTabElements() {
		return homeScreenTabElements;
	}

	public AndroidElement getKaryakramTab() {
		return karyakramTab;
	}

	public AndroidElement getSectionName() {
		return sectionName;
	}
	public AndroidElement getSubSectionName() {
		return subSectionName;
	}

	public AndroidElement getOtherStoriesfromSectionTxt() {
		return otherStoriesfromSectionTxt;
	}

	public AndroidElement getBadiKahbreinSection() {
		return badiKahbreinSection;
	}

	public AndroidElement getBharathSection() {
		return bharathSection;
	}

	
	
	public AndroidElement getHomeSectionCopy() {
		return HomeSectionCopy;
	}

	
	
	public AndroidElement getRajnitiSection() {
		return rajnitiSection;
	}

	public AndroidElement getBharathSectioncopy() {
		return BharathSectioncopy;
	}

	public AndroidElement getKhelSection() {
		return khelSection;
	}

	public AndroidElement getManoranjanSection() {
		return manoranjanSection;
	}

	public AndroidElement getPositiveStoriesSection() {
		return positiveStoriesSection;
	}

	public AndroidElement getJurmSection() {
		return jurmSection;
	}

	public AndroidElement getTrendingSection() {
		return trendingSection;
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

	public AndroidElement getTopStoriesSeeMoreLabel() {
		return topStoriesSeeMoreLabel;
	}

	public AndroidElement getBharathSeeMoreLabel() {
		return bharathSeeMoreLabel;
	}

	public AndroidElement getKhelSeeMoreLabel() {
		return khelSeeMoreLabel;
	}

	public AndroidElement getManoranjanSeeMoreLabel() {
		return manoranjanSeeMoreLabel;
	}

	public AndroidElement getPositiveStoriesSeeMoreLabel() {
		return positiveStoriesSeeMoreLabel;
	}

	public AndroidElement getJurmSeeMoreLabel() {
		return jurmSeeMoreLabel;
	}

	public AndroidElement getTrendingSeeMoreLabel() {
		return trendingSeeMoreLabel;
	}

	public AndroidElement getTechnologySeeMoreLabel() {
		return technologySeeMoreLabel;
	}

	public AndroidElement getDharmSeeMoreLabel() {
		return dharmSeeMoreLabel;
	}

	public AndroidElement getBusinessSeeMoreLabel() {
		return businessSeeMoreLabel;
	}
	
	public AndroidElement getBottomList() {
		return bottomList;
	}

	public AndroidElement getCommentIcon() {
		return commentIcon;
	}

	public AndroidElement getOfflineIcon() {
		return offlineIcon;
	}

	public AndroidElement getBookmarkIcon() {
		return bookmarkIcon;
	}

	public AndroidElement getShareIcon() {
		return shareIcon;
	}

	public AndroidElement getToastmsg() {
		return toastmsg;
	}

	public AndroidElement getFaceBookShare() {
		return faceBookShare;
	}

	public AndroidElement getWhatsAppShare() {
		return whatsAppShare;
	}

	public AndroidElement getTwitterShare() {
		return twitterShare;
	}

	public AndroidElement getOtherShare() {
		return otherShare;
	}

	public AndroidElement getPollClick() {
		return pollClick;
	}

	public AndroidElement getPollTitle() {
		return pollTitle;
	}

	public AndroidElement getAbVoteKare() {
		return abVoteKare;
	}

	public AndroidElement getAnyaPollOption() {
		return anyaPollOption;
	}

	public AndroidElement getWhatsappStickerHeader() {
		return whatsappStickerHeader;
	}

	public AndroidElement getWhatsappStickerClick() {
		return whatsappStickerClick;
	}
	public AndroidElement getStoryInHomeScreen() {
		return storyInHomeScreen;
	}
	
	public List<AndroidElement> getDot() {
		return dot;
	}
	
	public AndroidElement getWhatsAppOtherStickers() {
		return othersStickers;
	}
	
	public AndroidElement getWhatsAppstickerText() {
		return stickerText;
	}
	
	public AndroidElement getWhatsAppstickerImage() {
		return stickerImage;
	}
	
	
	public AndroidElement getWhatsAppstickerFrame() {
		return stickerFrame;
	}
}
