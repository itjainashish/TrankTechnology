package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.LaunchBrowser;
import pages.HomePage;

public class Footer_Test extends LaunchBrowser {
	
	HomePage home = new HomePage(driver);
	@Test(priority=1)
	public void footerSocialMedia_Icon() throws InterruptedException, IOException
	{
		home.facebook_link();
		
		home.linkedin_link();
		
		home.insta_link();
		
		
		
//		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/TrankTechnologies']")).click();
//	    String parentWindow = driver.getWindowHandle();
//	    Set<String> allWindows = driver.getWindowHandles();
//
//	    // Switch to child window and close it
//	    for (String window : allWindows) {
//	        if (!window.equals(parentWindow)) {
//	            driver.switchTo().window(window);
//	            Thread.sleep(2000);
//	            driver.close();
//	        }
//	    }
//	    
//	    driver.switchTo().window(parentWindow);
//	    
//	    Thread.sleep(3000);
//	    
//	    driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/trank-technologies-official']")).click();
//	    String parent1Window = driver.getWindowHandle();
//	    Set<String> linkedinnWindows = driver.getWindowHandles();
//
//	    // Switch to child window and close it
//	    for (String window1 : linkedinnWindows) {
//	        if (!window1.equals(parent1Window)) {
//	            driver.switchTo().window(window1);
//	            Thread.sleep(2000);
//	            driver.close();
//	        }
//	    }
//	    driver.switchTo().window(parent1Window);
//	    
//	    Thread.sleep(3000);
//		
//	   driver.findElement(By.xpath("//a[@href=\"https://www.instagram.com/tranktechnologies/\"]")).click();
//	    String parent2Window = driver.getWindowHandle();
//	    Set<String> InstagramWindows = driver.getWindowHandles();
//
//	    // Switch to child window and close it
//	    for (String instawindow : InstagramWindows) {
//	        if (!instawindow.equals(parent2Window)) {
//	            driver.switchTo().window(instawindow);
//	            Thread.sleep(2000);
//	            driver.close();
//	        }
//	    }
//	    driver.switchTo().window(parent2Window);
	    
//	    String footer_social_icons[] = {"//a[@href='https://www.facebook.com/TrankTechnologies']","//a[@href='https://in.linkedin.com/company/trank-technologies-official']","//a[@href=\"https://www.instagram.com/tranktechnologies/\"]",
//	    								"//a[@href=\"https://in.pinterest.com/tranktechnologies12/\"]","//a[@href='https://twitter.com/tranktechno']","//a[@href='https://www.youtube.com/channel/UCWu1Y-tfrXf-Utpaft830Cg']",
//	    								"//a[@href=\'https://www.quora.com/profile/Trank-Technologies-1\']"};
//	    
//	    //For Screenshots
//	    String[] socialNames = {
//	            "Facebook", "LinkedIn", "Instagram", "Pinterest",
//	            "Twitter", "YouTube", "Quora"
//	    };
//	    
//	    String parentWindow = driver.getWindowHandle();
//	    
//	    for(int i=0; i<footer_social_icons.length;i++)
//	    {
//	    	WebElement socail_icons = driver.findElement(By.xpath(footer_social_icons[i]));
//	    	a.moveToElement(socail_icons).click().perform();
//	    	Set<String> allWindows = driver.getWindowHandles();
//	    	for (String window : allWindows) {
//		        if (!window.equals(parentWindow)) {
//		            driver.switchTo().window(window);
//		            Thread.sleep(2000);
//		            
//		            //Screenshots
//		            TakesScreenshot ts = (TakesScreenshot) driver;
//		            File src = ts.getScreenshotAs(OutputType.FILE);
//
//		            File dest = new File(socialNames[i] +".png");
////		            
////		            //File dest = new File(
////           		 //For creating a folder
////                    System.getProperty("user.dir") 
////                    + "/screenshots/" + socialNames[i] + ".png"
////                );
//		            FileUtils.copyFile(src, dest);
//		            
//		            driver.close();
//		        }	        
//		       // if(!(parentWindow.equals(allWindows)))
//		    }
//	    	driver.switchTo().window(parentWindow);
//	    	//System.out.println(driver.getTitle());
//	    }

	}
}
