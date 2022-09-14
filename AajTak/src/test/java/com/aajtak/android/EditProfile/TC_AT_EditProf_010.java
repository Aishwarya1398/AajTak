package com.aajtak.android.EditProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_EditProf_010 extends Aajtak_app_Util {

	//468:validation pending[review]
	//@Test(description="Verify that the user is able to change the profile picture")
	public void AT_EditProf_010() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		clickBtn(homescreen.getHamburgerIcon(),"HambergerIcon");
		clickBtn(loginOrRegister.getLoginOrRegister(),"LoginOrRegister");
		loginOrRegister.getEmailOrPhone().sendKeys("aajtaktest001@gmail.com");
		loginOrRegister.getPassword().sendKeys("testing@123");
		clickBtn(loginOrRegister.getLogin(),"login");
		waitTillElementPresent(homescreen.getHamburgerIcon(),30);
		clickBtn(homescreen.getHamburgerIcon(),"HambergerIcon");
		clickBtn(viewProfile.getViewProfile(),"ViewProfile");
		clickBtn(viewProfile.getEditProfile(),"EditProfile");
		clickBtn(editProfile.getPhotoSelection(),"photo Selection");
		clickBtn(editProfile.getCamera(),"camera Option");
		clickBtn(aDriver.findElementByXPath("(//android.widget.ImageView[@resource-id='android:id/icon'])[1]"),"Phone camera");
		clickBtn(aDriver.findElementByAccessibilityId("Shutter button"),"Shutter Button");
		clickBtn(aDriver.findElementByXPath("//android.widget.ImageView[@resource-id='com.android.camera:id/inten_done_apply']"),"Apply");
		waitTillElementPresent(editProfile.getSaveKaren(),10);
		clickBtn(editProfile.getSaveKaren(),"save kare");
	//	String msg = editProfile.getToastMsg().getText();
	//	verifyTwoText(msg, "प्रोफाइल डिटेल सफलतापूर्वक अपडेट किया गया");
		
	
		}
}
