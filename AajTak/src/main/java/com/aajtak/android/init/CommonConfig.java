package com.aajtak.android.init;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

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
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class CommonConfig extends AppiumService {

	@BeforeTest()
	public static void loadLog4j() {
		String log4jPath = System.getProperty("user.dir")+"./src\\main\\resources\\log4j.properties" ;
		PropertyConfigurator.configure(log4jPath);
		logger = Logger.getLogger(CommonConfig.class.getName());
	}
	
	@BeforeTest()
	public void setUp() throws MalformedURLException, InterruptedException, FileNotFoundException{
//		startServer();
		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("deviceName"));
		capabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, properties.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, properties.getProperty("automationName"));		
		capabilities.setCapability(AndroidMobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getProperty("appPackage"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getProperty("appActivity"));
		capabilities.setCapability("autoGrantPermissions", properties.getProperty("autograntpermission"));		
		aDriver = new AndroidDriver<AndroidElement>(appiumServerURL, capabilities);
//		aDriver = new AndroidDriver<AndroidElement>(new URL("http://" + properties.getProperty("hostAddress")+":"+ properties.getProperty("port")+"/wd/hub"), capabilities);
		aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		intializePages();
	}	

	public static void cleanUp() {
		if (getDriver() != null) {
			getDriver().close();
			getDriver().quit();
			System.out.println("Driver closed");
		}
	}
	
//	@BeforeTest
	public static void intializePages() {
		loginOrRegister = new LoginOrRegister(aDriver);
		bookmarkContent = new BookmarkContent(aDriver); 
		autoplay = new Autoplay(aDriver);
		bookmarkContent = new BookmarkContent(aDriver);
		bottomNavigationBar = new BottomNavigationBar(aDriver);
		clearAppMemory = new ClearAppMemory(aDriver);
		dailyHighlights = new DailyHighlights(aDriver);
		downloadedContent = new DownloadedContent(aDriver);
		feedBack = new FeedBack(aDriver);
		forgotPassword = new ForgotPassword(aDriver);
		hamburgerMenu = new HamburgerMenu(aDriver);
		homescreen = new Homescreen(aDriver);
		homescreenWalkthrough = new HomescreenWalkthrough(aDriver);
		imageDownloadKaren = new ImageDownloadKaren(aDriver);
		notificatonPayeOnboarding = new NotificatonPayeOnboarding(aDriver);
		offlinePade = new OfflinePade(aDriver);
		offlinePadeOnboarding = new OfflinePadeOnboarding(aDriver);
		pasandidaSetKareinOnboarding = new PasandidaSetKareinOnboarding(aDriver);
		permssionMessage = new PermssionMessage(aDriver);
		photoDetail = new PhotoDetail(aDriver);
		photoList = new PhotoList(aDriver);
		privacyPolicy = new PrivacyPolicy(aDriver);
		search = new Search(aDriver);
		sectionCustomizeKaren = new SectionCustomizeKaren(aDriver);
		settings = new Settings(aDriver);
		share = new Share(aDriver);
		shuruKarienOnboarding = new ShuruKarienOnboarding(aDriver);
		signUp = new SignUp(aDriver);
		splashScreen = new SplashScreen(aDriver);
		storyDetail = new StoryDetail(aDriver);
		termsAndConditions = new TermsAndConditions(aDriver);
		widgetSettings = new WidgetSettings(aDriver);
		newsList = new NewsList(aDriver);
		poll = new Poll(aDriver);
		otherAppsFromIndiaToday = new OtherAppsFromIndiaToday(aDriver);
		logout = new Logout(aDriver);
		comments = new Comments(aDriver);
		podcast = new Podcast(aDriver);
		videoDetail = new VideoDetail(aDriver);
		videoList = new VideoList(aDriver);
		viewProfile = new ViewProfile(aDriver);
		editProfile = new EditProfile(aDriver);
		embedVideo = new EmbeddedVideo(aDriver);
		notificationHub = new NotificationHub(aDriver);
		liveTvWidget = new LiveTvWidget(aDriver);
		whatsAppStickers = new WhatsAppStickers(aDriver);
		liveBlog = new LiveBlog(aDriver);
	}
	
	public static AndroidDriver<AndroidElement> getDriver() {
		return aDriver;
	}

}
