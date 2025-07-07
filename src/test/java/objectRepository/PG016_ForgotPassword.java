package objectRepository;

import org.openqa.selenium.By;

public class PG016_ForgotPassword {
    public static By forgotPasswordButton = By.xpath("//a[normalize-space()='Forgot Password/User ID?']");
    public static By forgotPasswordPageTitle = By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-forgot-password/section/div/div[2]/h2");

    public static By forgotType = By.xpath("//div[@id='mat-select-value-1']");
    public static By forgotUserId = By.xpath("//*[@id=\"mat-option-0\"]");
    public static By forgotPassword = By.xpath("//*[@id=\"mat-option-1\"]");
    public static By forgotPasswordAndUserID = By.xpath("//*[@id=\"mat-option-2\"]");

    public static By dateOfBirthButton = By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-forgot-password/section/div/div[2]/form/mat-form-field[2]/div[1]/div[2]/div[2]/mat-datepicker-toggle/button/span[3]");
    public static By yearArrow = By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]");
    public static By arrow = By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]");
    public static By year = By.xpath("//span[normalize-space()='1996']");
    public static By month = By.xpath("//span[normalize-space()='DEC']");
    public static By date = By.xpath("//span[normalize-space()='31']");

    public static By enterEmail = By.xpath("//*[@id=\"mat-input-3\"]");
    public static By enterPhoneNumber = By.xpath("//*[@id=\"mat-input-4\"]");
    public static By submitButton = By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-forgot-password/section/div/div[2]/form/div[2]/button[2]");

    public static By enterOTP = By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-forgot-password/section/div/div[2]/form/code-input/span[1]/input");



}
