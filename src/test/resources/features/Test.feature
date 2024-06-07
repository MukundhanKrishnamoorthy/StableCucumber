Feature: Clear The Shelters Page Loading Verification

  Scenario Outline: Verify Page loading in the CLEAR THE SHELTERS site
    Given TC number <TC_number> and Title <TC_title>
    Then Launch the browser
    And Fetch the URL
    Then Verify the Page loading in site
    Then Close the browser

    Examples: 
      | TC_number | TC_title                    |
      | TC 001    | First Testcase Test.feature |

  Scenario Outline: Verify Page loading in the CLEAR THE SHELTERS site
    Given TC number <TC_number> and Title <TC_title>
    Then Launch the browser
    And Fetch the URL
    Then Verify the Page loading in site
    Then Close the browser

    Examples: 
      | TC_number | TC_title                     |
      | TC 002    | Second Testcase Test.feature |