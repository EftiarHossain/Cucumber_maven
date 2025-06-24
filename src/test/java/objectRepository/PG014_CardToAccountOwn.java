package objectRepository;

import org.openqa.selenium.By;

public class PG014_CardToAccountOwn {
    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarCardToAccount = By.xpath("//span[contains(text(),'Card to Account')]");
    public static By selectOwnAccount = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-card-to-bank/div/div/form/div[2]/div[2]/div/button");
}
