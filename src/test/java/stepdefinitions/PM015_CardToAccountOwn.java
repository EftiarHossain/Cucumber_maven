package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG014_CardToAccountOwn;
import utils.Base;
import utils.Operations;

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
    @Then("I can enter amount by selecting amount slab")
    public void iCanEnterAmountBySelectingAmountSlab() {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.amountSlab, driver);
        Operations.click(PG014_CardToAccountOwn.amountSlab, driver);
    }
    @Then("I click on the Next button without entering Remarks")
    public void iClickOnTheNextButtonWithoutEnteringRemarks() {
        Operations.waitUntilElementIsVisible(PG014_CardToAccountOwn.nextButton, driver);
        Operations.click(PG014_CardToAccountOwn.nextButton, driver);
    }
}
