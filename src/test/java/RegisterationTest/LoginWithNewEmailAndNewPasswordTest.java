package RegisterationTest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.TestBase;

public class LoginWithNewEmailAndNewPasswordTest extends TestBase {

    HomePage homeObject;
    LoginPage loginObject;

    @Test(priority = 5)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login With valid new email and new password ")
    @Feature("Register Epic")
    @Epic("Register Epic")
    public void loginWithNewEmailAndNewPassword() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnLoginLink();

        loginObject = new LoginPage(driver);
        loginObject.LoginToAccount(RegisterationTest.UpdateAccountInformationTest.email,
                RegisterationTest.ChangePasswordTest.newPassword);

        homeObject.verifyThatUserLogin();

        Thread.sleep(2000);

        //homeObject.clickOnLogOut();


    }
}
