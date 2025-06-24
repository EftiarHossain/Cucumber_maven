package objectRepository;

import org.openqa.selenium.By;

public class PG014_CardToAccountOwn {
    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarCardToAccount = By.xpath("//span[contains(text(),'Card to Account')]");
    public static By selectOwnAccount = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-card-to-bank/div/div/form/div[2]/div[2]/div/button");

    public static By amountSlab = By.xpath("//button[normalize-space()='500']");
    public static By nextButton = By.xpath("//button[normalize-space()='Next']");

    public static By CheckBox = By.xpath("//div[@class='mdc-checkbox']");
    public static By SendOTP = By.xpath("//button[normalize-space()='Next']");

    public static By EnterOTP = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog/div[1]/div[1]/code-input/span[1]/input");
    public static By OTPNextButton = By.xpath("//button[normalize-space()='Next']");
    public static By GoToHomeButton = By.xpath("//button[normalize-space()='Go to Home']");
}
