package com.stepDefinitions;

import java.util.Map;
import com.runner.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TravelDescriptionStepDef extends BaseClass{

	@When("^I search for india and click on book online$")
    public void i_search_for_india_and_click_on_book_online() throws Throwable {
		homePage.searchText();	
		homePage.clickOnMoreInfo();
		travelPage1.bookOnlineclick();
	}


    @Then("^The departure date should set to default values and last value$")
    public void the_departure_date_should_set_to_default_values_and_last_value() throws Throwable {

    }
    
     
    @And("^I select the default values$")
    public void iSelectTheDefaultValues() {
    	//travelPage1.selectingDate();
    }
    
    @Then("^I click on transport$")
    public void i_click_on_transport() throws Throwable {
        travelPage1.clickOnTransport();
    }

    @Then("^The date should select to default value$")
    public void theDateShouldSelectToDefaultValue() {
        resultsPage1.verifyDateEnable();
        travelPage1.clickOnContinue();

    }
    
    @When("^I select the standrad room and continue$")
    public void i_select_the_standrad_room_and_continue() throws Throwable {
    	travelPage1.selectTheStandardRoom(); 
    	travelPage1.selectRoomsAndContinue(); 

    }

    @When("^I click on continue with default extras$")
    public void i_click_on_continue_with_default_extras() throws Throwable {
    	travelPage1.clickOnContinueWithoutExtras(); 
    }
    
    @When("^I fill in passenger details$")
    public void i_fill_in_passenger_details(DataTable detailsTable) throws Throwable {
    	
    	Map<String, String> passengerDetails = detailsTable.asMap(String.class,String.class);
    	travelPage1.fillingPassengerDetails(passengerDetails);
    	  	
    }

        
}
