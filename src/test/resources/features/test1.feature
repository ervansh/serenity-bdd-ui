Feature: Test cases to verify home page elements

  @positive
  Scenario: Verify title of the page
    Given I am on homescreen
    Then I duckduckgo logo should be visible

	@positive
  Scenario: Verify search field is functional
    Given I am on homescreen
    When I enter cucumber in search field and press enter
    Then Search results are displayed
    
  @negative
  Scenario: Verify search field without entering data
    Given I am on homescreen
    When I press enter in search field without entering data
    Then Pointer remains on same page

