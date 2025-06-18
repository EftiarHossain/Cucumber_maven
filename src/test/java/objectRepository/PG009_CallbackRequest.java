package objectRepository;

import org.openqa.selenium.By;

public class PG009_CallbackRequest {
    public static By navBarServices = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item[3]/div[1]/div/div/div/span");
    public static By navBarAccountServices = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item[3]/div[2]/fuse-vertical-navigation-collapsable-item[1]/div[1]/div/div/div/span");
    public static By navBarCallbackRequest = By.xpath("/html/body/app-root/layout/classy-layout/fuse-vertical-navigation/div/div[2]/fuse-vertical-navigation-collapsable-item[3]/div[2]/fuse-vertical-navigation-collapsable-item[1]/div[2]/fuse-vertical-navigation-basic-item[3]/div/a/div/div/span");

    public static By startDate = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-cheque-stop-request/div/div/form/div[1]/div/mat-form-field[1]/div[1]/div[2]/div[2]");
    public static By SelectStartDate = By.xpath("//span[normalize-space()='28']");

    public static By startTime = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-cheque-stop-request/div/div/form/div[1]/div/mat-form-field[2]/div[1]/div[2]/div[2]");
    public static By SelectStartTime = By.xpath("//span[normalize-space()='3']");
    public static By OKButton = By.xpath("//span[normalize-space()='OK']");

    public static By endDate = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-cheque-stop-request/div/div/form/div[2]/div/mat-form-field[1]/div[1]/div[2]/div[2]");
    public static By SelectEndDate = By.xpath("//span[normalize-space()='29']");

    public static By endTime = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-cheque-stop-request/div/div/form/div[2]/div/mat-form-field[2]/div[1]/div[2]/div[2]");
    public static By SelectEndTime = By.xpath("//span[normalize-space()='4']");
    public static By endOKButton = By.xpath("//span[normalize-space()='OK']");

    public static By query = By.xpath("//input[@placeholder='Enter your query']");
    public static By requestButton = By.xpath("//button[normalize-space()='Request']");
}