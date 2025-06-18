package objectRepository;

import org.openqa.selenium.By;

public class PG007_ChequeBookRequest {
    public static By navBarServices = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item[3]/div[1]/div/div/div/span");
    public static By navBarAccountServices = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item[3]/div[2]/fuse-vertical-navigation-collapsable-item[1]/div[1]/div/div/div/span");
    public static By navBarChequeBookRequest = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item[3]/div[2]/fuse-vertical-navigation-collapsable-item[1]/div[2]/fuse-vertical-navigation-basic-item[2]/div/a/div/div/span");

    public static By ChequeBookRequestTitle = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-cheque-book-request/div/div/div/h1");
    public static By Scroll = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/div[4]");

    public static By clickOnSelectAccount = By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]");
    public static By SelectYourAccount = By.xpath("//*[@id=\"mat-option-1\"]/span");

    public static By clickOnSelectLeafSize = By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]");
    public static By SelectLeafSize = By.xpath("//span[normalize-space()='10']");

    public static By clickOnSelectDivision = By.xpath("//*[@id=\"mat-select-4\"]/div/div[2]");
    public static By SelectDivision = By.xpath("//span[normalize-space()='Chattogram']");

    public static By clickOnSelectDistrict = By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]");
    public static By SelectDistrict = By.xpath("//span[normalize-space()='Brahmanbaria']");

    public static By clickOnSelectDeliveryPoint = By.xpath("//*[@id=\"mat-select-8\"]/div/div[2]");
    public static By SelectDeliveryPoint = By.xpath("//*[@id=\"mat-option-0\"]/span");

    public static By clickOnSelectDeliveryLocation = By.xpath("//*[@id=\"mat-select-10\"]/div/div[2]");
    public static By SelectDeliveryLocation = By.xpath("//span[normalize-space()='Brahmanbaria Branch']");

    public static By NextButton = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-cheque-book-request/div/div/form/div/div[7]/div/button[2]");

    public static By CheckBox = By.xpath("//div[@class='mdc-checkbox']");
    public static By SendOTP = By.xpath("//button[normalize-space()='Send OTP']");

    public static By EnterOTP = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog/div[1]/div[1]/code-input/span[1]/input");
    public static By OTPNextButton = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog/div[2]/button[2]");
    public static By GoToHomeButton = By.xpath("//button[normalize-space()='Go to Home']");
}
