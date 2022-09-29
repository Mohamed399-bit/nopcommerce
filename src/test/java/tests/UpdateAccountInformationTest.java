package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import utilities.Helper;

public class UpdateAccountInformationTest extends TestBase{
    public static String fName = Helper.generateRandomName(9);
    public static String lName = Helper.generateRandomName(8);
    public static String email = Helper.generateRandomName(8) + "@Test.com";
    public static String company = Helper.generateRandomName(7);

    HomePage homeObject;
    MyAccountPage myAccountObject;
    @Test
    public void updateAccountInformation() throws InterruptedException {

        homeObject = new HomePage(driver);
        homeObject.clickOnMyAccount();

        myAccountObject = new MyAccountPage(driver);
        myAccountObject.updateAccountInformation(fName,lName);
        myAccountObject.updateBirthDay("15","April","1999");
        myAccountObject.updateEmailAndCompany(email,company);
        myAccountObject.clickOnSaveButton();

        Thread.sleep(7000);

    }
}
