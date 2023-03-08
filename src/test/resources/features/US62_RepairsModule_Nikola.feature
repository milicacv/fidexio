Feature: Repairs page verification

  Agile Story: As a POS & sales manager, I want to access the Repairs page

  @B28G25-62
  Scenario Outline: Verify there are 6 columns to see the repair orders on the Repairs page

    Given User is logged in with "<email>" and "<password>"
    When User click "Repairs" module
    Then User see "6" columns


    Examples:
      | email                  | password               |
      | pos_manager_username   | pos_manager_password   |
      | sales_manager_username | sales_manager_password |
