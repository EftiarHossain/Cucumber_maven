package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import objectRepository.PG014_CardToAccountOwn;
import objectRepository.PG015_CardToAccountWithin;
import utils.Base;
import utils.FileHelper;
import utils.Operations;
import utils.SoftAssertCollector;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PM016_CardToAccountWithin extends Base {
    @Then("I can select Within Bank and Navigate to the Transfer Details page using Continue without Beneficiary")
    public void iCanSelectWithinBankAndNavigateToTheTransferDetailsPage() {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.navBarFundTransfer, driver);
        Operations.click(PG015_CardToAccountWithin.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.navBarCardToAccount, driver);
        Operations.click(PG015_CardToAccountWithin.navBarCardToAccount, driver);
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.selectWithinBank, driver);
        Operations.click(PG015_CardToAccountWithin.selectWithinBank, driver);
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.selectContinueWithoutBeneficiary, driver);
        Operations.click(PG015_CardToAccountWithin.selectContinueWithoutBeneficiary, driver);
    }


    @Then("I can enter ToAccount Number for Within {string}")
    public void iCanEnterToAccountNumberWithin(String ToAccount) {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.toAccount, driver);
        Operations.sendText(PG015_CardToAccountWithin.toAccount, ToAccount, driver);
    }

    @Then("I can enter Amount for Within {string}")
    public void iCanEnterAmountForWithin(String amount) {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.withinAmount, driver);
        Operations.sendText(PG015_CardToAccountWithin.withinAmount, amount, driver);
    }

    @Then("I can enter Remarks for Within {string} and navigate to the Review page by clicking next button")
    public void iCanEnterRemarksForWithinAndNavigateToTheReviewPage(String Remarks) {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.remark, driver);
        Operations.sendText(PG015_CardToAccountWithin.remark, Remarks, driver);
        Operations.waitUntilElementIsClickable(PG015_CardToAccountWithin.nextButton, driver);
        Operations.scrollIntoElement(PG015_CardToAccountWithin.nextButton, driver);
        Operations.click(PG015_CardToAccountWithin.nextButton, driver);
    }

    @Then("I can select Terms & Condition checkbox and click on the Send OTP button")
    public void iCanSelectTermsAndConditionCheckboxAndClickOnTheSendOtpButton() {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.CheckBox, driver);
        Operations.click(PG015_CardToAccountWithin.CheckBox, driver);
        Operations.waitUntilElementIsClickable(PG015_CardToAccountWithin.SendOTP, driver);
        Operations.click(PG015_CardToAccountWithin.SendOTP, driver);
    }

    @Then("I can Enter OTP for Within {string} and click on the Next button")
    public void iCanEnterOTPForWithinAndClickOnTheNextButton(String OTP) {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.EnterOTP, driver);
        Operations.verifyElementIsPresent(PG015_CardToAccountWithin.EnterOTP, driver);
        Operations.sendText(PG015_CardToAccountWithin.EnterOTP, OTP, driver);
        Operations.waitUntilElementIsClickable(PG015_CardToAccountWithin.OTPNextButton, driver);
        Operations.click(PG015_CardToAccountWithin.OTPNextButton, driver);
    }

    private Scenario scenario;

    @io.cucumber.java.Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Then("I can check transaction status for Within {string} IF Transaction is failed then add an Screenshot")
    public void iCanCheckTransactionStatusForWithin(String Status) throws Exception {
        try {
            Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.transactionStatus, driver);
            Operations.verifyElementIsPresent(PG015_CardToAccountWithin.transactionStatus, driver);
            Operations.matchText(PG015_CardToAccountWithin.transactionStatus, Status, driver);
        } catch (AssertionError e) {
            SoftAssertCollector.addError(e);
            // Generate screenshot path
            String screenshotPath = FileHelper.generateScreenshotFilePath("TransactionFailed");
            // Take screenshot
            Operations.takeSnapShot(driver, screenshotPath);

            // Attach screenshot to report
            try {
                byte[] screenshotBytes = Files.readAllBytes(Paths.get(screenshotPath));
                scenario.attach(screenshotBytes, "image/png", "TransactionFailed");
            } catch (Exception ex) {
                System.err.println("Failed to attach screenshot to report: " + ex.getMessage());
            }
        }
    }

    @Then("I can Back to the Home Page for Within")
    public void iCanBackToTheHomePageForWithin() {
        Operations.waitUntilElementIsVisible(PG015_CardToAccountWithin.GoToHomeButton, driver);
        Operations.click(PG015_CardToAccountWithin.GoToHomeButton, driver);
    }
}
