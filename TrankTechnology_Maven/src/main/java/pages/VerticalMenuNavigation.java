package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerticalMenuNavigation {
	private WebDriver driver;

	public VerticalMenuNavigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()='Verticals'])[1]")
	WebElement Vertical;

	@FindBy(xpath = "(//a[@href='#'])[2]")
	WebElement Trading;

	@FindBy(xpath = "(//a[text()='Stock Trading'])[1]")
	WebElement Stock_Trading;

//	@FindBy(xpath= "(//a[text()='Algo Trading']")
//	WebElement Algo_Trading;

	@FindBy(xpath = "(//a[text()='Paper Trading'])[1]")
	WebElement paper_Trading;

	@FindBy(xpath = "(//a[text()='CFD Trading'])[1]")
	WebElement CFD_Trading;

	@FindBy(xpath = "(-//a[normalize-space()='Custom Trading'])[1]")
	WebElement Custom_Trading;

	@FindBy(xpath = "(//a[text()='Web Portal Trading'])[1]")
	WebElement Web_PortalTrading;

	@FindBy(xpath = "(//a[normalize-space()='Trading App Development in Massachusetts'])[1]")
	WebElement Trading_App_Development;

	@FindBy(xpath = "//strong[text()='Retail and Ecommerce']")
	WebElement Retail_Ecommerce;

	@FindBy(xpath = "(//a[normalize-space()='eCommerce Website Development'])[1]")
	WebElement eCommerce_Website_Development;

	@FindBy(xpath = "//a[text()='eCommerce App Development']")
	WebElement eCommerce_App_Development;

	@FindBy(xpath = "//strong[text()='Healthcare']")
	WebElement Healthcare;

	@FindBy(xpath = "(//a[@href=\"https://www.tranktechnologies.com/diet-and-nutrition-app-developement\"])[1]")
	WebElement diet_nutrition_developement;
	@FindBy(xpath = "//a[text()='Health tracking App'][1]")
	WebElement Health_tracking_App;

	@FindBy(xpath = "//li[@data-id='fintech']")
	WebElement FinTech;

	@FindBy(xpath = "(//a[@href='https://www.tranktechnologies.com/pos-software-development-company'])[1]")
	WebElement pos_software;
	@FindBy(xpath = "(//a[text()='Crypto'])[1]")
	WebElement Crypto;

	@FindBy(xpath = "//strong[text()='Custom App']")
	WebElement Custom_App;

	@FindBy(xpath = "//*[@id=\"customApp\"]/ul/li[1]/a")
	WebElement Desktop_app;
	
	@FindBy(xpath = "(//a[text()='Real Estate'])[1]")
	WebElement Real_Estate;
	
	@FindBy(xpath = "(//a[text()='E-Learning'])[1]")
	WebElement ELearning;
	
	@FindBy(xpath = "(//a[text()='Travel'])[1]")
	WebElement Travel;
	
	@FindBy(xpath = "(//a[text()='CRM Development'])[1]")
	WebElement CRM_Development;
	
	@FindBy(xpath = "(//a[text()='HRM Development'])[1]")
	WebElement HRM_Development;
	
	@FindBy(xpath = "(//a[text()='CRM Development USA'])[1]")
	WebElement CRM_Development_USA;

	@FindBy(xpath = "(//a[text()='Dating App Development'])[1]")
	WebElement Dating_App;

	public void mouseHover(WebElement Element) {
		Actions actionClass = new Actions(driver);
		actionClass.moveToElement(Element).perform();

	}

	public void clickonwebelement(WebElement Element) {
		Actions actionClass = new Actions(driver);
		actionClass.moveToElement(Element).click().perform();
	}

	public void TradingLoop() throws InterruptedException {
		mouseHover(Vertical);
		System.out.println(Trading.getText() + "  :  Vertical  Open");
		WebElement[] TradingModule = { Stock_Trading, paper_Trading, CFD_Trading, Custom_Trading, Web_PortalTrading,
				Trading_App_Development };
		for (int i = 0; i < TradingModule.length; i++) {

			mouseHover(Trading);
			System.out.println(Trading.getText() + "  :  Trading  Open");

			WebElement Trading_Submodule = TradingModule[i];
			System.out.println((TradingModule[i]));
			Thread.sleep(2000);
			clickonwebelement(Trading_Submodule);
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(4000);

			mouseHover(Vertical);

			Thread.sleep(2000);
			mouseHover(Trading);
		}
	}

	public void RetailEcommerceLoop() throws InterruptedException {
		mouseHover(Vertical);
		System.out.println(Retail_Ecommerce.getText() + "  :  Vertical  Open");
		WebElement[] RetailEcomModule = { eCommerce_Website_Development, eCommerce_App_Development };
		for (int i = 0; i < RetailEcomModule.length; i++) {
			mouseHover(Retail_Ecommerce);
			System.out.println(Retail_Ecommerce.getText() + "  :  Retail_Ecommerce  Open");

			WebElement Retail_Ecommerce_Submodule = RetailEcomModule[i];
			System.out.println((RetailEcomModule[i]));
			Thread.sleep(2000);
			clickonwebelement(Retail_Ecommerce_Submodule);
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(4000);

			mouseHover(Vertical);

			Thread.sleep(2000);
			mouseHover(Retail_Ecommerce);

		}

	}

	public void HealthcareLoop() throws InterruptedException {
		mouseHover(Vertical);
		System.out.println(Healthcare.getText() + "  :  Vertical  Open");
		WebElement[] HealthcareModule = { diet_nutrition_developement, Health_tracking_App };
		for (int i = 0; i < HealthcareModule.length; i++) {
			mouseHover(Healthcare);
			System.out.println(Healthcare.getText() + "  :  Healthcare  Open");

			WebElement Healthcare_Submodule = HealthcareModule[i];
			System.out.println((HealthcareModule[i]));
			Thread.sleep(2000);
			clickonwebelement(Healthcare_Submodule);
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(4000);

			mouseHover(Vertical);

			Thread.sleep(2000);
			mouseHover(Healthcare);

		}

	}

	public void FinTechLoop() throws InterruptedException {
		mouseHover(Vertical);
		System.out.println(FinTech.getText() + "  :  Vertical  Open");
		WebElement[] FinTechModule = { pos_software, Crypto };
		for (int i = 0; i < FinTechModule.length; i++) {
			mouseHover(FinTech);
			System.out.println(FinTech.getText() + "  :  FinTech  Open");

			WebElement FinTech_Submodule = FinTechModule[i];
			System.out.println((FinTechModule[i]));
			Thread.sleep(2000);
			clickonwebelement(FinTech_Submodule);
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(4000);

			mouseHover(Vertical);

			Thread.sleep(2000);
			mouseHover(FinTech);

		}

	}
	
	public void Custom_AppLoop() throws InterruptedException {
		mouseHover(Vertical);
		System.out.println(Custom_App.getText() + "  :  Vertical  Open");
		WebElement[] Custom_AppModule = { Desktop_app,Real_Estate,ELearning,Travel,CRM_Development,HRM_Development,CRM_Development_USA,Dating_App};
		for (int i = 0; i < Custom_AppModule.length; i++) {
			mouseHover(Custom_App);
			System.out.println(Custom_App.getText() + "  :  Custom_App  Open");

			WebElement Custom_App_Submodule = Custom_AppModule[i];
			System.out.println((Custom_AppModule[i]));
			Thread.sleep(2000);
			clickonwebelement(Custom_App_Submodule);
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(4000);

			mouseHover(Vertical);

			Thread.sleep(2000);
			mouseHover(FinTech);

		}

	}

}