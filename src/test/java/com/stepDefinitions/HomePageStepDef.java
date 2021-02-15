package com.stepDefinitions;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef extends BaseClass{

	@Given("^I in HomePage$")
	public void i_am_on_Home_page() throws Throwable {
		homePage.verifyTitleInHomePage();
	}

	/*@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String searchText) throws Throwable {
	   homePage.enterTextInSearchBox(searchText);
	}*/
	
	@When("^I search for text$")
	public void searchText()
	{
		homePage.enterText();	
	}

	@When("^I click on more info$")
	public void i_click_on_more_info() throws Throwable {
		homePage.clickOnMoreInfo();  
	}

	@Then("^It should display days price and telephone number$")
	public void it_should_display_days_price_and_telephone_number() throws Throwable {
	 homePage.verifyPhoneNumber(); 
	 homePage.verifyDays_VerifyPrice();
	}

	@When("^I click on iteneary$")
	public void i_click_on_iteneary() throws Throwable {
	   
	}

	@Then("^It should display some info for all the days in itenary$")
	public void it_should_display_some_info_for_all_the_days_in_itenary() throws Throwable {
	
	}


}
