Feature: Sales page verification
  Agile Story: As a POS & sales manager, I should be able to get correct information on the Sales page

  @B28G25-61
  Scenario Outline: Verify there are 6 columns to see the quotations on the Sales page
    Given user is logged in with "<email>" and "<password>"
    When user click "Sales" page
    Then user should see "6" columns
    Examples:
      | email                  | password               |
      | pos_manager_username   | pos_manager_password   |
      | sales_manager_username | sales_manager_password |