package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BrowserLaunch {

	protected WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.tranktechnologies.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
