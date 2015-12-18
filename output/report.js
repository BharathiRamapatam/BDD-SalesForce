$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/cucumber/sales/Task/menuTest.feature");
formatter.feature({
  "line": 2,
  "name": "Logged in as Sales person",
  "description": "One should have access to menu tabs",
  "id": "logged-in-as-sales-person",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@menuTest"
    }
  ]
});
formatter.before({
  "duration": 4559363764,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "access to Menu tag",
  "description": "",
  "id": "logged-in-as-sales-person;access-to-menu-tag",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.after({
  "duration": 25388,
  "status": "passed"
});
formatter.before({
  "duration": 3049004356,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Given logged in as user"
    },
    {
      "line": 7,
      "value": "#Then user should have access to Home page"
    },
    {
      "line": 8,
      "value": "#And Opportunity page"
    },
    {
      "line": 9,
      "value": "#And Tasks page"
    },
    {
      "line": 10,
      "value": "#And Leads page"
    },
    {
      "line": 11,
      "value": "#And Notes page"
    },
    {
      "line": 12,
      "value": "#And Accounts page"
    },
    {
      "line": 13,
      "value": "#And Contacts page"
    },
    {
      "line": 14,
      "value": "#And Dashboards page"
    },
    {
      "line": 15,
      "value": "#And Reports page"
    },
    {
      "line": 16,
      "value": "#And Groups page"
    },
    {
      "line": 17,
      "value": "#And Calendar page"
    },
    {
      "line": 18,
      "value": "#And People page"
    },
    {
      "line": 19,
      "value": "#And Cases page"
    }
  ],
  "line": 22,
  "name": "From Feeds Page user can upload a file",
  "description": "",
  "id": "logged-in-as-sales-person;from-feeds-page-user-can-upload-a-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "logged in as user",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "navigate to \"Feed_link\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on \"File_button\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click on upload button to upload a \"C:\\\\Users\\\\bharathi.ramapatnam\\\\Documents\\\\Admin\\\\CERTS\\\\createNewTaskSalesForce.PNG\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "upload file",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuTest.logged_in_as_user()"
});
formatter.result({
  "duration": 9229025682,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Feed_link",
      "offset": 13
    }
  ],
  "location": "MenuTest.navigate_to_Page(String)"
});
formatter.result({
  "duration": 10715904916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "File_button",
      "offset": 10
    }
  ],
  "location": "MenuTest.click_on(String)"
});
formatter.result({
  "duration": 1976092551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\\\Users\\\\bharathi.ramapatnam\\\\Documents\\\\Admin\\\\CERTS\\\\createNewTaskSalesForce.PNG",
      "offset": 36
    }
  ],
  "location": "MenuTest.click_on_to_upload_a(String)"
});
formatter.result({
  "duration": 707201674,
  "status": "passed"
});
formatter.match({
  "location": "MenuTest.uploadFile()"
});
formatter.result({
  "duration": 11316595040,
  "status": "passed"
});
formatter.after({
  "duration": 35651,
  "status": "passed"
});
});