package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.driver.Action;
import com.driver.Get;
import com.driver.Waits;
import com.pages.HomePage;
import com.pages.ResultsVerfiyPage;
import com.pages.TravelDescriptionPage;



public class BaseClass {
	
	public static WebDriver driver;
	public static HomePage homePage = new HomePage();
	public static Action action1 = new Action();
	public static Get get1 = new Get();
	public static Waits waits1 = new Waits(); 
	public static TravelDescriptionPage travelPage1 = new TravelDescriptionPage();
	public static ResultsVerfiyPage resultsPage1 = new ResultsVerfiyPage();
	
}
