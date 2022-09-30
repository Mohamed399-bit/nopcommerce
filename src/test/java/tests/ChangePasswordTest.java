package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.changePasswordPage;
import utilities.Helper;

public class ChangePasswordTest extends TestBase {

    public static String newPassword = Helper.generateRandomName(5) + "@12345";

    HomePage homeObject;
    MyAccountPage myAccountObject;
    changePasswordPage changePasswordObject;

    @Test
    public void ChangePassword() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnMyAccount();

        myAccountObject = new MyAccountPage(driver);
        myAccountObject.clickOnChangePassword();

        changePasswordObject = new changePasswordPage(driver);
        changePasswordObject.enterNewPassword(RegisterTest.password, newPassword);
        changePasswordObject.clickOnChangePasswordButton();

        Thread.sleep(7000);


    }
}
