package com.aajtak.android.EditProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_EditProf_011 extends Aajtak_app_Util {

	//466
	@Test(description="Verify that the user is able to save the changes")
	public void AT_EditProf_011() throws InterruptedException 
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
		/*Enter Username */
		editProfile.getEditUserName().sendKeys("Aajtak Testing");
		/*click on save page */
		clickBtn(editProfile.getSaveKaren(),"save karen");
		String msg = editProfile.getToastMsg().getText();
		/*validation:able to save the changes*/
		verifyTwoText(msg, "प्रोफाइल डिटेल सफलतापूर्वक अपडेट किया गया");
		}
}
