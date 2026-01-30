package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class LaunchBrowser {
	protected WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void launch()
	{
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}

}
