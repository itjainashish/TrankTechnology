package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechnologyMenuNavigation {
	

	private WebDriver driver;

	public TechnologyMenuNavigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Technologies'])[1]")
	WebElement Technologies;
	@FindBy(xpath = "//strong[text()='eCommerce Development']")
	WebElement eCommerce_Dev;
	@FindBy(xpath = "(//a[text()='Magento Development'])")
	WebElement Magento;
	@FindBy(xpath = "(//a[text()='Opencart Development'])[1]")
	WebElement Opencart;
	@FindBy(xpath = "(//a[text()='Codeigniter Development'])[1]")
	WebElement Codeigniter;
	@FindBy(xpath = "(//a[text()='WordPress Development'])[1]")
	WebElement WordPress;
	@FindBy(xpath = "(//a[text()='Big Commerce'])[1]")
	WebElement BigCommerce;
	@FindBy(xpath = "(//a[text()='Shopify Development'])[1]")
	WebElement Shopify;
	@FindBy(xpath = "(//a[text()='CS-Cart Development'])[1]")
	WebElement CSCart;
	
	public void mouseHover(WebElement Element) {
		Actions actionClass = new Actions(driver);
		actionClass.moveToElement(Element).perform();

	}

	public void clickonwebelement(WebElement Element) {
		Actions actionClass = new Actions(driver);
		actionClass.moveToElement(Element).click().perform();
	}

	public void eCommerce_DevLoop() throws InterruptedException {
		mouseHover(Technologies);
		System.out.println(eCommerce_Dev.getText() + "  :  Technologies  Open");
		WebElement[] eCommerce_DevModule = {Magento,Opencart,Codeigniter,WordPress,BigCommerce,Shopify,CSCart};
		for (int i = 0; i < eCommerce_DevModule.length; i++) {

			mouseHover(eCommerce_Dev);
			System.out.println(eCommerce_Dev.getText() + "  :  eCommerce_Dev  Open");

			WebElement eCommerce_Dev_Submodule = eCommerce_DevModule[i];
			System.out.println((eCommerce_DevModule[i]));
			Thread.sleep(2000);
			clickonwebelement(eCommerce_Dev_Submodule);
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(4000);

			mouseHover(Technologies);

			Thread.sleep(2000);
			mouseHover(eCommerce_Dev);
		}
	}

}
