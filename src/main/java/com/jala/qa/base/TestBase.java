package com.jala.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jala.qa.util.TestUtil;

public class TestBase {
public static ChromeDriver driver;
public static FirefoxDriver driver1;
public static Edge driver2;

public static Properties prop;

	public TestBase() throws IOException {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Sarvadnya\\eclipse-workspace\\JalaAcadamyTest\\src\\main\\java\\com\\jala\\qa\\config\\config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Intialization() throws InterruptedException {
		String browesername = prop.getProperty("browser");
		
		if(browesername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browesername.equals("firefox")) {
			driver1 = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
	public static void holdTime() throws InterruptedException {
		Thread.sleep(4000);
	}
}
