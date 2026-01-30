package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExplorePage {
	
	private WebDriver driver;
	private Actions actions;
	
	@FindBy (xpath="//a[contains(@class,'cm-slider-btn') and @tabindex='-1']")
	WebElement explore_button;
	
	@FindBy (xpath="(//input[@placeholder='Your Name'])[2]")
	WebElement name;
	@FindBy (xpath="(//input[@placeholder='Your Mail'])[2]")
	WebElement mail;
	@FindBy (xpath="(//input[@placeholder='Your Company'])[2]")
	WebElement company;
	@FindBy (xpath="(//select[@name='service'])[2]")
	WebElement service;
	@FindBy (xpath="(//input[@placeholder='Your Phone'])[2]")
	WebElement phone;
	@FindBy (xpath="(//textarea[@placeholder='Message'])[2]")
	WebElement message;
	@FindBy (xpath="(//input[@type='submit'])[2]")
	WebElement submit;
	
	public ExplorePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.actions = new Actions(driver);
		
	}
	
	public void exp_click() throws InterruptedException
	{
		Thread.sleep(1000);
		explore_button.click();
	}
	
	public void name(String a) throws InterruptedException
	{
		Thread.sleep(1000);
		name.sendKeys(a);
	}
	
	public void mail(String m) throws InterruptedException
	{Thread.sleep(1000);
		mail.sendKeys(m);
	}
	
	public void company(String c) throws InterruptedException
	{Thread.sleep(1000);
		company.sendKeys(c);
	}
	
	public void service(String svrc)
	{
		Select select = new Select(service);
		if(!select.isMultiple())
		{
		select.selectByVisibleText(svrc);
		}
		//service.sendKeys(svrc);
	}
	
	public void phone(String num)
	{
		phone.sendKeys(num);
	}
	
	public void message(String mes)
	{
		message.sendKeys(mes);
	}
	
	public void submit()
	{
		submit.click();
	}
	
	//Accordian
	
//	@FindBy (xpath = "//h2[text()='FAQs']")
//	WebElement scrolltoAccordian_Section;
	
	@FindBy (xpath = "//div[@class='cm-faq-item']")
	private List<WebElement> accordian;
	
	
	
	public void accord() throws InterruptedException
	{
		for(int i = 0; i<accordian.size();i++)
		{
			//WebElement accordian_click = driver.findElement(By.xpath(Accordian[i]));
			Thread.sleep(3000);
			actions.moveToElement(accordian.get(i)).click().perform();
			System.out.println(i);
		}
	}		
}
