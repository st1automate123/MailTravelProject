package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runner.BaseClass;

public class ResultsVerfiyPage extends BaseClass{
	
	public static By DATEENABLED=By.cssSelector("#calbox-98f14691e2018479869775ac1879f0dd-1") ;
	public void verifyDateEnable()
    {
        WebElement element=driver.findElement(DATEENABLED);
        Assert.assertTrue(element.isEnabled());
        Boolean Enable=driver.findElement(DATEENABLED).isEnabled();
        System.out.println(Enable);
    }
	


}
