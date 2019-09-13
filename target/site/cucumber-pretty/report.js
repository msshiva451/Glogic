$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("popular shows.feature");
formatter.feature({
  "line": 1,
  "name": "popular show title and duration to a file.",
  "description": "",
  "id": "popular-show-title-and-duration-to-a-file.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "adding title and duration of  popular show  to a file.",
  "description": "",
  "id": "popular-show-title-and-duration-to-a-file.;adding-title-and-duration-of--popular-show--to-a-file.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@AllShows"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "application \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify that home page is displayed.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Scroll down to popular shows",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to the last video by pressing the icon “\u003e”",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Once you reach the last video, click on EXPLORE THE SHOW",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on “SHOW MORE”  til last page  and write all the show titles and duration into it.",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "popular-show-title-and-duration-to-a-file.;adding-title-and-duration-of--popular-show--to-a-file.;",
  "rows": [
    {
      "cells": [
        "url",
        "",
        "new_file"
      ],
      "line": 14,
      "id": "popular-show-title-and-duration-to-a-file.;adding-title-and-duration-of--popular-show--to-a-file.;;1"
    },
    {
      "cells": [
        "\"https://go.discovery.com/\"",
        "",
        "\"i am considering now output folder\""
      ],
      "line": 15,
      "id": "popular-show-title-and-duration-to-a-file.;adding-title-and-duration-of--popular-show--to-a-file.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3692646700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "adding title and duration of  popular show  to a file.",
  "description": "",
  "id": "popular-show-title-and-duration-to-a-file.;adding-title-and-duration-of--popular-show--to-a-file.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@AllShows"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "application \"https://go.discovery.com/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify that home page is displayed.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Scroll down to popular shows",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to the last video by pressing the icon “\u003e”",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Once you reach the last video, click on EXPLORE THE SHOW",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on “SHOW MORE”  til last page  and write all the show titles and duration into it.",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://go.discovery.com/",
      "offset": 13
    }
  ],
  "location": "PopularShowSteps.application(String)"
});
formatter.result({
  "duration": 7036750200,
  "status": "passed"
});
formatter.match({
  "location": "PopularShowSteps.verify_that_home_page_is_displayed()"
});
formatter.result({
  "duration": 42000,
  "status": "passed"
});
formatter.match({
  "location": "PopularShowSteps.scroll_down_to_popular_shows()"
});
formatter.result({
  "duration": 76742200,
  "status": "passed"
});
formatter.match({
  "location": "PopularShowSteps.navigate_to_the_last_video_by_pressing_the_icon()"
});
formatter.result({
  "duration": 7785630600,
  "status": "passed"
});
formatter.match({
  "location": "PopularShowSteps.once_you_reach_the_last_video_click_on_EXPLORE_THE_SHOW()"
});
formatter.result({
  "duration": 161577000,
  "status": "passed"
});
formatter.match({
  "location": "PopularShowSteps.click_on_SHOW_MORE_til_last_page_and_write_all_the_show_titles_and_duration_into_it()"
});
formatter.result({
  "duration": 14197754400,
  "status": "passed"
});
formatter.after({
  "duration": 953131100,
  "status": "passed"
});
});