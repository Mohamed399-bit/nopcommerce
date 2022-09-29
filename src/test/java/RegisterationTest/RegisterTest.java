package RegisterationTest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterResultPage;
import tests.TestBase;
import utilities.Helper;

public class RegisterTest extends TestBase {

    public static String firstName = Helper.generateRandomName(6);
    public static String lastName = Helper.generateRandomName(7);
    public static String email = Helper.generateRandomName(8) +"@test.com";
    public static String company = Helper.generateRandomName(9);
    public static String password = "Test@12345";

    HomePage homeObject;
    RegisterPage registerObject;
    RegisterResultPage registerResultObject;

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Register new User ")
    @Feature("Register Epic")
    @Epic("Register Epic")

    public void RegisterNewUser() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnRegisterLink();

        registerObject = new RegisterPage(driver);
        registerObject.enterGenderAndName(firstName,lastName);
        registerObject.enterDateOfBirth("15","June","1993");
        registerObject.enterEmail(email);
        System.out.println("Email is : " + email);
        registerObject.enterCompanyName(company);
        registerObject.enterPassword(password);
        System.out.println("Password is  : " + password);
        registerObject.clickOnRegisterButton();

        registerResultObject = new RegisterResultPage(driver);
        registerResultObject.verifyFromRegisterUser("Your registration completed");
        registerResultObject.clickOnContinueButton();

        homeObject.clickOnLogOut();
        Thread.sleep(1000);
    }
}
