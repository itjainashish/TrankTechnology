package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	@FindBy (xpath="//button[@cs-consent=\"all\"]")
	WebElement consent;
	
	@FindBy (xpath="(//button[@class=\"user-button sf-button--text no-underline sf-button\"])[2]")
	WebElement main_login;
	
	@FindBy (xpath="(//button[@class=\"sf-button\"])[2]")
	WebElement login;
	
	@FindBy (xpath="//input[@type=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id=\"btn_login\"]")
	WebElement login_button;
	
	public void consent_click() {
		consent.click();
	}
	
	public void main_login_click() {
		main_login.click();
	}
	
	public void login_click() {
		login.click();
	}
	
	public void email_input(String s) {
		email.sendKeys(s);
	}
	public void pwd_input(String s) {
		pwd.sendKeys(s);
	}
	
	public void login_button_click() {
		login_button.click();
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
