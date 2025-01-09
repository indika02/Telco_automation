Feature: User management test cases
  This is User management related test cases

  @sanity @ideamart @robi
  Scenario: Verify the add user button
   Given Load UI
   Then Verify login as sdpadmin
    And  Click the user management icon
    Then Click the add user button

  @current @sanity @ideamart @robi
    Scenario: Verify if pagination is present-70325, Verify Pagination correctly worked user management - 70394
      Given Load UI
      Then Verify login as sdpadmin
      And Click the user management icon
      Then Verify pagination

  @current @sanity @ideamart @robi
  Scenario: Verify the header
    Given Load UI
    And Click the user management icon
    Then Verify the header

  @current @sanity @ideamart @robi
  Scenario: Verify the footer
    Given Load UI
    And Click the user management icon
    Then Verify the footer

  @current @sanity @ideamart
  Scenario: Search a system user filtered by username - 70383
    Given Load UI
    Then Verify login as system admin
    And Click the user management icon
#    Then Click the Username filter
    Then Enter the word sysad in the searchbar  Hms

  @current @sanity @ideamrt
  Scenario: Search a system user filtered by firstname, Verify users list  can acces User Management Module - 70284
    Given Load UI
    Then Verify login as admin
    And Click the user management icon
    Then Search by first name as "test"
   # Then Enter the word sysad in the searchbar


  @current @sanity @ideamart @robi
  Scenario: Click the view system user list
      Given Load UI
      #Then Verify login as admin
      And  Click the user management icon
      Then Click the view system user list

  @current @sanity @ideamart @robi
  Scenario: Verify if the user count is displayed
      Given Load UI
    #  Then Verify login as admin
      And  Click the user management icon
      Then Verify user count in tab

  @current @sanity @ideamart @robi
  Scenario: Verify the column headers for system user table
    Given Load UI
    Then Verify login as sdpadmin
    And  Click the user management icon
    Then Verify the column headers for system users

  @current @sanity @ideamart @robi
  Scenario: Filter the status of system users by initial
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then select the initial status

  @current @sanity @ideamart @robi
  Scenario: Filter the status of system users by active
      Given Load UI
     # Then Verify login as admin
      And  Click the user management icon
      Then select the active status

  @current @sanity @ideamart @robi
  Scenario: Filter the status of system users by disabled
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then select the disabled status

  @current @sanity @ideamart @robi
  Scenario: Filter the status of system users by any status
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then select the any status

  @current @sanity @ideamart @robi
  Scenario: Suspend a system user - 70384
    Given Load UI
   #Then Verify login as admin
    And  Click the user management icon
    Then Click the view system user list
    And Click the suspend button

  @current @sanity @ideamart @robi
  Scenario: Delete a system user - 70267, Check admin user Delete existing user details - 70301
    Given Load UI
