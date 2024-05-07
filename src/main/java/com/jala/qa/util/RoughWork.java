package com.jala.qa.util;



import java.io.IOException;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.CreateEmployeePage;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.MultipleTabsPage;

public class RoughWork extends TestBase {

	public RoughWork() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	static HomePage  homepage;
	 LoginPage log;
	 static CreateEmployeePage employee;
	 static TestUtil testutil;
	 static MultipleTabsPage multitab;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		TestBase test = new TestBase();
		Intialization();
		LoginPage log = new LoginPage();
		homepage = log.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		System.out.println("Login successfully done");
		
		homepage.clickOnEmployee();
		Thread.sleep(2000);
		System.out.println("Create empoyee Page successfully Open");
		 employee = new CreateEmployeePage();
		 
		 employee.createNewEmployeeInfo();
		 System.out.println("New Employee info saved successfully");
		 Thread.sleep(2000);
		 
		  
		  
		  homepage.navigateToHomePage();
		  Thread.sleep(2000);
		  homepage.clickOnMoreTab();
		  Thread.sleep(2000);
		  homepage.ClickonMultipleTab();
		  Thread.sleep(2000);
		   multitab = new MultipleTabsPage();
		   multitab.getTitleofMultiplePage();
		  
	}
	
	
	

}
