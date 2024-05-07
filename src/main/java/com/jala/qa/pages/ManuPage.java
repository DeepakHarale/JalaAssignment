package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class ManuPage extends TestBase {
	

	@FindBy(xpath = "//a[text()='Testing']")
	WebElement tab1;
	
	@FindBy(xpath = "//a[text()='Java']")
	WebElement tab2;
	
	@FindBy(xpath = "//a[text()='.Net']")
	WebElement tab3;
	
	
	@FindBy(xpath = "//a[text()='Java']")
	WebElement submenu;
	
	@FindBy(xpath = "//a[text()='Testing']")
	WebElement subtab1;
	
	@FindBy(xpath = "//a[text()='Java']")
	WebElement subtab2;
	
	@FindBy(xpath = "//a[text()='.Net']")
	WebElement subtab3;
	
	
	public ManuPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

}
