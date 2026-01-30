package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class Kamera_Express_Test extends BaseTest{
	
		
	@Test(priority = 0)
	void Login_Test() throws InterruptedException {
		
		Thread.sleep(3000);
		LoginPage l = new LoginPage(driver);
		l.consent_click();
		l.main_login_click();
		System.out.println("Clicked on main login");
		l.login_click();
		System.out.println("Clicked on  login");
		l.email_input("yaswinipriya@gmail.com");
		l.pwd_input("Vinnu@1992");
		l.login_button_click();
		l.login_button_click();				
		System.out.println("Logged in succesfully");	
			
	}
	@Test(priority = 1)
	void Product_Test() throws InterruptedException {
		Thread.sleep(5000);
		ProductPage p = new ProductPage(driver);
		p.addtocartandremove();
		
	}
	
}


