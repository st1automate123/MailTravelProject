package com.driver;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class Get extends BaseClass{

	public String getText(By element)
	{
		String str = driver.findElement(element).getText();
		return str;
	}
}
