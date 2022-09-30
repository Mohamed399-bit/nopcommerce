package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

    HomePage homeObject;
    LoginPage loginObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login With valid user name and password ")
    public void loginWithValidUserNameAndPassword() {

        homeObject = new HomePage(driver);
        homeObject.clickOnLoginLink();

        loginObject = new LoginPage(driver);
        loginObject.LoginToAccount(RegisterTest.email, RegisterTest.password);

        homeObject.verifyThatUserLogin();
        homeObject.clickOnLogOut();


    }
}
