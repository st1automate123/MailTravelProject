Feature: Search
@search1
Scenario: Verify Search 
Given I in HomePage
When  I search for text
When I click on more info
Then It should display days price and telephone number
When I click on iteneary
Then It should display some info for all the days in itenary

