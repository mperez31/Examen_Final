package pe.com.Mapfre.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUrlTest {
 
	protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();

	public WebDriver getDriver() {
		return driver.get();
	}

	@BeforeMethod
	public void setup() {
		driver.set(new ChromeDriver());
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		getDriver().quit();
	}

}