#    Then Verify login as system admin
    And  Click the user management icon
    Then Click the view system user list
    And Click the delete button

  @current @sanity @ideamart
  Scenario: Unlock a system user - 70321
    Given Load UI
    Then Verify login as system admin
    And  Click the user management icon
    Then Click the view system user list
    And Click the unlock button

  @current @sanity @ideamart
  Scenario: Verify UI data with Table - 70400
    Given Load UI
    Then Verify login as system admin
    And  Click the user management icon

  @current @sanity @ideamart
  Scenario: Edit a system user - 70402
    Given Load UI
    Then Verify login as system admin
    And  Click the user management icon
    Then Click the view system user list
    And Click the edit button

  @current @sanity @ideamart
  Scenario: Check admin user Edit existing user details function - 70316
    Given Load UI
    Then Verify login as system admin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Click on the sp user's data row
    Then Click the Organization Details form
    Then Click the Contact person form
    Then Click Benificiary bank details tab
    Then Click the Terms and Conditions form

  @current @sanity @ideamart
  Scenario:  Verify admin user can edit the bank details of sp account - 70317
    Given Load UI
    Then Verify login as system admin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Click on the sp user's data row
    Then Click the Organization Details form
    Then Click the Contact person form
    Then Click Benificiary bank details tab

  @current @sanity @ideamart
  Scenario: Verify messages when edit admin details - 70403
    Given Load UI
    Then Verify login as system admin
    And  Click the user management icon
    Then Click the view system user list
    And Click the edit button
    Then Delete the existing text firstName
    Then verify the firstname error message as First Name is required
    Then Delete the existing text lastName
    Then verify the laststname error message as Last Name is required
    Then Delete the existing text email
    Then verify the email error message as Email is required
    Then Enter invalid email as asdfgdhf
    Then verify the email error message as Email address is invalid.

  @current @sanity @ideamart @robi
  Scenario: Create a system admin and submit the create user account form
    Given Load UI
 #   Then Verify login as admin
    And  Click the user management icon
    Then Click the add user button
    And Enter the firstname as Test
    And Enter the lastname as User
    And Enter the designation as ABCDEFG
    And Enter the email as testuser@gmail.com
    And Enter the username as testuser123
    And Enter the address as testaddress
    And Enter the mobilenumber as 8801400000000
    #And Click the user group dropdown
    And Select the system admin user
    Then click the submit button

  @current @sanity @ideamart @robi
  Scenario: Verify the create user account form validation messages after entering invalid formats
    Given Load UI
 #   Then Verify login as admin
    And  Click the user management icon
    Then Click the add user button
    And Enter the firstname as testtesttesttesttesttest
    And Enter the lastname as testtesttesttesttesttest
    And Enter the designation as testtesttesttesttesttesttesttesttesttesttesttesttest
    And Enter the email as test
    And Enter the username as testtesttesttesttesttesttest
    And Enter the address as testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest
    And Enter the mobilenumber as 11111111111111111111111
    And Select the system admin user

  @current @sanity @ideamart @robi
  Scenario: Cancel the Create User Account form
     Given Load UI
    # Then Verify login as admin
     And  Click the user management icon
     Then Click the add user button
     And Click the cancel button


  @current @sanity
  Scenario: Navigate to the App Creators tab
    Given Load UI
  #  Then Verify login as admin
    And  Click the user management icon
    Then Click the App Creators tab

  @current @sanity
  Scenario: Verify Service Provider Account
      Given Load UI
      #Then Verify login as admin
      And  Click the user management icon
      Then Click the App Creators tab
      Then Click the view system user list
      Then Click the verify button
      Then Enter comment to verify as "test"

  @current @sanity
  Scenario: Filter the status to initial for App Creators
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then Click the App Creators tab
    Then select the initial status

  @current @sanity
  Scenario: Filter the status to active
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then Click the App Creators tab
    Then select the active status

  @current @sanity
  Scenario: Filter the status to disabled
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then Click the App Creators tab
    Then select the disabled status

  @current @sanity
  Scenario: Filter the status to disabled
    Given Load UI
    #Then Verify login as admin
    And  Click the user management icon
    Then Click the App Creators tab
    Then select the any status

  @current @sanity
  Scenario: Verify Admin cannot  edit bank detail for  SP
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Click on the sp user's data row
    Then Click Benificiary bank details tab

  @current @sanity
  Scenario: functionality of the user management table - 70385, Check admin user view existing user details function - 70389
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Click on the sp user's data row

  @current @sanity
  Scenario: Check content in the User Details table-70278
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon
    Then Click the App Creators tab

  @current @sanity
   Scenario: Verify admin user can edit the bank details of sp account - 70270
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Click on the sp user's data row
    Then Click Benificiary bank details tab

  @current @sanity
  Scenario: Check content in the User Management module header - 70274, Check content in the User Management module header - 70391
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon

  @current @sanity
  Scenario: Verify Content of 'Security tab of My Profile View - 70351
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Click on the sp user's data row

  @current @sanity
  Scenario: functionality of the SDP admins' home page - 70318
    Given Load UI
    Then Verify login as sdpadmin
    Then verify the modules for SDP admin


    @current @sanity
    Scenario: Check content in the User Details table - 70387
      Given Load UI
      Then Verify login as sdpadmin
      Then Click the user management icon
      Then Verify the column headers for system users
      Then Click the App Creators tab


  @current @sanity
  Scenario: Check content in the User Details table sdpadmin - 70304
    Given Load UI
    Then Verify login as sdpadmin
    Then Click the user management icon
    Then Click the App Creators tab
    Then Verify the column headers for App Creators

  @current @sanity
  Scenario: Check content in the User Management module header - SYS ADMIN - 70323, Check content in the User Management module header - 70306
    Given Load UI
    Then Verify login as system admin
    Then Click the user management icon
    Then Verify the header

  @current @sanity
  Scenario: Check whether user count is correctly displayed in the User's TAB - 70315, Check whether user count is correctly displayed in the User's TAB - 70397
    Given Load UI
    Then Verify login as system admin
    Then Click the user management icon
    Then Verify user count in tab

  @current @sanity
  Scenario: Verify 'Cancel in Add User Form - 70279
    Given Load UI
    Then Verify login as system admin
    Then Click the sys admin user management icon
    Then Click the add user button
    Then Click the cancel button

  @current @sanity
  Scenario: Reset Password for System users - 70404
    Given Load UI
    Then Verify login as system admin
    And  Click the user management icon
    Then Click the view system user list
    Then Click the Security tab
    And Click the Reset Password button

  @current @sanity
  Scenario: Verify Add user functionality - 70288,70470,70469
    Given Load UI
    Then Verify login as dialog limited admin
    Then Click the user management icon
    Then Click the add user button
    Then Enter first name for new admin as indika
    Then Enter last name for new admin as dfdfdsf
    Then Enter designation for new admin as sdfdsfds
    Then Enter email for new admin as idj@gmail.com
    Then Enter username for new admin
    Then Enter mobileno for new admin as 9476728243
    Then Enter address for new admin as sfdgdg,dsfkdjfhd
    Then Select usergroup for new admin as SDP_ADMIN
    Then Click the submit button of adduser form

  @current @sanity
  Scenario: Verify 'Cancel in Add User Form - 70296
    Given Load UI
    Then Verify login as dialog limited admin
    Then Click the user management icon
    Then Click the add user button
    Then Click the cancel button of adduser form

















