package com.jala.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.CreateEmployeePage;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;

public class CreateEmployeeDatailsTest extends TestBase{
	HomePage  homepage;
	 LoginPage loginpage;
	  CreateEmployeePage createwemployee;
	
	public CreateEmployeeDatailsTest() throws IOException {
		super();
		 		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		Intialization();
		 loginpage = new LoginPage();
		  homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
		  
	}
	

	@Test(priority = 1)
	public void VarifyNewEmployeeDetailsCreation() {
		createwemployee.createNewEmployeeInfo();
		Assert.assertTrue(true, "Employee dtails not created");
	}
	
	@AfterMethod (timeOut = 3000)
	public void tearDown(){
		
		driver.quit();
	}

}
