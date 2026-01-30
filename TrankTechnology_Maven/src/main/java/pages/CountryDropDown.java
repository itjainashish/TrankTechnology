package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryDropDown {
	private WebDriver driver;

	public CountryDropDown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//select[@id='countrySelector']")

	WebElement Country;
	@FindBy(xpath = "//option[@value='india']")
	WebElement India;

	public void CountrySelect() throws InterruptedException {
		Thread.sleep(1000);
		Country.click();
		Thread.sleep(1000);
		India.click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

	}
}
