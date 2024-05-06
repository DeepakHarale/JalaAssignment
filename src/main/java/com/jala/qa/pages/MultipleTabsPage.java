package com.jala.qa.pages;

import java.io.IOException;

import com.jala.qa.base.TestBase;

public class MultipleTabsPage extends TestBase {

	public MultipleTabsPage() throws IOException {
		
	}

	public String getTitleofMultiplePage() {
	return	driver.getTitle();
		
	}
	
}
