package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class staticPageNavigation {
	private WebDriver driver;

	public staticPageNavigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href=\"https://www.tranktechnologies.com/about\"])[1]")
	WebElement About_Us;

	@FindBy(xpath = "(//a[text()='Contact us'])[1]")
	WebElement Contact_Us;

	public void aboutus() throws InterruptedException {
		About_Us.click();
		System.out.println("About Us Clicked");
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(1000);
	}

	public void contactus() throws InterruptedException {
		Contact_Us.click();
		System.out.println("Contact  Us Clicked");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}}