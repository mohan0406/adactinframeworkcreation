@adactin
Feature: Validating the application credentials

  Scenario Outline: User validating correct credentials
    Given User launch the application "<url>"
    When User trying to enter the "<username>" and "<password>"
    Then User click the login button
    When User verify the application is in homoe page

    Examples: 
      | url | username | password |
      | url | username | password |