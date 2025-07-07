Feature: Within Card to Account

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


  Scenario: Verify Successful Within Card to Account
    Then I can select Within Bank and Navigate to the Transfer Details page using Continue without Beneficiary
    Then I can enter ToAccount Number for Within "4005619299300"
    Then I can enter Amount for Within "101"
    Then I can enter Remarks for Within "From Asif" and navigate to the Review page by clicking next button
    Then I can select Terms & Condition checkbox and click on the Send OTP button
    Then I can Enter OTP for Within "1111" and click on the Next button
    Then I can check transaction status for Within "Transaction is success" IF Transaction is failed then add an Screenshot
    Then I can Back to the Home Page for Within


