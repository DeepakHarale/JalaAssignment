package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jala.qa.base.TestBase;

public class CreateEmployeePage extends TestBase {

	@FindBy(linkText = "Employee")
	WebElement clickonemployee;
	@FindBy(xpath = "//a[text()=' Create ']")
	WebElement createemp;
	
	@FindBy(id="FirstName") WebElement firstname;
	@FindBy(id="LastName") WebElement lastname;  
	@FindBy(id="EmailId") WebElement emailID;
	@FindBy(id="MobileNo") WebElement mobileNo;
	@FindBy(id="DOB") WebElement dateOfBirth;  
	@FindBy(id="rdbMale") WebElement gender;
	@FindBy(id="Address") WebElement address;
	@FindBy(id="CountryId") WebElement countryDropDown;
	@FindBy(id="chkSkill_1") WebElement Skills;
	@FindBy(xpath = "//button[text()='Save']") WebElement Save;
	
	public CreateEmployeePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEmployee() throws InterruptedException {
		clickonemployee.click();
		System.out.println("Cliked on Employee Manue");
		createemp.click();
		System.out.println("Clicked on Create Page");
		
	}
	
public void createNewEmployeeInfo() {
		
		firstname.sendKeys("tony");
		lastname.sendKeys("pual");
		emailID.sendKeys("tonypaul@gmai.com");
		mobileNo.sendKeys("6178453245");
		dateOfBirth.sendKeys("07/09/1998");
		gender.isSelected();
		address.sendKeys("Street:  Taille Maréchal 433\r\n"
				+ "\r\n"
				+ "City:  Froidmont\r\n"
				+ "\r\n"
				+ "State/province/area:   Hainaut\r\n"
				+ "\r\n"
				+ "Phone number:  0474 44 50 90\r\n"
				+ "\r\n"
				+ "Zip code:  7504\r\n"
				+ "\r\n"
				+ "Country calling code:  +32\r\n"
				+ "\r\n"
				+ "Country:  Belgium");
		
		Select select = new Select(countryDropDown);
		select.selectByIndex(5);
		Skills.isSelected();
		Save.click();
System.out.println("Successfully added info");
	}

}
