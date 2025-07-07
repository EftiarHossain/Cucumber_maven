package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG016_ForgotPassword;
import utils.Base;
import utils.Operations;

public class PM017_ForgotPassword extends Base {
    @Then("I Can Navigate to the Forgot Password Page and Verify Page Title {string}")
    public void iCanNavigateToTheForgotPasswordPage(String Title) {
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.forgotPasswordButton, driver);
        Operations.click(PG016_ForgotPassword.forgotPasswordButton, driver);
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.forgotPasswordPageTitle, driver);
        Operations.matchText(PG016_ForgotPassword.forgotPasswordPageTitle, Title, driver);
    }
    @Then("I can select Forgot Type as Forgot Both User ID and Password")
    public void iCanSelectForgotTypeAsForgotBothUserIDAndPassword() {
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.forgotType, driver);
        Operations.click(PG016_ForgotPassword.forgotType, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.forgotPasswordAndUserID, driver);
        Operations.click(PG016_ForgotPassword.forgotPasswordAndUserID, driver);
    }
    @Then("I Can Select Date of Birth")
    public void iCanSelectDateOfBirth() {
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.dateOfBirthButton, driver);
        Operations.click(PG016_ForgotPassword.dateOfBirthButton, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.yearArrow, driver);
        Operations.click(PG016_ForgotPassword.yearArrow, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.arrow, driver);
        Operations.click(PG016_ForgotPassword.arrow, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.year, driver);
        Operations.click(PG016_ForgotPassword.year, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.month, driver);
        Operations.click(PG016_ForgotPassword.month, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.date, driver);
        Operations.click(PG016_ForgotPassword.date, driver);
    }

    @Then("I Can Enter Email for Forgot Password {string}")
    public void iCanEnterEmailForForgotPassword(String Email) {
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.enterEmail, driver);
        Operations.sendText(PG016_ForgotPassword.enterEmail,Email, driver);
    }

    @Then("I Can Enter Mobile Number for Forgot Password {string} and Click on the Submit button")
    public void iCanEnterMobileNumberForForgotPassword(String Phone) {
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.enterPhoneNumber, driver);
        Operations.sendText(PG016_ForgotPassword.enterPhoneNumber,Phone, driver);
        Operations.scrollIntoElement(PG016_ForgotPassword.submitButton, driver);
        Operations.waitUntilElementIsClickable(PG016_ForgotPassword.submitButton, driver);
        Operations.click(PG016_ForgotPassword.submitButton, driver);
    }

    @Then("I Can Enter OTP for Forgot Password {string} and click on the Submit button")
    public void iCanEnterOTPForForgotPasswordAndClickOnTheSubmitButton(String OTP) {
        Operations.waitUntilElementIsVisible(PG016_ForgotPassword.enterOTP, driver);
        Operations.sendText(PG016_ForgotPassword.enterOTP,OTP, driver);
    }
}
