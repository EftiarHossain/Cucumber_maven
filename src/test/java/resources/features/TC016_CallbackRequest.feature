Feature: Callback Request

  Scenario: Verify navigate to ABDirect Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"

  Scenario: Verify Successful Login With Device Binding
    When I login with "Shams1" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard


  Scenario: Verify Successful Callback Request
    Then I navigate to the Services for Callback Request
    Then I navigate to the Account Services for Callback Request
    Then I navigate to the Callback Request
    Then I can select Start Date
    Then I can select Start Time
    Then I can select End Date
    Then I can select End Time
    Then I Can enter Query "Test By Asif"
    Then I can click on the Request button