Feature: XiPaar Signin functionality
  Scenario: SignIn with valid data
  Given User is on Signin page
  When User enters Organization Code
  And User enters Email
  And User enters Password
  And User clicks on Log In
  And User is signed in successfully
  And User clicks on Dashboard
  And User clicks on QR Code button
  And User generates new QR code
  And User downloads pdf