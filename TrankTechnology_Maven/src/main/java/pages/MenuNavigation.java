package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BrowserLaunch;

public class MenuNavigation {
	
	private WebDriver driver;
	
	
	public MenuNavigation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "(//a[@href='#'])[2]")
	WebElement virtual_mousehover;
	
	@FindBy (xpath = "//strong[text() = 'Trading']")
	WebElement trading_mousehover;
	
	//Stock Trading Page
	
	@FindBy (xpath = "(//a[text()='Stock Trading'])[1]")
	WebElement stockTrading;
	
	@FindBy (xpath = "(//a[text()='Paper Trading'])[1]")
	WebElement paperTrading;
	
	@FindBy (xpath = "(//a[text()='CFD Trading'])[1]")
	WebElement cfdTrading;
	
//	@FindBy (xpath = "//h4[normalize-space()='Multi-dimensional approach for app personalization']")
//	WebElement WhyChooseUs_option1;
//	
//	@FindBy (xpath = "//h4[normalize-space()='Frameworks that offer customer-first accessibility']")
//	WebElement WhyChooseUs_option2;
//	
//	@FindBy (xpath = "//h4[normalize-space()='Streamlined client support from technology experts']")
//	WebElement WhyChooseUs_option3;
//	
//	@FindBy (xpath = "//h4[text()='User Authentication']")
//	WebElement TradingMobileApp_option1;
//	
//	@FindBy (xpath = "//h4[text()='Page Accessibility']")
//	WebElement TradingMobileApp_option2;
//	
//	@FindBy (xpath = "//h4[text()='Stock Maintenance']")
//	WebElement TradingMobileApp_option3;
//	
//	@FindBy (xpath = "//h4[text()='Market Analysis']")
//	WebElement TradingMobileApp_option4;
	
	
	
//	public void VirtualMenuTab()
//	{
//		Actions a = new Actions(driver);
//		
//	}
//	
//	public void Trading_hover()
//	{
//		Actions a = new Actions(driver);		
//	}
	
	public void StockTrading()
	{
		Actions a = new Actions(driver);
		//VirtualMenuTab();
		a.moveToElement(virtual_mousehover).perform();
		//Trading_hover();
		a.moveToElement(trading_mousehover).perform();
		stockTrading.click();
		driver.navigate().back();
	}
	
	public void PaperTrading()
	{
		paperTrading.click();
		driver.navigate().back();
	}
//	
//	public void CFDTrading()
//	{
//		cfdTrading.click();
//		driver.navigate().back();
//	}
	
//	public void WhyChooseUs_option1()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(WhyChooseUs_option1).perform();
//	}
//	
//	public void WhyChooseUs_option2()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(WhyChooseUs_option2).perform();
//	}
//	
//	public void WhyChooseUs_option3()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(WhyChooseUs_option3).perform();
//	}
//	
//	public void TradingMobile_option1()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(TradingMobileApp_option1).perform();
//	}
//	
//	public void TradingMobile_option2()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(TradingMobileApp_option2).perform();
//	}
//	
//	public void TradingMobile_option3()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(TradingMobileApp_option3).perform();
//	}
//	
//	public void TradingMobile_option4()
//	{
//		Actions a  = new Actions(driver);
//		a.moveToElement(TradingMobileApp_option4).perform();
//		driver.navigate().back();
//	}
	
	
}
