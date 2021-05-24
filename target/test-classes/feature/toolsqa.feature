@tools
Feature: Validating the toolqa text box

  Scenario Outline: User enterig the values in toolqa text box
    Given User launch the toolqa application url
    When User trying to enter the "<firstname>"
    Then User enter the mail "<mailid>"
    When User enter the current address "<redentialaddress>"
    Then User enter the permenent address "<permenentaddress>"
    When User click the submit button
    Then User verify the entered details are showed correctly

    Examples: 
      | firstname | mailid                   | redentialaddress | permenentaddress |
      | asdf      | mohanraj1996aa@gmail.com | asdf             | adfff            |
