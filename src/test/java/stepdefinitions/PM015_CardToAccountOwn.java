package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import objectRepository.PG012_Donation;
import objectRepository.PG014_CardToAccountOwn;
import utils.Base;
import utils.FileHelper;
import utils.Operations;
import utils.SoftAssertCollector;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PM015_CardToAccountOwn extends Base {
    @Then("I can select Own Card to Account and Navigate to the Transfer Details page")
    public void iCanSelectOwnCardToAccountAndNavigateToTheTransferDetailsPage() {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.navBarFundTransfer, driver);
        Operations.click(PG014_CardToAccountOwn.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.navBarCardToAccount, driver);
        Operations.click(PG014_CardToAccountOwn.navBarCardToAccount, driver);
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.selectOwnAccount, driver);
        Operations.click(PG014_CardToAccountOwn.selectOwnAccount, driver);
    }
    @Then("I can enter Amount {string}")
    public void iCanEnterAmount(String amount) {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.amount, driver);
        Operations.sendText(PG014_CardToAccountOwn.amount, amount, driver);
    }
    @Then("I click on the Next button without entering Remarks")
    public void iClickOnTheNextButtonWithoutEnteringRemarks() {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.nextButton, driver);
        Operations.click(PG014_CardToAccountOwn.availableBalance, driver);
        Operations.waitUntilElementIsClickable(PG014_CardToAccountOwn.nextButton, driver);
        Operations.scrollIntoElement(PG014_CardToAccountOwn.nextButton, driver);
        Operations.click(PG014_CardToAccountOwn.nextButton, driver);
    }
    @Then("I can click on the Terms and Condition checkbox and Next button")
    public void iCanClickOnTheTermsAndConditionCheckboxAndNextButton() {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.CheckBox, driver);
        Operations.click(PG014_CardToAccountOwn.CheckBox, driver);
        Operations.waitUntilElementIsClickable(PG014_CardToAccountOwn.SendOTP, driver);
        Operations.click(PG014_CardToAccountOwn.SendOTP, driver);
    }
    @Then("I can Enter OTP {string} and click on the Next button")
    public void iCanEnterOtpAndClickOnTheNextButton(String OTP) {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.EnterOTP, driver);
        Operations.verifyElementIsPresent(PG014_CardToAccountOwn.EnterOTP, driver);
        Operations.sendText(PG014_CardToAccountOwn.EnterOTP,OTP, driver);
        Operations.waitUntilElementIsClickable(PG014_CardToAccountOwn.OTPNextButton, driver);
        Operations.click(PG014_CardToAccountOwn.OTPNextButton, driver);
    }

    private Scenario scenario;

    @io.cucumber.java.Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Then("I can check transaction status {string} IF Transaction is failed then add an Screenshot")
    public void iCanCheckTransactionStatus(String Status) throws Exception {
        try {
            Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.transactionStatus, driver);
            Operations.verifyElementIsPresent(PG014_CardToAccountOwn.transactionStatus, driver);
            Operations.matchText(PG014_CardToAccountOwn.transactionStatus, Status, driver);
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

    @Then("I can Back to the Home Page")
    public void iCanBackToTheHomePage() {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.GoToHomeButton, driver);
        Operations.click(PG014_CardToAccountOwn.GoToHomeButton, driver);
    }
}
