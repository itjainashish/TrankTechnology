package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;




public class BaseTest {
	protected WebDriver driver = new ChromeDriver();
	String driverPath = "C:\\Users\\VINNU\\Automation_testing\\selenium\\chromedriver-win64\\chromedriver.exe";
	@BeforeTest
	public void launch()
	{
		driver.navigate().to("https://www.kamera-express.nl/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("----Started Base Test----");
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
		System.out.println("----completed----");
	}
}
