package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runner.BaseClass;

public class HomePage extends BaseClass{
	
	public static  By SERACHBOX = By.xpath("//input[@id='searchtext_freetext_search_form']");
	public static  By SERACHICON = By.xpath("//div[@id='freetext_search_form']//button");
	public static  By MOREINFO = By.xpath("//button[@id='iterator_1_product_custom_more-info-button']");
	public static  By PHONE = By.xpath("//a[@id='supplier-phone']");
	public static  By DAYS = By.xpath("//span[@id='price-pin_days-num-01']");


	public void verifyTitleInHomePage()
	{
		Assert.assertEquals("Home Page | Mail Travel", driver.getTitle());
	}

	public void enterTextInSearchBox(String searchText)
	{
		//action.sendText(SERACHBOX,searchText);
		action1.clickOnElement(SERACHBOX);
		action1.sendText(SERACHICON, searchText);
	
	}
	
	public void enterText()
	{
		action1.sendText(SERACHBOX, "india");
		action1.clickOnElement(SERACHICON);

	}
	
	public void clickOnMoreInfo()
	{
		waits1.waitForMilliSeconds(2000);
		action1.clickOnElement(MOREINFO);
	}
	
	public void verifyPhoneNumber()
	{
		waits1.waitForMilliSeconds(2000);
		String phno = driver.findElement(By.xpath("//a[@id='supplier-phone']")).getAttribute("href");
		System.out.println("phno :"+phno);
		String st1_actual = phno.substring(4);
		System.out.println("st1_actual = "+st1_actual);
	}
	
	public void verifyDays_VerifyPrice()
	{
		WebElement days = driver.findElement(By.xpath("//span[@id='price-pin_days-num-01']"));
		String daysText = days.getText();
		System.out.println("daysText :"+daysText);
		Assert.assertTrue(daysText.contains("9"));
		
		WebElement price = driver.findElement(By.xpath("//div[@id='price-pin_cc_newmarket']"));
		String priceText = price.getText();
		Assert.assertTrue(priceText.contains("£1,335"));
		System.out.println("priceText :"+priceText);

	}
	
}
