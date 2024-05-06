package com.jala.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.jala.qa.base.TestBase;
import com.jala.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/center/h1")
	WebElement gethometext;
	@FindBy(xpath = "/html/body/div[2]/aside/section/div/div[2]/p[1]")
	WebElement getuserid;
	@FindBy(tagName = "a")
	WebElement getlinks;
	@FindBy(linkText = "Employee")
	WebElement clickonemployee;
	@FindBy(xpath = "//a[text()=' Create ']")
	WebElement createemp;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getTitleHomePage() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getTitle();
		
		
	}
	
	public String getHomeVisibletext() {
		return gethometext.getText();	 
	}
	
	public String getUserId() {
		return getuserid.getText();
	}
	
	public void getVisibleLinksOnHomePgae() {
		System.out.println("Total no. of links = "+ getlinks.getSize());
		 
	}
	
	public CreateEmployeePage clickOnEmployee() throws InterruptedException, IOException {
		clickonemployee.click();
		System.out.println("Cliked on Employee Manue");
		createemp.click();
		System.out.println("Clicked on Create Page");
		
		return new CreateEmployeePage();
	}

	
}
