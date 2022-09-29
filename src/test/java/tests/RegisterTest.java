package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterResultPage;
import utilities.Helper;

public class RegisterTest extends TestBase{

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
