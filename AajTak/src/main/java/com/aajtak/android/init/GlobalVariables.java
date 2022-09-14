package com.aajtak.android.init;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.aajtak.android.pages.AppMessage;
import com.aajtak.android.pages.Autoplay;
import com.aajtak.android.pages.BookmarkContent;
import com.aajtak.android.pages.BottomNavigationBar;
import com.aajtak.android.pages.ClearAppMemory;
import com.aajtak.android.pages.Comments;
import com.aajtak.android.pages.DailyHighlights;
import com.aajtak.android.pages.DownloadedContent;
import com.aajtak.android.pages.EditProfile;
import com.aajtak.android.pages.EmbeddedVideo;
import com.aajtak.android.pages.FeedBack;
import com.aajtak.android.pages.ForgotPassword;
import com.aajtak.android.pages.HamburgerMenu;
import com.aajtak.android.pages.Homescreen;
import com.aajtak.android.pages.HomescreenWalkthrough;
import com.aajtak.android.pages.ImageDownloadKaren;
import com.aajtak.android.pages.InArticleLink;
import com.aajtak.android.pages.LiveBlog;
import com.aajtak.android.pages.LiveTvWidget;
import com.aajtak.android.pages.LoginOrRegister;
import com.aajtak.android.pages.Logout;
import com.aajtak.android.pages.NewsList;
import com.aajtak.android.pages.NotificationHub;
import com.aajtak.android.pages.NotificatonPayeOnboarding;
import com.aajtak.android.pages.OfflinePade;
import com.aajtak.android.pages.OfflinePadeOnboarding;
import com.aajtak.android.pages.OtherAppsFromIndiaToday;
import com.aajtak.android.pages.PasandidaSetKareinOnboarding;
import com.aajtak.android.pages.PermssionMessage;
import com.aajtak.android.pages.PhotoDetail;
import com.aajtak.android.pages.PhotoList;
import com.aajtak.android.pages.Podcast;
import com.aajtak.android.pages.Poll;
import com.aajtak.android.pages.PrivacyPolicy;
import com.aajtak.android.pages.Search;
import com.aajtak.android.pages.SectionCustomizeKaren;
import com.aajtak.android.pages.Settings;
import com.aajtak.android.pages.Share;
import com.aajtak.android.pages.ShuruKarienOnboarding;
import com.aajtak.android.pages.SignUp;
import com.aajtak.android.pages.SplashScreen;
import com.aajtak.android.pages.StoryDetail;
import com.aajtak.android.pages.TermsAndConditions;
import com.aajtak.android.pages.VideoDetail;
import com.aajtak.android.pages.VideoList;
import com.aajtak.android.pages.ViewProfile;
import com.aajtak.android.pages.WhatsAppStickers;
import com.aajtak.android.pages.WidgetSettings;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GlobalVariables {
	
	// Driver Variables
	public static AndroidDriver<AndroidElement> aDriver;
	
	// Logger Variables
	public static Logger logger = null;
	
	//Properties Variables
	public static FileInputStream inputStream;
	public static Properties properties;
	public static String propertiesFileName = ".\\src\\main\\resources\\EnvironmentVariables\\Config.properties";
	public static String prodApkPath = ".\\src\\main\\resources\\app-production-release_9.88.4.apk";
	public static String devApkPath = ".\\src\\main\\resources\\AajTak_dev_debug_9.37.apk";

	// POM page variables
	public static Autoplay autoplay;
	public static BookmarkContent bookmarkContent;
	public static BottomNavigationBar bottomNavigationBar;
	public static ClearAppMemory clearAppMemory;
	public static DailyHighlights dailyHighlights;
	public static DownloadedContent downloadedContent;
	public static FeedBack feedBack;
	public static ForgotPassword forgotPassword;
	public static HamburgerMenu hamburgerMenu;
	public static Homescreen homescreen;
	public static HomescreenWalkthrough homescreenWalkthrough;
	public static ImageDownloadKaren imageDownloadKaren;
	public static LoginOrRegister loginOrRegister;
	public static NotificatonPayeOnboarding notificatonPayeOnboarding;
	public static OfflinePade offlinePade;
	public static OfflinePadeOnboarding offlinePadeOnboarding;
	public static PasandidaSetKareinOnboarding pasandidaSetKareinOnboarding;
	public static PermssionMessage permssionMessage;
	public static PhotoDetail photoDetail;
	public static PhotoList photoList;
	public static PrivacyPolicy privacyPolicy;
	public static Search search;
	public static SectionCustomizeKaren sectionCustomizeKaren;
	public static Settings settings;
	public static Share share;
	public static ShuruKarienOnboarding shuruKarienOnboarding;
	public static SignUp signUp;
	public static SplashScreen splashScreen;
	public static StoryDetail storyDetail;
	public static TermsAndConditions termsAndConditions;
	public static WidgetSettings widgetSettings;
	public static NewsList newsList;
	public static Poll poll;
	public static OtherAppsFromIndiaToday otherAppsFromIndiaToday;
	public static AppMessage appMessage;
	public static Logout logout;
	public static Comments comments;
	public static Podcast podcast;
	public static VideoList videoList;
	public static VideoDetail videoDetail;
	public static ViewProfile viewProfile;
	public static NotificationHub notificationHub;
	public static EditProfile editProfile;
	public static EmbeddedVideo embedVideo;
	public static LiveTvWidget liveTvWidget;
	public static WhatsAppStickers whatsAppStickers;
	public static LiveBlog liveBlog;
	public static InArticleLink inArticlelink;
}