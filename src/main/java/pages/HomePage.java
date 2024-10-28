package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By alertText = By.xpath("//*[@id=\"content\"]/div[2]/div/h4");
    private By logoutBtn = By.xpath("//a[normalize-space()='Logout']");
    private By findPatientRecordBtn = By.xpath("//*[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertString() {
        return driver.findElement(alertText).getText();
    }

    public FindPatientRecordPage getFindPatientRecordPage() {
        driver.findElement(findPatientRecordBtn).click();
        return new FindPatientRecordPage(driver);
    }

    public LoginPage clickLogoutBtn() {
        driver.findElement(logoutBtn).click();
        return new LoginPage(driver);
    }
}
