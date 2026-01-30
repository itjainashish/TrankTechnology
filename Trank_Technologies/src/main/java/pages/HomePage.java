package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy (xpath="//a[@href='https://www.facebook.com/TrankTechnologies']")
	WebElement facebook_footer;
	
	@FindBy (xpath="//a[@href='https://in.linkedin.com/company/trank-technologies-official']")
	WebElement linkedin_footer;
	
	@FindBy (xpath="//a[contains(@href,'instagram')]")
	WebElement insta_footer;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void facebook_link() throws InterruptedException
	{
	    String parentWindow = driver.getWindowHandle();
		facebook_footer.click();
		
	    Set<String> allWindows = driver.getWindowHandles();

	    // Switch to child window and close it
	    for (String window : allWindows) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window);
	            Thread.sleep(2000);
	            driver.close();
	        }
	    }
	    driver.switchTo().window(parentWindow);
	}
	
	public void linkedin_link() throws InterruptedException
	{
	    String parentWindow = driver.getWindowHandle();
	    linkedin_footer.click();
		
	    Set<String> allWindows = driver.getWindowHandles();

	    // Switch to child window and close it
	    for (String window : allWindows) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window);
	            Thread.sleep(2000);
	            driver.close();
	        }
	    }
	    driver.switchTo().window(parentWindow);
	}
	
	public void insta_link() throws InterruptedException
	{
		String parentWindow = driver.getWindowHandle();
	    insta_footer.click();
		
	    Set<String> allWindows = driver.getWindowHandles();

	    // Switch to child window and close it
	    for (String window : allWindows) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window);
	            Thread.sleep(2000);
	            driver.close();
	        }
	    }
	    driver.switchTo().window(parentWindow);
	}
}
