package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialLinks {

	private WebDriver driver;

	@FindBy(xpath = "//a[@href='https://www.facebook.com/TrankTechnologies']")
	WebElement facebook_footer;

	@FindBy(xpath = "//a[@href='https://in.linkedin.com/company/trank-technologies-official']")
	WebElement linkedin_footer;

	@FindBy(xpath = "//a[contains(@href,'instagram')]")
	WebElement insta_footer;

	public SocialLinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
