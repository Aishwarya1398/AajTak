package com.aajtak.android.EditProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_EditProf_005 extends Aajtak_app_Util {

	//460
	@Test(description="Verify that the user is able to select the Gender")
	public void AT_EditProf_005() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*click on Hamburger Icon */
		clickBtn(homescreen.getHamburgerIcon(),"hambergerIcon");
		/*click on loginOrRegister */
		clickBtn(loginOrRegister.getLoginOrRegister(),"LoginOrRegister");
		/*enter registered EmailID */
		loginOrRegister.getEmailOrPhone().sendKeys("aajtaktest001@gmail.com");
		/*Enter password */
		loginOrRegister.getPassword().sendKeys("testing@123");
		/*click on login */
		clickBtn(loginOrRegister.getLogin(),"Login");
		/*wait till hamburger Icon is display in homeScreen */
		waitTillElementPresent(homescreen.getHamburgerIcon(),30);
		/*click on Hamburger Icon */
		clickBtn(homescreen.getHamburgerIcon(),"HambergerIcon");
		/*click on view Profile */
		clickBtn(viewProfile.getViewProfile(),"ViewProfile");
		/*click on Edit Profile */
		clickBtn(viewProfile.getEditProfile(),"EditProfile");
		/*click on Gender */
		clickBtn(editProfile.getGender(),"Gender");
		/*select Sthree */
		clickBtn(editProfile.getSelectSthree(),"Sthree");
		/*validation:able to select the Gender */
		isElementExist(editProfile.getGender(),"Sthree");
		
		}
}
