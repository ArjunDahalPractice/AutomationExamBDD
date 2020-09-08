$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/backgroundChange.feature");
formatter.feature({
  "line": 1,
  "name": "User I will able to change background of website",
  "description": "",
  "id": "user-i-will-able-to-change-background-of-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User able to change Sky Blue Background;",
  "description": "",
  "id": "user-i-will-able-to-change-background-of-website;user-able-to-change-sky-blue-background;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Set SkyBlue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundChangeTest.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 7379398500,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundChangeTest.i_click_on_Set_SkyBlue_Backgroundthe_button()"
});
formatter.result({
  "duration": 42811900,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundChangeTest.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 2223130300,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "White Background Change;",
  "description": "",
  "id": "user-i-will-able-to-change-background-of-website;white-background-change;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Set White Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on Set White Background button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundChangeTest.set_White_Background_button_exists()"
});
formatter.result({
  "duration": 6660315700,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundChangeTest.i_click_on_Set_White_Background_button()"
});
formatter.result({
  "duration": 51237400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundChangeTest.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 979692500,
  "status": "passed"
});
});