package com.aajtak.android.NonFunctional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 2 June 2021
 * 
 * Description: Verify that 'aap abhi offline hai' message is displaying when
 * the internet is turned off
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_005 extends Aajtak_app_Util {

	@Test(priority = 5, description = "Description: Verify that 'aap abhi offline hai' message is displaying when the internet is turned off")

	public void AT_NonFunctional_005() throws Exception {
		reOpenApp();
		Aajtak_app_Util.compelteOnboarding();
		/*
		 * aDriver.setConnection(new
		 * ConnectionStateBuilder().withDataEnabled().withWiFiEnabled().build());
		 * aDriver.setConnection(new
		 * ConnectionStateBuilder().withDataDisabled().withWiFiDisabled().build());
		 * aDriver.setConnection(new ConnectionState(1)); Thread.sleep(10000);
		 * System.out.println("Data Off");
		 * isElementExist(nonFunctional.getOfflineToast());
		 * clickBtn(nonFunctional.getPhotoTab());
		 * isElementExist(nonFunctional.getOfflineText());
		 * clickBtn(nonFunctional.getVideoTab());
		 * isElementExist(nonFunctional.getOfflineText()); // aDriver.toggleData();
		 * aDriver.setConnection(new
		 * ConnectionStateBuilder().withWiFiEnabled().withDataEnabled().build());
		 * System.out.println("Data On"); aDriver.setConnection(new ConnectionState(1));
		 */
	}
}
