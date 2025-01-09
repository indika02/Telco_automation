Feature: Settings Page test cases
  This is the settings page for SP users and all related test cases

  @current @sanity @ideamart @robi @banglalink
  Scenario: Click the Complete Your Profile banner button - 70464,70465
    Given Load UI
    Then Verify login as sp
    Then click the complete button on dashboard
    Then Click the Home button

  @current @sanity @ideamart @robi @banglalink
  Scenario: Verify UI elements for Basic Details Form - 70418
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    And Verify the Basic Details form UI elements
    Then Click the Home button

  @current @sanity @ideamart @robi @banglalink
  Scenario: Verify UI elements for Organization Details Form - 70461
    Given Load UI
    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click the Organization Details form
#    And Verify the Organization Details UI elements
    Then Click the Home button

  @current @sanity @ideamart @robi @banglalink
  Scenario: Verify Settings :  Beneficiary's Bank Details - 70462
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click the Benificiary details tab
    Then Click the Home button

  @current @sanity @ideamart @robi @banglalink
  Scenario: Verify UI elements for Contact person Form
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click the Contact person form
#    And Verify the Contact person UI elements
    Then Click the Home button

  @current @sanity @ideamart @robi @banglalink
  Scenario: Verify UI elements for Reconciliation Details Form
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click the Reconciliation Details form
    And Verify the Reconciliation Details UI elements
    Then Click the Home button


    @current @sanity @ideamart @robi @banglalink
    Scenario: Verify terms and conditions download button - 70463,70357
#      Given Load UI
#      Then Verify login as sp
      Then Hover over the profile dropdown
      And Click the settings button
      And Click the Terms and Conditions form
      Then Click the download button
      Then Click the Home button

  @current @sanity @ideamart @robi @banglalink
  Scenario: Verify UI elements for Change Password Form - 70299
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Navigate to security tab
    And Verify the Change Password form
    Then Click the Home button

  @current @sanity @ideamart @robi
  Scenario: Verify the validation message when current and new password are different
    Given Load UI
    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Navigate to security tab
    And click the edit button
    And Enter the current password as Testing
    And Enter the new password as Test
    Then click the change button
    Then Verify the validation message when current and new password are different Your password must be within 10-20 characters containing at least one simple letter, one capital letter, one special character and one number
    Then Click the Home button

  @current @sanity @banglalink
  Scenario: Verify the validation message when current and new password are different
    Given Load UI
    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Navigate to security tab
    And click the edit button
    And Enter the current password as Testing
    And Enter the new password as Test
    Then click the change button
    Then Verify the validation message when current and new password are different  Enter alphanumeric with special characters.Password length 8-20
    Then Click the Home button


  @currenta @sanity
  Scenario: Verify the validation message when Re-enter new password is an invalid format
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Navigate to security tab
    And click the edit button
    And Enter the current password as Testing
    And Enter the new password as Test
    Then click the change button
    Then Verify the validation message when current and new password are different Your password must be within 10-20 characters containing at least one simple letter, one capital letter, one special character and one number
    Then Enter the Re-enter new password as "ttt"
    Then click the change button
    And Verify the validation message when Re-enter new password is an invalid format
    Then Click the Home button

  @current @sanity
  Scenario: Verify the Cancel button - 70335
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Navigate to security tab
    And click the edit button
    Then Click the cancel btn
    Then Click the yes button
    Then Click the Home button

  @bank @ideamart
  Scenario: Verify whether after Admin verify sp cannot be change bank details
#    Given Load UI
#    Then Verify login as sp
    Then Click the Home button
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Verify Report is not Editable
    Then Click the Home button

  @current @sanity
  Scenario:  Verify error messages in SP profile view-70291,70307
#    Given Load UI
#    Then Verify login as sp
    Then Click the Home button
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Click the Benificiary's name field
    Then Click save Button
    Then Click the Home button

  @current @sanity @ideamart
  Scenario:  verify the error message when enter a benificiary name as 'bank' in profile settings page - 72716
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as bank
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario:  Verify the error message when enter the benificiary's name which starting word called 'Bank' in profile settings page - 72717
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as Bank
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario:  Verify the Error message when enter a benificiary's name with spaces and numbers and letters in profile settings page. - 72726
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as ahfhd 132
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: verify the error message when enter a benificiary name which consist of word called Bank with other word without space in profile settings page - 72715
    Given Load UI
    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as ahfhdbankidsghdf
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: verify the error message when enter a benificiary name which consist of word called Bank with other word without space in profile settings page - 72714
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as ahfhdBankidsghdf
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: verify the error message when enter a benificiary name which consist of word called Bank with other word without space in profile settings page - 72715
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as ahfhdbankidsghdf
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: verify the error message when enter a Benificiary's name with punctuation marks with different Scenarios in profile settings page - 72697
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as @#$@#$23
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: Verify the Error message when enter a benificiary's name which including dot mark with other punctuation mark in complete profile page. - 72701
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as sds_indika
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: Verify the Error message when enter a benificiary's name which including dot mark with other punctuation mark in complete profile page. - 72702
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as _indika
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button

  @current @sanity @ideamart
  Scenario: Verify the Error message when enter a benificiary's name which including underscore(_) mark at the begining and brackets at the end profile settings page. - 72704
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click Bank Details
    Then Click Edit Button
    Then Enter bname as _indika()
    Then Click save Button
    Then verify the Benificiary name error message as Please enter only alphabetical letters and numerical values. Usage of the word ‘bank’ for the beneficiary name is not allowed
    Then Click the Home button


    @current @sanity
    Scenario: functionality of the edit button of the security page - 70338
#      Given Load UI
#      Then Verify login as sp
      Then Hover over the profile dropdown
      And Click the settings button
      Then Click the top-Security tab
      Then Click the Home button

    @current @sanity
    Scenario: Functionality of the save button - 70361
#      Given Load UI
#      Then Verify login as sp
      Then Hover over the profile dropdown
      And Click the settings button
      Then Click Bank Details
      Then Click Edit Button
      Then Click the Home button

    @current @sanity @ideamart
    Scenario: Verify error messages in SP profile view - 70291
#      Given Load UI
#      Then Verify login as sp
      Then Hover over the profile dropdown
      And Click the settings button
      Then Click Bank Details
      Then Click Edit Button
      Then Enter bname as sfdfsfsd
      Then Click the benificary form save button
      Then Verify the bankname error message in benificiary form as Bank Name is required
      Then Click the Home button

    @current @sanity
      Scenario: UI and functionality of the organization details - 70354
#      Given Load UI
#      Then Verify login as sp
      Then Hover over the profile dropdown
      And Click the settings button
      Then Click the Organization Details form
      Then Click Edit Button
      Then Click the Home button

  @current @sanity
  Scenario: UI and functionality Settings : Contact person on behalf of the company - 70350
#    Given Load UI
#    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the settings button
    Then Click the Contact person form
    Then Click Edit Button
    Then Click the Home button

    @current @sanity
      Scenario: UI of the settings page - 70326
#      Given Load UI
#      Then Verify login as sp
      Then Hover over the profile dropdown
      And Click the settings button
      Then Click the top-Security tab
      Then Click the Home button
      
    @current @sanity
    Scenario: Verify whether after Admin verfy sp can be change bank details - 70309
#      Given Load UI
      Then Hover over the profile dropdown
      And Click the settings button
      Then Enter username as xorixap304@luravel.com
      Then Enter password as Payment@2001
      Then Click on Login Button
      Then Hover over the profile dropdown
      Then Click the settings button
      Then Click the Benificiary details tab
      Then Click the Home button








