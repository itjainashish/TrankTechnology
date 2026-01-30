package tests;

import org.testng.annotations.Test;

import base.BrowserLaunch;
import pages.staticPageNavigation;

public class staticPageNavigation_Test extends BrowserLaunch {
	staticPageNavigation sp = new staticPageNavigation(driver);

	@Test(priority = 2)
	public void StaticpageValidation() throws InterruptedException {
		sp.aboutus();

	}

	@Test(priority = 1)
	public void StaticpageValidation1() throws InterruptedException {
		sp.contactus();

	}
}
