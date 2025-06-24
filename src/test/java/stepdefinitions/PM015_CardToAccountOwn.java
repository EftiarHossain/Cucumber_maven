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
}
