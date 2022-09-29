package RegisterationTest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import tests.TestBase;
import utilities.Helper;

public class UpdateAccountInformationTest extends TestBase {
    public static String fName = Helper.generateRandomName(9);
    public static String lName = Helper.generateRandomName(8);
    public static String email = Helper.generateRandomName(8) + "@Test.com";
    public static String company = Helper.generateRandomName(7);

    HomePage homeObject;
    MyAccountPage myAccountObject;

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Update Account Information ")
    @Feature("Register Epic")
    @Epic("Register Epic")
    public void updateAccountInformation() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnMyAccount();

        myAccountObject = new MyAccountPage(driver);
        myAccountObject.updateAccountInformation(fName,lName);

        System.out.println("New First Name : " + fName);
        System.out.println("New Last Name : " + lName);

        myAccountObject.updateBirthDay("20","April","1999");
        myAccountObject.updateEmailAndCompany(email,company);

        System.out.println("New Email : " + email);
        System.out.println("New Company : " + company);

        myAccountObject.clickOnSaveButton();

       // homeObject.clickOnLogOut();

        Thread.sleep(2000);

    }
}
