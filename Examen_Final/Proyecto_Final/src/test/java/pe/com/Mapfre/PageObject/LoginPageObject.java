package pe.com.Mapfre.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	
private static WebDriver driver;
	
	private By login = By.xpath("/html/body/div/div/section/div/div/div[1]/div/div[2]/div/ui-view/mx-login/form/div[1]/div[1]/input");
	private By clave = By.xpath("/html/body/div/div/section/div/div/div[1]/div/div[2]/div/ui-view/mx-login/form/div[2]/div[1]/input");
	private By Imput_Button = By.xpath("/html/body/div/div/section/div/div/div[1]/div/div[2]/div/ui-view/mx-login/form/div[3]/a");
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void UserLogin(String user) {
		driver.findElement(login).sendKeys(user);
	}

	public void PasswordLogin(String password) {
		driver.findElement(clave).sendKeys(password);
	}
	
	public void ClickLogin( ) {
		driver.findElement(Imput_Button).click();
	}

}
