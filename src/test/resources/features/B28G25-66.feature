Feature: Access the documentation page
  Agile story: As a user, I want to access the documentation page.

  Background: User is already in the log in page
    Given the user is on the login page
    When user enters valid credentials and clicks on login button

  #@wip
  Scenario: “Odoo Documentation” message is displayed on a new window
    When user should click on the name
    And user should click the "Documentation"
    Then user should see the “Odoo Documentation” message is displayed on a new window


  Scenario: 4 main document topics are listed on the new window
    When user should click on the name
    And user should click the "Documentation"
    Then user should see 4 main document topics are listed on the new window
