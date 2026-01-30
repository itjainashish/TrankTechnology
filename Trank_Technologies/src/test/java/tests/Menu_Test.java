package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.LaunchBrowser;
import pages.Menu;

public class Menu_Test extends LaunchBrowser{

	Menu topmenu = new Menu(driver);
	//Actions a = new Actions(driver);
	@Test
	public void Trading_Menus() {
	//String Trading_Child_Menu[] = {""};
	//driver.findElement(By.xpath("((//a[@href='#'])[2]));
//	topmenu.VirtualMenuTab();
//	topmenu.Trading_hover();
	topmenu.StockTrading();
//	topmenu.PaperTrading();
//	topmenu.CFDTrading();
//	
//	topmenu.WhyChooseUs_option1();
//	topmenu.WhyChooseUs_option2();
//	topmenu.WhyChooseUs_option3();
//	
//	topmenu.TradingMobile_option1();
//	topmenu.TradingMobile_option2();
//	topmenu.TradingMobile_option3();
//	topmenu.TradingMobile_option4();
	
	
//	for(int i = 0; i<Trading_Child_Menu.length; i++)
//	{
//		
//		WebElement MainMenu_hover = driver.findElement(By.xpath("(//li[@class='drop_down']//a[text()='Verticals']"));
//		a.moveToElement(MainMenu_hover).perform();
//		//Thread.sleep(500);
//		
//		WebElement Trading_MouseHover = driver.findElement(By.xpath("//strong[text() = 'Trading']"));
//		a.moveToElement(Trading_MouseHover).perform();
//		//Thread.sleep(500);
//		
//		WebElement childMenu = driver.findElement(By.xpath(Trading_Child_Menu[i]));
//		a.moveToElement(childMenu).click().perform();
//		//Thread.sleep(1000);
//		driver.navigate().back();			
//	}
//	System.out.println("Trading Menu Completed");
	}
}




