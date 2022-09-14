package com.aajtak.android.EditProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_EditProf_009 extends Aajtak_app_Util {

	//465
	@Test(description="Verify that if the user is login with phone then the phone fiield should display as Contact Information")
	public void AT_EditProf_009() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*click on Hamburger Icon */
		clickBtn(homescreen.getHamburgerIcon(),"hambergerIcon");
		/*click on loginOrRegister */
		clickBtn(loginOrRegister.getLoginOrRegister(),"LoginOrRegister");
		/*enter registered phone NO */
		loginOrRegister.getEmailOrPhone().sendKeys("9538000000");
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
		/*Validation:phone field should display as Contact Information*/
		isElementExist(editProfile.getRegisteredPhoneNum(),"Registered PhoneNum");
	}
}


