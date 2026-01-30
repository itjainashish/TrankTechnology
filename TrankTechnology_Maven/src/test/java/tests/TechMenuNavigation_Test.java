package tests;

import org.testng.annotations.Test;

import base.BrowserLaunch;
import pages.TechnologyMenuNavigation;


public class TechMenuNavigation_Test extends BrowserLaunch {
	TechnologyMenuNavigation vmn = new TechnologyMenuNavigation(driver);
	@Test(priority = 1)
	public void eCommerce_DevValidation() throws InterruptedException {
		vmn.eCommerce_DevLoop();
	}


}
