package RegisterationTest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.changePasswordPage;
import tests.RegisterTest;
import tests.TestBase;
import utilities.Helper;

public class ChangePasswordTest extends TestBase {

    public static String newPassword = Helper.generateRandomName(5)+"@12345";
    
    HomePage homeObject;
    MyAccountPage myAccountObject;
    changePasswordPage changePasswordObject;

    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Change Password ")
    @Feature("Register Epic")
    @Epic("Register Epic")
    public void ChangePassword() throws InterruptedException {


        //homeObject.clickOnMyAccount();

        myAccountObject = new MyAccountPage(driver);
        myAccountObject.clickOnChangePassword();

        changePasswordObject = new changePasswordPage(driver);
        changePasswordObject.enterNewPassword(RegisterationTest.RegisterTest.password,newPassword);

        System.out.println("New Password : " + newPassword);

        changePasswordObject.clickOnChangePasswordButton();
        changePasswordObject.VerifyThatUserChangePassword("Password was changed");
        Thread.sleep(2000);
        changePasswordObject.closedMessage();

        homeObject = new HomePage(driver);
        homeObject.clickOnLogOut();

        Thread.sleep(1000);



    }
}
