package objectRepository;

import org.openqa.selenium.By;

public class PG014_CardToAccountOwn {
    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarCardToAccount = By.xpath("//span[contains(text(),'Card to Account')]");
    public static By selectOwnAccount = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-card-to-bank/div/div/form/div[2]/div[2]/div/button");

    public static By amount = By.xpath("//input[@id='mat-input-0']");
    public static By availableBalance = By.xpath("//div[@class='flex justify-between pb-4 ng-star-inserted']");
    public static By nextButton = By.xpath("//button[normalize-space()='Next']");

    public static By CheckBox = By.xpath("//div[@class='mdc-checkbox']");
    public static By SendOTP = By.xpath("//button[normalize-space()='Next']");

    public static By EnterOTP = By.xpath("//span[1]//input[1]");
    public static By OTPNextButton = By.xpath("//div[@class='flex space-x-2 justify-center']//button[@class='btn-primary'][normalize-space()='Next']");

    public static By transactionStatus = By.xpath("//span[@class='text-md font-normal']");
    public static By GoToHomeButton = By.xpath("//button[normalize-space()='Go to Home']");
}
