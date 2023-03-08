Feature: Event Manager accessibility

  Agile story: As an Event manager I should be able to access different modules

  @US67.Asma

  Scenario: Event manager should access all modules
    Given the user is on the login page
    When user enters valid credentials and clicks on login button
    Then user should be able to see all modules
    Then user should access different modules