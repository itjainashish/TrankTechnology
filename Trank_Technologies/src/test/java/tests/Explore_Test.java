package tests;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.LaunchBrowser;
import pages.ExplorePage;
import pages.HomePage;

public class Explore_Test extends LaunchBrowser {
	
	ExplorePage obj = new ExplorePage(driver);
	Actions a = new Actions(driver);
	@Test (priority=1) 
	public void explore() throws InterruptedException
	{
		
		//Request a call back 
		
		obj.exp_click();
		
		obj.name("Tester");
		
		obj.mail("tetser@gmail.com");
		
		obj.company("Tester");
		
		obj.service("eCommerce Development");
		
		obj.phone("99889989898");
		
		obj.message("Tets tset");
		
		obj.submit();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
		//Scrolling
	@Test (priority=2) 
	public void exp_accordian() throws InterruptedException
	{
		obj.accord();
	}	
		//WebElement targetElement = driver.findElement(By.xpath("//h2[text()='FAQs']"));
        
//        // Cast the driver to JavascriptExecutor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
//
//        // Optional: Add a slight delay to visually confirm the scroll action
//        Thread.sleep(2000);
        
//		String Accordian[] = {"(//div[@class='cm-faq-item'])[1]","(//div[@class='cm-faq-item'])[2]","(//div[@class='cm-faq-item'])[3]","(//div[@class='cm-faq-item'])[4]","(//div[@class='cm-faq-item'])[5]","(//div[@class='cm-faq-item'])[6]","(//div[@class='cm-faq-item'])[7]",
//				"(//div[@class='cm-faq-item'])[8]","(//div[@class='cm-faq-item'])[9]","(//div[@class='cm-faq-item'])[10]","(//div[@class='cm-faq-item'])[11]","(//div[@class='cm-faq-item'])[12]","(//div[@class='cm-faq-item'])[13]","(//div[@class='cm-faq-item'])[14]",
//				"(//div[@class='cm-faq-item'])[15]","(//div[@class='cm-faq-item'])[16]"};
//		
//		for(int i = 0; i<Accordian.length;i++)
//		{
//			WebElement accordian_click = driver.findElement(By.xpath(Accordian[i]));
//			Thread.sleep(3000);
//			a.moveToElement(accordian_click).click().perform();
//			System.out.println(i);
//		}
	}

