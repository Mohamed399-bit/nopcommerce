package RegisterationTest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.RegisterTest;
import tests.TestBase;

public class LoginTest extends TestBase {

    HomePage homeObject;
    LoginPage loginObject;

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login With valid user name and password ")
    @Feature("Register Epic")
    @Epic("Register Epic")
    public void loginWithValidUserNameAndPassword(){

        homeObject = new HomePage(driver);
        homeObject.clickOnLoginLink();

        loginObject = new LoginPage(driver);
        loginObject.LoginToAccount(RegisterationTest.RegisterTest.email, RegisterationTest.RegisterTest.password);

        homeObject.verifyThatUserLogin();
        //homeObject.clickOnLogOut();


    }
}
