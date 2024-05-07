package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class MultipleTabsPage extends TestBase {

	@FindBy(xpath = "//a[text()='Plan to Succeed']")
	WebElement tab1;
	
	@FindBy(xpath = "//a[text()='UnLearning']")
	WebElement tab2;
	
	@FindBy(xpath = "//a[text()='Ways of Unlearning']")
	WebElement tab3;
	
	public MultipleTabsPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	public String getTitleofMultiplePage() {
	return	driver.getTitle();
		
	}
	
}
