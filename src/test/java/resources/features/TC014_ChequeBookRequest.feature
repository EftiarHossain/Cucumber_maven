Feature: Cheque Book Request

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


  Scenario: Verify Successful CheckBook Request
    Then I navigate to the Services
    Then I navigate to the Account Services
    Then I navigate to the Cheque Book Request
    Then I can choose your Account
    Then I can select Leaf Size
    Then I can select Division
    Then I can select District
    Then I can select Delivery Point
    Then I can select Delivery Location
    Then I can click on the next button
    Then I can click on the Terms & Conditions checkbox and click on the Send OTP button
    Then Enter OTP "1111"
    Then I can click on the next button on the OTP Page
    Then I can click on the Go to Home button
