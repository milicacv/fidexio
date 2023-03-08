Feature: Main modules accessibility
  User story: As a POS manager, I should be able to access the main modules

@Bojana
  Scenario: POS manager should access all 22 main modules
    Given the user logged in with username as "posmanager50@info.com" and password as "posmanager"
    Then User should be able to see all 22 modules
    Then User should access all modules