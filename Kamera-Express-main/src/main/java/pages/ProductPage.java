package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	private WebDriver driver;
	
	
	@FindBy (xpath= "(//li[@class=\"nav--dropdown\"])[1]")
	WebElement product;
	
	@FindBy (xpath = "(//li[@class=\"Mainlist--links--item active\"])[1]")
	
	WebElement camera;
	
	@FindBy (xpath = "(//a[normalize-space()=\"Systeemcamera's\"])[1]")
	WebElement systemcamera;
	
	@FindBy (xpath="(//div[@class=\"button-content\"])[1]")
	WebElement button; 
	
	@FindBy ( xpath = "(//div[@class=\"mini-cart-button-container\"])[2]")
	WebElement cart;
	
//	@FindBy ( xpath = "(//a[text()=\"Bestellen\"])[1]")
//	WebElement viewcart;
	
	@FindBy (xpath = "//button[@class=\"delete-button sf-button--text no-underline sf-button\"]")
	WebElement delete;
	
	public void addtocartandremove() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(product).perform();
		System.out.println("Mouse over on producten menu done succesfully");

		camera.click();
		System.out.println("Mouse over on fotocamera menu done succesfully");
		
		systemcamera.click();
		System.out.println("Clicked on systeem camera succesfully");
		
		button.click();
		System.out.println("Clicked on first camera item");
		
		cart.click();
		System.out.println("Clicked on cart element");
		Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement viewcart = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("(//button[@class=\"sf-button\"])[2]")
		    )
		);
		
		a.moveToElement(viewcart).click().perform();
		System.out.println("Clicked on orders");
		Thread.sleep(10000);
		delete.click();
		System.out.println("Deleted succesfully from the cart");
		
		
		}
	
		
	public ProductPage(WebDriver driver) {
		this.driver=driver;		
		PageFactory.initElements(driver, this);

	}
	

}
