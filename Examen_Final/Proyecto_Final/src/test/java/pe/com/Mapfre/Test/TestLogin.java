package pe.com.Mapfre.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import pe.com.Mapfre.PageObject.LoginPageObject;


public class TestLogin {
 
	private static WebDriver driver;
	private static String url = "http://10.160.120.216/login/#/";
	
public static void main(String[] args) throws InterruptedException {
		
		LoginTestSucess();

	}
public static void LoginTestSucess() throws InterruptedException {
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	LoginPageObject loginpage = new LoginPageObject(driver);
		
	Thread.sleep(3000);
	loginpage.UserLogin("");
	loginpage.PasswordLogin("");
	
	//click on search button
	Thread.sleep(3000);
	loginpage.ClickLogin();
	
	Thread.sleep(2000);
	driver.quit();
  }

}
