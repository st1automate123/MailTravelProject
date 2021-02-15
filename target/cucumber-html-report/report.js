$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MailTravel.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23375860100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Search",
  "description": "",
  "id": "search;verify-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@search1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for text",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on more info",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "It should display days price and telephone number",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on iteneary",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "It should display some info for all the days in itenary",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 697910100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.searchText()"
});
formatter.result({
  "duration": 11806064300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_click_on_more_info()"
});
formatter.result({
  "duration": 7617478900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.it_should_display_days_price_and_telephone_number()"
});
formatter.result({
  "duration": 2498621000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_click_on_iteneary()"
});
formatter.result({
  "duration": 39500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.it_should_display_some_info_for_all_the_days_in_itenary()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.after({
  "duration": 26600,
  "status": "passed"
});
});