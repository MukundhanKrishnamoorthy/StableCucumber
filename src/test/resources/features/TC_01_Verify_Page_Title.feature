Feature: Clear The Shelters Microsite

  Scenario Outline: Verify Home Page title in the CLEAR THE SHELTERS site
    Given TC number <TC_number> and Title <TC_title>
    Then Launch the browser
    And Fetch the URL
    Then Verify the Home Page title in site
    Then Close the browser

    Examples: 
      | TC_number | TC_title                                                     |
      | TC 001    | To Verify the home page title in the CLEAR THE SHELTERS site |