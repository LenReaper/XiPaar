Feature: XiPaar Signin functionality
  Scenario: SignIn with valid data
  Given User is on Signin page
  When User enters Organization Code
  And User enters Email
  And User enters Password
  And User clicks on Log In
  Then User is signed in successfully
  
  Scenario: QR code validation
  Given User is looged in and on home page
  When User clicks on Dashboard
  And User clicks on QR Code button
  And User generates new QR code
  And User downloads pdf
  Then Test is successful
