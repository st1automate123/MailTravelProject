package com.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.runner.BaseClass;
import cucumber.api.java.en.When;

public class TravelDescriptionPage extends BaseClass{
	
	 public  static By BOOK_ONLINE = By.xpath("//div[@id='book-button-header']//div[@id='book-98f14691e2018479869775ac1879f0dd']");
	 public static By SELECT_DATE=By.cssSelector(".nbf_pms_tpl_calendar_selecteddate") ;
	 public static By CONTINUE=By.xpath("//div[contains(text(),'Continue')]"); 
	 public static By TRANSPORT = By.xpath("//h2[@class='nbf_tpl_pms_bf_transport_title']");
	 public static By STANDARDROOM = By.cssSelector("#room-0-numselect");
	 public static By SELECTROOMSANDCONTINUE = By.cssSelector("div[class='nbf_fancy_nbf_tpl_pms_book_room nbf_fg_pms_button_text ']");
	 public static By CONTINUEWITHOUTEXTRAS = By.cssSelector("div[class='nbf_button nbf_tpl_pms_button']");
	 	 // passengerdetails
	 public static By   FIRSTNAME1 = By.cssSelector("input[name='pax-a-first-1']");
	 public static By   LASTNAME1 = By.cssSelector("input[name='pax-a-last-1']");
	 public static By   FIRSTNAME2 = By.cssSelector("input[name='pax-a-first-2']");
	 public static By   LASTNAME2 = By.cssSelector("input[name='pax-a-last-2']");
	 public static By   PHONENUM = By.cssSelector("input[id='contact-mobile']");
	 public static By   EMAIL = By.cssSelector("input[id='contact-email']");
	 public static By   ADDRESS1 = By.cssSelector("input[id='contact-address1']");
	 public static By   ADDRESS2 = By.cssSelector("input[id='contact-address2']");
	 public static By   CITY = By.cssSelector("input[id='contact-city']");
	 public static By   POSTCODE = By.cssSelector("input[id='contact-postcode']");
	 public static By   PROMOCODE = By.cssSelector("input[id='contact-promocode']");
	 public static By   CONTINUEBTN = By.cssSelector("button[class='nbf_button nbf_tpl_pms_button']");
   
	    public void bookOnlineclick()
	    {
	        action1.clickOnElement(BOOK_ONLINE);
	    }
	    
	    public void selectingDate()
	    {
	         action1.clickOnElement(SELECT_DATE);
	    }
	    
	    public void clickOnContinue()
	    {
	    	waits1.waitForMilliSeconds(5000);
	        action1.clickOnElement(CONTINUE);
	    }
	    
	    public void clickOnTransport()
	    {
            waits1.waitForMilliSeconds(11000);
	    	action1.clickOnElement(TRANSPORT);
	    }
	    
	    public void selectTheStandardRoom()
	    {
	    	Select ele = new Select(driver.findElement(STANDARDROOM));
	    	ele.selectByVisibleText("1");
	    }

	    public void selectRoomsAndContinue()
	    {
	    	waits1.waitForMilliSeconds(2000);
	    	action1.clickOnElement(SELECTROOMSANDCONTINUE);
	    }
	    
	    public void clickOnContinueWithoutExtras()
	    {
           action1.clickOnElement(CONTINUEWITHOUTEXTRAS);
	    }
	    
	    public void fillingPassengerDetails(Map<String, String> detailsMap)
	    {
	    	waits1.waitForMilliSeconds(5000);
	    	Select title1DropDown = new Select(driver.findElement(By.cssSelector("select[id='pax-a-title-1']")));
            title1DropDown.selectByVisibleText(detailsMap.get("adulttitle1"));
			action1.sendText(FIRSTNAME1,detailsMap.get("firstname1") );
			action1.sendText(LASTNAME1,detailsMap.get("lastname1") );
			
			Select dob1DayDropdown = new Select(driver.findElement(By.cssSelector("select[name='pax-a-dobd-1']")));
			dob1DayDropdown.selectByVisibleText(detailsMap.get("dobday1"));
			
			Select dob1MonthDropdown = new Select(driver.findElement(By.cssSelector("select[id='pax-a-dobm-1']")));
			dob1MonthDropdown.selectByVisibleText(detailsMap.get("dobmonth1"));
			
			Select dob1YearDropdown = new Select(driver.findElement(By.cssSelector("select[id='pax-a-doby-1']")));
			dob1YearDropdown.selectByVisibleText(detailsMap.get("dobyear1"));
			
	    	waits1.waitForMilliSeconds(3000);
	    	Select title2DropDown = new Select(driver.findElement(By.cssSelector("select[id='pax-a-title-2']")));
            title2DropDown.selectByVisibleText(detailsMap.get("adulttitle2"));
			
			action1.sendText(FIRSTNAME2,detailsMap.get("firstname2") );
			action1.sendText(LASTNAME2,detailsMap.get("lastname2"));
			
			Select dob2DayDropdown = new Select(driver.findElement(By.cssSelector("select[name='pax-a-dobd-2']")));
			dob2DayDropdown.selectByVisibleText(detailsMap.get("dobday2"));
			
			Select dob2MonthDropdown = new Select(driver.findElement(By.cssSelector("select[id='pax-a-dobm-2']")));
			dob2MonthDropdown.selectByVisibleText(detailsMap.get("dobmonth2"));
			
			Select dob2YearDropdown = new Select(driver.findElement(By.cssSelector("select[id='pax-a-doby-2']")));
			dob2YearDropdown.selectByVisibleText(detailsMap.get("dobyear2"));
			
			action1.sendText(PHONENUM,detailsMap.get("phonenumber") );
			action1.sendText(EMAIL,detailsMap.get("email") );
			action1.sendText(ADDRESS1,detailsMap.get("address1") );
			action1.sendText(ADDRESS2,detailsMap.get("address2") );
			action1.sendText(CITY,detailsMap.get("city") );
			action1.sendText(POSTCODE,detailsMap.get("postcode") );
			action1.sendText(PROMOCODE,detailsMap.get("promocode") );
			waits1.waitForMilliSeconds(2000);
			action1.clickOnElement(CONTINUEBTN);
	    }
	    
	   
	   
}

