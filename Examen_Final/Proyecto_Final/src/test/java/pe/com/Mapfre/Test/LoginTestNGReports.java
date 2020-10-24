package pe.com.Mapfre.Test;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pe.com.Mapfre.PageObject.LoginPageObject;
import pe.com.Mapfre.Util.BaseUrlTest;

public class LoginTestNGReports extends BaseUrlTest {
	
	int int_random = ThreadLocalRandom.current().nextInt();
	
	
	ExtentHtmlReporter report = new ExtentHtmlReporter("./Reports/HtmlReport_"+ int_random +".html");
	ExtentReports extend = new ExtentReports();
	
  @Test(description="Login Mapfre Exito")
  public void LoginTestReportsSucess() throws InterruptedException, IOException {
	  
	  extend.attachReporter(report);
	  ExtentTest logger =  extend.createTest("Test Login Sucess");
	  getDriver().get("http://10.160.120.216/login/#/");
	  getDriver().manage().window().maximize();
	  LoginPageObject loginpage = new LoginPageObject(getDriver());
		
	  Thread.sleep(3000);
	  loginpage.UserLogin("");
	  loginpage.PasswordLogin("");
	  loginpage.ClickLogin();
	  logger.log(Status.PASS, getDriver().getTitle());
	  logger.assignCategory("Test Login Exito");
	  logger.assignAuthor("Marcial Perez");
	  extend.flush();
	 	  
  }
  @Test(description="Login Mapfre Falla")
  public void LoginTestReportsFail() throws InterruptedException {
	  
	  extend.attachReporter(report);
	  ExtentTest logger =  extend.createTest("Test Login Fail");
	  getDriver().get("http://10.160.120.216/login/#/");
	  getDriver().manage().window().maximize();
	  LoginPageObject loginpage = new LoginPageObject(getDriver());
		
	  Thread.sleep(3000);
	  loginpage.UserLogin("");
	  loginpage.PasswordLogin("");
	  loginpage.ClickLogin();
	  logger.log(Status.FAIL, (Markup) getDriver().findElement(By.linkText("Usuario o contraseña no valido")));
	  logger.assignCategory("Test Login Fallido");
	  logger.assignAuthor("Senayda Vilcas");
	  extend.flush();
	 	  
  }
}
