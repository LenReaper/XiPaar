Feature: XiPaar SignUp Functionality
 Scenario: SignUp with valid data
 Given User is on signup page
 When User enters organizationname
 And User enters city
 And User chooses organizationtype
 And User enters authorisedpersonname
 And User enters email
 And User click on Generate OTP
 And User enters phonenumber
 And User enters password
 And User confirms password
 And User agrees to TermsAndConditions
 And User clicks on SignUp
 Then User Signed Up successfully