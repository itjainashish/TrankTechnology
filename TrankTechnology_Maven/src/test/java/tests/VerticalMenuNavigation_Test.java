package tests;

import org.testng.annotations.Test;

import base.BrowserLaunch;
import pages.VerticalMenuNavigation;

public class VerticalMenuNavigation_Test extends BrowserLaunch {

	VerticalMenuNavigation mn = new VerticalMenuNavigation(driver);

	@Test(priority = 1)
	public void TradingValidation() throws InterruptedException {
		mn.TradingLoop();
	}

	@Test(priority = 2)
	public void RetailEcommerceValidation() throws InterruptedException {
		mn.RetailEcommerceLoop();
	}

	@Test(priority = 3)
	public void HealthcareValidation() throws InterruptedException {
		mn.HealthcareLoop();
	}

	@Test(priority = 4)
	public void FinTechValidation() throws InterruptedException {
		mn.FinTechLoop();
	}
	
	@Test(priority = 5)
	public void CustomAppValidation() throws InterruptedException {
		mn.Custom_AppLoop();
	}


}
