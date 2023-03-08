Feature: View product order

  User Story: As a Point of Sale manager (POS), I should be able to view product order.

  Background: User is already in the log in page
    Given the user is on the login page
    When the user enters valid credentials and clicks on submit
    When The user clicks on the the Point of Sale module
    And The user clicks on the orders button

  @wip1
  Scenario: Orders checkbox verification
    When The user clicks on the Order reference checkbox
    Then All the orders should be checked

  @wip
  Scenario: Dropdown action verification
    When The user clicks on the Order reference checkbox
    When The user clicks on actions dropdown
    Then The user should see the options bellow

      | Export |
      | Delete |


