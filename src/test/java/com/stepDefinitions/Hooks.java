package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.runner.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	public static String BASE_URL = "https://www.mailtravel.co.uk/";
	public static String driverPath = "C:\\2020_Testing\\Automation\\chromedriver.exe";
	public static By COOKIE = By.cssSelector("button[title='Accept Cookies']");
	
	@Before
	public void start() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",driverPath );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		Thread.sleep(3000);
		driver.findElement(COOKIE).click();
		
	}
		
	
	@After
	public void close()
	{
		driver.close();
	}
	
}
