package com.aajtak.android.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppMessage {

	public static AndroidDriver<AndroidElement> aDriver;
	
	public AppMessage(AndroidDriver<AndroidElement> aDriver) {
		AppMessage.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
		@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[1]")
		private AndroidElement tasvireSection;
		
		@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[1]")
		private AndroidElement videoSection;
		
		@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[1]")
		private AndroidElement storySection;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_nodata']")
		private AndroidElement contentMessage;
		
		@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=1]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/preference_check']")
		private AndroidElement selectKhel;
		
		@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/preference_name']")
		private AndroidElement khelInSettingsPage;
		
		@AndroidFindBy(xpath ="//android.widget.TextView[@text='सेटिंग्स']")
		private AndroidElement settings;
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/customize_section']")
		private AndroidElement customizeSection;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
		private AndroidElement preferenceMessage;
						
		public AndroidElement getTasvireSection() {
			return tasvireSection;	
		}
		
		public AndroidElement getVideoSection() {
			return videoSection;	
		}
		
		public AndroidElement getStorySection() {
			return storySection;	
		}
		
		public AndroidElement getContentMessage() {
			return contentMessage;
		}
		
		public AndroidElement getSelectKhel() {
			return selectKhel;
		}
		
		public AndroidElement getKhelInSettingsPage() {
			return khelInSettingsPage;
		}
		
		public AndroidElement getSettings() {
			return settings;
		}
		
		public AndroidElement getcustomizeSection() {
			return customizeSection;
		}
		
		public AndroidElement getPreferenceMessage() {
			return preferenceMessage;
		}
	

}
