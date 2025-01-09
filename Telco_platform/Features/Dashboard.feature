Feature: Dashboard test cases
  This is Dashboard related test cases

  @current @sanity
  Scenario: Click the user management icon
    Given Load UI
    Then Verify login as system admin
    And  Click the user management icon
    Then Click the Home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @current @sanity
  Scenario: Verify modules for a system admin user
    Given Load UI
    Then Verify login as system admin
    And verify the modules for system admin
    Then Hover over the profile dropdown
    Then Click the Home button
    And Click the Logout button

  @current @sanity
  Scenario: Verify modules for a SDP admin user
    Given Load UI
#    Then Select a country
#    And Click the continue button
    Then Verify login as sdpadmin
    And verify the modules for SDP admin
    Then Hover over the profile dropdown
    Then Click the Home button
    And Click the Logout button

  @Current @sanity
   Scenario: Verify the Error message when enter a benificiary's name with spaces and numbers and letters in complete profile page. - 72725
    Given Load UI
#    Then Select a country
#    And Click the continue button
    Then Verify login as sp
    Then Click the complete banner button
    And Enter the organization name as sdhkdfjs
    Then Enter the legal entity as Individual
    Then Select the industry
    Then Select the country
    Then Select the Province as Central
    Then Select the City as Ampara
    Then Enter Post code as 79889
    Then Click the Home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @current @sanity
  Scenario: Verify the allignment of Registration Page Logo - 72596
    Given Load UI
#    Then Select a country
#    And Click the continue button
    Then Verify login as sp
    Then Verify ideamart logo is align in center
    Then Hover over the profile dropdown
    And Click the Logout button


#  @current @sanity
#  Scenario: Click the Complete Your Profile banner button
#    Given Load UI
#    Then Select a country
#    And Click the continue button
#    Then Verify login as sp
#    And Click the complete banner button
#    Given Load UI
#    Then Hover over the profile dropdown
#    Then Click the Home button
#    And Click the Logout button

