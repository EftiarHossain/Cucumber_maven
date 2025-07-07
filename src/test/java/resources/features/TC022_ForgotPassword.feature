Feature: Forgot Password and User ID

  Scenario: Verify navigate to ABDirect Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"

  Scenario: Verify Successful Forgot Password and User ID
    Then I Can Navigate to the Forgot Password Page and Verify Page Title "Forgot Password/User ID?"
    Then I can select Forgot Type as Forgot Both User ID and Password
    Then I Can Select Date of Birth
    Then I Can Enter Email for Forgot Password "touhid@yopmail.com"
    Then I Can Enter Mobile Number for Forgot Password "01985238731" and Click on the Submit button
    Then I Can Enter OTP for Forgot Password "1111" and click on the Submit button