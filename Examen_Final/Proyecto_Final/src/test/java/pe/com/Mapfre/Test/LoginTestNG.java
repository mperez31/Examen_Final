package pe.com.Mapfre.Test;

import org.testng.annotations.Test;

import pe.com.Mapfre.PageObject.LoginPageObject;
import pe.com.Mapfre.Util.BaseUrlTest;

public class LoginTestNG extends BaseUrlTest {
  @Test
  public void Login() throws InterruptedException {
	  getDriver().get("http://10.160.120.216/login/#/");
	  LoginPageObject loginpage = new LoginPageObject(getDriver());
		
	  Thread.sleep(3000);
	  loginpage.UserLogin("");
	  loginpage.PasswordLogin("");
	  loginpage.ClickLogin();
	  
  }
}
