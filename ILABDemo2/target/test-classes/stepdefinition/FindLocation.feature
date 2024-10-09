Feature: Automate to find location
  Description: find a location by searching.

  @NkosinathiRun
  Scenario: User search a location and make sure is found
    Given: user navigate to the home page
    When: click on the location dropdown
    Then: click search button
    And: check if the selected and search location if found

