package com.jala.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollapsibleConentPage {

	@FindBy(xpath = "//*[@id=\"headingOne\"]/h4/a")
	WebElement siglecollaps1;
	
	@FindBy(xpath = "//a[text()=' Multiple Collapse']")
	WebElement multicollapstab;
	
	@FindBy(xpath = "//*[@id=\"headingFour\"]/h4/a")
	WebElement multicollapstab1;
}
