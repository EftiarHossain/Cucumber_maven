package objectRepository;

import org.openqa.selenium.By;

public class PG015_CardToAccountWithin {
    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarCardToAccount = By.xpath("//span[contains(text(),'Card to Account')]");
    public static By selectWithinBank = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-card-to-bank/div/div/form/div[1]/div/div/div[2]/button");
    public static By selectContinueWithoutBeneficiary = By.xpath("//h1[normalize-space()='Continue without Beneficiary']");

    public static By toAccount = By.xpath("//input[@id='mat-input-3']");
    public static By withinAmount = By.xpath("//input[@id='mat-input-1']");
    public static By remark = By.xpath("//input[@id='mat-input-2']");
    public static By nextButton = By.xpath("//button[normalize-space()='Next']");


    public static By CheckBox = By.xpath("//div[@class='mdc-checkbox']");
    public static By SendOTP = By.xpath("//button[normalize-space()='Next']");

    public static By EnterOTP = By.xpath("//span[1]//input[1]");
    public static By OTPNextButton = By.xpath("//div[@class='flex space-x-2 justify-center']//button[@class='btn-primary'][normalize-space()='Next']");

    public static By transactionStatus = By.xpath("//span[@class='text-md font-normal']");
    public static By GoToHomeButton = By.xpath("//button[normalize-space()='Go to Home']");
}
