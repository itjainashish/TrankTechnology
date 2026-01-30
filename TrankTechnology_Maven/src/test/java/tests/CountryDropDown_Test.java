package tests;

import org.testng.annotations.Test;

import base.BrowserLaunch;
import pages.CountryDropDown;

public class CountryDropDown_Test extends BrowserLaunch {

	CountryDropDown In = new CountryDropDown(driver);
	@Test
	public void countryselect() throws InterruptedException
	{
		In.CountrySelect();
	}

}
