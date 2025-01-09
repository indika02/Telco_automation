Feature: Login Page Test Cases
  This is Login related test cases


  @ideamart
  Scenario: Verify validation message when username and password is not entered
    Given Load UI
    And click loginbtn
    Then Verify the error message of login as Please enter a password. Please enter a username.

 @robi
  Scenario: Verify validation message when username and password is not entered
    Given Load UI
    And click loginbtn
    Then Verify the error message of login as Password is a required field.

   @mspace
  Scenario: Verify validation message when username and password is not entered
    Given Load UI
    And click loginbtn
    Then Verify the error message of login as Username is a required field. Password is a required field.


 @banglalink
  Scenario: Verify validation message when username and password is not entered
    Given Load UI
    And click loginbtn
    Then Verify the error message of login as Password is a required field. Username is a required field.

@digimart @ideamart
  Scenario: Verify validation message when enter username only
    Given Load UI
    And Enter username as "test"
    And click loginbtn
    Then Verify the error message of login as Please enter a password.


@banglalink @mspace
  Scenario: Verify validation message when enter username only
    Given Load UI
    And Enter username as "test"
    And click loginbtn
    Then Verify the error message of login as Password is a required field.

 @robi
  Scenario: Verify validation message when enter username only
    Given Load UI
    And Enter username as "test"
    And click loginbtn
    Then Verify the error message of login as Password is a required field.

   @mspace @digimart @ideamart
  Scenario: Verify validation message when enter password only
    Given Load UI
    And Enter password as fsdfdffg
    And click loginbtn
    Then Verify the error message of login as Please enter a username.


 @banglalink
  Scenario: Verify validation message when enter password only
    Given Load UI
    And Enter password as fsdfdffg
    And click loginbtn
    Then Verify the error message of login as Username is a required field.


  @robi
  Scenario: Verify validation message when enter password only
    Given Load UI
    And Enter password as fsdfdffg
    And click loginbtn
    Then Verify the error message of login as Username is a required field.

  @mspace @banglalink @digimart @ideamart
  Scenario: Verify validation message when enter incorrect username and incorrect password
    Given Load UI
    And Enter username as "teest"
    And Enter password as fsdfdffg
    And click loginbtn
    Then Verify the error message of login as The username or password you entered is incorrect please try again.

  @mspace
  Scenario: Verify validation message when enter incorrect username and incorrect password
    Given Load UI
    And Enter username as "teest"
    And Enter password as fsdfdffg
    And click loginbtn
    Then Verify the error message of login as The credentials you provided cannot be determined to be authentic.


   @robi @banglalink
  Scenario: Verify validation message when enter incorrect username and incorrect password
    Given Load UI
    And Enter username as "teest"
    And Enter password as fsdfdffg
    And click loginbtn
    Then Verify the error message of login as Username or password you have entered is incorrect. Please try again.

 @robi @banglalink
  Scenario: Login as SDP Admin
    Given Load UI
    Then Verify login as sdpadmin
    Then Hover over the profile dropdown
    And Click the Logout button

  @mspace @banglalink @digimart @ideamart @robi
  Scenario: Login as SP user
    Given Load UI
    Then Verify login as sp
    Then Hover over the profile dropdown
    And Click the Logout button

 @mspace @banglalink @digimart @ideamart @robi
  Scenario: Verify the Forget Password functionality
    Given Load UI
    Then User click on forget password link
    And Enter fogotpassword username as "teest"
    And click back to login

@mspace @banglalink @digimart @ideamart @robi
  Scenario: Verify validation message when forget password OTP is invalid
    Given Load UI
    Then User click on forget password link
    And Enter fogotpassword username as "teest"
    And click back to login

 @mspace @banglalink @digimart @ideamart @robi
  Scenario: Verify validation message when forget password OTP is more that 6 digits
    Given Load UI
    Then User click on forget password link
    And Enter fogotpassword username as "teest"
    And click back to login

 @mspace @banglalink @digimart @ideamart @robi
  Scenario: Verify the Forget Password functionality
    Given Load UI
    Then User click on forget password link
    And Enter fogotpassword username as "teest"
    And click back to login

 @digimart @ideamart
  Scenario: Verify Back directing to country select page - 70412
    Given Load UI
    And Click the back
    Then Select a country
    And Click the continue button

 @digimart @ideamart
  Scenario: Verify Learn more directing to dilaog pages - 70413
    Given Load UI
    And Click the learn more link
