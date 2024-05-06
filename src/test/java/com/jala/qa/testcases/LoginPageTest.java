
package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		Intialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void logintext() throws IOException {
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test (priority = 2)
	public void loginPageTitle() {
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}
	
	@Test (priority = 3)
	public void loginPageVisibletext() {
		
		 boolean text = loginpage.ValidateLoginPageText();
		Assert.assertTrue(text);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
		
	}
}
