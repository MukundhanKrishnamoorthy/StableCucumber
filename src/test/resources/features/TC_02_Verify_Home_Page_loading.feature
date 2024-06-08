Feature: CLEAR THE SHELTERS Microsite

  Scenario Outline: Verify Home Page loading in the CLEAR THE SHELTERS site
    Given TC number <TC_number> and Title <TC_title>
    Then Launch the browser
    And Fetch the URL
    Then Verify the Page loading in site
    Then Close the browser

    Examples: 
      | TC_number | TC_title                                                       |
      | TC 002    | To verify the home page loading in the CLEAR THE SHELTERS site |