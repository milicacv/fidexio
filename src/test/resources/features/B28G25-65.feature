Feature: View product order

  User Story: As a Point of Sale manager (POS), I should be able to view product order.

  Background: User is already in the log in page
    Given the user is on the login page
    When the user logged in as "<pos manager>"
    And the user logged in with username as "pos_manager_username" and password as "pos_manager_password"


  Scenario: Order list verification
    When The user clicks on the the Point of Sale module
    And The user clicks on the orders button
    Then The user should see the order list

  Scenario: Orders checkboxes verification
    When The user clicks on the Order reference checkbox
    Then All the orders should be checked

  Scenario: Dropdown action verification
    When The user clicks on actions dropdown
    Then The user should see the options bellow
      | Import |
      | Export |
      | Delete |


