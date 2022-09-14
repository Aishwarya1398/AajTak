package com.aajtak.android.EditProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_EditProf_007 extends Aajtak_app_Util {

	//461
	@Test(description="Verify that the user is able to edit location")
	public void AT_EditProf_007() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		clickBtn(homescreen.getHamburgerIcon(),"hambergerIcon");
		clickBtn(loginOrRegister.getLoginOrRegister(),"LoginOrRegister");
		loginOrRegister.getEmailOrPhone().sendKeys("aajtaktest001@gmail.com");
		loginOrRegister.getPassword().sendKeys("testing@123");
		clickBtn(loginOrRegister.getLogin(),"Login");
		waitTillElementPresent(homescreen.getHamburgerIcon(),30);
		clickBtn(homescreen.getHamburgerIcon(),"HambergerIcon");
		clickBtn(viewProfile.getViewProfile(),"ViewProfile");
		clickBtn(viewProfile.getEditProfile(),"EditProfile");
		editProfile.getUserLocation().sendKeys("Bangalore");
		isElementExist(editProfile.getUserLocation(),"User Location");
	}
}
