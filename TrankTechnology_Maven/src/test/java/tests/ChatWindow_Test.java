package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BrowserLaunch;
import pages.Chatwindow;


public class ChatWindow_Test extends BrowserLaunch  {
	//WebDriver driver;
	Chatwindow cw = new Chatwindow(driver);
	
	@Test
	public void chatValidation() throws InterruptedException {
		cw.ClickonChat();
	}

}
