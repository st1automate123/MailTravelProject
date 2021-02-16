$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MailTravel.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14464846400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Calender and passenger",
  "description": "",
  "id": "search;calender-and-passenger",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@travel2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search for india and click on book online",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I select the default values",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "The date should select to default value",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on transport",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "The departure date should set to default values and last value",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select the standrad room and continue",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on continue with default extras",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I fill in passenger details",
  "rows": [
    {
      "cells": [
        "adulttitle1",
        "Mr"
      ],
      "line": 22
    },
    {
      "cells": [
        "firstname1",
        "Ravi"
      ],
      "line": 23
    },
    {
      "cells": [
        "lastname1",
        "Gugloth"
      ],
      "line": 24
    },
    {
      "cells": [
        "dobday1",
        "15"
      ],
      "line": 25
    },
    {
      "cells": [
        "dobmonth1",
        "January"
      ],
      "line": 26
    },
    {
      "cells": [
        "dobyear1",
        "1990"
      ],
      "line": 27
    },
    {
      "cells": [
        "adulttitle2",
        "Mr"
      ],
      "line": 28
    },
    {
      "cells": [
        "firstname2",
        "Ravindra"
      ],
      "line": 29
    },
    {
      "cells": [
        "lastname2",
        "Gugloth"
      ],
      "line": 30
    },
    {
      "cells": [
        "dobday2",
        "20"
      ],
      "line": 31
    },
    {
      "cells": [
        "dobmonth2",
        "March"
      ],
      "line": 32
    },
    {
      "cells": [
        "dobyear2",
        "1995"
      ],
      "line": 33
    },
    {
      "cells": [
        "phonenumber",
        "0745888888"
      ],
      "line": 34
    },
    {
      "cells": [
        "email",
        "ravi@gmail.com"
      ],
      "line": 35
    },
    {
      "cells": [
        "address1",
        "126 Manor House"
      ],
      "line": 36
    },
    {
      "cells": [
        "address2",
        "White street"
      ],
      "line": 37
    },
    {
      "cells": [
        "city",
        "London"
      ],
      "line": 38
    },
    {
      "cells": [
        "postcode",
        "IG7 5NP"
      ],
      "line": 39
    },
    {
      "cells": [
        "promocode",
        "6666"
      ],
      "line": 40
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 818506800,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.i_search_for_india_and_click_on_book_online()"
});
formatter.result({
  "duration": 15052735700,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.iSelectTheDefaultValues()"
});
formatter.result({
  "duration": 38800,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.theDateShouldSelectToDefaultValue()"
});
formatter.result({
  "duration": 5417974000,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.i_click_on_transport()"
});
formatter.result({
  "duration": 11156693000,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.the_departure_date_should_set_to_default_values_and_last_value()"
});
formatter.result({
  "duration": 44000,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.i_select_the_standrad_room_and_continue()"
});
formatter.result({
  "duration": 2668925300,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.i_click_on_continue_with_default_extras()"
});
formatter.result({
  "duration": 2138524300,
  "status": "passed"
});
formatter.match({
  "location": "TravelDescriptionStepDef.i_fill_in_passenger_details(DataTable)"
});
formatter.result({
  "duration": 17100558700,
  "status": "passed"
});
formatter.after({
  "duration": 2630038800,
  "status": "passed"
});
});