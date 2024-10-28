package patient;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class FindPatientRecordTest extends BaseTest {
    @Test
    public void testFindPatientRecordSuccess() {
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.setLocation();
        HomePage homePage = loginPage.clickLoginButton();
        homePage.clickFindPatientRecordPage();

        String alertText = homePage.getAlertString();
        Assertions.assertTrue(alertText.contains("Logged in as Super User (admin) at Inpatient Ward."), "Alert text is incorrect!");
    }
}
