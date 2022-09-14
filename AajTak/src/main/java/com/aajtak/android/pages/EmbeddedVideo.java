package com.aajtak.android.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

	public class EmbeddedVideo {
		
		public EmbeddedVideo (AndroidDriver<AndroidElement> aDriver) {
			
		}
		@AndroidFindBy(id = "in.AajTak.headlines:id/iv_video_arrow")
		private AndroidElement closeBtn;
		
		@AndroidFindBy(xpath = "//android.widget.SeekBar[@resource-id='in.AajTak.headlines:id/exo_progress']")
		private AndroidElement progressBar;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/exo_position']")
		private AndroidElement startDuration;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/exo_duration']")
		private AndroidElement endDuration;
		
		@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/exoPlayPauseButton']")
		private AndroidElement playPauseBtn;
		
		@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/exo_maximize_video']")
		private AndroidElement maximizeBtn;
		
		public AndroidElement getCloseBtn() {
			return closeBtn;
		}

		public AndroidElement getProgressBar() {
			return progressBar;
		}

		public AndroidElement getStartDuration() {
			return startDuration;
		}

		public AndroidElement getEndDuration() {
			return endDuration;
		}

		public AndroidElement getPlayPauseBtn() {
			return playPauseBtn;
		}

		public AndroidElement getMaximizeBtn() {
			return maximizeBtn;
		}
		
		
		
}
