Feature: Registration related testcases
  This is registration flow related testcases

  @Reg @ideamart
  Scenario: Verify SPregistraion page : Email field empty email error msg
    Given Load UI
    Then Register as a new user
    Then Agree the agreement
    Then Continue
    Then Verify the error message as Email is required

  @Reg
    Scenario: Verify SPregistraion page : invalid email format email error msg
    Given Load UI
    Then Register as a new user
    Then Set Email as andydd.com
    Then Agree the agreement
    Then Continue
    Then Verify the error message as Email address is invalid.

  @Reg
  Scenario: Verify SPregistraion page : empty mobileno field
    Given Load UI
    Then Register as a new user
    Then Agree the agreement
    Then Continue
    Then Verify the mobileno error message as Mobile Number is required

  @Reg
  Scenario: Verify SPregistraion page : empty mobileno field
    Given Load UI
    Then Register as a new user
    Then Agree the agreement
    Then Continue
    Then Verify the mobileno error message as Mobile Number is required

  @Reg
  Scenario: Verify SPregistraion page : mobile number incorrect format
    Given Load UI
    Then Register as a new user
    Then Set Mobile number as 94772654765233331
    Then Agree the agreement
    Then Continue
    Then Verify the mobileno error message as Invalid Input, Please enter a valid mobile number

@Reg
  Scenario: Verify SPregistraion page : login link
      Given Load UI
      Then Register as a new user
      Then click the login link


  #Simulate human behaviour
  @Reg @newuser @recapcha @ideamart
  Scenario: Create a new user in human manner - 70259, Check the terms and conditions - 70344
    Given Load UI
    Then Register as a new user
    Then Set Email as andy@gmail.com
    Then Set Mobile number as 94774101905
    Then  Set Password as AndyNew@2001
    Then Confirm password as AndyNew@2001
    Then Agree the agreement
    Then Continue

  @Reg @banglalink
  Scenario: Create a new user in human manner - 70259, Check the terms and conditions - 70344
    Given Load UI
    Then Register as a new user
    Then Set Username as indikfh
    Then Set Email as andy@gmail.com
    Then Set Mobile number as 94774101905
    Then  Set Password as AndyNew@2001
    Then Confirm password as AndyNew@2001
    Then Agree the agreement
    Then Continue

  @Reg @forgotpwd @recapcha
  Scenario: Forget password
      Given Load UI
      Then Click Forget password Button
      Then Search For user name andy@gmail.com
      Then Click Submit Button

  @Reg
  Scenario: Verify SPregistraion page : password field - 70255
    Given Load UI
    Then User click on new user registration link
    Then Set Password as Indika12@#
    Then Confirm password as indikA12@#
    Then Click the continue button
    Then Confirm the password match error msg as Passwords do not match. Please re-enter your password.







