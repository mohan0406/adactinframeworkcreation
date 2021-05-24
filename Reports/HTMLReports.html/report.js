$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/login.feature");
formatter.feature({
  "name": "Validating the application credentials",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@adactin"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User validating correct credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch the application \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User trying to enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click the login button",
  "keyword": "Then "
});
formatter.step({
  "name": "User verify the application is in homoe page",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "url",
        "username",
        "password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User validating correct credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@adactin"
    }
  ]
});
formatter.step({
  "name": "User launch the application \"url\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStepDefen.user_launch_the_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User trying to enter the \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefen.user_trying_to_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefen.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the application is in homoe page",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefen.user_verify_the_application_is_in_homoe_page()"
});
formatter.result({
  "status": "passed"
});
});