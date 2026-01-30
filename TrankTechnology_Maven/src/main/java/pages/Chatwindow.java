package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chatwindow {

	private WebDriver driver;
	private Actions a;
	public Chatwindow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "(//iframe[@title='chat widget'])[1]")
	WebElement chat2;

	@FindBy(xpath = "//button[@title='Chat widget']")
	WebElement chat3;

	@FindBy(xpath = "/html/body/header/div[1]/div/div[2]/a/img")
	WebElement Logo;

	public void ClickonChat() throws InterruptedException {
		Actions qa=new Actions (driver);


		Thread.sleep(10000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement f = chat2;
		driver.switchTo().frame(f);
		
		Thread.sleep(3000);
		WebElement c = chat3;
		qa.moveToElement(c).click().perform();
		System.out.println("Chat Widget Clicked ");
		Thread.sleep(5000);
		c.click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		Logo.click();
		System.out.println("Moved to Main screen and Clicked on logo");

		System.out.println("Automation Complete");
		
	
		
		
	}

}
