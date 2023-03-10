Feature: Event Manager accessibility

  Agile story: As an Event manager I should be able to access different modules

  Background: User is already in the log in page
    Given the user is on the login page

@Asma
  Scenario: Event manager should access all modules
    When the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"
    Then user should see all 15 modules
    Then user is able to access all modules